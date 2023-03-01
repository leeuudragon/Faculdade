package Apresentacao;

import Negocio.Pessoa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {
    public static void main(String[] args) { //sintaxe para instanciar: classe objeto = new construtor();

        Pessoa objeto1 = new Pessoa();

        System.out.println(objeto1.getNome());

        Pessoa objeto2 = new Pessoa("Leo", "QD 403", 619999);

        System.out.println(objeto2.getNome());
        System.out.println(objeto2.getEndereco());
        System.out.println(objeto2.getTelefone());

        Pessoa objeto3 = new Pessoa();

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("\nDigite o seu nome: ");
            objeto3.setNome(leitor.readLine());

            System.out.print("Digite o seu endereço: ");
            objeto3.setEndereco(leitor.readLine());

            System.out.print("Digite o seu telefone: ");
            objeto3.setTelefone(Long.parseLong(leitor.readLine()));
        } catch (Exception erro) {
            System.out.println(erro);
        }

        System.out.println("Nome: " + objeto3.getNome());
        System.out.println("Endereço: " + objeto3.getEndereco());
        System.out.println("Telefone: " + objeto3.getTelefone());
    }
}
