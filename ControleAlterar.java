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
public class ControleAlterar implements Initializable {
    
    @FXML
    private AnchorPane AnchorAlterar;
    
    @FXML
    void acaoVoltar(ActionEvent event) throws IOException {
        AnchorPane anchorAlterar = FXMLLoader.load(getClass().getResource("Controle.fxml"));
        AnchorAlterar.getChildren().setAll(anchorAlterar);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
