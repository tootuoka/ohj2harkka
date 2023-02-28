package rekisteri.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import rekisteri.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2023.02.28 11:48:15 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class ValuutatTest {


  // Generated by ComTest BEGIN
  /** testLisaa20 */
  @Test
  public void testLisaa20() {    // Valuutat: 20
    Valuutat valuutat = new Valuutat(); 
    Valuutta bitcoin = new Valuutta(), ethereum = new Valuutta(); 
    assertEquals("From: Valuutat line: 23", 0, valuutat.getLkm()); 
    valuutat.lisaa(bitcoin); assertEquals("From: Valuutat line: 24", 1, valuutat.getLkm()); 
    valuutat.lisaa(ethereum); assertEquals("From: Valuutat line: 25", 2, valuutat.getLkm()); 
    valuutat.lisaa(bitcoin); assertEquals("From: Valuutat line: 26", 3, valuutat.getLkm()); 
    assertEquals("From: Valuutat line: 27", bitcoin, valuutat.anna(0)); 
    assertEquals("From: Valuutat line: 28", ethereum, valuutat.anna(1)); 
    assertEquals("From: Valuutat line: 29", bitcoin, valuutat.anna(2)); 
    assertEquals("From: Valuutat line: 30", false, valuutat.anna(1) == bitcoin); 
    assertEquals("From: Valuutat line: 31", true, valuutat.anna(1) == ethereum); 
    valuutat.lisaa(bitcoin); assertEquals("From: Valuutat line: 32", 4, valuutat.getLkm()); 
    valuutat.lisaa(bitcoin); assertEquals("From: Valuutat line: 33", 5, valuutat.getLkm()); 
  } // Generated by ComTest END
}