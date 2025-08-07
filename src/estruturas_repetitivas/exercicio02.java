package estruturas_repetitivas;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */
        Scanner sc  = new Scanner(System.in);
        int x, y;
        System.out.print("Digite a coordenada x: ");
        x = sc.nextInt();
        System.out.print("Digite a coordenada y: ");
        y = sc.nextInt();

        while(x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }

            System.out.print("Digite a coordenada x: ");
            x = sc.nextInt();
            System.out.print("Digite a coordenada y: ");
            y = sc.nextInt();
        }
        sc.close();
    }
}
