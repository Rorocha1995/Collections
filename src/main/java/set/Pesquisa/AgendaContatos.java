package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarCOntato(String nome,int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarCOntato("Contato 1", 1112);
        agendaContatos.adicionarCOntato("Contato 2", 1113);
        agendaContatos.adicionarCOntato("Contato 3", 1114);
        agendaContatos.adicionarCOntato("Contato 4", 1115);
        agendaContatos.adicionarCOntato("Contato 5", 1116);
        agendaContatos.adicionarCOntato("Contato 5", 1117);
        agendaContatos.adicionarCOntato("Contato 6", 1118);
        agendaContatos.adicionarCOntato("Contato 7", 1119);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));
        agendaContatos.atualizarNumeroContato("Contato 1",1109);
        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));

    }

}
