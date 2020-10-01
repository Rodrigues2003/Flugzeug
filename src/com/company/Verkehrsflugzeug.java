package com.company;

public class Verkehrsflugzeug extends Flugzeug {
    public int anzahlFluegel = 1; // Anzahl Flügelpaare 1
    private String immatNummer="S65A45"; // Immatrikulationsnummer
    private String Hersteller="Vofel";
    private int maxSpeed=320;
    private int AnzahlPassagiere=120;


public boolean getLooping(){
    return false;
}
public int getAnzahlPassagiere() {
    return AnzahlPassagiere;
}
public int setAnzahlPassagiere(){
    return AnzahlPassagiere;
}
}
