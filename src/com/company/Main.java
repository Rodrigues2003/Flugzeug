package com.company;

public class Main {

    public static void main(String[] args) {
        abstract class Flugzeug {
            private String hersteller; // Herstellername
            private int maxSpeed =350; // Max. Geschwindigkeit
            private String immatNummer="S65A45"; // Immatrikulationsnummer
            private int anzahlFluegel = 1; // Anzahl Flügelpaare

            public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
                this.hersteller = hersteller;
                this.maxSpeed = maxSpeed;
                this.anzahlFluegel = anzahlFluegel;
            }
            public String getImmatNummer(){
                return immatNummer;
            }
            protected void setImmatNummer(String immatNummer){
                this.immatNummer = immatNummer;
            }
            public int getMaxSpeed(){
                return maxSpeed;
            }
            abstract public boolean getLooping();

        }
    }
        }
