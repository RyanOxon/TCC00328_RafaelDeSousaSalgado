package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao1;

import java.util.ArrayList;

public class Palavra {
    private Dicionario dicio;
    public String grafia;
    public String fonetica;
    ArrayList<Sinonimos> sinonimos = new ArrayList<>();
    
    
    Palavra(String grafia, String fonetica){
        this.grafia = grafia;
        this.fonetica = fonetica;
        
    }
    
    public void addSignificado(String signif, boolean isSubstantivo){
        if(dicio.checkSignif(signif)){
            sinonimos.add(dicio.getSignif(signif));
            dicio.getSignif(signif).palavras.add(this);
        } else {
            if(isSubstantivo)
                dicio.addSignif(new Substantivo(signif));
            else
                dicio.addSignif(new Verbo(signif));
            
            sinonimos.add(dicio.getSignif(signif));
            dicio.getSignif(signif).palavras.add(this);
        }
    }

    void vincDicio(Dicionario dicio) {
        this.dicio = dicio;
    }
}
