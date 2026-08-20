import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("\n===== MENU DE CANETAS =====");
            System.out.println("1 - Esferográfica");
            System.out.println("2 - Gel");
            System.out.println("3 - Tinteiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração.");
                    break;

                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave.");
                    break;

                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia.");
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 0);

        sc.close();
    }
}