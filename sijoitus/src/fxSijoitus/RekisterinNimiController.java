package fxSijoitus;

import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



/**
 * Kysytään rekisterin nimi ja luodaan tätä varten dialogi
 * 
 * @author tomikankaanpaa
 * @version 8.2.2023
 *
 */

public class RekisterinNimiController implements ModalControllerInterface<String> {

    @FXML private TextField textVastaus;
    private String vastaus = null;
    
    @FXML private void handleOK() {
        vastaus = textVastaus.getText();
        ModalController.closeStage(textVastaus);
    }
    
    @FXML private void handlePeruuta() {
        vastaus = textVastaus.getText();
        ModalController.closeStage(textVastaus);
    }
    
    // ============================================
    
    
    @Override
    public String getResult() {
        return vastaus;
    }
    
    @Override
    public void setDefault(String oletus) {
        textVastaus.setText(oletus);
    }
    
    /**
     * Mitä tehdään kun dialogi on näytetty    
     */
    @Override
    public void handleShown() {
        textVastaus.requestFocus();
    }
    
    
    /**
     * Luodaan rekisterinkysymisdialogi ja palautetaan siihen kirjoitettu nimi tai null
     * @param modalityStage mille ollaan modaalisia, null = sovellukselle
     * @param oletus mitä nimeä näytetään oletuksena
     * @return null jos painetaan Peruuta, muuten kirjoitettu nimi
     */
    
    public static String kysyNimi(Stage modalityStage, String oletus) {
        return ModalController.showModal(RekisterinNimiController.class.getResource("RekisterinNimi.fxml"),
                "Rekisteri",
                modalityStage, oletus);                
    }
}
