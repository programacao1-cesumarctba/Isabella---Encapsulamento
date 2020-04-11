package com.bellakratchei.classes;

public class Curso {
    private String professor;
    private String nome;
    private String tema;
    private double valor;

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception {
        if ((valor > 0) && (valor < 1000)){
            this.valor = valor;
        } else {
            throw new Exception("O valor é inválido!");
        }
    }
}
