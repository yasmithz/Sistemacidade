package Pessoas;

// Reutiliza tudo de Pessoa e adiciona Renda
public class Morador extends Pessoa {
    private double renda;
    public Morador(String nome, String cpf, int idade, double renda) {
        super(nome, cpf, idade);
        this.renda = renda;
    }
}
