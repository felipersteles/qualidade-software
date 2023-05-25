package br.teles.app.model;

public class Media {
    private Float[] notas;
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

    public void setNotas(Float[] notas) {
        this.notas = notas;
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
                " nota1='" + getNotas()[0] + "'" +
                " nota2='" + getNotas()[1] + "'" +
                " nota3='" + getNotas()[2] + "'" +
                "}";
    }

}
