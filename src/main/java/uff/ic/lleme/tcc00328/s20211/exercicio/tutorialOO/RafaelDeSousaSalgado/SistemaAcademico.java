package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SistemaAcademico {
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    public static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    public static ArrayList<Inscricao> inscricoes = new ArrayList<>();
    
    public static void main(String[] args){
        String arqAluno = "src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20211\\exercicio\\tutorialOO\\RafaelDeSousaSalgado\\Alunos.txt";
        String arqDisciplinas = "src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20211\\exercicio\\tutorialOO\\RafaelDeSousaSalgado\\Disciplinas.txt";
        String arqInscricoes = "src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20211\\exercicio\\tutorialOO\\RafaelDeSousaSalgado\\Inscricoes.txt";
        
        try {
            alunos = carregarAlunos(arqAluno);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar alunos, Arquivo nao encontrado");
        } catch ( NoSuchElementException ex) {
            System.out.println("Erro no arquivo de alunos, mal formatado");
        }
        try {
            disciplinas = carregarDisciplinas(arqDisciplinas);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar Disciplinas, Arquivo nao encontrado");
        } catch ( NoSuchElementException ex) {
            System.out.println("Erro no arquivo de disciplinas, mal formatado");
        }
        try {
            inscricoes = carregarInscricoes(arqInscricoes);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar as Inscricoes, Arquivo nao encontrado");
        } catch ( NoSuchElementException ex) {
            System.out.println("Erro no arquivo de disciplinas, mal formatado");
        }
            
    }
    
    private static ArrayList<Aluno> carregarAlunos(String nomeArquivo) throws FileNotFoundException, NoSuchElementException {
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura;
        String[] dados = new String[4];
        ArrayList<Aluno> al = new ArrayList<>();
        int pos = 0;
        while(in.hasNext()){
            leitura = in.next();
            while(!leitura.equals("\n") || in.hasNext()){
                if(pos>3)
                    dados[pos-1] = dados[pos-1].concat(leitura); 
                else{
                    dados[pos] = leitura;
                    pos++;
                }
                if(in.hasNext())
                    leitura = in.next();
            }
            al.add(new Aluno(dados[0], dados[1], dados[2], dados[3]));
            pos = 0;
        }
        return al;
    }
    
    private static ArrayList<Disciplina> carregarDisciplinas(String nomeArquivo) throws FileNotFoundException, NoSuchElementException{
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura;
        String[] dados = new String[3];
        ArrayList<Disciplina> dis = new ArrayList<>();
        int pos = 0;
        while(in.hasNext()){
            leitura = in.next();
            while(!leitura.equals("\n")|| in.hasNext()){
                if(pos>2)
                    dados[pos] = dados[pos].concat(leitura);
                else{
                    dados[pos] = leitura;
                    pos++;
                }
                if(in.hasNext()) 
                    leitura = in.next();
            }
            dis.add(new Disciplina(dados[0], dados[1], dados[2]));
            pos = 0;
        }
        return dis;
    }

    private static ArrayList<Inscricao> carregarInscricoes(String nomeArquivo) throws FileNotFoundException, NoSuchElementException  {
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String leitura;
        String[] dados = new String[3];
        int pos = 0;
        ArrayList<Inscricao> ins = new ArrayList<>();
        while(in.hasNext()){
            leitura = in.next();
            while(!leitura.equals("\n")|| in.hasNext()){
                dados[pos] = leitura; //[0] Disciplina :: [1] Matricula :: [2] Data 
                pos++;
                if(in.hasNext()) 
                    leitura = in.next();
            }
            pos = 0;
            for(Disciplina disc : disciplinas ){
                if(disc.getCod().equals(dados[0]))
                    for(Aluno al : alunos)
                        if(al.getMat().equals(dados[1]))
                            ins.add(new Inscricao(al, disc, dados[2])); 
            }
        }
        return ins;
    }
}
