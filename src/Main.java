import Infraestrutura.*;
import Edificações.*; // O IntelliJ prefere sem 'ç' e '~' no nome do pacote
import Pessoas.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA CIDADE ---\n");


        ViaDeAcesso minhaEstrada = new Estrada("Asfalto", 60, true);
        Morador morador1 = new Morador("Carlos", "111.222", 35, 3000.0);
        Medico medico1 = new Medico("Dr. Marcos", "333.444", 50, "CRM-999");

        Professor profJulia = new Professor("Julia", "555.666", 28, "Matemática");
        Aluno aluno1 = new Aluno("João Silva", "777.888", 12, "MAT-2024");


        Casa casaDoCarlos = new Casa(minhaEstrada, "Rua das Palmeiras, 45");
        casaDoCarlos.adicionarMorador(morador1);

        Hospital hospitalCentral = new Hospital();

        hospitalCentral.admitirMedico(medico1);

        Escola escolaMunicipal = new Escola("Ensino Fundamental", 100, true, minhaEstrada);


        System.out.println("--- AÇÕES DA ESCOLA ---");
        // Matriculando o aluno
        escolaMunicipal.efetuarMatricula(aluno1);


        escolaMunicipal.contratarProfessor(profJulia);
        profJulia.darAula();


        escolaMunicipal.iniciarAnoLetivo();

        System.out.println("\n--- CENÁRIO DE EMERGÊNCIA ---");
        casaDoCarlos.chamarAmbulancia(hospitalCentral);

        System.out.println("\n--- FIM DA SIMULAÇÃO ---");
    }
}