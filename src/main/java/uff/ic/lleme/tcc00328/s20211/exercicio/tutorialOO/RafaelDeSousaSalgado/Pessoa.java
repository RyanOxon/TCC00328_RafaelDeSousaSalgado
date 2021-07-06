package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

public class Pessoa {
    
    protected String nome;
    protected String cpf;
    
    Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    private void setNome(String nome){
        this.nome=nome;
    }
    
    private void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
}
