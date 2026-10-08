package lab2;

import java.util.Arrays;
import java.util.Locale;

/**
 * Para acompanhar os estudos, é preciso ter um pequeno registro de resumos dos estudos realizados ao longo do período.
 * Para isso, é possível inicializar um registro de resumos que armazenará até uma quantidade limitada de resumos.
 *
 * @author Franciso Malison da Silva Alves
 */
public class RegistroResumos {
    /**
     * Um Array de Resumos que guarda todos os resumos que foram criados
     */
    private Resumo [] colecaoResumos;
    /**
     *Um atributo que controla o numero de Resumo e é usado para verificar se houve uma estouro no numero de resumos
     */
    private int numeroResumos;

    /**
     * O construtor da classe que precisa da quantidade maxima de resumos que podem ser cadastrados
     * @param quantidade
     */
    public RegistroResumos(int quantidade){
        colecaoResumos = new Resumo[quantidade];
    }

    /**
     * Adiciona um resumo a coleção de resumos
     * cada resumo precisa de um tema e de um conteudo em si
     * Cria-se um objeto resumo que precisa do conteudo e de seu tema
     * Armazena esse resumo na coleção de resumos, caso o numero seja estrourado o outro resumo é
     * sobrescrito no primeiro lugar e dps sucessivamente
     */
    public void adiciona(String tema, String resumo){
        Resumo resumo1 = new Resumo(tema,resumo);
        int indice = numeroResumos >= colecaoResumos.length? numeroResumos - colecaoResumos.length: numeroResumos;
        colecaoResumos [indice] = resumo1;
        numeroResumos +=1;
    }

    /**
     * Retorna o Array de Resumos que guarda todos os resumos que foram cadastrados
     * @return colecaoResumos
     */
    public Resumo [] pegaResumos(){
        return colecaoResumos;
    }

    /**
     * Retorna a quantidade de resumos que já foram cadastrados
     * @return Numero de Resumos
     */
    public int conta(){
        return numeroResumos;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < numeroResumos; i++){
            if (colecaoResumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

    /**
     *A reposta retornada tem uma estrutura de -NresumosCadastrados : Tema[0]|tema[1]|tema[n]
     * @return String com todos os temas de resumo
     */
    public String imprimeResumos(){
        int resumosCadastrados = Math.min(numeroResumos, colecaoResumos.length);
        String resposta = "- " + resumosCadastrados + " resumo(s) cadastrado(s)\n" +
                "- " + colecaoResumos[0].getTema() + " " ;
        for (int i = 1; i < numeroResumos; i++){
            resposta += "| "+ colecaoResumos[i].getTema() + " ";
        }
        return resposta.trim();
    }

    /**
     * A busca retorna uma lista de strings com os temas onde a palavra buscada faz parte do conteúdo.
     *
     * @return Arrays de String com os temas
     */
    public String [] busca(String chaveDeBusca){
        String[] Possiveis = new String[numeroResumos];
        String[] temasPossiveis;
        int numeroControle = 0;

        for (int i =0; i < colecaoResumos.length; i++){
           if(colecaoResumos[i].getConteudo().toLowerCase().contains(chaveDeBusca.toLowerCase())) {
               Possiveis[numeroControle] = colecaoResumos[i].getTema();
               numeroControle +=1;
           }
        }
        temasPossiveis = new String[numeroControle];
        for (int j = 0; j < numeroControle; j++){
            temasPossiveis[j] = Possiveis[j];
        }
        Arrays.sort(temasPossiveis);
        return temasPossiveis;
    }


}
