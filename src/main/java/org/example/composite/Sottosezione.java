package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Sottosezione implements OggettoLibro {
    private List<Pagina> pagine = new ArrayList<>();

    public void aggiungiPagina(Pagina pagina) {
        pagine.add(pagina);
    }

    public int getNumeroPagine() {
        return pagine.stream().mapToInt(Pagina::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Sottosezione");
        pagine.forEach(Pagina::stampa);

    }
}
