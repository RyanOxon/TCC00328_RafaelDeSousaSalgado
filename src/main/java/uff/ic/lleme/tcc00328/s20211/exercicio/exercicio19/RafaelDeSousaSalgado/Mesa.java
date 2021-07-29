
package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

import java.util.ArrayList;

public class Mesa {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    int rodada = 0;
    
    public int fazerRolagem(Dado dado1, Dado dado2){
        int roll_1 = (int)Math.floor(Math.random()*(dado1.getLados())+1);
        int roll_2 = (int)Math.floor((Math.random()*(dado2.getLados())+1));
        System.out.println("Foram rolados os numeros " +roll_1 + " e " + roll_2);
        return roll_1 + roll_2;
    }

    public void startGame() {
        nextRound();
        pessoas.forEach(p ->p.setStatus("Jogando"));
    }

    public boolean inGame() {
        if (pessoas.stream().anyMatch(p -> (p.getStatus().equals("Jogando"))))
            return true;
        
        return false;            
    }
    
    public void nextRound(){
        this.rodada++;
    }
    
    public void endGame(){
        this.rodada = 0;
        pessoas.forEach(p -> p.setStatus("Aguardando"));
    }
    
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    
    public void addJogadores(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public int getRound() {
        return this.rodada;
    }
}
