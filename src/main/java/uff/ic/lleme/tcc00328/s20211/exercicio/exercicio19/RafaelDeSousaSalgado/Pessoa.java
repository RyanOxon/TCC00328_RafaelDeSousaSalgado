package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

public class Pessoa {
    private String nome;
    private String status = "Aguardando";
    
    private int ponto;
    
    Pessoa(String nome){
        setNome(nome);
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getStatus(){
        return this.status;
    }

    public void setStatus(String i){
        this.status = i;
    }
    
    public void setPonto(int i){
        this.ponto = i;
    }
    
    public int getPonto(){
        return this.ponto;
    }
}
