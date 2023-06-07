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

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public boolean isCablate() {
        return cablate;
    }

    @Override
    public String toString() {
        String stringa = this.getNome() + "/n" + this.getDescrizione() + "/n" + this.finalPrice() + "/n" + this.getColore() + this.isWireless() + this.isCablate();
        return stringa;
    }
}
