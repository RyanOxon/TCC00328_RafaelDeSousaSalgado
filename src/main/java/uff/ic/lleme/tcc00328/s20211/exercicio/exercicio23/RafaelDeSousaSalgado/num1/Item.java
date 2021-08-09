package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio23.RafaelDeSousaSalgado.num1;

public class Item {
    private int quantidade;
    private Produto produto;
    
    public Produto getProduto(){
        return produto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setProduto(Produto p){
        produto = p;
    }
    
    public void setQuantidade(int q){
        quantidade = q;
    }
}
