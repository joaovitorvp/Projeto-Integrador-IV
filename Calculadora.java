import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("=== Calculadora Simples ===");
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");

        System.out.print("Digite o número da operação desejada: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

//teste