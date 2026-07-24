public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";
        double notaDoFilme = 8.1;

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("FIlme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}
