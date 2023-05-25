package br.teles.app;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import br.teles.app.model.Media;
import br.teles.app.model.Turma;

/**
 * Unit test for class App.
 * developed by Felipe Teles
 */
public class AppTest {

    Random rn = new Random();

    @Test
    public void deveCriarTurma() {

        /*
         * Cénario:
         * Professor insere um valor que será a quantidade
         * de alunos da turma.
         */

        Integer qtdAlunos = rn.nextInt(0, 10);

        /*
         * Ação:
         * Sistema aloca um valor na memmória para a turma
         * de acordo com a quantadidade estabelecida pelo
         * professor.
         */

        Turma novaTurma = new Turma(qtdAlunos);

        /*
         * Teste:
         * 1: Verifica se o objeto foi criado.
         * 2: Verifica se a quantidade de alunos é
         * igual a estabelecida pelo professor.
         * 3: Verifica se a turma foi criada com
         * menos de 10 alunos.
         * 
         */

        Assert.assertNotNull(novaTurma);
        Assert.assertEquals(qtdAlunos, Integer.valueOf(novaTurma.getMedias().length));
        Assert.assertTrue(Integer.valueOf(novaTurma.getMedias().length) < 11);
    }

    @Test
    public void deveInserirNotas() {

        /*
         * Cénario:
         * Professor insere as três notas do aluno
         */

        Integer qtdAlunos = rn.nextInt(0, 10);
        Turma novaTurma = new Turma(qtdAlunos);

        /*
         * Ação:
         * Cria-se um objeto Media com as notas inseridas pelo professor
         */
        for (Media m : novaTurma.getMedias()) {
            Float[] notasAluno = new Float[3];

            notasAluno[0] = Float.valueOf(rn.nextFloat(0, 10));
            notasAluno[1] = Float.valueOf(rn.nextFloat(0, 10));
            notasAluno[2] = Float.valueOf(rn.nextFloat(0, 10));

            m = new Media(notasAluno);

            /*
             * Teste:
             * Valida se todas as notas foram criadas e
             * se foram iguais as notas inseridas pelo professor
             */
            Assert.assertNotNull(m);
            for (Float n : m.getNotas()) {
                Assert.assertTrue(n >= 0 && n <= 10);
            }
            Assert.assertArrayEquals(m.getNotas(), notasAluno);
        }
    }

    @Test
    public void deveCalcularMedia() {
        /*
         * Cenário:
         * A partir do momento que o Aluno possuir notas
         * é possivel realizar o calculo da media atraves do
         * objeto Media
         */
        Float[] notasAluno = new Float[3];

        /*
         * Ação:
         * Atribui o valor das notas do aluno
         * e calcula-se a média a partir da fórmula matemática
         */
        notasAluno[0] = Float.valueOf(rn.nextFloat(0, 10));
        notasAluno[1] = Float.valueOf(rn.nextFloat(0, 10));
        notasAluno[2] = Float.valueOf(rn.nextFloat(0, 10));

        Float mediaEsperada = media(notasAluno);

        Turma novaTurma = criaTurma(notasAluno);
        for (Media m : novaTurma.getMedias()) {
            Float media = m.valor();

            /*
             * Teste:
             * Verifica se a media existe e depois valida se ela é
             * menor que 10 e igual a media esperada
             */
            Assert.assertNotNull(media);
            Assert.assertTrue(media >= 0 && media <= 10);
            Assert.assertEquals(mediaEsperada, media);
        }
    }

    @Test
    public void deveInserirUmaQuartaNotaECalcularNovaMedia() {
        /*
         * Cenário:
         * Atribui o valor das notas do aluno,
         * calcula-se a média a partir da fórmula matemática
         */
        Float[] notasAluno = new Float[3];
        Float nota4;

        notasAluno[0] = Float.valueOf(rn.nextFloat(0, 10));
        notasAluno[1] = Float.valueOf(rn.nextFloat(0, 10));
        notasAluno[2] = Float.valueOf(rn.nextFloat(0, 10));

        Turma novaTurma = criaTurma(notasAluno);

        for (Media m : novaTurma.getMedias()) {
            Float media = Float.valueOf(m.valor());

            if (m.valor() < 7) {
                /*
                 * Ação:
                 * Professor insere uma quarta nota
                 * em caso de a media ser menor que 7
                 */
                nota4 = Float.valueOf(rn.nextFloat(0, 10));
                m.setNota4(nota4);

                Float novaMedia = m.valor();

                /*
                 * Teste:
                 * Verifica se a quarta nota foi criada
                 * e se é igual a nota inserida pelo professor
                 * e caso seja menor que a menor nota
                 * valida se a media é diferente
                 * da antiga
                 */
                Assert.assertNotNull(m.getNota4());
                Assert.assertEquals(m.getNota4(), nota4);
                if (m.getNota4() > m.menor())
                    Assert.assertNotEquals(media, novaMedia);
            }
        }
    }

    private Turma criaTurma(Float[] notas) {
        Integer qtdAlunos = 1;
        Turma novaTurma = new Turma(qtdAlunos);

        novaTurma.getMedias()[0] = new Media(notas);

        return novaTurma;
    }

    private Float media(Float[] notas) {
        Float soma = Float.valueOf(0);
        for (Float n : notas) {
            soma += n;
        }

        return soma / 3;
    }
}
