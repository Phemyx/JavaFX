/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empiretech;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author paguiar
 */
public class ControleSoftware implements Initializable {
    
    @FXML
    private AnchorPane AnchorSoftware;
    
    @FXML
    void acaoVoltar(ActionEvent event) throws IOException {
        AnchorPane anchorSoftware = FXMLLoader.load(getClass().getResource("Estoque.fxml"));
        AnchorSoftware.getChildren().setAll(anchorSoftware);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
