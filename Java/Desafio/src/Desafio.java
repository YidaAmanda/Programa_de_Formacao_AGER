import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome = "Amanda Yida";
        String tipoConta = "Corrente";
        double valor;
        double saldo = 0;

        System.out.print(String.format(
                "----------------------------\n" +
                "Dados do cliente:\n" +
                "Nome:\t\t\t%s\n" +
                "Tipo conta:\t\t%s\n" +
                "Saldo:\t\t\t%.2f\n" +
                "----------------------------", nome, tipoConta, saldo));

        do {
            System.out.print(String.format(
                    "\n-----------OPÇÕES-----------\n" +
                    "1. Consultar saldo\n" +
                    "2. Receber valor\n" +
                    "3. Transferir valor\n" +
                    "4. Sair\n" +
                    "Escolha uma opção: "));
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;
                case 2:
                    do {
                        System.out.print("Digite o valor: ");
                        valor = scanner.nextDouble();
                        if (valor < 0) {
                            System.out.println("Digite um valor válido!");
                        }
                    } while(valor < 0);
                    saldo += valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    do {
                        System.out.print("Digite o valor: ");
                        valor = scanner.nextDouble();
                        if (valor < 0) {
                            System.out.println("Digite um valor válido!");
                        }
                    } while(valor < 0);
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= valor;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        } while(opcao != 4);

        scanner.close();
    }
}

            /*System.out.println("----------------------------");
            System.out.println("Dados do cliente:\n");
            System.out.println("Nome:\t\t\t" + nome);
            System.out.println("Tipo conta:\t\t" + tipoConta);
            System.out.println(String.format("Saldo:\t\t\t%.2f", saldo));
            System.out.println("----------------------------");

            System.out.println("-----------OPÇÕES-----------");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");*/