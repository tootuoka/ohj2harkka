package fxSijoitus;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author tomikankaanpaa
 * @version 20.1.2023
 *
 */
public class SijoitusMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            final FXMLLoader ldr = new FXMLLoader(getClass().getResource("SijoitusGUIView2.fxml"));
            final Pane root = ldr.load();
            final SijoitusGUIController sijoitusCtrl = (SijoitusGUIController) ldr.getController();
            
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("sijoitus.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Sijoitus");
            primaryStage.show();
            if ( !sijoitusCtrl.avaa() ) Platform.exit();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei käytössä
     */
    public static void main(String[] args) {
        launch(args);
    }
}