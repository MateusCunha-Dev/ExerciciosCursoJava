package estrututas_condicionais;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        /*
        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo
        em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
        Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem
        “Fora de intervalo”.
         */
        Scanner sc = new Scanner(System.in);
        double number;

        System.out.print("Entre com um número: ");
        number = sc.nextDouble();

        if(number >= 0 && number <= 25){
            System.out.printf("Número %.2f está no intervalo [0, 25]", number);
        }
        else if(number > 25 && number <= 50){
            System.out.printf("Número %.2f está no intervalo (25, 50]", number);
        }
        else if(number > 50 && number <= 75){
            System.out.printf("Número %.2f está no intervalo (50, 75]", number);
        }
        else if(number > 75 && number <= 100){
            System.out.printf("Número %.2f está no intervalo (75, 100]", number);
        }
        else{
            System.out.println("Número está fora do intrvalo!");
        }
        sc.close();
    }
}
