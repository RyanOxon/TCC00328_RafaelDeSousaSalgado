package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio20.RafaelDeSousaSalgado;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String[] entrada; //[0] dia / [1] mes / [2] ano
    private String[] saida;
    private String[] quartos;
    private int reserva;
    
    Pessoa(String nome, String cpf, String telefone, String[] entrada, String[] saida){
        
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String[] getEntrada(){
        return entrada;
    }
    
    public String[] getSaida(){
        return saida;
    }
    
    public String[] getQuartos(){
        return quartos;
    }
    
    public void setReserva(int numRes){
        reserva = numRes;
    }
    
    public int getNumReserva(){
        return reserva;
    }
}
