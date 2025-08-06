package estruturas_sequenciais;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1,
        o valor unitário de cada peça 1, ocódigo de uma peça 2, o número de peças 2
        e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */

        Scanner sc = new Scanner(System.in);
        int partCodeA, partCodeB, partQtyA, partQtyB;
        double unitPriceA, unitPriceB;

        System.out.print("Digite o código da peça A: ");
        partCodeA = sc.nextInt();
        System.out.print("Digite o código da peça B: ");
        partCodeB = sc.nextInt();
        System.out.print("Digite a quantidades de peças A: ");
        partQtyA = sc.nextInt();
        System.out.print("Digite a quantidades de peças B: ");
        partQtyB = sc.nextInt();
        System.out.print("Digite o preço unitário da peça A: ");
        unitPriceA = sc.nextDouble();
        System.out.print("Digite o preço unitário da peça B: ");
        unitPriceB = sc.nextDouble();

        double totalCostA = partQtyA * unitPriceA;
        double totalCostB = partQtyB * unitPriceB;

        System.out.printf(
                "\nCódigo da peça A: %d " +
                "\nQuantidades de peças A: %d" +
                "\nPreço unitário da peça A: %.2f" +
                "\nPreço total da compra das peças A: %.2f" +
                "\n\nCódigo da peça B: %d " +
                "\nQuantidades de peças B: %d" +
                "\nPreço unitário da peça B: %.2f" +
                "\nPreço total da compra das peças B: %.2f",
                partCodeA, partQtyA, unitPriceA, totalCostA, partCodeB, partQtyB, unitPriceB, totalCostB
        );
        sc.close();
    }
}
