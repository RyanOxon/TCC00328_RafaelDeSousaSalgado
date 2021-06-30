package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio16.RafaelDeSousaSalgado;

public class Campeonato {
    public static void main(String[] args){ // Valores do exemplo( 5 times ):
       int[][] matriz = {
                        {10, 8, 3, -4, 12},
                        {17, 8, 5, 10, 19},
                        {10, 8, 3, -5, 11},
                        {11, 8, 3, -1, 15},
                        {19, 8, 6, 13, 23}};    
       
       int vTime = decideVencedor(matriz.length, matriz);
       System.out.println("O time "+vTime+" Ganhou o campeonato!!");
       
    }


    private static int decideVencedor(int par, int[][] matriz) {
        int vTime = 0;
        return vTime;
    }
}
