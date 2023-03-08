package apresentacao;

import negocio.Autor;
import negocio.Livro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalLivraria {
    public static void main(String[] args) throws IOException {

        //Declaração de variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Livro objLivro = new Livro();

        //Entrada de dados

        System.out.print("Digite o título do livro: ");
        objLivro.setTitulo(leitor.readLine());

        System.out.print("Digite o nome do autor: ");
        objLivro.setObjAutor(new Autor(leitor.readLine()));

        System.out.print("Digite o gênero do livro: ");
        objLivro.setGenero(leitor.readLine());

        //Saídas de dados

        System.out.println("Título do livro: " + objLivro.getTitulo());
        System.out.println("Autor: " + objLivro.getObjAutor().getNome());
        System.out.println("Gênero: " + objLivro.getGenero());
    }
}
