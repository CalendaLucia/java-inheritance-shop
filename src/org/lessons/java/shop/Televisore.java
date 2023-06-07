package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    double pollici;
    boolean smartTv;
    public Televisore(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, double pollici, boolean smartTv) {
        super(nome, descrizione, prezzo, iva);

        this.pollici = pollici;
        this.smartTv = smartTv;
    }

    public double getPollici() {
        return pollici;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pollici: " + getPollici() + ", Smart TV: " + isSmartTv() + ", Prezzo finale: " + finalPrice();
    }

}
