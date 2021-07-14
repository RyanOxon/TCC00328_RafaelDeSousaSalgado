package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOOcont.RafaelDeSousaSalgado;

public class Turma {
    String codigo;
    Disciplina disciplina;
    int semestre;
    String horario;
    
    Turma(Disciplina disc, String codigo, int semestre, String horario){
        setCodigo(codigo);
        setDisciplina(disc);
        setSemestre(semestre);
        setHorario(horario);
    }
    
    private void setCodigo(String codigo){
        this.codigo = codigo;
    } 
    
    private void setDisciplina(Disciplina disc){
        this.disciplina = disc;
    }
    
    private void setSemestre(int semestre){
        this.semestre = semestre;
    }
    
    private void setHorario(String hora){
        this.horario=hora;
    }
    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    public String getCodigo(){
        return this.codigo;
        
    }
}
