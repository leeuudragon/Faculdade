package negocio;

public class Estante {
    //Propriedades da classe

    private int numero = 0;

    //Métodos construtores


    public Estante() {
    }

    public Estante(int numero) {
        this.numero = numero;
    }

    //Métodos get/set da classe


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
