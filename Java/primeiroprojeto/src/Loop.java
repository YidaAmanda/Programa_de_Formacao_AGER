import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma avaliação para o filme");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Média de avaliações: " + media/3);
        leitura.close();
    }
}
