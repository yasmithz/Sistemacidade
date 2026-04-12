package Edificações;
import Infraestrutura.ViaDeAcesso;
import Pessoas.*;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Medico> medicos = new ArrayList<>();


    public void admitirMedico(Medico m) {
        medicos.add(m);
    }
    public void emergencia(ViaDeAcesso v, String destino) {
        System.out.println("[HOSPITAL] Chamado recebido! Preparando equipe médica...");
        if (v.liberarTrafego()) {
            System.out.println("[HOSPITAL] Ambulância a caminho do destino: " + destino);
        } else {
            System.out.println("[HOSPITAL] Falha no envio: Via obstruída.");
        }
    }
}
