package estrututas_condicionais;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
        mínima de 1 hora e máxima de 24 horas.
         */
        Scanner sc = new Scanner(System.in);
        int initialHour, finalHour, gameplayDuration;

        System.out.print("Digite quando à hora que começou a jogar: ");
        initialHour = sc.nextInt();
        System.out.print("Digite quando à hora que acabou de jogar: ");
        finalHour = sc.nextInt();

        if(finalHour > initialHour){
            gameplayDuration = finalHour - initialHour;
        }
        else{
            gameplayDuration = (24 - initialHour) + finalHour;
        }
        System.out.printf("A duração do jogo foi de %d horas", gameplayDuration);
        sc.close();
    }
}
