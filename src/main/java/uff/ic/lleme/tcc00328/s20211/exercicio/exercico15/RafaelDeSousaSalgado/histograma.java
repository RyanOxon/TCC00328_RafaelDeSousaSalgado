package uff.ic.lleme.tcc00328.s20211.exercicio.exercico15.RafaelDeSousaSalgado;

public class histograma {
    public static void main(String[] args){
        float[] numeros = {1.0f, 3.0f, 2.5f, 4.8f, 10.0f, 8.7f, 4.5f, 1.1f};
        float[] categs = {1.0f, 3.5f, 4.7f, 10.0f};
    
        float[] catPorcent = histograma(numeros, categs);
        
        for(int i = 0; i<categs.length-1; i++){
            System.out.printf("Categoria: [ %.2f , %.2f ] > " , categs[i], categs[i+1]);
            System.out.printf("%.0f %% \n", catPorcent[i]);
        }
        
    
    }    

    private static float[] histograma(float[] numeros, float[] categs) {
        int x, y;
        int[] qnt = new int[categs.length-1];
        float[] porcent = new float[categs.length-1];
        
        for(int i=0; i<numeros.length;i++){
            int cat = categoria(numeros[i], categs);
            if( cat!= -1)
                qnt[cat]++;
        }
        for(int i=0;i<categs.length-1;i++)
            porcent[i] = ((float)qnt[i]/numeros.length)*100;
            
        return porcent;
    }

    private static int categoria(float numero, float[] categs) {
        for(int j=0;j<categs.length-1;j++){
                if(j==0)
                    if(numero==categs[j])
                        return j;
                if(numero>categs[j] && numero<=categs[j+1])
                    return j;
        }
        return -1;
    }
}
