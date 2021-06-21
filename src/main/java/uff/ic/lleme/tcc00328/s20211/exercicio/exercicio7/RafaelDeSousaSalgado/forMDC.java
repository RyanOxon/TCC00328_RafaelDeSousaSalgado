package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio7.RafaelDeSousaSalgado;

import java.util.Scanner;

public class forMDC {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int x = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        int y = scan.nextInt();
        int resto;
        if(x>y){
            for(resto = x%y; resto > 0; resto = x%y){
                x = y;
                y = resto;
            }
            System.out.println("O MDC é " + y);
        }else if(x<y){
            for(resto = y%x; resto > 0; resto = y%x){
                y = x;
                x = resto;
            }
            System.out.println("O MDC é " + x);
        }
        scan.close();
    }
}
