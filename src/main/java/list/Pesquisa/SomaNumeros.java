package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public List<Integer> getNumerosList() {
        return numerosList;
    }

    @Override
    public String toString() {
        return "numerosList = " + numerosList;
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int valorSoma = 0;
        if (!numerosList.isEmpty()){
            for (Integer n : numerosList){
                valorSoma += n;
            }

        }
        return valorSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Integer numero : numerosList){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : numerosList){
            if (numero <= menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(4);
        System.out.println(somaNumeros.calcularSoma());
        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }

}
