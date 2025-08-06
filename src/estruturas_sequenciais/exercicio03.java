package estruturas_sequenciais;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir
        , calcule e mostre a diferença do produto de A e B pelo produto
        de C e D.
        */

        Scanner sc = new Scanner(System.in);
        double a, b, c, d, diference;

        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();
        System.out.print("Digite o valor de D: ");
        d = sc.nextDouble();

        diference = (a * b) - (c * d);
        System.out.print("A diferença de dos produto de A e B " +
                "pelo produto de C e D = " + diference);
        sc.close();
    }
}
