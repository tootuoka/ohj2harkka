package rekisteri;

public class Valuutat {
    
    private static final int MAX_VALUUTTOJA = 5;
    
    int lkm = 0;
    private Valuutta[] alkiot;
    
    public Valuutat() {
        alkiot = new Valuutta[MAX_VALUUTTOJA];
    }
    
    
    
    /**
     * Lisää uuden valuutan tietorakenteeseen. Ottaa valuutan omistukseensa.
     * @param valuutta lisättävään valuuttaan viite. Huom tietorakenne muuttuu omistajaksi
     * @throws SailoException jos tietorakenne on jo täynnä
     * @example
     * <pre name="test">
     * #THROWS SailoException
     * Valuutat valuutat = new Valuutat();
     * Valuutta bitcoin = new Valuutta(), ethereum = new Valuutta();
     * valuutat.getLkm() === 0;
     * valuutat.lisaa(bitcoin); valuutat.getLkm() === 1;
     * valuutat.lisaa(ethereum); valuutat.getLkm() === 2;
     * valuutat.lisaa(bitcoin); valuutat.getLkm() === 3;
     * valuutat.anna(0) === bitcoin;
     * valuutat.anna(1) === ethereum;
     * valuutat.anna(2) === bitcoin;
     * valuutat.anna(1) == bitcoin === false;
     * valuutat.anna(1) == ethereum === true;
     * valuutat.anna(3) === bitcoin; #THROWS IndexOutOfBoundsException
     * valuutat.lisaa(bitcoin); valuutat.getLkm() === 4;
     * valuutat.lisaa(bitcoin); valuutat.getLkm() === 5;
     * valuutat.lisaa(bitcoin); #THROWS SailoException
     * </pre>
     */
    public void lisaa(Valuutta valuutta) throws SailoException {
        if (lkm >= alkiot.length) throw new SailoException("Liikaa alkioita");
        alkiot[lkm] = valuutta;
        lkm++;
    }
    
    
    /**
     * Palauttaa rekisterin valuuttojen lukumäärän
     * @return valuuttojen lukumäärä
     */
    
    public int getLkm() {
        return lkm;
    }
    
    /**
     * Palauttaa viitteen i:teen valuuttaan
     * @param i monennenko valuutan viite halutaan
     * @return viite valuuttaan, jonka indeksi on i
     * @throws IndexOutOfBoundsException jos i ei ole sallitulla alueella
     */
    
    public Valuutta anna(int i) throws IndexOutOfBoundsException {
        if (i < 0 || this.lkm <= i)
            throw new IndexOutOfBoundsException("Laiton indeksi: " + i);
        return alkiot[i];
    }
    
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Valuutat valuutat = new Valuutat();
        Valuutta bitcoin = new Valuutta();
        Valuutta ethereum = new Valuutta();
        
        bitcoin.rekisteroi();
        bitcoin.vastaaTiedot();
        ethereum.rekisteroi();
        ethereum.vastaaTiedot();
        
        try {
            valuutat.lisaa(bitcoin);
            valuutat.lisaa(ethereum);            
        } catch (SailoException e) {            
            // e.printStackTrace();
            System.err.println(e.getMessage());
        }
        
        
        System.out.println("============ Valuutat testi ============");
        
        for (int i = 0; i < valuutat.getLkm(); i++) {
            Valuutta valuutta = valuutat.anna(i);
            System.out.println("Valuutan indeksi: " + i);
            valuutta.tulosta(System.out);
        }        
    }
}
