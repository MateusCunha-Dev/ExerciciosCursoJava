package estrututas_condicionais;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        */
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Entre com um número: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("%d é par", number);
        }
        else{
            System.out.printf("%d é ímpar", number);
        }
        sc.close();
    }
}
