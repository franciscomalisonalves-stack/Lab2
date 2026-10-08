package lab2;

/**
 * É uma representação do resumo, essa classe é usada na classe registro de resumo
 *
 * @author Francisco Malison da Silva ALves
 */
public class Resumo {
    /**
     * Tema do resumo, uma String que deve ter ideal só uma palavra
     */
    private String tema;
    /**
     * Conteudo do resumo, sem formato expecifico e de tamanho indepedente
     */
    private String conteudo;

    /**
     * Constroi o resumo a parti do tema e do conteudo
     * @param tema do resumo
     * @param conteudo do resumo
     */
    public Resumo(String tema,String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema guardado no atributo tema para realizar operações
     * @return uma String com o tema
     */
    public String getTema(){
        return tema;
    }

    /**
     * Retorna a String segue o formato:
     * Tema: conteudo
     * @return A reprentação da String que representa a classe Resumo
     */
    @Override
    public String toString(){
        return tema + ": " + conteudo;
    }
}
