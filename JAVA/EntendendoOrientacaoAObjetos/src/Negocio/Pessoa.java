package Negocio;

public class Pessoa {

    //Propriedades da classa (todas as propriedades devem ser privativas)

    private String nome = ""; //Uma classe instanciada é um objeto.
    private String endereco = "";
    private long telefone = 0;

    //Métodos construtores da classe (tem o mesmo nome da classe, e possui dois construtores, um vazio e um cheio)

    public Pessoa() {

    }

    public Pessoa(String nome, String endereco, long telefone) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Métodos get/set da classe (get obtemos o valor, set atribuímos valor)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
