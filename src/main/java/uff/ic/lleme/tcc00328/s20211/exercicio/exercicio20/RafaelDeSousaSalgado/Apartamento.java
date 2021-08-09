package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio20.RafaelDeSousaSalgado;

public abstract class Apartamento {
    private Pessoa[] vagas;
    private String tipo = this.getClass().getSimpleName();
    private int numQuarto;
    
    protected void setTamanho(int i){
        vagas = new Pessoa[i];
    }
        
    public Pessoa[] getOcupantes(){
        return vagas;
    }
    
    public void setNum(int i){
        numQuarto = i;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setOcupante(Pessoa p){
        for (int i = 0; i < vagas.length; i++) {
            if(vagas[i]== null){
                vagas[i] = p;
                return;
            }
        }
    }
    
    public void delOcupante(Pessoa p){
        for (int i = 0; i < vagas.length; i++) {
            if(vagas[i] == p)
                vagas[i] = null;
        }
    }
    
}
