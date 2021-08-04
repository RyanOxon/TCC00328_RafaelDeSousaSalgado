package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio19.RafaelDeSousaSalgado;

public class Jogo {
    public static void main(String[] args){
        
        Pessoa vencedor = jogar();
        if(vencedor == null)
            System.out.println("\n\nTodos perderam");
        else    
            System.out.println(vencedor.getNome() + " Venceu o jogo");
    }

    private static Pessoa jogar() {
        Mesa mesa = new Mesa();
        mesa.addJogadores(new Pessoa("Rafael"));
        mesa.addJogadores(new Pessoa("Leticia"));
        mesa.addJogadores(new Pessoa("Luiz"));
        mesa.addJogadores(new Pessoa("Jose"));
        mesa.addDado(new Dado(6));
        mesa.addDado(new Dado(6));
        
        while(mesa.emProgresso()){
            mesa.Rodada();
        }
        
        return mesa.getVencedor();
    }
        
        
        
}
    

