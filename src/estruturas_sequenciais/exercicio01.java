package estruturas_sequenciais;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        /*Faça um programa para ler dois valores inteiros, e depois mostrar
         na tela a soma desses números com uma mensagem explicativa*/

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite valor de B: ");
        b = sc.nextInt();

        c = a + b;

        System.out.print("Soma:\n" + c);
        sc.close();
    }
}
