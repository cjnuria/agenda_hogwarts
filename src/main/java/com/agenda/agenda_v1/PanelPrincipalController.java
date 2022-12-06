/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ismael
 */
public class PanelPrincipalController implements Initializable {

    @FXML
    private Button buttonPanelAlumno;
    @FXML
    private AnchorPane Panel_arriba;
    @FXML
    private AnchorPane panel_Abajo;
    @FXML
    private Pane panelEstudiante;
    @FXML
    private Button botonMenuTareas;
    @FXML
    private Circle botonNotasRedondo;
    @FXML
    private Label botonNotas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void salirApp(ActionEvent event) {
        System.exit(0);
    }
    
    

    
    public void cambiarVentana(String ventana) {

        try {
            //Tomamos la ventana en la que se encuentra el botón y esa
            //ventana en realidad es el escenario que buscamos
            Stage stage = (Stage) panel_Abajo.getScene().getWindow();
            
            //Ya que tenemos el escenario, necesitamos identificar la otra escena
            Scene s = new Scene(FXMLLoader.load(getClass().getResource(ventana)));
            
            //Por último cambiamos la escena
            
            stage.setScene(s);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void abrirTareas(ActionEvent event) {
        String ventana = "panelNuevaTarea.fxml";
        cambiarVentana(ventana);
    }
    private void abrirNotasGenera(ActionEvent event) {
        String ventana = "panelNuevaTarea.fxml";
        cambiarVentana(ventana);
    }

    @FXML
    private void abrirNotasGeneral(MouseEvent event) {
    }

}
