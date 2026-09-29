package lab2;

public class Descanso {
    private int  horasDescanso;
    private int numeroSemanas;

    public String getStatusGeral(){
            if (numeroSemanas == 0 || horasDescanso/numeroSemanas < 26){
                return "cansado";
            }
            return "descansado";
    }
    public void defineHorasDescanso(int horasDescanso){
        this.horasDescanso = horasDescanso;
    }
    public void defineNumeroSemanas(int numeroSemanas){
        this.numeroSemanas = numeroSemanas;
    }
}
