package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto nel carrello!!");

        int count = 0;
        String scelta = "";

        while (!scelta.equals("exit")) {

            System.out.print("Cosa vuoi acquistare? ");
            String nome = input.nextLine();

            System.out.print("Descrizione prodotto ");
            String descrizione = input.nextLine();

            System.out.print("Prezzo: ");
            BigDecimal prezzo = input.nextBigDecimal();

            System.out.print("Aggiungi iva: ");
            BigDecimal iva = input.nextBigDecimal();
            input.nextLine();

            Prodotto prodotto = new Prodotto(nome, descrizione, prezzo, iva);
            System.out.println("Riepilogo: Nome prodotto: " + prodotto.getNome() + ", Descrizione: " + prodotto.getDescrizione() + ", Prezzo con iva: " +  prodotto.finalPrice());

            System.out.println("Che tipo di prodotto stai inserendo?");
            System.out.println("1. Smartphone");
            System.out.println("2. Televisore");
            System.out.println("3. Cuffie");
            System.out.println("exit. Esci");

            scelta = input.nextLine();

            switch (scelta) {
                case "1":
                    System.out.print("Inserisci codice IMEI: ");
                    String codeImei = input.nextLine();
                    System.out.print("Inserisci memoria: ");
                    int memoria = input.nextInt();
                    input.nextLine();

                    Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, codeImei, memoria);
                    System.out.println("Telefono " + smartphone.getNome() + " Descrizione: " + smartphone.getDescrizione() + " Prezzo incluso di iva " + smartphone.finalPrice());
                    System.out.println("Codice IMEI: " + smartphone.getCodeImei() + " Memoria: " + smartphone.getMemoria() + "GB");
                    count++;
                    System.out.println("Numero prodotti: " + count);

                    prodotto = smartphone;
                    break;
                case "2":
                    System.out.print("Inserisci pollici: ");
                    double pollici = input.nextDouble();
                    input.nextLine();
                    System.out.print("È una smart TV? : ");
                    boolean smartTv = input.nextBoolean();
                    input.nextLine();

                    Televisore televisore = new Televisore(nome, descrizione, prezzo, iva, pollici, smartTv);
                    count++;
                    System.out.println("Numero di scelte: " + count);
                    break;
                case "3":
                    System.out.print("Inserisci colore: ");
                    String colore = input.nextLine();
                    System.out.print("Wireless? (true/false): ");
                    boolean wireless = input.nextBoolean();
                    input.nextLine();
                    System.out.print("Cablate? (true/false): ");
                    boolean cablate = input.nextBoolean();
                    input.nextLine();

                    Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore, wireless, cablate);
                    count++;
                    System.out.println("Numero di scelte: " + count);
                    break;
                case "exit":
                    System.out.println("Nel tuo carrello ci sono " + count + " prodotti");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }

        input.close();
    }

}
