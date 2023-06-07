package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto nel carrello!!");

        int maxProdotti = 10; // Massimo numero di prodotti che il carrello può contenere
        Prodotto[] carrello = new Prodotto[maxProdotti]; // Array per memorizzare i prodotti nel carrello
        int count = 0; // Numero di prodotti attualmente nel carrello

        String scelta = "";

        while (!scelta.equals("exit")) {
            System.out.println("Che tipo di prodotto stai inserendo?");
            System.out.println("1. Smartphone");
            System.out.println("2. Televisore");
            System.out.println("3. Cuffie");
            System.out.println("exit. Esci");

            scelta = input.nextLine();

            switch (scelta) {
                case "1":
                    if (count < maxProdotti) {
                        System.out.print("Cosa vuoi acquistare? ");
                        String nomeSmartphone = input.nextLine();

                        System.out.print("Descrizione prodotto: ");
                        String descrizioneSmartphone = input.nextLine();

                        System.out.print("Prezzo: ");
                        BigDecimal prezzoSmartphone = input.nextBigDecimal();

                        System.out.print("Aggiungi IVA: ");
                        BigDecimal ivaSmartphone = input.nextBigDecimal();
                        input.nextLine();

                        System.out.print("Inserisci codice IMEI: ");
                        String codeImei = input.nextLine();
                        System.out.print("Inserisci memoria: ");
                        int memoria = input.nextInt();
                        input.nextLine();

                        Smartphone smartphone = new Smartphone(nomeSmartphone, descrizioneSmartphone, prezzoSmartphone, ivaSmartphone, codeImei, memoria);
                        carrello[count] = smartphone;
                        count++;

                        System.out.println("Prodotto aggiunto al carrello: " + smartphone.toString());
                    } else {
                        System.out.println("Il carrello è pieno. Non è possibile aggiungere ulteriori prodotti.");
                    }
                    break;
                case "2":
                    if (count < maxProdotti) {
                        System.out.print("Cosa vuoi acquistare? ");
                        String nomeTelevisore = input.nextLine();

                        System.out.print("Descrizione prodotto: ");
                        String descrizioneTelevisore = input.nextLine();

                        System.out.print("Prezzo: ");
                        BigDecimal prezzoTelevisore = input.nextBigDecimal();

                        System.out.print("Aggiungi IVA: ");
                        BigDecimal ivaTelevisore = input.nextBigDecimal();
                        input.nextLine();

                        System.out.print("Inserisci pollici: ");
                        double pollici = input.nextDouble();
                        input.nextLine();

                        System.out.print("È una smart TV? true/false: ");
                        boolean smartTv = input.nextBoolean();
                        input.nextLine();

                        Televisore televisore = new Televisore(nomeTelevisore, descrizioneTelevisore, prezzoTelevisore, ivaTelevisore, pollici, smartTv);
                        carrello[count] = televisore;
                        count++;

                        System.out.println("Prodotto aggiunto al carrello: " + televisore.toString());
                    } else {
                        System.out.println("Il carrello è pieno. Non è possibile aggiungere ulteriori prodotti.");
                    }
                    break;
                case "3":
                    if (count < maxProdotti) {
                        System.out.print("Cosa vuoi acquistare? ");
                        String nomeCuffie = input.nextLine();

                        System.out.print("Descrizione prodotto: ");
                        String descrizioneCuffie = input.nextLine();

                        System.out.print("Prezzo: ");
                        BigDecimal prezzoCuffie = input.nextBigDecimal();

                        System.out.print("Aggiungi IVA: ");
                        BigDecimal ivaCuffie = input.nextBigDecimal();
                        input.nextLine();

                        System.out.print("Inserisci colore: ");
                        String colore = input.nextLine();

                        System.out.print("Wireless? (true/false): ");
                        boolean wireless = input.nextBoolean();
                        input.nextLine();

                        System.out.print("Cablate? (true/false): ");
                        boolean cablate = input.nextBoolean();
                        input.nextLine();

                        Cuffie cuffie = new Cuffie(nomeCuffie, descrizioneCuffie, prezzoCuffie, ivaCuffie, colore, wireless, cablate);
                        carrello[count] = cuffie;
                        count++;

                        System.out.println("Prodotto aggiunto al carrello: " + cuffie.toString());
                    } else {
                        System.out.println("Il carrello è pieno. Non è possibile aggiungere ulteriori prodotti.");
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }

        if (count > 0) {
            System.out.println("Nel tuo carrello ci sono " + count + " prodotti:");
            BigDecimal totaleCarrello = BigDecimal.ZERO; // Variabile per il totale del carrello

            for (int i = 0; i < count; i++) {
                System.out.println(carrello[i].toString());
                totaleCarrello = totaleCarrello.add(carrello[i].finalPrice());
            }

            System.out.println("Totale carrello: " + totaleCarrello + "€");
        } else {
            System.out.println("Il carrello è vuoto.");
        }


        input.close();
    }

}
