package estrututas_condicionais;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
         */
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Entre com um valor: ");
        number = sc.nextInt();

        if(number >= 0){
            System.out.printf("%d não é negativo!", number);
        }
        else{
            System.out.printf("%d é negativo!", number);
        }
        sc.close();
    }
}
