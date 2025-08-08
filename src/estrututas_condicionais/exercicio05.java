package estrututas_condicionais;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        /*
         Escreva um programa que leia o código de um item
         e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
         */
        Scanner sc = new Scanner(System.in);
        int code, qty;

        System.out.print(
                "\n1 - Cachorro Quente" +
                "\n2 - X-Salada" +
                "\n3 - X-Bacon" +
                "\n4 - Torrada Simples" +
                "\n5 - Refrigerante");
        System.out.print("\nEntre com o código do lanche: ");
        code = sc.nextInt();

        System.out.print("Entre com a quantidade: ");
        qty = sc.nextInt();

        switch (code){
            case 1:
                System.out.printf("Total: R$ %.2f", qty * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f", qty * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f", qty * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f", qty * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f", qty * 1.50);
                break;
            default:
                System.out.println("Entrada inválida!");
        }
        sc.close();
    }
}
