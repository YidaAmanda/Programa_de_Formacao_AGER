import java.util.Random;
import java.util.Scanner;

public class JoaoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativa;

        System.out.println("Jogo da Adivinhação - tente adivinhar o número secreto");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeroTentativa = scanner.nextInt();

            if (numeroTentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número aleatório em " + (i+1) + " tentativas");
                break;
            } else if (numeroTentativa > numeroAleatorio) {
                System.out.println("O número é menor que " + numeroTentativa);
            } else {
                System.out.println("O número é maior que " + numeroTentativa);
            }

            if (i == 4) {
                System.out.println("Acabou suas tentativas...");
            }
        }

        scanner.close();
    }
}
