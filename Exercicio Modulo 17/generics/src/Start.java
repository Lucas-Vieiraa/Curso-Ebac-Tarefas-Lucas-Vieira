public class Start {
    public static void main(String[] args) {
        ListaGenerica<Fiat> listaFiat = new ListaGenerica<>();
        ListaGenerica<Chevrolet> listaChevrolet = new ListaGenerica<>();

        Fiat uno = new Fiat("Uno Mille", 2010, false);
        Fiat pulse = new Fiat("Pulse Abarth", 2023, true);

        Chevrolet camaro = new Chevrolet("Camaro SS", 2024, "V8 6.2");
        Chevrolet onix = new Chevrolet("Onix LTZ", 2023, "1.0 Turbo");

        listaFiat.adicionar(uno);
        listaFiat.adicionar(pulse);

        listaChevrolet.adicionar(camaro);
        listaChevrolet.adicionar(onix);

        listaFiat.listar();
        listaChevrolet.listar();

        System.out.println("\nBuscando por modelo 'Camaro SS'...");
        CarroGenerico<?, ?, ?> encontrado = listaChevrolet.buscarPorModelo("Camaro SS");
        if (encontrado != null) {
            encontrado.exibirInfo();
        } else {
            System.out.println("Carro não encontrado!");
        }
    }
}
