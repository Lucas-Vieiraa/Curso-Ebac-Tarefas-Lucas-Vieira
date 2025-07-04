import java.util.Scanner;

public class ConversaoWrappers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo ;
        Integer codigoConvertido;

        System.out.print("Digite um numero para conversão: ");
        codigo = scan.nextInt();
        codigoConvertido = codigo;

        System.out.println("código sem conversão: " +  codigo);
        System.out.println("código com conversão: " +  codigoConvertido);

        double conversaoParaDouble =  codigoConvertido.doubleValue();

        System.out.println("código convertido para double: " +  conversaoParaDouble);

    }
}
