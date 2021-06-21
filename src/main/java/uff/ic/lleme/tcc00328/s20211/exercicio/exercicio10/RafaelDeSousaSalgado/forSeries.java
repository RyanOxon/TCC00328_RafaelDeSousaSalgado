package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio10.RafaelDeSousaSalgado;

import java.util.Scanner;

public class forSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de termos:");
        long i = scan.nextLong();
        double resultado = 0;
        double pow;
        for(long n = i; n>=0 ;n--)
            resultado += Math.pow(-1,n)/((2*n)+1);
        resultado *= 4;
        System.out.println("O resultado da serie no termo "+ i+ " e igual a " +resultado);
        scan.close();
    }
}
