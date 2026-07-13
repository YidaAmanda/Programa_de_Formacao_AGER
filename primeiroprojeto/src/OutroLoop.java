import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double nota = 0;
        double media = 0;

        while (nota != -1) {
            System.out.println("Digite uma avaliação para o filme ou -1 para encerrar");
            nota = scanner.nextDouble();
            if (nota != -1) {
                media += nota;
                i++;
            }
        }

        System.out.println("Média de avaliações: " + media/i);
        scanner.close();
    }
}
