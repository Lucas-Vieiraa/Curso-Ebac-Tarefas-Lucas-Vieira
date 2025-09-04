public class PessoaFisica extends Pessoa {
    String cpf;

    @Override
    public String toString() {
        return
                "CPF=" + cpf + "\n" +
                "Nome=" + nome + "\n" +
                "Endereço=" + endereco ;
    }
}
