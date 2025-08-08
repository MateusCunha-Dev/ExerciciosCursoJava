package estrututas_condicionais;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

        /*
         * Escrever um programa que recebe um salário como entrada e calcula o valor do imposto de renda a ser pago.
         * A lógica deve seguir o sistema de faixas progressivas conforme as regras abaixo.
         *
         * Tabela de Faixas de Renda e Alíquotas:
         * - Salários de R$ 0,00 a R$ 2000,00: Isento de imposto.
         * - Salários de R$ 2000,01 até R$ 3000,00: Alíquota de 8%.
         * - Salários de R$ 3000,01 até R$ 4500,00: Alíquota de 18%.
         * - Salários acima de R$ 4500,00: Alíquota de 28%.
         *
         * Lógica do Cálculo (Progressivo):
         * - O imposto é calculado apenas sobre a parte do salário que se enquadra em cada faixa.
         * - Por exemplo: para um salário de R$ 3002,00, a porção de R$ 2000,00 é isenta.
         * - A porção de R$ 1000,00 (de R$ 2000,01 a R$ 3000,00) é taxada a 8%.
         * - A porção restante de R$ 2,00 (acima de R$ 3000,00) é taxada a 18%.
         * - O valor total do imposto é a soma desses valores.
         */

        Scanner sc = new Scanner(System.in);
        double salary;
        double tax = 0;

        System.out.print("Digite seu salário: ");
        salary = sc.nextDouble();

        if(salary > 4500){
            tax += ((salary - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
        }
        else if(salary > 3000){
            tax += (((salary - 3000)* 0.18) + (1000 * 0.08));
        }
        else if(salary > 2000){
            tax += ((salary - 2000)*0.08);
        }
        else {
            System.out.println("Isento");
        }
        System.out.printf(
                "Baseado no seu salário R$ %.2f, o imposto que " +
                "deverá ser pago é R$ %.2f", salary, tax);

        sc.close();
    }
}
