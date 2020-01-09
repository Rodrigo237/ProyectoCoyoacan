package com.iventa.pruebaspsicologia2.clases;

public class ClasesIndividual {
    private long numero;
    private String texto;

    public long getId() {
        return numero;
    }

    public void setId(long numero) {
        this.numero = numero;
    }

    public String gettexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString(){
        return texto;
    }
}
