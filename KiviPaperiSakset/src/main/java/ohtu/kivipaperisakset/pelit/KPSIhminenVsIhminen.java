package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.osalliset.Ihmispelaaja;
import ohtu.kivipaperisakset.io.IO;

public class KPSIhminenVsIhminen extends Peli {

    private final Ihmispelaaja toka;

    KPSIhminenVsIhminen(IO io, Ihmispelaaja eka, Ihmispelaaja toka) {
        this.io = io;
        this.eka = eka;
        this.toka = toka;
    }
    
    @Override
    protected String kasitteleTokanSiirto(String ekanSiirto) {
        io.print("Toisen pelaajan siirto: ");
        return toka.annaSiirto();
    }
}