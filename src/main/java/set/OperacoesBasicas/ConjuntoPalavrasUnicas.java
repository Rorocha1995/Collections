package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public Set<String> getPalavrasUnicasSet() {
        return palavrasUnicasSet;
    }

    @Override
    public String toString() {
        return "palavrasUnicasSet = " + palavrasUnicasSet;
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
       if (palavrasUnicasSet.contains(palavra)){
           palavrasUnicasSet.remove(palavra);
       }
    }

    public boolean verificarPalavra(String palavra){
       return palavrasUnicasSet.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Navio");
        conjuntoPalavrasUnicas.adicionarPalavra("Agua");
        conjuntoPalavrasUnicas.adicionarPalavra("Mar");
        conjuntoPalavrasUnicas.adicionarPalavra("Rio");
        conjuntoPalavrasUnicas.adicionarPalavra("Navio");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
