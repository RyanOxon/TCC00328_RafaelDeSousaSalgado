package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ForkSoma extends RecursiveAction{
    
    private int inicio = 0;
    private int fim = 0;
    private List<Double> numeros = new ArrayList<>();
    protected static int limiar = 10000;
    private Resultado result;
    
    
    public ForkSoma(List<Double> numeros, Resultado result){
        this.inicio = 0;
        this.fim = numeros.size();
        this.numeros = numeros;
        this.result = result;
    }

    private ForkSoma(List<Double> numeros, Resultado result, int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.numeros = numeros;
        this.result = result;
    }
    
    protected void computeDirectly(){
        for(int i= inicio; i< fim; i++)
            result.total += numeros.get(i);
    }
    
    @Override
    protected void compute(){
        if(fim - inicio > limiar){
            computeDirectly();
        } else {
            int metade = (inicio + fim)/2 ;
            invokeAll(new ForkSoma(numeros, result, inicio, metade), new ForkSoma(numeros, result, metade, fim));
        }
    }
}
