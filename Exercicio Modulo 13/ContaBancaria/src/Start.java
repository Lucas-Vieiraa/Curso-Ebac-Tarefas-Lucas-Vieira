public class Start {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();

        pessoaFisica.nome = "Carlos";
        pessoaFisica.endereco = "Rio Federal";
        pessoaFisica.cpf = "123.456.789";

        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaJuridica.nome = "Pedro comercio construtora";
        pessoaJuridica.endereco = "Rio maracaipe";
        pessoaJuridica.cnpj = "45.764.950/0001-52" ;

        System.out.println("============================= \n");
        System.out.println("Inprimindo a pessoa física\n");
        System.out.println(pessoaFisica + "\n");
        System.out.println("============================= \n");
        System.out.println("Inprimindo a pessoa Juridica\n");
        System.out.println(pessoaJuridica);
    }
}
