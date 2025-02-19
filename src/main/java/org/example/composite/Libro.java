package org.example.composite;

import java.util.ArrayList;
import java.util.List;

//libro composto sezioni
//sezioni composte da sottosezioni
//sottosezioni composte da pagine
public class Libro implements OggettoLibro {
    private String titolo;
    private List<Sezione> sezioni = new ArrayList<>();
    public List<Autore> autori = new ArrayList<>();
    private double prezzo;

    //costruttore
    public Libro(String titolo, double prezzo){
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public List<Sezione> getSezioni() {
        return sezioni;}

    public void aggiungiSezione(Sezione sezione) {
        sezioni.add(sezione);}

    public void aggiungiAutore(Autore autore) {
        autori.add(autore);}

    public List<Autore> getAutori() {
        return autori;}


    @Override
    public int getNumeroPagine() {
       return sezioni.stream().mapToInt(Sezione::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Libro " + titolo);
        System.out.println("Autori:");
        autori.forEach(a -> System.out.println(a.getNome() + " " + a.getCognome()));
        System.out.println("Prezzo euro " + prezzo);
        sezioni.forEach(Sezione::stampa);
    }
}

