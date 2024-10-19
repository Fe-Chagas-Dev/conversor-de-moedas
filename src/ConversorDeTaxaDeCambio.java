import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConversorDeTaxaDeCambio extends ConversorDeMoeda {
    //private static final String API_KEY = "441c33cced77b551bd2bae79";

    private static String API_KEY;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config.properties"));
            API_KEY = properties.getProperty("api.key");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao carregar a configuração da API.");
        }
    }

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";
    ;

    public ConversorDeTaxaDeCambio(String moedaOrigem, String moedaDestino) {
        super(moedaOrigem, moedaDestino);
    }

    @Override
    public double converte(double quantia) {
        double rate = getExchangeRate();
        return quantia * rate;
    }

    private double getExchangeRate() {
        try {
            String apiUrl = BASE_URL + moedaOrigem; // URL da API para obter taxas de câmbio
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) { // Verifica se a resposta foi bem-sucedida
                JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
                return jsonResponse.getAsJsonObject("conversion_rates").get(moedaDestino).getAsDouble();
            } else {
                throw new RuntimeException("Erro ao obter a taxa de câmbio: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao obter a taxa de câmbio.");
        }
    }
}
