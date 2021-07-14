package uff.ic.lleme.tcc00328.s20211.prova.p1.RafaelDeSousaSalgado.Questao2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Gestao {
    public static Prato[] pratos; 
    public static Pedido[] pedidos;
    
    public static void main(String[] args){
        try{
        pratos = carregaPratos("src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20211\\prova\\p1\\RafaelDeSousaSalgado\\Questao2\\pratos.txt");
        pedidos = carregaPedidos("src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20211\\prova\\p1\\RafaelDeSousaSalgado\\Questao2\\pedidos.txt");
        } catch(FileNotFoundException ex){
            System.out.println("Arquivos nao encontrado");
        }
        //int numPedido = 0;
        //geraConta(numPedido);
        percentPedido();
    }

    private static Prato[] carregaPratos(String arq)throws FileNotFoundException {
        InputStream input = new FileInputStream(arq);
        Scanner in = new Scanner(input);
        String nome = "";
        float valor = 0.0f;
        String[] dados; //[0] valor | [1+] Nome
        Prato[] pr = new Prato[10];
        int pos = 0;
        while(in.hasNext()){
            dados = in.nextLine().split(" ");
            for(int i = 0; i<dados.length;i++){
                switch (i) {
                    case 0 -> valor = Float.parseFloat(dados[i]);
                    case 1 -> nome = dados[i];
                    default -> {
                        nome = nome.concat(" ");
                        nome = nome.concat(dados[i]);
                    }
                }
            }
            pr[pos] = new Prato(nome, valor);
            pos++;
        }
        return pr;
    }

    private static Pedido[] carregaPedidos(String arq)throws FileNotFoundException {
        InputStream input = new FileInputStream(arq);
        Scanner in = new Scanner(input);
        String nome = "";
        int qnt = 0;
        Pedido[] pd = new Pedido[10];
        for(int i = 0; i<pd.length;i++)
            pd[i] = new Pedido();
        int posItem = 0;
        int posPd = 0;
        String[] dados; //[0] Qnt | [1+] Nome
        
        while(in.hasNext()){
            dados = in.nextLine().split(" ");
            while(!dados[0].equals("0")){
                
                for(int i = 0; i<dados.length;i++){
                    switch (i) {
                        case 0 -> qnt = Integer.parseInt(dados[i]);
                        case 1 -> nome = dados[i];
                        default -> {
                            nome = nome.concat(" ");
                            nome = nome.concat(dados[i]);
                        }
                    }
                }
                for(Prato pr : pratos)
                    if(pr != null)
                        if(pr.getNome().equals(nome)){
                            pd[posPd].setItem(new Item(qnt, pr), posItem);
                            posItem++;
                            break;
                    }
                dados = in.nextLine().split(" "); 
            }
            posPd++;
            posItem = 0;
        }
        return pd;
    }    

    /*private static void geraConta(int ped)  {
        if(ped>pedidos.length){
            System.out.println(" Pedido Nao existe!");
        }else{
            float total = 0;
        
            for(Item it : pedidos[ped].itens)
                if(it != null){
                    System.out.println(it.getQnt()+ "x "+ it.getPrato().getNome());
                    total += it.getQnt()*it.getPrato().getPreco();
                }
        
            System.out.printf("O valor da conta do pedido %d é %.2f reais", ped , total);
        }
    }*/

    private static void percentPedido() {
        int[] qntPratos = new int[pratos.length];
        int total = 0;
        for(int j = 0; j<qntPratos.length;j++)
            qntPratos[j] = 0;
        for(Pedido pd : pedidos){
            for(int i = 0; i<pratos.length;i++){
                if(pd !=null && pratos[i]!= null){
                    for(Item it : pd.itens){
                        if(it !=null)
                            if(pratos[i].getNome().equals(it.getPrato().getNome())){
                                qntPratos[i] += it.getQnt();
                                total += it.getQnt();
                        }
                            
                    }
                }
                
            }
        }
        for( int i = 0; i<pratos.length;i++){
            if(pratos[i] != null){
                System.out.printf("Prato: %s > " , pratos[i].getNome());
                System.out.printf("%.0f %% \n", ((float)qntPratos[i]/total)*100);
            }
        }
    }
}
