package estruturas_sequenciais;

import java.util.Scanner;

public class exercicio02 {

    public static final double pi = 3.14159;

    public static void main(String[] args) {
    /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar
     o valor da área deste círculo com quatrocasas decimais conforme exemplos.
    */
        Scanner sc  = new Scanner(System.in);

        double radius, area;

        System.out.print("Digite o valor do raio do círculo: ");
        radius = sc.nextDouble();

        area = pi * Math.pow(radius, 2);
        System.out.printf("Área: %.4f", area);
        sc.close();
    }
}
