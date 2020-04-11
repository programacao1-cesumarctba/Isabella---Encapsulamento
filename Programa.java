package com.bellakratchei.main;

import com.bellakratchei.classes.Curso;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
        try{
            Curso curso = new Curso();
            curso.setNome("Isabella");
            curso.setProfessor("Maycon");
            curso.setTema("Programacao");
            curso.setValor(50d);

            System.out.println(String.format("Titular da Conta:" + curso.getNome() +
                                             "\nNome do Professor:" + curso.getProfessor() +
                                             "\nMatéria:" + curso.getTema() +
                                             "\nSaldo:" + curso.getValor()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
