package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    String colore;
    boolean wireless;
    boolean cablate;

    public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless, boolean cablate) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
        this.cablate = cablate;
    }
}
