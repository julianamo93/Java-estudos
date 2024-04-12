package ClientesProdutos.Programa;

import ClientesProdutos.Model.Cliente;
import ClientesProdutos.Model.Produto;

import java.util.ArrayList;

public class programa {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        String baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";

        String[] registros = baseDados.split(";");
        for (String registro : registros) {
            String[] dados = registro.split(",");
            if (registro.startsWith("C")) {
                String nome = dados[0].substring(1); // removendo o prefixo "C"
                int idade = Integer.parseInt(dados[1]);
                String cidade = dados[2];
                Cliente c = new Cliente(nome, idade, cidade);
                clientes.add(c);
            } else if (registro.startsWith("P")) {
                String nomeProduto = dados[0].substring(1); // removendo o "P"
                int qtdEstoque = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);
                Produto p = new Produto(nomeProduto, qtdEstoque, preco);
                produtos.add(p);
            }
        }

        System.out.println("\n>>> Clientes <<<");
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Idade: " + c.getIdade());
            System.out.println("Cidade: " + c.getCidade());
            System.out.println();
        }

        System.out.println("\n>>> Produtos <<<");
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNomeProduto());
            System.out.println("Quantidade em estoque: " + p.getQtdEstoque());
            System.out.println("Preço: " + p.getPreco());
            System.out.println();
        }
    }
}
