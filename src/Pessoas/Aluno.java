package Pessoas;

// Reutiliza tudo de Pessoa e adiciona Matrícula
public class Aluno extends Pessoa {
    private String matricula;
    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }
}