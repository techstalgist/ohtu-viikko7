package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.pelit.Pelitehdas;
import ohtu.kivipaperisakset.io.*;

public class Paaohjelma {

    public static void main(String[] args) {   
        IO io = new KonsoliIO();
        Pelitehdas.luoJaKaynnistaPeli(io);
    }
}
