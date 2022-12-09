/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.io.IOException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ismael
 */
public class PanelSeleccionCasaController implements Initializable {

    @FXML
    private Label label_casa_seleccion;
    @FXML
    private ImageView botonIrHogwarts;
    @FXML
    private ImageView botonSombrero;
    @FXML
    private ImageView imagenPulsaSombrero;
    @FXML
    private Label labelPulsaSombrero1;
    @FXML
    private Label labelPulsaSombrero2;
    @FXML
    private ImageView imagenNombreCasa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
 
    //==========================================================================================================
    // configuracion 4 casas
    @FXML
    private void segun_casa(MouseEvent event) throws IOException {
        if (label_casa_seleccion.getText().equalsIgnoreCase("gryffindor") ) {

            String casa = "PanelPrincipalCasas.fxml";
            abrirCasa(event, casa);

        }

    }
   
    //=========================================================================================================
    
    

    public void abrirCasa(MouseEvent event, String casa) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource(casa));
            Scene scene = new Scene(root, 1040, 690);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.toFront();
            appStage.centerOnScreen();
            appStage.show();

        } catch (Exception e) {
        }
    }

    @FXML
    private void saberCasa(MouseEvent event) {
        imagenPulsaSombrero.setVisible(false);
        labelPulsaSombrero1.setVisible(false);
        labelPulsaSombrero2.setVisible(false);
        imagenNombreCasa.setVisible(true);
        label_casa_seleccion.setVisible(true);
        pulsarCasas();
    }
    
    public void pulsarCasas(){
        SecureRandom generador = new SecureRandom();
        int i = generador.nextInt(4);
        switch (i) {
            case 0:
                label_casa_seleccion.setText("GRYFFINDOR");
                break;
                
            case 1:
                label_casa_seleccion.setText("HAFFLEPUFF");
                break;
            
            case 2:
                label_casa_seleccion.setText("RAVENCLAW");
                break;
                
            case 3:
                label_casa_seleccion.setText("SLYTHERIN");
                break;
            
        }
    }

}
