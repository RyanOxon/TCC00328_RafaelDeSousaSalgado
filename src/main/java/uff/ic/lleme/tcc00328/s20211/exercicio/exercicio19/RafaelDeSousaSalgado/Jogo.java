package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

public class Jogo {
    public static void main(String[] args){
        Mesa mesa = new Mesa();
        mesa.addJogadores(new Pessoa("Rafael"));
        mesa.addJogadores(new Pessoa("Leticia"));
        Dado dado1 = new Dado(6); //Lados do dado
        Dado dado2 = new Dado(6);
        
        mesa.startGame();
        
        while(mesa.inGame()){
            if(mesa.getRound() == 1){
                System.out.println("Primeira Rodada \n----------------");
                for(Pessoa p:mesa.getPessoas()){
                    if(p.getStatus().equals("Jogando")){
                        System.out.println("\nVez de: "+ p.getNome());
                        int rolagem = mesa.fazerRolagem(dado1, dado2);
                        if(rolagem == 7 || rolagem == 11){
                            p.setStatus("Ganhou");
                            System.out.println("Que sorte! "+ p.getNome()+ " Ganhou na Primeira Rodada ");
                        }
                        else if(rolagem == 2 || rolagem == 3 || rolagem == 12){
                            p.setStatus("Perdeu");
                             System.out.println("Que Azar! "+ p.getNome()+ " Perdeu na Primeira Rodada ");
                        }
                        else
                            p.setPonto(rolagem);
                    }
                }
            }else{
                System.out.println("\n--------------\nRodada: "+ mesa.getRound() + " \n--------------");
                for(Pessoa p:mesa.getPessoas()){
                    if(p.getStatus().equals("Jogando")){
                        System.out.println("\nVez de: "+ p.getNome());
                        System.out.println("O ponto é: " + p.getPonto());
                        int rolagem = mesa.fazerRolagem(dado1, dado2);
                        if(rolagem == p.getPonto()){
                            p.setStatus("Ganhou");
                            System.out.println("Opaaa, " +p.getNome()+ " Acertou o ponto e ganhou!");
                        }
                        else if(rolagem == 7){
                            p.setStatus("Perdeu");
                            System.out.println("Eita!, " +p.getNome()+ " Tirou 7 e perdeu!");
                        }
                    }
                }
            }
            mesa.nextRound();
            
        }
        mesa.endGame();
        
        
    }
    
}
