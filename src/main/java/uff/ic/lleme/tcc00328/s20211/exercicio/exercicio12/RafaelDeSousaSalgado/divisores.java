package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio12.RafaelDeSousaSalgado;

import java.util.Scanner;

public class divisores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor maior que Zero:");
        int valor = scan.nextInt();
        int[] res = new int[(valor/3)+1];
        int pos = 0;
        for(int i = 1; i <= valor; i++){
            if(valor%i == 0){
                res[pos]= i;
                pos++;
            }          
        }
        System.out.print("Os divisores de "+valor+" Sao :");
        for(int a:res){
            if(a!= 0)
                System.out.print("["+ a +"]");
        }
    }
            
}
