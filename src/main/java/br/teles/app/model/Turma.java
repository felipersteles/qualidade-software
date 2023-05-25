package br.teles.app.model;

public class Turma {
    private String professor;
    private Integer qtdAlunos;
    private Media[] medias;

    public Turma(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
        this.medias = new Media[qtdAlunos];
    }

    public Media[] getMedias() {
        return medias;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Integer getQtdAlunos() {
        return this.qtdAlunos;
    }

    @Override
    public String toString() {
        return "{" +
                " professor='" + getProfessor() + "'" +
                ", qtdAlunos='" + getQtdAlunos() + "'" +
                ", medias='" + getMedias() + "'" +
                "}";
    }

}
