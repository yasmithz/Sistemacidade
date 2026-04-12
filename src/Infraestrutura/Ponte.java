package Infraestrutura;

public class Ponte implements ViaDeAcesso {
    private String materialConstrucao;
    private double limitePesoToneladas;
    private boolean sobreAgua;

    public Ponte(String materialConstrucao, double limitePesoToneladas, boolean sobreAgua) {
        this.materialConstrucao = materialConstrucao;
        this.limitePesoToneladas = limitePesoToneladas;
        this.sobreAgua = sobreAgua;
    }

    public boolean verificarLimitePeso(double pesoVeiculo) {
        return pesoVeiculo <= limitePesoToneladas;
    }

    @Override
    public boolean liberarTrafego() {
        System.out.println("Trânsito na ponte liberado!");
        return true;
    }
}
