package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio20.RafaelDeSousaSalgado;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Apartamento> aps = new ArrayList<>();
    private Sistema sistema;
    
    Hotel(){
        sistema = new Sistema(this);
        addAp(new ApDuplo());
        addAp(new ApSimples());
        addAp(new ApSuite());
        addAp(new ApSimples());
        addAp(new ApTrio());
        addAp(new ApSuite());
    }    
    
    public final void addAp(Apartamento ape){
        aps.add(ape);
        ape.setNum(aps.lastIndexOf(ape));
    }
    
    public ArrayList<Apartamento> getAps(){
        return aps;
    }
    
    public Sistema getSys(){
        return sistema;
    }
}
