package Pessoas;

public class Medico extends Pessoa {
    private String crm;
    public Medico(String nome, String cpf, int idade, String crm) {
        super(nome, cpf, idade);
        this.crm = crm;
    }
}
