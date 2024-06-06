package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    public ConjutoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjutoConvidados conjutoConvidados = new ConjutoConvidados();
        System.out.println("Existen " + conjutoConvidados.contarConvidado() + " dentro do Set de Convidados");

        conjutoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjutoConvidados.adicionarConvidado("Convidado 2", 12345);
        conjutoConvidados.adicionarConvidado("Convidado 3", 12345);
        conjutoConvidados.adicionarConvidado("Convidado 4", 12346);

        System.out.println("Existen " + conjutoConvidados.contarConvidado() + " dentro do Set de Convidados");

        conjutoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existen " + conjutoConvidados.contarConvidado() + " dentro do Set de Convidados");

        conjutoConvidados.exibirConvidado();
   }
}
