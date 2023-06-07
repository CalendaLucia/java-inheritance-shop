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
        String stringa = this.getNome() + " Descrzione:  " + this.getDescrizione() + " Prezzo comprensivo di iva " + this.finalPrice() + " Pollici: " + this.getPollici() + " Smart Tv: " + this.isSmartTv();
        return stringa;
    }
}
