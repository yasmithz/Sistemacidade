package Infraestrutura;

public class Estrada implements ViaDeAcesso {
    private String materialPavimento;
    private int limiteVelocidade;
    private boolean ehMaoDupla;

    public Estrada(String materialPavimento, int limiteVelocidade, boolean ehMaoDupla) {
        this.materialPavimento = materialPavimento;
        this.limiteVelocidade = limiteVelocidade;
        this.ehMaoDupla = ehMaoDupla;
    }

    @Override
    public boolean liberarTrafego() {
        System.out.println("[INFRA] Trânsito na estrada de " + materialPavimento + " liberado.");
        return true;
    }
}