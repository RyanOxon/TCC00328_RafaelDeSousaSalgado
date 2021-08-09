package uff.ic.lleme.tcc00328.s20211.exercicio.exercicio23.RafaelDeSousaSalgado.num2;

public class Teste {
    public static void main(String[] args) {
        Lista<Integer> list = new Lista<>();
        list.incluir(0);
        imprimeLista(list);
        list.incluir(1);
        imprimeLista(list);
        list.remover(0);
        imprimeLista(list);
        for (int i = 0; i < 10; i++)
            list.incluir(i);
        imprimeLista(list);
        for (int i = 1; i < list.tamanho(); i +=2)
            list.remover(i);
        imprimeLista(list);
        for (int i = 1; i < 100; i*=i+1)
            list.incluir(i);
        imprimeLista(list);
        for (int i = list.tamanho(); i > 0 ; i-=2)
            list.remover(i);
        imprimeLista(list);
    }

    private static void imprimeLista(Lista<Integer> list) {
        
        for (int i = 0; i < list.tamanho(); i++)
            System.out.printf("[%d]", list.recuperar(i));
        System.out.println("\n------------------------------");
    }
    
    
}
