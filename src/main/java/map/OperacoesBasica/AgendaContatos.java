package main.java.map.OperacoesBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Rodrigo",111111111);
        agendaContatos.adicionarContato("Maya",34343434);
        agendaContatos.adicionarContato("Bianca",13423123);
        agendaContatos.adicionarContato("Gertrudes",1112321111);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));
        agendaContatos.removerContato("Maya");
        agendaContatos.exibirContato();
    }


}
