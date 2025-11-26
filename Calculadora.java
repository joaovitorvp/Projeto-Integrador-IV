import java.util.Scanner;

public class Calculadora {
    
    // Métodos de operação (lógica pura - testáveis)
    public static double somar(double a, double b) {
        return a + b;
    }
    
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
    
    // Método main (interface de usuário)
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
                case 1 -> System.out.println("Resultado: " + num1 + " + " + num2 + " = " + somar(num1, num2));
                case 2 -> System.out.println("Resultado: " + num1 + " - " + num2 + " = " + subtrair(num1, num2));
                case 3 -> System.out.println("Resultado: " + num1 + " * " + num2 + " = " + multiplicar(num1, num2));
                case 4 -> {
                    try {
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + dividir(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}