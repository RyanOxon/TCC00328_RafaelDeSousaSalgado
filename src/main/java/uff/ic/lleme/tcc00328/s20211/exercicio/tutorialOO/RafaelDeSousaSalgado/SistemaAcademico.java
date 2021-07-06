package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class SistemaAcademico {
    private static void main(String[] args){
        String arqAluno = "Alunos.txt";
        String arqDisciplinas = "Disciplinas.txt";
        String arqInscricoes = "Inscricoes.txt";
        
        try {
            Aluno[] alunos = carregarAlunos(arqAluno);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar alunos, Arquivo nao encontrado");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Numero maximo de alunos atingido, Somente permitido 20 alunos");
        }
        String[] disciplinas = carregarDisciplinas(arqDisciplinas);
        String[] inscricoes = carregarInscricoes(arqInscricoes);
    }
    
    private static Aluno[] carregarAlunos(String nomeArquivo) throws FileNotFoundException, ArrayIndexOutOfBoundsException{
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura;
        String[] dados = new String[4];
        Aluno[] al = new Aluno[20];
        int pos = 0, posVetor = 0;
        while(in.hasNext()){
            leitura = in.next();
            while(!leitura.equals("\n")){
                if(pos>3){
                    dados[pos] = dados[pos].concat(leitura); 
                }
                dados[pos] = leitura;
                pos++;    
            }
            al[posVetor] = new Aluno(dados[0], dados[1], dados[2], dados[3]);
            
            
        }
    }
    
    private static String[] carregarDisciplinas(String nomeArquivo){
        #todo
    }

    private static String[] carregarInscricoes(String nomeArquivo) {
        #todo
    }
}
