package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String codeImei;
    private int memoria;
    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String codeImei, int memoria) {
        super(nome, descrizione, prezzo, iva);

        this.codeImei = codeImei;
        this.memoria = memoria;
    }

    public String getCodeImei() {
        return codeImei;
    }

    public int getMemoria() {
        return memoria;
    }

//    METODI


    @Override
    public String toString() {
        return super.toString() + ", Codice IMEI: " + getCodeImei() + ", Memoria: " + getMemoria() + "GB" + "Prezzo finale " + finalPrice().ulp();
    }

}
