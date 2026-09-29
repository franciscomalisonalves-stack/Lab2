package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado = 120;
    private int tempoAtual;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo){
        tempoAtual += tempo;
    }
    public boolean atingiuMetaTempoOnline(){
        if (tempoAtual < tempoOnlineEsperado){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return nomeDisciplina+ " " + tempoAtual + "/" + tempoOnlineEsperado;
    }
}
