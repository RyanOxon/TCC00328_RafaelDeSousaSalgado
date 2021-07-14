package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOOcont.RafaelDeSousaSalgado;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private String matricula;
    private String unidade;
    private ArrayList<Inscricao> inscricoes = new ArrayList<>();
    
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
    
    public void addInscricao(Inscricao ins){
        this.inscricoes.add(ins);
    }
    
    public void delInscricao(Inscricao ins){
        this.inscricoes.remove(ins);
    }
    
    public boolean verificaInscricao(String a){
        for(Inscricao i: inscricoes){
            if(i.getTurma().getDisciplina().getCod().equals(a))
                return true;
        }
        return false;
    }
    
    public String getMat(){
        return this.matricula;
    }

    public Inscricao achaInscricao(String b) {
        for(Inscricao i: inscricoes)
            if(i.getTurma().getDisciplina().getCod().equals(b))
                return i;
        
        return null;
    }
    
}
