package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio6.RafaelDeSousaSalgado;

import java.util.Scanner;

public class series {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de termos:");
        int n = scan.nextInt();
        int i = n;
        double resultado = 0;
        double pow;
        do{
            n--;
            resultado += Math.pow(-1,n)/((2*n)+1);
        }while(n>0);
        resultado *= 4;
        System.out.println("O resultado da serie no termo "+ i+ " e igual a " +resultado);
        scan.close();
    }
}
