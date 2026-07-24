import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do{
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("A área do quadrado é: " + (lado*lado));
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    System.out.println("A área do círculo é: " + (3.14*raio*raio));
                    break;
                case 3:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }while(escolha != 3);

        scanner.close();
    }
}
