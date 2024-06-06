package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numero = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "nome = " + nome + '\'' +
                ", Numero Telefone = " + numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
