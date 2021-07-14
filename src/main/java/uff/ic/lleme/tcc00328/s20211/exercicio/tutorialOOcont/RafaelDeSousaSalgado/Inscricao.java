package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOOcont.RafaelDeSousaSalgado;

import uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado.*;

public class Inscricao {
    private Aluno aluno;
    private String data_matricula;
    private String data_cancelamento;
    private Turma turma;
    private float[] notas;
    
    Inscricao(Aluno aluno, Turma turma, String data){
        setAluno(aluno);
        setTurma(turma);
        setData_matricula(data);
        
    }

    private void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    private void setTurma(Turma turma) {
        this.turma = turma;
    }

    private void setData_matricula(String data) {
        this.data_matricula = data;
    }
    
    private void setData_cancelamento(String data){
        this.data_cancelamento = data;
    }
    
    public void setNotas(float[] b){
        this.notas = b;
    }
    
    public Turma getTurma(){
        return this.turma;
    }

    public float[] getNotas() {
        return this.notas;
    }

    public Aluno getAluno() {
        return this.aluno;
    }
    
}
