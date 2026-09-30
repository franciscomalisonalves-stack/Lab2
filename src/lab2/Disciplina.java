package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double [] listaNotas = new double [4];
    private double media;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int hotas){
        horasEstudo += hotas;
    }
    public void cadastraNota(int indice, double nota){
        listaNotas[indice-1] = nota;
    }
    public boolean aprovado(){
        int soma = (int) (listaNotas[1] + listaNotas[2] + listaNotas[3] + listaNotas[0]);
        media = soma/4;
        if (media < 7){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return nomeDisciplina + " " + horasEstudo + " " + media + " " + Arrays.toString(listaNotas);
    }
}
