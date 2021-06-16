package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio3.RafaelDeSousaSalgado;

import java.util.Scanner;

public class MDC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int x = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        int y = scan.nextInt();
        int resto;
        if(x>y){
            do{
                resto = x%y;
                x = y;
                y = resto;
            }while(resto >0);
            System.out.println("O MDC é " + x);
        }else if(x<y){
            do{
                resto = y%x;
                y=x;
                x = resto;
            }while(resto>0);
            System.out.println("O MDC é " + y);
        }
        scan.close();
    }
}