package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double [] listaNotas = new double [4];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int hotas){
        horasEstudo += hotas;
    }
    public void cadastraNota(int indice, double nota){
        listaNotas[indice] = nota;
    }
}
