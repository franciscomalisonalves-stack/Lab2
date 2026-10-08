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
    private double [] listaNotas;

    /**
     * guarda a media na disciplina
     */
    private double media;

    /**
     * guarda os pesos das notas
     */
    private int [] pesos;

    /**
     * é o construtor da classe que define o nome da disciplina
     */
    public Disciplina(String nomeDisciplina){
        this(nomeDisciplina, 4, new int[]{1,1,1});
    }

    /**
     * Construtor que pode ser controlado o nome da disciplina e a quantidade de notas
     * @param nomeDisciplina
     * @param quantidadeNotas
     */
    public Disciplina(String nomeDisciplina, int quantidadeNotas){
        this(nomeDisciplina,quantidadeNotas, new int[]{1,1,1,1});
    }

    /**
     * Construtor que pode ser controlado o nome da disciplina, o pesos e a quantidade de notas
     * @param nomeDisciplina
     * @param quantidadeNotas
     * @param pesos
     */
    public Disciplina(String nomeDisciplina, int quantidadeNotas, int[] pesos){
        listaNotas = new double[quantidadeNotas];
        this.pesos = pesos;
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
     * depende da media do aluno, soma as notas com pesos e divide
     * @return True ou False
     */
    public boolean aprovado(){
        int soma = 0;
        int somapesos = 0;
        for (int i = 0; i < listaNotas.length; i++){
            soma += listaNotas[i]*pesos[i];
            somapesos += pesos[i];
        }
        media = soma/ somapesos;
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
