package estrututas_condicionais;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
        ou "Nao saoMultiplos", indicando se os valores lidos são múltiplos entre si. Atenção:
        os números devem poder ser digitados em ordem crescente ou decrescente
         */

        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.print("Entre com valor de A: ");
        A = sc.nextInt();

        System.out.print("Entre com valor de B: ");
        B = sc.nextInt();
        try{
        if ((A % B == 0) || (B % A == 0)){
            System.out.println("São múltiplos");
        }
        else{
            System.out.println("Não são múltiplos");
        }
        }catch (ArithmeticException e){
            System.out.println("Error: Divisão por zero" + e.getMessage());
        }
        sc.close();
    }
}
