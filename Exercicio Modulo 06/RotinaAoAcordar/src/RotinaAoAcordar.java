import java.sql.SQLOutput;
import java.util.Scanner;

public class RotinaAoAcordar {
    public static void main(String[] args) {
        int dormir = 0;
        int despertar = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. O despertador toca");
        System.out.println("2. Abro os olhos");
        System.out.println("3. Decida se posso dormir mais: 1 - Sim ou 2 -Não ");
        dormir = sc.nextInt();
        if (dormir == 1){
            System.out.println("despertador no modo soneca");
            System.out.println("Voltando a dormir...");
            sc.close();
            System.exit(1);
        }else {
            System.out.println("levanto da cama");
            System.out.println("4. 1 - Faço alongamento ou  2 - me espreguiço?");
            despertar = sc.nextInt();
            if (despertar == 1 ){
                System.out.println("Alogando...");
            }else {
                System.out.println("Espreguiçando...");
            }
            sc.close();
            System.out.println("5. Vou ao banheiro");
            System.out.println("6. Escovo os dentes e lavo o rosto");
            System.out.println("7. Preparo o café da manhã");
            System.out.println("8. Me visto e me preparo para o dia");
            System.out.println("9. Saio para o trabalho ou atividades diárias");
        }
    }
}
