package br.com.andersonajx;

public final class Pessoa {

    private Veiculo veiculo;

    public Pessoa() {
    }

    public Pessoa(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void utilizarVeiculo() {
        if (veiculo != null) {
            veiculo.mover();
        }
    }

}
