package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao1;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Dicionario dicio = new Dicionario();
        
        dicio.addPalavra(new Palavra("Livro" , "l´ivru"));
        dicio.ultimaPalavra().addSignificado(   "coleção de folhas de papel, impressas ou não, reunidas em cadernos cujos dorsos são unidos por" +     
                                                "meio de cola, costura etc., formando um volume que se recobre com capa resistente.", true);
        dicio.ultimaPalavra().addSignificado(   "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de" + 
                                                " documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].", true);
        
        dicio.addPalavra(new Palavra("Obra", "o·bra"));
        dicio.ultimaPalavra().addSignificado(" aquilo que resulta de um trabalho, de uma ação. ", true);
        dicio.ultimaPalavra().addSignificado(   "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de" + 
                                                " documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].", true);
        
        ArrayList<Palavra> teste = dicio.PesquisarSignif(  "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de" + 
                                " documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].");
        
        teste.forEach(p -> {
            System.out.println(p.grafia);
        });
    }   
}
