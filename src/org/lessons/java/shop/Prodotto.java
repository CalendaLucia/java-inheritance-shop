package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

//    COSTRUTTORE

    public Prodotto (String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }


//    METODI
private static int generateRandomCode() {
    Random rand = new Random();
    return rand.nextInt(1000);
}

public BigDecimal finalPrice() {
    BigDecimal importoIva = prezzo.multiply(iva.divide(BigDecimal.valueOf(100)));
    return prezzo.add(importoIva);
}



//GETTER E SETTER

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return
                "Codice prodotto: " + codice +
                getNome() + getDescrizione() +
                finalPrice();
    }
}
