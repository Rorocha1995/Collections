package main.java.set.Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    //atributo
    private String nome;
    private double nota;
    private long matricula;

    public Aluno(String nome,long matricula,double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public String toString() {
        return "Aluno " + nome + '\'' +
                ", nota = " + nota +
                ", matricula = " + matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome()) ;
    }
}

class ComparatorPorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(),a2.getNota());
    }
}
