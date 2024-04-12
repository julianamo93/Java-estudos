package AlunosVestibular.Programa;

import java.util.HashMap;
import AlunosVestibular.Model.Aluno;

public class Programa {
    public static void main(String[] args) {
        HashMap<Integer, Aluno> alunosAprovados = new HashMap<>();

        String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo.";

        String[] linhas = alunosVestibular.split(";");
        int id = 0;
        for (String linha : linhas) {
            String[] dados = linha.split(",");
            String nome = dados[0];
            double nota = Double.parseDouble(dados[1]);
            String cidade = dados[2];

            if (nota >= 7) {
                id++;
                Aluno a = new Aluno(nome, nota, cidade);
                alunosAprovados.put(id, a); // Corrigido para adicionar o objeto Aluno
            }
        }

        for (Aluno a : alunosAprovados.values()) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Nota: " + a.getNota());
            System.out.println("Cidade: " + a.getCidade());
            System.out.println();
        }
    }
}

