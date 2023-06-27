package br.teles.app.model;

public class Turma {
    private String professor;
    private Integer qtdAlunos;
    private Media[] medias;

    public Turma(Integer qtdAlunos) {
        if (qtdAlunos > 0 && qtdAlunos <= 10)
            this.qtdAlunos = qtdAlunos;
        else {
            throw new RuntimeException(
                    "Quantidade máxima de alunos na Turma é 10 e estás tentando criar com " + qtdAlunos + ".");
        }

        this.medias = new Media[qtdAlunos];
    }

    public Media[] getMedias() {
        return medias;
    }

    public Media getAluno(Integer id) {
        if (medias[id] == null)
            medias[id] = new Media();
        return medias[id];
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
