package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao1;

import java.util.ArrayList;

public abstract class Sinonimos {
    
    public String significado;
    ArrayList<Palavra> palavras = new ArrayList<>();
    
    Sinonimos(String signif) {
        this.significado = signif;
    }
    
}
