/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
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
import javafx.scene.layout.Pane;
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
    @FXML
    private ImageView botonRegistro;
    @FXML
    private Pane panelLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Tooltip.install(jlabelEntrarLogin, new Tooltip("Pulsa para entrar"));
//        panelLogin.setVisible(true);

    }

    private void login(MouseEvent event) throws IOException, InterruptedException {
        if (labelUser.getText().equals("admin") && labelPass.getText().equals("admin")) {
            String casa = "panelGifCasa";
            Thread a = new Thread(new lanzarGifHilo());
            a.start();
            abrirCasa(event);

        }

    }

    //=========================================================================================================
    // Registro
    @FXML
    private void registro(MouseEvent event) throws IOException {

        abrirSeleccionCasa(event);

    }
    //=========================================================================================================

    public void abrirGif(MouseEvent event, String casa, int tam1, int tam2) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource(casa));
            Scene scene = new Scene(root, tam1, tam2);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.toFront();
            appStage.centerOnScreen();
            appStage.show();
            Thread.currentThread().wait(7000);

        } catch (Exception e) {
        }
    }

    @FXML
    private void cerrarTodo(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void abrirCasa(MouseEvent event) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("PanelPrincipalCasas.fxml"));
            Scene scene = new Scene(root, 1040, 690);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.toFront();
            appStage.centerOnScreen();
            appStage.show();
            Thread.currentThread().wait(7000);

        } catch (Exception e) {
        }
    }

    @FXML
    private void abrirSeleccionCasa(MouseEvent event) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("PanelSeleccionCasa.fxml"));
            Scene scene = new Scene(root, 913, 511);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.toFront();
            appStage.centerOnScreen();
            appStage.show();
            Thread.currentThread().wait(7000);

        } catch (Exception e) {
        }
    }

}
