package lab2;

import java.util.Arrays;

/**
 * Uma classe disciplina que serve para ver as horas de estudo e o estado da nota do aluno
 *
 * @author Francisco Malison da Silva Alves
 */
public class Disciplina {
    /**
     * guarda o nome da disciplina
     */
    private String nomeDisciplina;
    /**
     * guarda a quantidade de horas de estudo
     */
    private int horasEstudo;
    /**
     * guarda um Array de double que são as 4 notas do aluna na disciplina
     */
    private double [] listaNotas = new double [4];
    /**
     * guarda a media na disciplina
     */
    private double media;

    /**
     * é o construtor da classe que define o nome da disciplina
     */
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * incrementa as horas de estudp
     *
     */
    public void cadastraHoras(int horas){
        horasEstudo += horas;
    }

    /**
     * Cadastra uma das notas no Arrays, coloca a nota em um indice
     *
     */
    public void cadastraNota(int indice, double nota){
        listaNotas[indice-1] = nota;
    }

    /**
     * Retorna true se o aluno estiver aprovado e false se o aluno estiver reprovado
     * depende da media do aluno, soma as notas e divide por 4
     * @return True ou False
     */
    public boolean aprovado(){
        int soma = (int) (listaNotas[1] + listaNotas[2] + listaNotas[3] + listaNotas[0]);
        media = soma/4;
        if (media < 7){
            return false;
        }
        return true;
    }

    /**
     * Representação do toString da classe
     * formato: nomeDisciplina horasEstudos media ArraysComNotas
     * @return Representação da Classe em uma String
     */
    @Override
    public String toString(){
        return nomeDisciplina + " " + horasEstudo + " " + media + " " + Arrays.toString(listaNotas);
    }
}
