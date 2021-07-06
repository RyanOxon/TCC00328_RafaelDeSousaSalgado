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
        try {
            ArrayList<Disciplina> disciplinas = carregarDisciplinas(arqDisciplinas);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar Disciplinas, Arquivo nao encontrado");
        }
        try {
            ArrayList<Inscricao> Inscricoes = carregarInscricoes(arqInscricoes);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar as Inscricoes, Arquivo nao encontrado");
        } catch (Exception e) {
            
        }
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
    
    private static ArrayList<Disciplina> carregarDisciplinas(String nomeArquivo) throws FileNotFoundException{
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura;
        String[] dados = new String[3];
        ArrayList<Disciplina> dis = new ArrayList<>();
        int pos = 0;
        while(in.hasNext()){
            leitura = in.next();
            while(!leitura.equals("\n")|| in.hasNext()){
                if(pos>2){
                    dados[pos] = dados[pos].concat(leitura);
                    if(in.hasNext()) 
                        leitura = in.next();
                }else{
                dados[pos] = leitura;
                pos++;
                if(in.hasNext()) 
                    leitura = in.next();
                }
            }
            dis.add(new Disciplina(dados[0], dados[1], dados[2]));
            pos = 0;
        }
        return dis;
    }

    private static ArrayList<Inscricao> carregarInscricoes(String nomeArquivo) throws FileNotFoundException, Exception {
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura = in.next();
        String[] dados = new String[4];
        ArrayList<Inscricao> ins = new ArrayList<>();
        while(in.hasNext()){
            
            for(int i = 0; i<3;i++){
                dados[i] = leitura;
                if(in.hasNext()) 
                    leitura = in.next();
                else 
                }
            
        }
        return ins;
    }
}
