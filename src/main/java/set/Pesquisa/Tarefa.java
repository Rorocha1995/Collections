package main.java.set.Pesquisa;

public class Tarefa {
    private String descrição;
    private boolean concluido;

    public Tarefa(String descrição, boolean concluido) {
        this.descrição = descrição;
        this.concluido = concluido;
    }

    public String getDescrição() {
        return descrição;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public boolean setConcluido(boolean concluido) {
        this.concluido = concluido;
        return concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descrição='" + descrição + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}
