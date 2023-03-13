package apresentacao;

import negocio.Estante;
import negocio.Produto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrincipalEstoque {
    public static void main(String[] args) {
        //Declaração de variáveis

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Produto objProduto = new Produto();

        //Entrada de dados

        try {
            System.out.print("Digite o nome do produto: ");
            objProduto.setNome(leitor.readLine());

            System.out.print("Digite o número da estante: ");
            objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine())));

            System.out.print("Digite a quantidade de produtos: ");
            objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
        } catch(Exception erro) {
            System.out.println(erro);
        }

        //Saída de dados

        System.out.println("Nome do produto: " + objProduto.getNome());
        System.out.println("Número da estante: " + objProduto.getObjEstante().getNumero());
        System.out.println("Quantidade: " + objProduto.getQuantidade());
    }
}
