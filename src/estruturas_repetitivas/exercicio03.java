package estruturas_repetitivas;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        /*
        O objetivo do exercício é criar um programa que lê códigos de combustível para determinar
        a preferência dos clientes. O programa deve ler repetidamente um código que representa o
        tipo de combustível, sendo 1 para Álcool, 2 para Gasolina e 3 para Diesel. Caso o usuário
        insira um código inválido, o programa deve pedir um novo valor. O algoritmo deve contar a
        quantidade de clientes que abasteceram cada tipo de combustível e será encerrado somente
        quando o código 4 for digitado. Ao finalizar, o programa deve imprimir a mensagem "MUITO OBRIGADO"
        e a quantidade total de clientes para cada tipo de combustível.
        */

        Scanner sc = new Scanner(System.in);
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int choice;

        System.out.println(
                "1 - Alcool | " +
                "2 - Gasolina | " +
                "3 - Diesel | " +
                "4 - fim");

        while(true) {
            System.out.print("Qual sua preferência de combustível? ");
            choice = sc.nextInt();

            if (choice == 1) {
                alcohol++;
            } else if (choice == 2) {
                gasoline++;
            } else if (choice == 3) {
                diesel++;
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Entrada inválida! Tente novamente.\n");
            }
        }
        System.out.printf(
                "\nMUITO OBRIGADO!" +
                "\nAlcool: %d" +
                "\nGasolina: %d" +
                "\nDiesel: %d",
                alcohol, gasoline, diesel);
        sc.close();
    }
}
