package uff.ic.lleme.tcc00328.s20211.prova.p1.RafaelDeSousaSalgado.Questao2;


public class Pedido {
    public Item[] itens = new Item[10];
    
    public void setItem(Item item, int pos){
        this.itens[pos] = item;
    }
}
