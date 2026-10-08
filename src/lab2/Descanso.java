package lab2;

/**
 * Uma classe que cuida do controle de Descanso do aluno
 *
 * @author Francisco Malison da Silva Alves
 */
public class Descanso {
    /**
     * Quantidade total das horas de descanso do car
     */
    private int  horasDescanso;
    /**
     * Atributo da quantidade das semanas computadas
     */
    private int numeroSemanas;

    /**
     * A partid ods numeros de semanas e das horas de descando define que
     * o cara tá descandado ou cansado retornando uma String
     * @return String que diz que o cara tá discansado ou não
     */
    public String getStatusGeral(){
        return (numeroSemanas == 0 || horasDescanso / numeroSemanas < 26)
                ? "cansado"
                : "descansado";
    }

    /**
     * um set para as horas de descanso
     *
     */
    public void defineHorasDescanso(int horasDescanso){
        this.horasDescanso = horasDescanso;
    }

    /**
     * Só muda o numero de semanas
     *
     */
    public void defineNumeroSemanas(int numeroSemanas){
        this.numeroSemanas = numeroSemanas;
    }
}
