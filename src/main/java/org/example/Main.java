package org.example;

import org.example.chainOfResponsability.Generale;
import org.example.chainOfResponsability.Tenente;

public class Main {
    public static void main(String[] args) {

        Generale generale = new Generale();
        Tenente tenente = new Tenente();
        generale.verifica(5);
        generale.setSuperiore(tenente);
        tenente.verifica(20000000);


    }
}