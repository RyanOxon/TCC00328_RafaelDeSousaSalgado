package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao1;

import java.util.ArrayList;

public class Palavra {
    public Dicionario dicio;
    public String grafia;
    public String fonetica;
    ArrayList<Sinonimos> sinonimos = new ArrayList<>();
    
    
    Palavra(String grafia, String fonetica){
        this.grafia = grafia;
        this.fonetica = fonetica;
        
    }
    
    public void addSignificado(String signif){
        if(dicio.checkSignif(signif)){
            sinonimos.add(dicio.getSignif(signif));
        } else {
            dicio.addSignif(new Sinonimos(signif));
            sinonimos.add(dicio.getSignif(signif));
        }
    }

    void vincDicio(Dicionario dicio) {
        this.dicio = dicio;
    }
}
