/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ismael
 */
public class PanelPrincipalCasasController implements Initializable {

    @FXML
    private Pane panelSalaComun;
    @FXML
    private Pane panelNotas;
    @FXML
    private Pane panelMenuLateral;
    @FXML
    private Pane panelAsignaturas;
    @FXML
    private Pane panelTareas;
    @FXML
    private AnchorPane panelAlumno;
    @FXML
    private Button botonSalirAlumno;
    @FXML
    private Pane paneConfiguracion;
    @FXML
    private ImageView imagen_bandera;
    @FXML
    private Button boton_sala_comun;
    @FXML
    private Button boton_asignaturas;
    @FXML
    private Button boton_tareas;
    @FXML
    private Button boton_notas;
    @FXML
    private Label label_titulo;
    @FXML
    private Pane paneAsignaturasIndividual;
    @FXML
    private ImageView _imgEScudo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        panelAlumno.minHeight(1040);
//        panelAlumno.minWidth(690);
        paneConfiguracion.setVisible(true);
        
        
        cambiarImagen();
        
        

    }
    
    public void cambiarImagen(){
        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/escudo_verde.png"));
        ImageView imageView1 = new ImageView(image1);
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        _imgEScudo.setImage(image1);
    }

    public void vaciarPanel() {
        panelAsignaturas.setVisible(false);
        panelNotas.setVisible(false);
        panelTareas.setVisible(false);
        panelSalaComun.setVisible(false);
        paneAsignaturasIndividual.setVisible(false);
        paneConfiguracion.setVisible(false);
    }
    //===========================================================================================================

  

    @FXML
    private void cambiarPanelSalaComun(ActionEvent event) {
        vaciarPanel();
        panelSalaComun.setVisible(true);
    }

    @FXML
    private void cambiarPanelAsignaturas(ActionEvent event) {
        vaciarPanel();
        panelAsignaturas.setVisible(true);
    }

    @FXML
    private void cambiarPanelNotas(ActionEvent event) {
        vaciarPanel();
        panelNotas.setVisible(true);
    }

    @FXML
    private void cambiarPanelTareas(ActionEvent event) {
        vaciarPanel();
        panelTareas.setVisible(true);
    }

    @FXML
    private void cerrarTodo(ActionEvent event) {
        System.exit(0);
    }

}
