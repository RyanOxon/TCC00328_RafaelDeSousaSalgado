/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

public class Dado {
    private int lados;
    private int valor;
    
    Dado(int lados){
        setLados(lados);
    }
    
    public void sortear(){
        setValor((int)Math.floor(Math.random()*(getLados())+1));
    }
    
    private void setLados(int lados) {
        this.lados = lados;
    }
    
    public int getLados(){
        return lados;
    }
    
    private void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
    

}
