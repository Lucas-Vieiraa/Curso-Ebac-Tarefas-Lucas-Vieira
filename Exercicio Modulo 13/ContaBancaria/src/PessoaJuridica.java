public class PessoaJuridica extends Pessoa {
    String cnpj;

    @Override
    public String toString() {
        return
                "CNPJ=" + cnpj + "\n" +
                "Nome=" + nome + "\n" +
                "Endereço=" + endereco;
    }
}
