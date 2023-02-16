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
public class SijoitusGUIController implements ModalControllerInterface<String> {
    
    @FXML private void handleTallenna() {
        tallenna();
    }
    
    @FXML private void handleLopeta() {
        lopeta();        
    }
    
    
    /**
     * Käsitellään uuden oston lisääminen
     */
    @FXML private void handleUusiOsto() {    
        ModalController.showModal(SijoitusGUIController.class.getResource("SijoitusGUIView3.fxml"), "Osto", null, "");
        // Dialogs.showMessageDialog("Tiedosto ei aukea");
    }
    
    @FXML private void handleMuokkaaOsto() {
        ModalController.showModal(SijoitusGUIController.class.getResource("SijoitusGUIView3.fxml"), "Osto", null, "");
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