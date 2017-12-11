
package ohtu.kivipaperisakset.pelit;
import ohtu.kivipaperisakset.osalliset.*;
import ohtu.kivipaperisakset.io.*;

public class Pelitehdas {

    protected static final String LOPETUSTEKSTI = "peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s";

    public static void luoJaKaynnistaPeli(IO io) {
        while (true) {
            io.printLine("\nValitse pelataanko" + "\n (a) ihmistä vastaan " + "\n (b) tekoälyä vastaan" + "\n (c) parannettua tekoälyä vastaan" + "\nmuilla valinnoilla lopetetaan");
            String vastaus = io.read();
            if (vastaus.endsWith("a")) {
                io.printLine(LOPETUSTEKSTI);
                luoIhminenVsIhminenPeli(io).pelaa();
            } else if (vastaus.endsWith("b")) {
                io.printLine(LOPETUSTEKSTI);
                luoIhminenVsSimppeliTekoalyPeli(io).pelaa();
            } else if (vastaus.endsWith("c")) {
                io.printLine(LOPETUSTEKSTI);
                luoIhminenVsParempiTekoalyPeli(io).pelaa();
            } else {
                break;
            }
        }
    }

    public static Peli luoIhminenVsIhminenPeli(IO io) {
        return new KPSIhminenVsIhminen(io, new Ihmispelaaja(new KonsoliIO()), new Ihmispelaaja(new KonsoliIO()));
    }

    public static Peli luoIhminenVsSimppeliTekoalyPeli(IO io) {
        return new KPSIhminenVsTekoaly(io, new Ihmispelaaja(new KonsoliIO()), new TekoalySimppeli());
    }

    public static Peli luoIhminenVsParempiTekoalyPeli(IO io) {
        return new KPSIhminenVsTekoaly(io, new Ihmispelaaja(new KonsoliIO()), new TekoalyParannettu(20));
    }

}
