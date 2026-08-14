public class produto {
    public static void main(String[] args) {
        String nomeProduto = "Teclado";
        int quantidade = 2;
        double precoUnitario = 75.50;

        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
    }
}
