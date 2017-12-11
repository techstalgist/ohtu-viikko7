
package ohtu.kivipaperisakset.io;
import java.util.Scanner;

public class KonsoliIO implements IO {

    private Scanner lukija;

    public KonsoliIO() {
        this.lukija = new Scanner(System.in);
    }    
    
    @Override
    public String read() {
        return lukija.nextLine();
    }

    @Override
    public void print(String s) {
        System.out.print(s);
    }
    
    @Override
    public void printLine(String s) {
        System.out.println(s);
    }
}
