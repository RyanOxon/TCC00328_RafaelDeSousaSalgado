package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio8.RafaelDeSousaSalgado;

import java.util.Scanner;

public class forPrimo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero a ser verificado:");
        int n = scan.nextInt();
        int p = 0;
        for(int i = n; i>0; i--)
            if(0 == n%i)
                p++;
        if(p==2)
            System.out.println("O numero "+ n+" e primo!");
        else 
            System.out.println("O numero "+ n+ " nao e primo");
        scan.close();
    }
}
