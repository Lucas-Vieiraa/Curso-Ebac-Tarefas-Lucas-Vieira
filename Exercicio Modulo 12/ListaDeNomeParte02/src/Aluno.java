import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Aluno {
    String nome;
    Character sexo;
    int Id;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    Scanner scanner = new Scanner(System.in);
    Map<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
    Map<Integer, Aluno> alunas = new HashMap<Integer, Aluno>();

    public void cadastrarAluno() {
        int quantidadeAluno = 0;
       System.out.print("Digite a quantidade de alunos que deseja adicionar: ");
       quantidadeAluno = scanner.nextInt();


       for (int i = 0; i < quantidadeAluno; i++) {
           Aluno aluno = new Aluno();
           aluno.setId(i + 1);
           System.out.print("Digite um nome: ");
           aluno.setNome(scanner.next());
           System.out.print("Digite o sexo: ");
           aluno.setSexo(scanner.next().toUpperCase().charAt(0));

           if (aluno.getSexo() == 'M') {
               alunos.put(aluno.getId(), aluno);
           }else  {
               alunas.put(aluno.getId(), aluno);
           }

       }
    }

    public void consultarAlunos() {
        System.out.println("-------------------ALUNOS----------------------- " + "\n");
        for (Map.Entry<Integer, Aluno> entry : alunos.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() + "\n");
        }
        System.out.println("-------------------ALUNAS----------------------- " + "\n");
        for (Map.Entry<Integer, Aluno> entry : alunas.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() + "\n");
        }
    }


    @Override
    public String toString() {
        return "  ----------------------------------------"+"\n" +
               "        Nome = " +  nome + ", Sexo = " + sexo + "\n" +
               "        ----------------------------------------" ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno that = (Aluno) o;
        return Id == that.Id && Objects.equals(nome, that.nome) && Objects.equals(sexo, that.sexo) && Objects.equals(scanner, that.scanner) && Objects.equals(alunos, that.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo, Id, scanner, alunos);
    }
}
