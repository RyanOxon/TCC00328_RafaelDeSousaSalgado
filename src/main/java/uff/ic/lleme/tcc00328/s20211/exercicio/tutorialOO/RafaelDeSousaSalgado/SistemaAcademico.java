package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SistemaAcademico {
    private static void main(String[] args){
        String arqAluno = "Alunos.txt";
        String arqDisciplinas = "Disciplinas.txt";
        String arqInscricoes = "Inscricoes.txt";
        
        try {
            String[] alunos = carregarAlunos(arqAluno);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar alunos, Arquivo nao encontrado");
        }
        String[] disciplinas = carregarDisciplinas(arqDisciplinas);
        String[] inscricoes = carregarInscricoes(arqInscricoes);
    }
    
    private static String[] carregarAlunos(String nomeArquivo) throws FileNotFoundException{
        InputStream input = new FileInputStream(nomeArquivo);
        
    }
    
    private static String[] carregarDisciplinas(String nomeArquivo){
        #todo
    }

    private static String[] carregarInscricoes(String nomeArquivo) {
        #todo
    }
}
