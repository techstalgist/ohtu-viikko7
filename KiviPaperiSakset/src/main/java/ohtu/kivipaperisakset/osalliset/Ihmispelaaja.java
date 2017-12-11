
package ohtu.kivipaperisakset.osalliset;
import ohtu.kivipaperisakset.io.IO;

public class Ihmispelaaja implements Pelaaja {
    
    IO io;

    public Ihmispelaaja(IO io) {
        this.io = io;
    }
        
    @Override
    public String annaSiirto() {
        return io.read();
    }   
    
}
