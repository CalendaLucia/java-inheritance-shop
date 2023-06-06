package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto nel carrello!!");

        System.out.print("Cosa vuoi acquistare? ");
        String nome = input.nextLine();

        System.out.print("Descrizione prodotto ");
        String descrizione = input.nextLine();

        System.out.print("Prezzo");
        BigDecimal prezzo = input.nextBigDecimal();

        System.out.print("Prezzo con iva");
        BigDecimal iva = input.nextBigDecimal();


        System.out.println("Che tipo di prodotto stai inserendo?");

        System.out.println("1. Smartphone");
        System.out.println("2. Televisore");
        System.out.println("3. Cuffie");

        Prodotto prodotto = new Prodotto(nome, descrizione, prezzo, iva);
        System.out.println(prodotto.getNome() + " " +  prodotto.finalPrice());

        int scelta = input.nextInt();

        switch (scelta) {
            case 1:
                System.out.print("Inserisci codice imei: ");
                String codeImei = input.nextLine();
                System.out.println("Inserisci memoria: ");
                int memoria = input.nextInt();
                // Creazione oggetto Smartphone con codice IMEI e memoria

                prodotto = new Smartphone(nome, descrizione, prezzo, iva, codeImei, memoria);
                // Aggiungi lo Smartphone al carrello o fai altre operazioni di gestione del carrello
                break;
            case 2:
                System.out.println("Inserisci pollici: ");
                double pollici = input.nextDouble();
                System.out.println("é una smart tv?: ");
                boolean smartTv = input.hasNextBoolean();

                prodotto = new Televisore(nome, descrizione, prezzo, iva, pollici, smartTv);
                break;
            case 3:
                System.out.println("Inserisci colore: ");
                String colore  = input.nextLine();
                System.out.println("Wireless?: ");
                boolean wireless = input.hasNextBoolean();
                System.out.println("cablate?: ");
                boolean cablate = input.hasNextBoolean();
                prodotto = new Cuffie(nome, descrizione, prezzo, iva, colore, wireless, cablate);
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                break;
        }


        input.close();
    }
}
