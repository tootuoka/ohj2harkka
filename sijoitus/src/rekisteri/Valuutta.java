package rekisteri;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * 
 * @author tomikankaanpaa
 * @version 27.2.2023
 *
 */

public class Valuutta {
    
    private int tunnusNro = 0;
    private String nimi = "";
    
    
    private static int seuraavaNro = 1;
    
    /**
     * Alustaa valuutan tiedot tyhiksi
     */
    
    public Valuutta() {
        // Ei edes tarviisi
    }
    
    
    /**
     * 
     * @param args ei käytössä
     */

    
    /**
     * Palauttaa jäsenen tunnusnumeron 
     * @return jäsenen tunnusnumero
     */
    public int getTunnusNro() {
        return tunnusNro;
    }
    
    
    /**
     * Antaa valuutalle seuraavan rekisterinumeron.
     * @return valuutan uusi tunnusNro
     * @example
     * <pre name="test">
     *   Valuutta bitcoin = new Valuutta();
     *   bitcoin.getTunnusNro() === 0;
     *   bitcoin.rekisteroi();
     *   Valuutta ethereum = new Valuutta();
     *   ethereum.rekisteroi();
     *   int n1 = bitcoin.getTunnusNro();
     *   int n2 = ethereum.getTunnusNro();
     *   n1 === n2-1;
     * </pre
     */    
    public int rekisteroi() {
        this.tunnusNro = seuraavaNro;
        seuraavaNro++;
        return this.tunnusNro;
    }
    
    public void vastaaTiedot() {
        nimi = "Bitcoin";        
    }
    
    
    public static void main(String[] args) {
        Valuutta bitcoin = new Valuutta();
        Valuutta ethereum = new Valuutta();
        
        bitcoin.rekisteroi();
        ethereum.rekisteroi();
        
        bitcoin.tulosta(System.out);
                
        bitcoin.vastaaTiedot();
        ethereum.vastaaTiedot();
        
        bitcoin.tulosta(System.out);
        ethereum.tulosta(System.out);
    }

    
    /**
     * Tulostetaan valuutan tiedot
     * @param out tietovirta, johon tulostetaan
     */
    
    public void tulosta(PrintStream out) {
        out.println(String.format("%03d", tunnusNro) + " " + nimi);        
    }
    
    /**
     * Tulostetaan valuutan tiedot
     * @param os tietovirta, johon tulostetaan
     */
    
    public void tulosta(OutputStream os) {
        tulosta (new PrintStream(os));
    }

}
