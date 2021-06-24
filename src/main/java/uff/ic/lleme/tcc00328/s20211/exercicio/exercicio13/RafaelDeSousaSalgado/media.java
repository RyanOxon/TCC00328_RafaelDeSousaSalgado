package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio13.RafaelDeSousaSalgado;

import java.util.Scanner;

public class media {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de valores para a media");
        int qnt = scan.nextInt();
        double valor = 0;
        System.out.println("Entre os valores:");
        for(int i = 0; i<qnt;i++){
            valor += scan.nextInt();
        }
        System.out.println("A media dos valores informado é: "+ (valor/qnt));
        scan.close();
    }
}
