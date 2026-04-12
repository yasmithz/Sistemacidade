package Edificações;
import Infraestrutura.ViaDeAcesso;
import Pessoas.Aluno;
import java.util.ArrayList;
import java.util.List;
import Pessoas.Professor; // IMPORTANTE: Não esquece de importar o Professor!

public class Escola {
    private String nivelEnsino;
    private int capacidadeAlunos;
    private boolean possuiQuadra;
    private ViaDeAcesso via;

    // --- AS LISTAS (As Agregações do diagrama!) ---
    private List<Aluno> alunos = new ArrayList<>();

    // 1. ADICIONADO AQUI: A lista de professores
    private List<Professor> professores = new ArrayList<>();

    // O Construtor
    public Escola(String nivelEnsino, int capacidadeAlunos, boolean possuiQuadra, ViaDeAcesso via) {
        this.nivelEnsino = nivelEnsino;
        this.capacidadeAlunos = capacidadeAlunos;
        this.possuiQuadra = possuiQuadra;
        this.via = via;
    }

    // 2. ADICIONADO AQUI: O método para contratar o professor
    public void contratarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("[ESCOLA] Professor(a) " + professor.getNome() + " contratado(a) para ensinar " + professor.getFormacao() + "!");
    }

    // O método de matricular o aluno
    public void efetuarMatricula(Aluno aluno) {
        if(alunos.size() < capacidadeAlunos) {
            alunos.add(aluno);
            System.out.println("[ESCOLA] Aluno " + aluno.getNome() + " matriculado com sucesso!");
        } else {
            System.out.println("[ESCOLA] Falha: Sem vagas para matricular " + aluno.getNome() + ".");
        }
    }

    // Os métodos originais
    public boolean matricularAluno() {
        if(capacidadeAlunos > 0) {
            capacidadeAlunos--;
            return true;
        }
        return false;
    }

    public void iniciarAnoLetivo() {
        System.out.println("[ESCOLA] Ano letivo iniciado para " + alunos.size() + " alunos e " + professores.size() + " professores!");
    }
}