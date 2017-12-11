package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.osalliset.Ihmispelaaja;
import ohtu.kivipaperisakset.osalliset.Tekoaly;
import ohtu.kivipaperisakset.io.IO;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSIhminenVsTekoaly extends Peli {

    private final Tekoaly toka;

    KPSIhminenVsTekoaly(IO io, Ihmispelaaja eka, Tekoaly toka) {
        this.io = io;
        this.eka = eka;
        this.toka = toka;
    }

    @Override
    protected String kasitteleTokanSiirto(String ekanSiirto) {
        String tokanSiirto = toka.annaSiirto();
        io.printLine("Tietokone valitsi: " + tokanSiirto);
        if (ekanSiirto != null) {
           toka.asetaSiirto(ekanSiirto); 
        }
        
        return tokanSiirto;
    }
}
