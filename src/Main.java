import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorDeEntrada validador = new ValidadorDeEntrada(scanner);
        boolean continuarConversao = true;

        while (continuarConversao) {
            System.out.println("\n************************************");
            System.out.println("*      CONVERSOR DE MOEDAS         *");
            System.out.println("************************************");
            System.out.println("*   Bem-vindo ao Conversor de Moedas   *");
            System.out.println("************************************");
            System.out.println("\nEscolha uma conversão:\n");
            System.out.println("1. Dólar [USD] => Peso argentino [ARS]");
            System.out.println("2. Peso argentino [ARS] => Dólar [USD]");
            System.out.println("3. Dólar [USD] => Real brasileiro [BRL]");
            System.out.println("4. Real brasileiro [BRL] => Dólar [USD]");
            System.out.println("5. Dólar [USD] => Peso colombiano [COP]");
            System.out.println("6. Peso colombiano [COP] => Dólar [USD]");
            System.out.println("7. Sair\n");

            int option = validador.getValidaOpcao();
            String moedaOrigem = "";
            String moedaDestino = "";

            switch (option) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    break;
                case 2:
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 5:
                    moedaOrigem = "USD";
                    moedaDestino = "COP";
                    break;
                case 6:
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                    break;
                case 7:
                    continuarConversao = false; // Encerra o loop
                    continue;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            double quantia = validador.getValidaQuantia();

            ConversorDeMoeda conversor = new ConversorDeTaxaDeCambio(moedaOrigem, moedaDestino);
            double converteQuantia = conversor.converte(quantia);

            System.out.printf("\n%.2f [%s] é igual a %.2f [%s]\n\n", quantia, moedaOrigem, converteQuantia, moedaDestino);

            continuarConversao = ValidadorDeEntrada.perguntarSeContinua(scanner);
        }

        scanner.close();
        System.out.println("\nEncerrando programa...");
    }
}
