package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

public class Inscricao {
    private Aluno aluno;
    private String data_matricula;
    private String data_cancelamento;
    private Disciplina disciplina;
    private float[] notas;
    
    Inscricao(Aluno aluno, Disciplina disciplina, String data){
        setAluno(aluno);
        setDisciplina(disciplina);
        setData_matricula(data);
        
    }

    private void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    private void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    private void setData_matricula(String data) {
        this.data_matricula = data;
    }
    
    private void setData_cancelamento(String data){
        this.data_cancelamento = data;
    }
}
