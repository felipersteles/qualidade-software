package br.teles.app;

import java.util.Scanner;

import br.teles.app.model.Media;
import br.teles.app.model.Turma;

// desenvolvido por felipe teles

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cria a turma
        System.out.println("Bem vindo, professor. Quantos alunos tem na turma?");
        Integer qtdAlunos = sc.nextInt();

        Turma turma = new Turma(qtdAlunos);

        if (turma != null) {
            controle(turma, sc);
        }

        sc.close();
    }

    private static void controle(Turma turma, Scanner sc) {

        System.out.println("Escolha um aluno de 1 a " + (turma.getQtdAlunos() + 1));

        Integer idAluno = sc.nextInt() - 1;
        Media aluno = turma.getAluno(idAluno);
        aluno.inserirNotas(sc);

        Float mediaAluno = aluno.valor();
        System.out.println("A média do aluno " + (idAluno + 1) + ": " + mediaAluno);

        String escolha = "";
        if(mediaAluno < 7){
            System.out.print("Deseja inserir uma quarta nota?[s/n]");
            escolha = sc.next();
        }

        System.out.println(escolha);

        if(escolha.equals("s") || escolha.equals("S")){
            System.out.print("Insira a nota:");
            Float nota4 = sc.nextFloat();
            aluno.setNota4(nota4);

            System.out.println("A nova média é: " + aluno.valor());
        }
    }
}
