package main.java.set.Pesquisa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao,true));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescrição().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConcluido() == true){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConcluido() == false){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public boolean marcarTarefaConcluida(String descricao){
        boolean tarefaConcluida = false;
        for (Tarefa t : tarefaSet){
            if (t.getDescrição().contains(descricao)){
                t.setConcluido(true);

            }
        }
        return tarefaConcluida;
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public boolean marcarTarefaPendente(String descricao){
        boolean tarefaPendente = true;
        for (Tarefa t : tarefaSet){
            if (t.getDescrição().contains(descricao)){
                tarefaPendente = t.setConcluido(false);
            }
        }
        return tarefaPendente;
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Coar Café");
        listaTarefas.adicionarTarefa("Botar açucar");
        listaTarefas.adicionarTarefa("Botar chá");
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Coar Café");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.marcarTarefaPendente("Botar chá");
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaConcluida("Botar chá");
        listaTarefas.exibirTarefas();
    }
}
