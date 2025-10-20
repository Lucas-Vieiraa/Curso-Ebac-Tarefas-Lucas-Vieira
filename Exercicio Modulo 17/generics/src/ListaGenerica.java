import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T extends CarroGenerico<?, ?, ?>> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T item) {
        lista.add(item);
    }

    public void remover(T item) {
        lista.remove(item);
    }

    public void listar() {
        System.out.println("\n--- Lista de " +
                (lista.isEmpty() ? "Carros" : lista.get(0).getClass().getSimpleName()) + " ---");
        for (T item : lista) {
            item.exibirInfo();
        }
    }

    public int tamanho() {
        return lista.size();
    }

    public T buscarPorModelo(Object modelo) {
        for (T item : lista) {
            if (item.getModelo().equals(modelo)) {
                return item;
            }
        }
        return null;
    }
}
