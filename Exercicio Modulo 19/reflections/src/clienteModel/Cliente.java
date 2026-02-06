package clienteModel;

import anotacoes.TabelaClientes;


@TabelaClientes(cliente = {"Lucas", "Andre"})
public class Cliente {
    @TabelaClientes(cliente = {"silva", "vieira"})
    String nome;

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        Nome = nome;
    }

}

