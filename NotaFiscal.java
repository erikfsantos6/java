import java.util.Locale;
import java.util.Scanner;

public class NotaFiscal {
    public static void main(String[] args) {
        // Define a localização para aceitar ponto (.) nos números decimais
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entrada dos dados
        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor unitário: ");
        double valorUnitario = scanner.nextDouble();

        // Cálculo
        double total = quantidade * valorUnitario;

        // Impressão da Nota Fiscal utilizando os formatadores exigidos
        System.out.printf("%n--------- NOTA FISCAL ---------%n");
        System.out.printf("Cliente: %s%n", cliente);
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Valor unitário: R$ %.2f%n", valorUnitario);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("-------------------------------%n");

        scanner.close();
    }
}