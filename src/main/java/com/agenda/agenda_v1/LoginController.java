/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nuria
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView jlabelEntrarLogin;
    @FXML
    private Label jlabelRegistro;
    @FXML
    private Label jlabelSalir;
    @FXML
    private TextField labelUser;
    @FXML
    private PasswordField labelPass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Tooltip.install(jlabelEntrarLogin, new Tooltip("Pulsa para entrar"));
    }

    @FXML
    private void login(MouseEvent event) throws IOException {
        if (labelUser.getText().equals("admin") && labelPass.getText().equals("admin")) {

            String casa = "PanelPrincipalCasas.fxml";
            abrirCasa(event, casa);
            
        }

    }
    
    public void abrirCasa(MouseEvent event, String casa){
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
    private void cerrarTodo(MouseEvent event) {
        System.exit(0);
    }

    public void mostrarMenuAdministrador(Event event) {

    }

}
