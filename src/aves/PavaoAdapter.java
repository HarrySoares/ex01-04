package aves;

class PavaoAdapter implements Cantar {
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void cantar() {
        pavao.emitirSom();
    }
}