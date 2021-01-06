package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String estado = "q0"; boolean ok=false;
        System.out.println("Escreva a palavra da linguagem");
        estado = transicaoexpandida(estado, scanf.nextLine());
        ArrayList<String> Qs = new ArrayList<String>();
        Qs.add("q4");
        Qs.add("q5");
        Qs.add("q6");
        Qs.add("q7");
        for (String q: Qs) {
            if(q.equals(estado)){
               ok = true;
            }
        }
        if(ok==true){
            System.out.println("E da linguagem");
        }else{
            System.out.println("Nao e da linguagem");
        }

    }
    public static String transicaoexpandida(String estado,String palavra){
        if(palavra.equals("")){
            return "q0";
        }
        String palavra2 = palavra.substring(palavra.length()-1,palavra.length());
        palavra = palavra.substring(0,palavra.length()-1);
        return transicao(transicaoexpandida(estado,palavra),palavra2);
    }
    public static String transicao(String estado, String letra){
        if(estado.equals("q0")){
            if(letra.equals("a")) return "q0";
            if (letra.equals("b")) return "q1";
        }
        if(estado.equals("q1")){
            if(letra.equals("a")) return "q2";
            if (letra.equals("b")) return "q3";
        }
        if(estado.equals("q2")){
            if(letra.equals("a")) return "q4";
            if (letra.equals("b")) return "q5";
        }
        if(estado.equals("q3")){
            if(letra.equals("a")) return "q6";
            if (letra.equals("b")) return "q7";
        }
        if(estado.equals("q4")){
            if(letra.equals("a")) return "q0";
            if (letra.equals("b")) return "q1";
        }
        if(estado.equals("q5")){
            if(letra.equals("a")) return "q2";
            if (letra.equals("b")) return "q3";
        }
        if(estado.equals("q6")){
            if(letra.equals("a")) return "q4";
            if (letra.equals("b")) return "q5";
        }
        if(estado.equals("q7")){
            if(letra.equals("a")) return "q6";
            if (letra.equals("b")) return "q7";
        }
        return "";
    }
}