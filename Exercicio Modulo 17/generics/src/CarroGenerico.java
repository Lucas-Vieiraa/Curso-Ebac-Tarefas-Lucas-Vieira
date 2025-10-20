public abstract class CarroGenerico<M, A, D> {
    private M modelo;
    private A ano;
    private D detalhe;

    public CarroGenerico(M modelo, A ano, D detalhe) {
        this.modelo = modelo;
        this.ano = ano;
        this.detalhe = detalhe;
    }

    public M getModelo() {
        return modelo;
    }

    public A getAno() {
        return ano;
    }

    public D getDetalhe() {
        return detalhe;
    }

    public abstract void exibirInfo();

    @Override
    public String toString() {
        return modelo + " (" + ano + ") - " + detalhe;
    }
}
