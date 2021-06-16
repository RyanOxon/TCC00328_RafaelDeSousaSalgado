package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio5.RafaelDeSousaSalgado;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digitar a quantidade determos desejada:");
        int qnt = scan.nextInt();
        System.out.println("\n");
        int n1 = 1, n2 = 0, n = 0, aux;
        do{
            switch (n) {
                case 0:
                    System.out.println(n2);
                    n++;
                    break;
                case 1:
                    System.out.println(n1);
                    n++;
                    break;
                default:
                    aux = n1;
                    n1 += n2;
                    n2 = aux;
                    n++;
                    System.out.println(n1);
                    break;
            }
        }while(n<qnt);
        scan.close();
    }
}
