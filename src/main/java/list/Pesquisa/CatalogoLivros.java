package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }
    public  List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervalosAnos.add(l);
                }
            }
        }
        return livroPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O algoz","R,R James",2019);
        catalogoLivros.adicionarLivro("O alquimista","R,R James",2019);
        catalogoLivros.adicionarLivro("O lobo","R,R James",2019);
        catalogoLivros.adicionarLivro("Java Iniciantes","Morgan James",2018);
        catalogoLivros.adicionarLivro("Como aumentar o Q.I","Livia A Silva",2020);
        catalogoLivros.adicionarLivro("O Bruxo","James Brown",2023);
        catalogoLivros.adicionarLivro("O Mago","A A Silva",2024);
        catalogoLivros.adicionarLivro("O Beast","Pedro Cabral",2015);

        System.out.println(catalogoLivros.pesquisarPorAutor("R,R James"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2024));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Mago"));

    }
}
