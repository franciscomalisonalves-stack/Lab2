package lab2;

public class RegistroResumos {
    private String [] temas;
    private String [] resumos;
    private int numeroResumos;
    private int quantidade;

    public RegistroResumos(int quantidade){
        this.quantidade = quantidade;
        temas = new String[quantidade];
        resumos = new String[quantidade];
    }

    public void adiciona(String tema, String resumo){
        int indice = numeroResumos;
        if (numeroResumos >= quantidade) indice = numeroResumos - quantidade;
        temas [indice] = tema;
        resumos [indice] = tema + ": " + resumo;
        numeroResumos +=1;
    }

    public String [] pegaResumos(){
        return resumos;
    }

    public int conta(){
        return numeroResumos;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < numeroResumos; i++){
            if (temas[i].equals(tema)){
                return true;
            }
        }
        return false;
    }

    public String imprimeResumos(){
        String resposta = "- " + numeroResumos + " resumo(s) cadastrado(s)\n" +
                "- " + temas[0] + " " ;
        for (int i = 1; i < numeroResumos; i++){
            resposta += "| " + temas[i] + " ";
        }
        return resposta.trim();
    }


}
