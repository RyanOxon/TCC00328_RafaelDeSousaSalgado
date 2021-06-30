package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio16.RafaelDeSousaSalgado;

public class Campeonato {
    public static void main(String[] args){ 
       int[][] matriz = {
                        {10, 8, 3, 1, 24},
                        {10, 8, 3, 1, 19},
                        {10, 8, 3, 1, 11},
                        {10, 8, 3, 1, 15},
                        {10, 8, 3, 1, 23}};    
       
       int vTime = decideVencedor(matriz.length, matriz);
       System.out.println("O time "+vTime+" Ganhou o campeonato!!"); 
    }

    private static int decideVencedor(int qnt, int[][] matriz){
        int indexVencedor = -1;
        for(int i=0;i<(qnt);i++){
            if(indexVencedor == -1)
                indexVencedor = i;
            else{
                for(int j=0;j<(matriz[i].length);j++){
                    if(matriz[indexVencedor][j] > matriz[i][j])
                        break;
                    if(matriz[indexVencedor][j] < matriz[i][j]){
                        indexVencedor = i;
                        break;
                    }    
                }
            }
        }        
        return indexVencedor;
    }
}