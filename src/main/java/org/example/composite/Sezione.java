package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements OggettoLibro {
    private List<Sottosezione> sottosezioni = new ArrayList<>();

    public void aggiungiSottosezione(Sottosezione sottosezione) {
        sottosezioni.add(sottosezione);
    }

    public int getNumeroPagine() {
        return sottosezioni.stream().mapToInt(Sottosezione::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Sezione");
        sottosezioni.forEach(Sottosezione::stampa);
    }
}
