package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio23.RafaelDeSousaSalgado.num2;

public class Lista<T> {
    
    int size = 2;
    Object[] dados = new Object[size];
    
    public void incluir(T dado){
        for (int i = 0; i < dados.length-1; i++) 
            if( dados[i] == null ){
                dados[i] = dado;
                return;
            }
        mudarTamanho();
        incluir(dado);
    }
    
    public void remover(int pos){
        dados[pos] = dados[pos+1];
        if (dados[pos+1]!= null)
            remover(pos+1);
        if( tamanho()==(size/2)-1)
            mudarTamanho(true);
    }
    
    public T recuperar(int index){
        return (T)dados[index];
    }
    
    public int tamanho(){
        for (int i = 0; i < dados.length; i++)
            if(dados[i]==null)
                return i;
        return dados.length;
        
    }
    
    public void mudarTamanho(boolean reduzir ){
        if(reduzir == true)
            size *= 0.5;
        else
            size *= 2;
        
        Object[] dados_AUX = new Object[size];
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] != null)
                dados_AUX[i] = dados[i];
            
        }
                
        dados = dados_AUX;
        
    }
    
    public void mudarTamanho(){
        mudarTamanho(false);
    }
    
}
