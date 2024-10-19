    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class ValidadorDeEntrada {
        private Scanner scanner;

        public ValidadorDeEntrada(Scanner scanner) {
            this.scanner = scanner;
        }

        public int getValidaOpcao() {
            while (true) {
                System.out.print("Digite o número da opção: ");
                if (scanner.hasNextInt()) {
                    int opcao = scanner.nextInt();
                    if (opcao >= 1 && opcao <= 7) {
                        return opcao;
                    } else {
                        System.out.println("\nPor favor, insira uma opção válida entre 1 e 7.");
                    }
                } else {
                    System.out.println("\nEntrada inválida. Por favor, insira um número.");
                    scanner.next(); // Limpa a entrada inválida
                }
            }
        }

        public double getValidaQuantia() {
            while (true) {
                System.out.print("Digite a quantia: ");
                if (scanner.hasNextDouble()) {
                    double quantia = scanner.nextDouble();
                    if (quantia >= 0) {
                        return quantia; // Aceita apenas valores não negativos
                    } else {
                        System.out.println("Por favor, insira um valor não negativo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    scanner.next(); // Limpa a entrada inválida
                }
            }
        }

        public static boolean perguntarSeContinua(Scanner scanner) {
            while (true) {
                try {
                    System.out.print("Deseja fazer outra conversão? (1 - Sim, 0 - Não): ");
                    int resposta = scanner.nextInt();
                    if (resposta == 1) {
                        return true;
                    } else if (resposta == 0) {
                        return false;
                    } else {
                        System.out.println("Por favor, digite 1 para Sim ou 0 para Não.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nEntrada inválida. Por favor, digite 1 para Sim ou 0 para Não.");
                    scanner.next(); // Limpa a entrada inválida do scanner
                }
            }
        }
    }
