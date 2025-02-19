package org.example.composite;

public class Pagina implements OggettoLibro{
    private int numeroPagine;

    public Pagina(int numeroPagine){
        this.numeroPagine = numeroPagine;
    }
    @Override
    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Il totale delle pagine è: " + numeroPagine);
    }
}
