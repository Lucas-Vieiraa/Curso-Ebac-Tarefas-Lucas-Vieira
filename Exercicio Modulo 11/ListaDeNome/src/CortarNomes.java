import java.util.*;

public class CortarNomes {

    private String conjuntoDeNomes = "luciano, carlos, andré, vinicius";
    private String [] nomes = conjuntoDeNomes.split(",");
    private List<String> arrayOrdenado = new ArrayList<>();




    public  void cortarNomes() {
       arrayOrdenado.addAll(Arrays.asList(this.nomes));
       Collections.sort(arrayOrdenado);
       arrayOrdenado.forEach(System.out::println);
       System.out.println(arrayOrdenado.size());
    }



}



