package Edificações;
import Infraestrutura.ViaDeAcesso;
import Pessoas.Morador;
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private ViaDeAcesso via;
    private String endereco;
    private List<Morador> moradores = new ArrayList<>();

    public Casa(ViaDeAcesso via, String endereco) {
        this.via = via;
        this.endereco = endereco;
    }

    public void adicionarMorador(Morador m) { moradores.add(m); }

    public void chamarAmbulancia(Hospital hospital) {
        System.out.println("[CASA] Solicitando ambulância para o endereço: " + this.endereco);
        hospital.emergencia(this.via, this.endereco);
    }

    public String getEndereco() { return endereco; }
    public List<Morador> getMoradores() { return moradores; }
}