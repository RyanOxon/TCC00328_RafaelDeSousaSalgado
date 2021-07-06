package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

class Disciplina {
    private String codigo;
    private String nome;
    private String sigla;
    
    Disciplina(String cod, String sigla, String nome){
        setCodigo(cod);
        setSigla(sigla);
        setNome(nome);
    }
    
    private void setCodigo(String cod){
        this.codigo = cod;
    }
    
    private void setSigla(String sigla){
        this.sigla = sigla;
    }
        
    private void setNome(String nome){
        this.nome = nome;
    }    
}