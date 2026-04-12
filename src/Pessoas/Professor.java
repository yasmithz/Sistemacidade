package Pessoas;

// Reutiliza tudo de Pessoa e adiciona C

public class Professor extends Pessoa {
    private String formacao; // Ex: "Matemática", "História"

    public Professor(String nome, String cpf, int idade, String formacao) {
        super(nome, cpf, idade);
        this.formacao = formacao;
    }

    public String getFormacao() { return formacao; }

    public void darAula() {
        System.out.println("[PROFESSOR] " + nome + " está ministrando aula de " + formacao);
    }
}
