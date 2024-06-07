package main.java.set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunoRemover = a;
            }
        }
        alunoSet.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()){
            return alunosPorNome;
        }else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()){
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        }else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Rodrigo",23L,8.5);
        gerenciadorAlunos.adicionarAluno("Ana",27L,6.9);
        gerenciadorAlunos.adicionarAluno("Celia",10L,4.7);
        gerenciadorAlunos.adicionarAluno("Fernanda",40L,10.0);
        gerenciadorAlunos.adicionarAluno("Zuma",15L,2.5);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.removerAluno(40L);
        gerenciadorAlunos.exibirAlunos();
    }
}
