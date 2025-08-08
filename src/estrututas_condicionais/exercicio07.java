package estrututas_condicionais;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.
         */
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Entre com a coordenada x: ");
        x = sc.nextDouble();
        System.out.print("Entre com as coordenada y: ");
        y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.printf("O ponto (%.1f, %.1f)  está na origem", x, y);
        }
        else if(x == 0){
            System.out.printf("O ponto (%.1f, %.1f)  está sobre Eixo X", x, y);
        }
        else if(y == 0){
            System.out.printf("O ponto (%.1f, %.1f)  está sobre Eixo Y", x, y);
        }
        else if(x > 0 && y > 0){
            System.out.printf("O ponto (%.1f, %.1f)  está no Q1", x, y);
        }
        else if(x > 0 && y < 0){
            System.out.printf("O ponto (%.1f, %.1f)  está no Q4", x, y);
        }
        else if(x < 0 && y > 0){
            System.out.printf("O ponto (%.1f, %.1f)  está no Q2", x, y);
        }
        else{
            System.out.printf("O ponto (%.1f, %.1f)  está no Q3", x, y);
        }
        sc.close();
    }
}
