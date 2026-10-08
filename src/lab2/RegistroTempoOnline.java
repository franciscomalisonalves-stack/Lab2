package lab2;

/**
 * O registro de tempo online deve ser responsável por manter a informação sobre quantidade de horas de internet
 * que o aluno tem dedicado a uma disciplina remota. Para cada disciplina, seria criado um objeto para controle
 * desse estado (tempo online usado)
 *
 * @author Francisco Malison da Silva Alves
 */
public class RegistroTempoOnline {
    /**
     * o nome da disciplina
     */
    private String nomeDisciplina;
    /**
     * O tempo online esperado para a disciplina
     */
    private int tempoOnlineEsperado;
    /**
     * Tempo de estudo atual que é um inteiro
     */
    private int tempoAtual;

    /**
     * O contrutor da Classe que define o nome da disciplina e o tempo esperado online
     * @param nomeDisciplina
     * @param tempoOnlineEsperado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * é o segundo construtor da classe que só define o nome da Disciplina e tem como padrão o tempo esperado de 120 horas
     * @param nomeDisciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this(nomeDisciplina, 120);
    }

    /**
     * incrementa o tempoAtual de estudo da Disciplina
     *
     */
    public void adicionaTempoOnline(int tempo){
        tempoAtual += tempo;
    }

    /**
     * Um metodo que retorna True se o aluno consegui atingir o tempo online minimo
     * @return True ou False
     */
    public boolean atingiuMetaTempoOnline(){
        if (tempoAtual < tempoOnlineEsperado){
            return false;
        }
        return true;
    }

    /**
     * Retorna a String no formato nome da disciplina tempoAtual / tempoOnlineEsperado
     * @return a representação de String da Classe
     */
    @Override
    public String toString(){
        return nomeDisciplina+ " " + tempoAtual + "/" + tempoOnlineEsperado;
    }
}
