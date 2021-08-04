
package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

import java.util.ArrayList;
import java.util.Collections;

public class Mesa {
    private ArrayList<Pessoa> participantes = new ArrayList<>();
    private ArrayList<Dado> dados = new ArrayList<>();
    private Pessoa vencedor = null;
    int rodada = 0;
    
    public void Rodada(){
        Collections.shuffle(participantes);
        for (int i = 0; i < participantes.size(); i++) {
            if(emProgresso()){
                System.out.println("\n\nVez de "+ participantes.get(i).getNome() + " rolar: ");
                participantes.get(i).fazerRolagem();
                checaRolagem(participantes.get(i));
            }            
        }
        rodada++;
    }
 
    private void checaRolagem(Pessoa pessoa){
        int resultado = pessoa.calculaValor();
        if(rodada == 0){
            if(resultado == 7 || resultado == 11)
                vencedor = pessoa;
            else if(resultado == 2 || resultado == 3|| resultado == 12){
                participantes.remove(pessoa);
                System.out.println("Ops, tirou "+resultado+", " + pessoa.getNome()+" Perdeu");
            }
            else{
                pessoa.setPonto(resultado);
                System.out.println("O ponto de "+ pessoa.getNome() + " é "+ resultado);
            }
        }else {
            if(resultado == pessoa.getPonto())
                vencedor = pessoa;
            else if(resultado == 7){
                participantes.remove(pessoa);
                System.out.println("Ops, tirou "+resultado+", " + pessoa.getNome()+" Perdeu");
            }
        }
        
    }
    
    public Pessoa getVencedor(){
        return vencedor;
    }
    
    public boolean emProgresso(){
        if(participantes.isEmpty())
            return false;
        else if(vencedor == null)
            return true;
        return false;
        
    }
    public ArrayList<Dado> getDados(){
        return dados;
    }
    
    public void addDado(Dado dado){
        dados.add(dado);
    }
    
    public ArrayList<Pessoa> getPessoas() {
        return participantes;
    }
    
    public void addJogadores(Pessoa pessoa){
        participantes.add(pessoa);
        pessoa.setMesa(this);
    }


}
