public class Fiat extends CarroGenerico<String, Integer, Boolean> {

    public Fiat(String modelo, Integer ano, Boolean temTurbo) {
        super(modelo, ano, temTurbo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Fiat - Modelo: " + getModelo() +
                " | Ano: " + getAno() +
                " | Turbo: " + (getDetalhe() ? "Sim" : "Não"));
    }
}
