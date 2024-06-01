package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : carrinhoList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itemParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!carrinhoList.isEmpty()){
            for (Item item : carrinhoList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal+=valorItem;
            }
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(carrinhoList);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Lápis",2d,3);
        carrinhoDeCompras.adicionarItem("Lápis",2d,3);
        carrinhoDeCompras.adicionarItem("Caderno",35d,1);
        carrinhoDeCompras.adicionarItem("Borracha",2d,2);


        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
