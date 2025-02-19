package org.example.chainOfResponsability;

public class Ufficiale {
    private String grado;
    private int stipendio;
    private Ufficiale superiore;

    public Ufficiale(String grado, int stipendio) {
        this.grado = grado;
        this.stipendio = stipendio;
    }

    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public Ufficiale getSuperiore() {
        return superiore;
    }
    public int getStipendio() {
        return stipendio;
    }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public void verifica(int importoMinimo){
        if(this.getStipendio() >= importoMinimo){
            System.out.println(this.getGrado() + " raggiunge l'importo minimo");
        } else {
            System.out.println(this.getGrado() + " non raggiunge l'importo minimo");
        }
        if(this.getSuperiore()!=null) {
            this.getSuperiore().verifica(importoMinimo);
    }
    }}






