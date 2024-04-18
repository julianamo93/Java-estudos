package Arquivos.ExListaComprasArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, linhaProduto;
        double qtd, preco;
        String path= "C:\\temp\\lista.txt";


        ArrayList<String> listaProdutos = new ArrayList<>();

        for (int i=1; i<=3; i++) {
            System.out.print("Digite o nome do " + i + "° produto: ");
            nome = sc.next();


            System.out.print("Digite a quantidade do " + i + "° produto: ");
            qtd = sc.nextDouble();


            System.out.print("Digite o preço do " + i + "° produto: ");
            preco = sc.nextDouble();


            linhaProduto = nome + "," + qtd + "," + preco;


            listaProdutos.add(linhaProduto);
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String produto : listaProdutos) {
                bw.write(produto);
                bw.newLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }


        sc.close();
    }
}

