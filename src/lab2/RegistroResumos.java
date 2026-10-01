package lab2;

public class RegistroResumos {
    private Resumo [] colecaoResumos;
    private int numeroResumos;


    public RegistroResumos(int quantidade){
        colecaoResumos = new Resumo[quantidade];
    }

    public void adiciona(String tema, String resumo){
        Resumo resumo1 = new Resumo(tema,resumo);
        int indice = numeroResumos >= colecaoResumos.length? numeroResumos - colecaoResumos.length: numeroResumos;
        colecaoResumos [indice] = resumo1;
        numeroResumos +=1;
    }

    public Resumo [] pegaResumos(){
        return colecaoResumos;
    }

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

    public String imprimeResumos(){
        int resumosCadastrados = Math.min(numeroResumos, colecaoResumos.length);
        String resposta = "- " + resumosCadastrados + " resumo(s) cadastrado(s)\n" +
                "- " + colecaoResumos[0].getTema() + " " ;
        for (int i = 1; i < numeroResumos; i++){
            resposta += "| "+ colecaoResumos[i].getTema() + " ";
        }
        return resposta.trim();
    }


}
