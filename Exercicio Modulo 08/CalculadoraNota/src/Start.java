import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double [] notas = new double [4];

        System.out.println("Digite as notas para o calculo ");
        for(int i = 0; i < notas.length; i++){
            notas[i] = scan.nextInt();
        }
        CalculadoraNota calculadoraNota = new CalculadoraNota();
        calculadoraNota.setNota(notas);
        calculadoraNota.calcularNota();

        System.out.print("suas notas são: ");
        System.out.println(Arrays.toString(calculadoraNota.getNota()));

        System.out.print("sua Média: ");
        System.out.println(calculadoraNota.getSomaNota());


    }
}
