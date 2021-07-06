package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {
    private static void main(String[] args){
        String arqAluno = "Alunos.txt";
        String arqDisciplinas = "Disciplinas.txt";
        String arqInscricoes = "Inscricoes.txt";
        
        try {
            ArrayList<Aluno> alunos = carregarAlunos(arqAluno);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar alunos, Arquivo nao encontrado");
        }
        String[] disciplinas = carregarDisciplinas(arqDisciplinas);
        String[] inscricoes = carregarInscricoes(arqInscricoes);
    }
    
    private static ArrayList<Aluno> carregarAlunos(String nomeArquivo) throws FileNotFoundException {
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura;
        String[] dados = new String[4];
        ArrayList<Aluno> al = new ArrayList<>();
        int pos = 0;
        while(in.hasNext()){
            leitura = in.next();
            while(!leitura.equals("\n")){
                if(pos>3){
                    dados[pos] = dados[pos].concat(leitura); 
                }
                dados[pos] = leitura;
                pos++;    
            }
            al.add(new Aluno(dados[0], dados[1], dados[2], dados[3]));
            pos = 0;
        }
        return al;
    }
    
    private static String[] carregarDisciplinas(String nomeArquivo){
        #todo
    }

    private static String[] carregarInscricoes(String nomeArquivo) {
        #todo
    }
}
