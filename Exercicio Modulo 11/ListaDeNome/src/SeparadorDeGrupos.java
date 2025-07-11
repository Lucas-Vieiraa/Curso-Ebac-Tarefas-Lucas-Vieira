import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparadorDeGrupos {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os nomes e os sexos no formato 'Nome-Sexo'.");
        System.out.println("Exemplos: 'Carlos-Masculino' ou 'Ana-Feminino'.");
        System.out.println("Digite 'sair' quando terminar.");
        System.out.println("---------------------------------------------");


        while (true) {
            System.out.print("Digite o próximo nome: ");
            String entrada = scanner.nextLine();


            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Usa o comando split para separar o nome do sexo, usando o hífen como delimitador
            String[] partes = entrada.split("-");


            if (partes.length != 2) {
                System.out.println("Formato inválido. Por favor, use 'Nome-Sexo'.");
                continue; // Pula para a próxima iteração do loop
            }

            // Pega o nome e o sexo, removendo espaços em branco extras
            String nome = partes[0].trim();
            String sexo = partes[1].trim();

            // Separa a pessoa no grupo correspondente
            if (sexo.equalsIgnoreCase("Masculino")) {
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo '" + sexo + "' não reconhecido. Use 'Masculino' ou 'Feminino'.");
            }
        }

        scanner.close();


        System.out.println("\n----- Resultados Finais -----");

        System.out.println("\nGrupo de Pessoas do Sexo Masculino:");
        if (grupoMasculino.isEmpty()) {
            System.out.println("Nenhuma pessoa do sexo masculino na lista.");
        } else {
            for (String nome : grupoMasculino) {
                System.out.println("- " + nome);
            }
        }

        System.out.println("\nGrupo de Pessoas do Sexo Feminino:");
        if (grupoFeminino.isEmpty()) {
            System.out.println("Nenhuma pessoa do sexo feminino na lista.");
        } else {
            for (String nome : grupoFeminino) {
                System.out.println("- " + nome);
            }
        }
    }
}