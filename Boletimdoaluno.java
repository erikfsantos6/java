public class Boletimdoaluno {
    public static void main(String[] args) {

        String nome = "Erik Freitas";
        double nota1 = 8.50;
        double nota2 = 7.00;

        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Média: %.2f%n", media);
    }
}