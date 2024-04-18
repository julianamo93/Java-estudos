package Arquivos.ExListaComprasArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CalculaTotal {
    public static void main(String[] args) {
        String listaPath = "C:\\temp\\lista.txt";
        String totalPath = "C:\\temp\\total.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(listaPath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(totalPath))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                // Separando os valores da linha
                String[] valores = linha.split(",");
                String nome = valores[0];
                double qtd = Double.parseDouble(valores[1]);
                double preco = Double.parseDouble(valores[2]);

                // Calculando o preço total
                double precoTotal = qtd * preco;

                // Escrevendo o resultado no arquivo total.txt
                bw.write(nome + ": " + precoTotal);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
