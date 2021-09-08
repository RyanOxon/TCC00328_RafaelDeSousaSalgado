package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao1;

import java.util.ArrayList;

public class Dicionario {
    
    public ArrayList<Palavra> palavras = new ArrayList<>();
    private ArrayList<Sinonimos> sin = new ArrayList<>();
    
    public void addPalavra(Palavra palavra){
        palavras.add(palavra);
        palavras.get(palavras.size()-1).vincDicio(this);
        

    }

    public boolean checkSignif(String signif) {
        return sin.stream().anyMatch(s -> (s.significado.equals(signif)));
    }

    public Sinonimos getSignif(String signif) {
        for( Sinonimos s : sin){
            if(s.significado.equals(signif))
                return s;
        }
        return null;
    }

    public void addSignif(Sinonimos sinonimos) {
        sin.add(sinonimos);
    }

    public Palavra ultimaPalavra() {
        return palavras.get(palavras.size()-1);
    }

    public ArrayList<Palavra> PesquisarSignif(String signif) {
        for( Sinonimos s : sin)
            if(s.significado.equals(signif))
                return s.palavras;
        return null;        
        }
}    

