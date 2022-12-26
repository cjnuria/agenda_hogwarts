/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.net.URL;
import java.security.SecureRandom;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.rgb;
import javafx.stage.Stage;
import javafx.stage.Window;

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
    private Button botonSalirAlumno;
    @FXML
    private Pane paneConfiguracion;
    @FXML
    private Label label_titulo;
    @FXML
    private Pane paneAsignaturasIndividual;
    @FXML
    private ImageView _imgEScudo;
    @FXML
    private ImageView _imagen_bandera;
    private VBox _boxmenu;
    @FXML
    private Button _boton_sala_comun;
    @FXML
    private Button _boton_asignaturas;
    @FXML
    private Button _boton_tareas;
    @FXML
    private Button _boton_notas;

    private Label LabelSesion1;
    @FXML
    private Pane panelLog;
    @FXML
    private TextField labelUser;
    @FXML
    private PasswordField labelPass;
    @FXML
    private ImageView jlabelEntrarLogin;
    @FXML
    private Label jlabelRegistro;
    @FXML
    private ImageView botonRegistro;
    @FXML
    private Label jlabelSalir;
    @FXML
    private Pane panelRegistro;
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
    @FXML
    private Label label_casa_seleccion;
    @FXML
    private ImageView botonIrHogwarts;
    @FXML
    private Button _boton_sala_comun1;
    @FXML
    private Pane panelMenuLateralProfe;
    @FXML
    private ImageView _imagen_bandera1;
    @FXML
    private ImageView _imgEScudo1;
    @FXML
    private Button _boton_asignaturas1;
    @FXML
    private Button _boton_tareas1;
    @FXML
    private Button _boton_notas1;
    @FXML
    private Button botonSalirAlumno1;
    @FXML
    private Pane panelSalaComunProfe;
    @FXML
    private Pane paneConfiguracionProfe;
    @FXML
    private Button _boton_sala_comun11;
    @FXML
    private Pane panelProfesores;
    @FXML
    private Pane panelCursosProfe;
    @FXML
    private Pane panelAlumnos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vaciarPanel();
        panelLog.setVisible(true);

    }


    @FXML
    public void abrirCasaLogin() {
        String casa = labelUser.getText();
        switch (casa) {
            case "a":
                cambiarImagenGr();
                break;
            case "s":
                cambiarImagenSl();
                break;
            case "d":
                cambiarImagenHu();
                break;
            case "f":
                cambiarImagenRa();
                break;
            case "p":
                cambiarImagenProfe();
            default:
                throw new AssertionError();
        }
    }

    public void cambiarImagenSl() {
        Window win = App.getScene().getWindow();
        win.setWidth(1040);
        win.setHeight(690);
        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/verde.png"));
        ImageView imageView1 = new ImageView(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/img/casas/banderaVerde.png"));
        ImageView imageView2 = new ImageView(image2);
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        _imgEScudo.setImage(image1);
        _imagen_bandera.setImage(image2);
        panelMenuLateral.getStylesheets().clear();
        panelMenuLateral.getStylesheets().add("/css/CssVerde.css");
        vaciarPanel();
        paneConfiguracion.setVisible(true);

    }

    public void cambiarImagenGr() {
        Window win = App.getScene().getWindow();
        win.setWidth(1040);
        win.setHeight(690);
        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/rojo.png"));
        ImageView imageView1 = new ImageView(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/img/casas/banderaRoja.png"));
        ImageView imageView2 = new ImageView(image2);
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        _imgEScudo.setImage(image1);
        _imagen_bandera.setImage(image2);
        panelMenuLateral.getStylesheets().clear();
        panelMenuLateral.getStylesheets().add("/css/CssRojo.css");
        vaciarPanel();
        paneConfiguracion.setVisible(true);
    }

    public void cambiarImagenRa() {
        Window win = App.getScene().getWindow();
        win.setWidth(1040);
        win.setHeight(690);
        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/azul.png"));
        ImageView imageView1 = new ImageView(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/img/casas/banderaAzul.png"));
        ImageView imageView2 = new ImageView(image2);
        _imgEScudo.setImage(image1);
        panelMenuLateral.getStylesheets().clear();
        panelMenuLateral.getStylesheets().add("/css/CssAzul.css");
        _imagen_bandera.setImage(image2);
        vaciarPanel();
        paneConfiguracion.setVisible(true);
    }

    public void cambiarImagenHu() {
        Window win = App.getScene().getWindow();
        win.setWidth(1040);
        win.setHeight(690);
        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/amarillo.png"));
        ImageView imageView1 = new ImageView(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/img/casas/banderaAmarilla.png"));
        ImageView imageView2 = new ImageView(image2);
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        _imgEScudo.setImage(image1);
        panelMenuLateral.getStylesheets().clear();
        panelMenuLateral.getStylesheets().add("/css/CssAmarillo.css");
        _imagen_bandera.setImage(image2);
        vaciarPanel();
        paneConfiguracion.setVisible(true);
    }
    
    public void cambiarImagenProfe() {
        Window win = App.getScene().getWindow();
        win.setWidth(1040);
        win.setHeight(690);
        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/cole.png"));
        ImageView imageView1 = new ImageView(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/img/casas/banderaRoja.png"));
        ImageView imageView2 = new ImageView(image2);
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        _imgEScudo.setImage(image1);
        panelMenuLateral.getStylesheets().clear();
        panelMenuLateral.getStylesheets().add("/css/CssAmarillo.css");
        _imagen_bandera.setImage(image2);
        vaciarPanel();
        panelProfesores.setVisible(true);
        panelSalaComunProfe.setVisible(true);
    }

    public void vaciarPanel() {

        panelAsignaturas.setVisible(false);
        panelNotas.setVisible(false);
        panelTareas.setVisible(false);
        panelSalaComun.setVisible(false);
        paneAsignaturasIndividual.setVisible(false);
        paneConfiguracion.setVisible(false);
        panelAlumnos.setVisible(false);
        panelLog.setVisible(false);
        panelProfesores.setVisible(false);
        panelRegistro.setVisible(false);
        panelCursosProfe.setVisible(false);
        panelSalaComunProfe.setVisible(false);
    }
    
    public void vaciarPanelProfes() {
       
        panelCursosProfe.setVisible(false);
        panelSalaComunProfe.setVisible(false);
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
    public void salirProg() {
        System.exit(0);
    }

    @FXML
    private void cerrarTodo(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void registro() {
        Window win = App.getScene().getWindow();
        win.setWidth(927);
        win.setHeight(520);
        vaciarPanel();
        panelRegistro.setVisible(true);
    }

    @FXML
    private String saberCasa(MouseEvent event) {
        imagenPulsaSombrero.setVisible(false);
        labelPulsaSombrero1.setVisible(false);
        labelPulsaSombrero2.setVisible(false);
        imagenNombreCasa.setVisible(true);
        label_casa_seleccion.setVisible(true);
        pulsarCasas();
        return label_casa_seleccion.getText();
    }

    public void pulsarCasas() {
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

    @FXML
    private void anden934() {

        String casa = label_casa_seleccion.getText();
        switch (casa) {
            case "GRYFFINDOR":
                cambiarImagenGr();
                LabelSesion1.setText("");
                break;
            case "SLYTHERIN":
                cambiarImagenSl();
                LabelSesion1.setText("");
                break;
            case "HAFFLEPUFF":
                cambiarImagenHu();
                LabelSesion1.setText("");
                break;
            case "RAVENCLAW":
                cambiarImagenRa();
                LabelSesion1.setText("");
                break;
            default:
                throw new AssertionError();
        }

    }

    @FXML
    private void guardarPerfil(MouseEvent event) {
        
        vaciarPanel();
        panelSalaComun.setVisible(true);
        
    }

    @FXML
    private void cambiarPanelSalaComunProfes(MouseEvent event) {
        vaciarPanelProfes();
        panelSalaComunProfe.setVisible(true);
    }

    @FXML
    private void cambiarPanelCursosProfes(MouseEvent event) {
        vaciarPanelProfes();
        panelCursosProfe.setVisible(true);
    }

    @FXML
    private void cambiarPanelTareasProfe(MouseEvent event) {
        vaciarPanelProfes();
        panelSalaComunProfe.setVisible(true);
    }

    @FXML
    private void cambiarPanelAlumnosProfe(MouseEvent event) {
        vaciarPanelProfes();
        panelSalaComunProfe.setVisible(true);
    }
    

}
