package br.com.andersonajx;

public final class Pessoa {

    private Veiculo veiculo = new VeiculoNull();

    public Pessoa() {
    }

    public Pessoa(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void utilizarVeiculo() {
        veiculo.mover();
    }

}
