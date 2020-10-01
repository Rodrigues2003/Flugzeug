package com.company;

public class Doppeldecker extends Flugzeug {
    private String hersteller;
    private String ImmatNummer;
    private int anzahlFluegel = 2; // Anzahl Flügelpaare 2
    private int maxSpeed=350;
    private boolean offenesCockpit=true;
   private int LOOPINGSPEED=320;   //Mindestgeschwindigkeit von 320 kmh
    public void getLooping(){
        if (maxSpeed>LOOPINGSPEED);
        System.out.println("true");
    }
    public boolean isOffenesCockpit(){
        return offenesCockpit;
    }
    public Doppeldecker(String hersteller, int maxSpeed, String ImmatNummer, boolean offenesCockpit){
        this.hersteller="Doppelhersteller";
                this.maxSpeed=350;
                        this.ImmatNummer= "S65A45";
                                this.offenesCockpit=true;
    }
    public Doppeldecker (String hersteller, int maxSpeed, boolean offenesCockpit){
        this.offenesCockpit=true;
                this.maxSpeed=350;
                        this.hersteller="Doppelhersteller2";


    }
}
