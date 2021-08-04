package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

public class Pessoa {
    private String nome;
    private Mesa mesa;
    private int ponto;
    
    Pessoa (String nome){
        setNome(nome);
    }
    
    public void fazerRolagem(){
        for (Dado d : mesa.getDados()){
            d.sortear();
            System.out.println("Rolou "+ d.getValor());
        }    
    }
    
    public int calculaValor(){
        int resultado = 0;
        for(Dado d : mesa.getDados())
            resultado += d.getValor();
        return resultado;
    }
    
    
    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
        
    public void setPonto(int i){
        this.ponto = i;
    }
    
    public int getPonto(){
        return this.ponto;
    }
}
