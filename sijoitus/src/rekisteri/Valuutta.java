package rekisteri;

import java.io.PrintStream;

/**
 * 
 * @author tomikankaanpaa
 * @version 27.2.2023
 *
 */

public class Valuutta {
    
    /**
     * 
     * @param args ei käytössä
     */

    public static void main(String[] args) {
        Valuutta bitcoin = new Valuutta();
        Valuutta ethereum = new Valuutta();
        
        // bitcoin.rekisteroi();
        // ethereum.rekisteroi();
        
        bitcoin.tulosta(System.out);
                
        // bitcoin.vastaaBitcoin();
        // ethereum.vastaaBitcoin();
        
        bitcoin.tulosta(System.out);
        ethereum.tulosta(System.out);
    }

    public void tulosta(PrintStream out) {
        out.println("Bitcoin");
        
    }

}
