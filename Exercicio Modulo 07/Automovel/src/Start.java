import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro("Renault", "Kiwd E-tech","PDD 8523", 2007,"Preta");
        System.out.println(carro);
        carro.ligarCarro();
        carro.trocarMarcha("D");
        carro.acelerarCarro(40);
        System.out.println(carro);

    }
}
