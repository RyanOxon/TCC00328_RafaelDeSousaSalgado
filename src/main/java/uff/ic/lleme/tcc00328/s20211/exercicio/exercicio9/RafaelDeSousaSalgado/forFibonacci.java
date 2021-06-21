package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio9.RafaelDeSousaSalgado;

import java.util.Scanner;

public class forFibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digitar a quantidade determos desejada:");
        int qnt = scan.nextInt();
        System.out.println("\n");
        int n1 = 1, n2 = 0, aux;
        for(int n = 0; n < qnt; n++){
            switch (n) {
                case 0 -> System.out.print(n2 + " ");
                case 1 -> System.out.print(n1 + " ");
                default -> {
                    aux = n1;
                    n1 += n2;
                    n2 = aux;
                    System.out.print(n1 + " ");
                }
            }
        }
        scan.close();
    }
}
