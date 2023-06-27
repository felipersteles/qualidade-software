package br.teles.app.model;

import java.util.Scanner;

public class Media {
    private Float[] notas = new Float[3];
    private Float nota4;

    public Media() {
    }

    public Media(Float[] notas) {
        this.notas = notas;
    }

    public Float valor() {
        return soma() / 3;
    }

    private Float soma() {
        Float soma = Float.valueOf(0);
        Float menor = Float.valueOf(11);
        for (Float n : notas) {
            soma += n;
            if (n < menor)
                menor = n;
        }

        if (nota4 != null && nota4 > menor) {
            soma += nota4 - menor;
        }

        return soma;
    }

    public Float menor() {
        Float menor = Float.valueOf(11);
        for (Float n : notas) {
            if (n < menor)
                menor = n;
        }

        return menor;
    }

    public Float[] getNotas() {
        return this.notas;
    }

    public void inserirNotas(Scanner sc) {
        System.out.println("Digite as notas:");
        this.notas[0] = sc.nextFloat();
        this.notas[1] = sc.nextFloat();
        this.notas[2] = sc.nextFloat();

        System.out.println(this.toString());
    }

    public Float getNota4() {
        return this.nota4;
    }

    public void setNota4(Float nota4) {
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return "{" +
                " nota1= " + getNotas()[0] +
                ", nota2= " + getNotas()[1]  +
                ", nota3= " + getNotas()[2] +
                " }";
    }

}
