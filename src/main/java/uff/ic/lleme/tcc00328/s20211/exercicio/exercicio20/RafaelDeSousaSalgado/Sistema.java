package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio20.RafaelDeSousaSalgado;

import java.util.ArrayList;

public class Sistema {
    private Hotel hotel;
    private ArrayList<Reserva> reservas = new ArrayList<>();
    
    Sistema(Hotel h){
        hotel = h;
    }
    
    public void fazerReserva(Pessoa p){
        reservas.add(new Reserva(p));
        p.setReserva(reservas.size());
    }   
    
    
}
