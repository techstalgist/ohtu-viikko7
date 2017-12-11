
package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.osalliset.Tuomari;
import ohtu.kivipaperisakset.osalliset.Pelaaja;
import ohtu.kivipaperisakset.io.IO;

public abstract class Peli extends Pelitehdas {

    protected Pelaaja eka;
    protected IO io;
        
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = eka.annaSiirto();
        String tokanSiirto = kasitteleTokanSiirto(null);
        
        while (tuomari.onkoOkSiirto(ekanSiirto) && tuomari.onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            io.printLine(tuomari.toString());
            io.printLine("");
            io.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = eka.annaSiirto();
            tokanSiirto = kasitteleTokanSiirto(ekanSiirto);
        }

        io.printLine("");
        io.printLine("Kiitos!");
        io.printLine(tuomari.toString());
    }
        
    protected abstract String kasitteleTokanSiirto(String ekanSiirto);    
}
