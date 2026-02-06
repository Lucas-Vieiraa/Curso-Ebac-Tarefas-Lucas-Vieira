import clienteModel.Cliente;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class app {
    public static void main(String[] args) throws NoSuchMethodException {
        Class cliente = Cliente.class;
        System.out.println("Esse é o nome da tabela: " + cliente.getSimpleName());


        try {
            Constructor construtor = cliente.getConstructor();
            Cliente c = (Cliente) construtor.newInstance();
            System.out.println(construtor);
            System.out.println(c);

            Field[] fields = cliente.getDeclaredFields();
           for(Field field : fields){
            Class<?> tipo = field.getType();
            String nome = field.getName();
               System.out.println(tipo);
               System.out.println(nome);
           }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
