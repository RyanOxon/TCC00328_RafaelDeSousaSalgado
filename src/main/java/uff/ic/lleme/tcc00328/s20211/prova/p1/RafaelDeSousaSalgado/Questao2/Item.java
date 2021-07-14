package uff.ic.lleme.tcc00328.s20211.prova.p1.RafaelDeSousaSalgado.Questao2;


public class Item {
    private Prato prato;
    private int quantidade;

    Item(int qnt, Prato prato) {
        setPrato(prato);
        setQnt(qnt);
    }
        
    private void setPrato(Prato prato) {
        this.prato = prato;
    }
    
    private void setQnt(int qnt){
        this.quantidade = qnt;
    }

    public Prato getPrato() {
        return this.prato;
    }
    
    public int getQnt(){
        return this.quantidade;
    }
}
