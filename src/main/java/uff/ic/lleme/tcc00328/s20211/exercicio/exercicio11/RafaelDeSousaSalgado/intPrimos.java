package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio11.RafaelDeSousaSalgado;

public class intPrimos {
    public static void main(String [] args){
        long total = 1;
        int cont = 0;
        for(int i = 1; i<=50; i++){
            for(int n= 1; n<=i; n++){
                if(i%n == 0) cont++;
            }
            if(cont==2)
                total *=i;
            cont = 0;
        }
        System.out.println("O produto dos inteiros primos de 1 a 50 é "+ total);
    }
}
