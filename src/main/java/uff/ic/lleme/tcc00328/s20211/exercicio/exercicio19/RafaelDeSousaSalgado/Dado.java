/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

public class Dado {
    private int lados;
    
    Dado(int lados){
        setLados(lados);
    }

    private void setLados(int lados) {
        this.lados = lados;
    }
    
    public int getLados(){
        return lados;
    }
}
