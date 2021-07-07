package uff.ic.lleme.tcc00328.s20211.exercicio.tutorialOO.RafaelDeSousaSalgado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
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
            System.out.println("Alunos Carregados");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar alunos, Arquivo nao encontrado");
        }
        try {
            disciplinas = carregarDisciplinas(arqDisciplinas);
            System.out.println("Disciplinas Carregadas");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar Disciplinas, Arquivo nao encontrado");
        }
        try {
            inscricoes = carregarInscricoes(arqInscricoes);
            System.out.println("Inscricoes Carregadas");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao carregar as Inscricoes, Arquivo nao encontrado");
        }
            
    }
    
    private static ArrayList<Aluno> carregarAlunos(String nomeArquivo) throws FileNotFoundException{
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input); 
        String nome = " ", matricula = " ", departamento= " ", cpf = " " ;
        String[] dados; //[0] CPF [1] Matricula [2] Departamento [3+] Nome
        ArrayList<Aluno> al = new ArrayList<>();
        while(in.hasNext()){
            dados = in.nextLine().split(" ");
            for(int i = 0; i<dados.length;i++){
                switch (i) {
                    case 0 -> cpf = dados[i];
                    case 1 -> matricula = dados[i];
                    case 2 -> departamento = dados[i];
                    case 3 -> nome = dados[i];
                    default -> {
                        nome = nome.concat(" ");
                        nome = nome.concat(dados[i]);
                    }
                }
            }
            al.add(new Aluno(cpf, matricula, departamento, nome));
        }
        return al;
    }
    
    private static ArrayList<Disciplina> carregarDisciplinas(String nomeArquivo) throws FileNotFoundException{
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String codigo = " " , sigla= " ", nome = " ";
        String[] dados;
        ArrayList<Disciplina> dis = new ArrayList<>();
        while(in.hasNext()){
            dados = in.nextLine().split(" ");
            for(int i = 0;i<dados.length;i++){
                switch (i) {
                    case 0 -> codigo = dados[i];
                    case 1 -> sigla = dados[i];
                    case 2 -> nome = dados[i];
                    default -> {
                        nome = nome.concat(" ");
                        nome = nome.concat(dados[i]);
                    }
                }
            }
            dis.add(new Disciplina(codigo, sigla, nome));
        }
        return dis;
    }

    private static ArrayList<Inscricao> carregarInscricoes(String nomeArquivo) throws FileNotFoundException{
        InputStream input = new FileInputStream(nomeArquivo);
        Scanner in = new Scanner(input);
        String[] dados;
        ArrayList<Inscricao> ins = new ArrayList<>();
        while(in.hasNext()){
            dados = in.nextLine().split(" ");
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
