package uff.ic.lleme.tcc00328.s20211.prova.p1.RafaelDeSousaSalgado.Questao1;

public class Prato {
    String nome;
    float preco;

    Prato(String nome, float valor) {
        setNome(nome);
        setPreco(valor);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private void setPreco(float valor){
        this.preco = valor;
    }

    public String getNome() {
        return this.nome;
    }
    
    public float getPreco(){
        return this.preco;
    }
}
