package estruturas_sequenciais;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas
        , o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre
        o número e o salário do funcionário, com duas casas decimais.
         */

        Scanner sc  = new Scanner(System.in);

        int number, hours;
        double hourlyWage, grossSalary;

        System.out.print("Digite o número do funcionário: ");
        number = sc.nextInt();
        System.out.print("Digite às horas que ele trabalha: ");
        hours = sc.nextInt();
        System.out.print("Digite o salário por hora trabalhada: ");
        hourlyWage = sc.nextDouble();

        grossSalary = hours * hourlyWage;

        System.out.printf("O salário bruto é =  %.2f", grossSalary);



    }
}
