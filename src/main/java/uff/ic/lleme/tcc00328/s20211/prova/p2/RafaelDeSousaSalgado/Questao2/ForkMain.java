package uff.ic.lleme.tcc00328.s20211.prova.p2.RafaelDeSousaSalgado.Questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkMain {
    
    public static void main(String[] args) throws InterruptedException {
        List<Double> numeros = new ArrayList<>();
        Resultado result = new Resultado();
        for (int i = 0; i<100000000;i++){   // Tempo de execucao menor que 5segs
            Double num = Math.random()*100; // math Random nao e tao aleatorio, media sempre cai
            numeros.add(num);               // no 50
            //System.out.print("[" + num + "] ");
        }
        
        ForkSoma fb = new ForkSoma(numeros, result);
        ForkJoinPool pool = new ForkJoinPool();
        
        pool.invoke(fb);
        
        System.out.println();
        System.out.println("A media dos numeros da ArrayList é: "+ result.media(numeros.size()));
  
    }
}
