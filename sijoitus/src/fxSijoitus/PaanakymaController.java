package fxSijoitus;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import fi.jyu.mit.fxgui.ComboBoxChooser;
import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


 /**
 * @author tomikankaanpaa
 * @version 20.1.2023
 *
 */
    public class PaanakymaController implements ModalControllerInterface<String> {
    
    @FXML private void handleTallenna() {
        tallenna();
    }
    
    @FXML private void handleLopeta() {
        lopeta();        
    }
    
    @FXML private void handleOK() {
        tallenna();        
    }
    
    
    /**
     * Käsitellään uuden oston lisääminen
     */
    @FXML private void handleUusiOsto() {    
        ModalController.showModal(PaanakymaController.class.getResource("Lisaysnakyma.fxml"), "Osto", null, "");
        // Dialogs.showMessageDialog("Tiedosto ei aukea");
    }
    
    @FXML private void handlePoistaOsto() {
        Dialogs.showMessageDialog("Vielä ei osata poistaa ostoa");
    }
    
    @FXML private void handleTietoja() {
        Dialogs.showMessageDialog("Ei osata vielä tietoja");
    }
    
    @FXML private void handlePeruuta() {
        ModalController.closeStage(null);
    }


    
    
    
    
    // ============================================================

    /**
     * @return false jos painetaan cancel
     */
    public boolean avaa() {
        String uusinimi = RekisterinNimiController.kysyNimi(null, "kryptovaluutta");
        if (uusinimi == null) return false;
        // lueTiedosto(uusinimi);
        return true;
        
    }
    
    /**
     * Tietojen tallennus
     */
    private void tallenna() {
        Dialogs.showMessageDialog("Tallennetetaan! Mutta ei toimi vielä");
    }
    
    private void lopeta() {
        // tallenna();
        Platform.exit();
    }

    @Override
    public String getResult() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void handleShown() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setDefault(String oletus) {
        // TODO Auto-generated method stub
        
    }

}