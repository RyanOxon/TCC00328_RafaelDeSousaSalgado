package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio4.RafaelDeSousaSalgado;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero a ser verificado:");
        int n = scan.nextInt();
        int i = n;
        int p = 0;
        do{ //Na minha ideia a utilizacao do for seria mais apropriada, mas é possivel fazer com o while
            if(0 == n%i)p++;
            i--;
        }while(i>0);
        if(p==2)System.out.println("O numero "+ n+" e primo!");
        else System.out.println("O numero "+ n+ " nao e primo");
        scan.close();
    }
}
