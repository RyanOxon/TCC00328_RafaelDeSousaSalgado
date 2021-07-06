package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

public class Aluno extends Pessoa {
    private String matricula;
    private String unidade;
    private Inscricao[] inscricoes;
    
    Aluno(String cpf, String matricula, String sigla, String nome){
        super(nome, cpf);
        setMatricula(matricula);
        setUnidade(sigla);
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private void setUnidade(String sigla) {
        this.unidade = sigla;
    }
    
}
