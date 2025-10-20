public class Chevrolet extends CarroGenerico<String, Integer, String> {

    public Chevrolet(String modelo, Integer ano, String motor) {
        super(modelo, ano, motor);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Chevrolet - Modelo: " + getModelo() +
                " | Ano: " + getAno() +
                " | Motor: " + getDetalhe());
    }
}
