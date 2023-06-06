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
}
