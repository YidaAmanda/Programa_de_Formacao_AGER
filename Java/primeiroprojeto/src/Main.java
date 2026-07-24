//TIP <b>Convenção de código:</b>
//<li>Classes e interfaces em <i><b>PascalCase</b></i></li>
//<li>Variáveis e métodos em <i><b>camelCase</b></i></li>
//<li>Constantes devem ser maiúsculas, separadas por underline</li>
//<li>Linhas de código com 80 caracteres
//<li>Espaço em branco para separar operadores, palavras-chave e elementos de controle de fluxo

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");

        String nomeDoFilme = "Top Gun: Maverick";
        int anoDeLancamento = 2022;
        String sinopse = "Filme de aventura com galã dos anos 80.";
        boolean incluidoNoPlano = false;

        System.out.println(String.format("Filme: %s\nAno de lançamento: %d\nSinopse: %s", nomeDoFilme, anoDeLancamento, sinopse));

        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        //textblocks (java15) - java formatted
        /*String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;*/
        /*String nome = "João";
        int aulas = 4;

        String mensagem = """
                          Olá, %s!
                          Boas vindas ao curso de Java.
                          Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                          """.formatted(nome, aulas);

        System.out.println(mensagem);*/

        //casting implícito
        /*int x = 10;
        double y = x; // casting implícito*/
        //casting explícito
        /*double x = 10.5;
        int y = (int) x; // casting explícito*/

        //comparação de String
        /*String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }*/
    }
}
