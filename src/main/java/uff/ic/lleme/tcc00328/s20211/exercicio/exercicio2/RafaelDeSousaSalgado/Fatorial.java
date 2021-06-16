package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio2.RafaelDeSousaSalgado;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pronto para calcular o fatorial de N");
        System.out.println("Digite o valor de N:");
        int inicial = scan.nextInt();
        int n = inicial;
        int total = n;
        do{
            total *= (n-1);
            n--;
        }while(n>1);
        System.out.println("O fatorial de "+inicial+" é igual a "+ total);
        scan.close();
    }
}
