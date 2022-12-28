/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ResourceBundle;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.rgb;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Ismael
 */
public class PanelPrincipalCasasController implements Initializable {

    @FXML
    private Pane panelAlumnos;
    @FXML
    private Pane panelMenuLateral;
    @FXML
    private ImageView _imagen_bandera;
    @FXML
    private ImageView _imgEScudo;
    @FXML
    private Button _boton_sala_comun;
    @FXML
    private Button _boton_asignaturas;
    @FXML
    private Button _boton_tareas;
    @FXML
    private Button _boton_notas;
    @FXML
    private Button botonSalirAlumno;
    @FXML
    private Pane panelSalaComun;
    @FXML
    private Pane panelAsignaturas;
    @FXML
    private Pane panelTareas;
    @FXML
    private Label label_titulo;
    @FXML
    private Pane panelNotas;
    @FXML
    private Pane paneConfiguracion;
    @FXML
    private Button _boton_sala_comun1;
    @FXML
    private Pane paneAsignaturasIndividual;
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
    private Pane panelProfesores;
    @FXML
    private ImageView _imagen_banderaProfes;
    @FXML
    private ImageView _imgEScudoProfes;
    @FXML
    private Button _boton_sala_comun_Profes;
    @FXML
    private Button _boton_Cursos_Profes;
    @FXML
    private Button _boton_tareas_Profes;
    @FXML
    private Button _boton_Alumnos_Profes;
    @FXML
    private Button _botonSalirProfes;
    @FXML
    private Label LabelSesionProfe;
    private Pane panelSalaComunProfes;
    @FXML
    private Pane _panelMenuLateralProfe;
    @FXML
    private Pane _panelSalaComunProfes;
    @FXML
    private Pane _panelCursosProfes;
    @FXML
    private Pane _panelAsignaerTareasProfes;
    @FXML
    private Pane _panelCorreccionesProfes;
    @FXML
    private Label _tituloAsignatura;
    @FXML
    private Label _nombreProfesorAsignatura;
    @FXML
    private Label _notaMediaAsignatura;
    @FXML
    private Label _tipoAsignatura;
    @FXML
    private TableView<?> _tablaAsignaturaIndividual;
    @FXML
    private ImageView _imagenAsignatura;
    @FXML
    private ImageView _asignaturaPociones;
    @FXML
    private ImageView _asignaturaTransformaciones;
    @FXML
    private ImageView _asignaturaEncantamientos;
    @FXML
    private ImageView _asignaturaDefensa;
    @FXML
    private ImageView _asignaturaCriaturas;
    @FXML
    private ImageView _asignaturaHistoria;
    @FXML
    private ImageView _asignaturaVuelo;
    @FXML
    private ImageView _asignaturaRunas;
    @FXML
    private ImageView _asignaturaAdivinacion;
    @FXML
    private Pane panelTareas1;
    @FXML
    private Label label_titulo1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vaciarPanelTodo();
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
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
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
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
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
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
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
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        paneConfiguracion.setVisible(true);
    }

    public void cambiarImagenProfe() {
        Window win = App.getScene().getWindow();
        win.setWidth(1040);
        win.setHeight(690);
        _panelMenuLateralProfe.getStylesheets().clear();
        _panelMenuLateralProfe.getStylesheets().add("/css/CssProfesor.css");
        vaciarPanelTodo();
        panelProfesores.setVisible(true);
        _panelSalaComunProfes.setVisible(true);
    }

    public void vaciarPanelTodo() {

        panelAsignaturas.setVisible(false);
        panelNotas.setVisible(false);
        panelTareas.setVisible(false);
        panelSalaComun.setVisible(false);
        paneAsignaturasIndividual.setVisible(false);
        paneConfiguracion.setVisible(false);
        panelAlumnos.setVisible(false);
        panelLog.setVisible(false);
        panelProfesores.setVisible(false);
        panelRegistro.setVisible(false);;
        _panelCorreccionesProfes.setVisible(false);
        _panelCursosProfes.setVisible(false);
        _panelSalaComunProfes.setVisible(false);
        _panelAsignaerTareasProfes.setVisible(false);
    }

    public void vaciarPanelProfes() {
        _panelCorreccionesProfes.setVisible(false);
        _panelCursosProfes.setVisible(false);
        _panelSalaComunProfes.setVisible(false);
        _panelAsignaerTareasProfes.setVisible(false);

    }

    //===========================================================================================================
    @FXML
    private void cambiarPanelSalaComun(ActionEvent event) {
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelSalaComun.setVisible(true);
    }

    @FXML
    private void cambiarPanelAsignaturas(ActionEvent event) {
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelAsignaturas.setVisible(true);
    }

    @FXML
    private void cambiarPanelNotas(ActionEvent event) {
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelNotas.setVisible(true);
    }

    @FXML
    private void cambiarPanelTareas(ActionEvent event) {
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelTareas.setVisible(true);
    }

    public void cambiarPanelAsignaturasIndividual(String asignatura, String profesor, float notaMedia, String tipoAsignatura) {

        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        paneAsignaturasIndividual.setVisible(true);

        //CAMBIAR FOTOS, LABEL Y TABLAS, SOLO ESTÁ EL CODE SIN CAMBIAR
        //HACERLO CON TODOS LOS CASES O CREAR UN MÉTODO(SE PODRIA HACER SOLO UNO....)
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        Image image1 = new Image(getClass().getResourceAsStream("/img/asignaturas/" + asignatura + ".png"));
        ImageView imageView1 = new ImageView(image1);
        _imagenAsignatura.setImage(image1);

        _tituloAsignatura.setText(asignatura.toUpperCase());
        _nombreProfesorAsignatura.setText(profesor);
        _notaMediaAsignatura.setText(String.valueOf(notaMedia));
        _tipoAsignatura.setText(tipoAsignatura);
    }

    @FXML
    private void cambiarAsignaturaIndividual(MouseEvent event) {

        //intentando sacar el texto que hay en el label que haces click
        //RECORDAR ARREGLAR ESTO, SOLO COJO EL LABEL Y NO EL PANEL COMPLETO....ARREGLAR O FUNCIONA A TROZOS
        String a = event.getPickResult().getIntersectedNode().getId().toString();
        //chapuza que funciona, no me gusta pero es lo que hay, no se que más hacer, 18-24
        String asignatura = a.substring(11).toLowerCase();
        System.out.println(a); //para comprobar los nodos y saber donde estoy entrando

        //SE PODRIA HACER UN RETURN Y NO EL SW, SE LE PASA EL SZTRING Y SE PONE DE NOMBRE A TODO....RARO...DAR VUELTA
        switch (asignatura) {
            case "pociones":
                cambiarPanelAsignaturasIndividual(asignatura, "Snape", 9.8f, "OPCIONAL");

                break;
            case "criaturas":
                cambiarPanelAsignaturasIndividual(asignatura, "Hagrid", 9.7f, "OBLIGATORIA");

                break;
            case "vuelo":
                cambiarPanelAsignaturasIndividual(asignatura, "Hook", 9.6f, "OPCIONAL");

                break;
            case "defensa":
                cambiarPanelAsignaturasIndividual(asignatura, "Lupin", 9.58f, "OBLIGATORIA");

                break;
            case "historia":
                cambiarPanelAsignaturasIndividual(asignatura, "Beans", 9.4f, "OPCIONAL");

                break;
            case "transformaciones":
                cambiarPanelAsignaturasIndividual(asignatura, "Mcgonagall", 9.3f, "OBLIGATORIA");

                break;
            case "encantamientos":
                cambiarPanelAsignaturasIndividual(asignatura, "Flitwich", 9.2f, "OPCIONAL");

                break;
            case "runas":
                cambiarPanelAsignaturasIndividual(asignatura, "Babbling", 9.1f, "OPCIONAL");

                break;
            case "adivinacion":
                cambiarPanelAsignaturasIndividual(asignatura, "Trelawney", 8.2f, "OPCIONAL");

                break;

        }

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
        vaciarPanelTodo();
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
                LabelSesionProfe.setText("");
                break;
            case "SLYTHERIN":
                cambiarImagenSl();
                LabelSesionProfe.setText("");
                break;
            case "HAFFLEPUFF":
                cambiarImagenHu();
                LabelSesionProfe.setText("");
                break;
            case "RAVENCLAW":
                cambiarImagenRa();
                LabelSesionProfe.setText("");
                break;
            default:
                throw new AssertionError();
        }

    }

    @FXML
    private void guardarPerfil(MouseEvent event) {

        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelSalaComun.setVisible(true);

    }

    @FXML
    private void cambiarSalaProfes() {
        vaciarPanelProfes();
        _panelSalaComunProfes.setVisible(true);
    }

    @FXML
    private void cambiarTareasProfes() {
        vaciarPanelProfes();
        _panelAsignaerTareasProfes.setVisible(true);
    }

    @FXML
    private void cambiarCorreccionesProfes() {
        vaciarPanelProfes();
        _panelCorreccionesProfes.setVisible(true);
    }

    @FXML
    private void cambiarCursosProfes() {
        vaciarPanelProfes();
        _panelCursosProfes.setVisible(true);
    }

    private void elegirAsignaturaPanel(MouseEvent event) {

        String asignatura = event.getPickResult().toString();
        System.out.println(asignatura);

    }

    @FXML
    private void atrasAsignatura(MouseEvent event) {

        paneAsignaturasIndividual.setVisible(false);
        panelAsignaturas.setVisible(true);
    }

    //método para copiar un archivo elegido del sistema a una ruta específica (en este caso la carpeta archivos)
    @FXML
    private void fileChooser(MouseEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Archivo");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );

        // Obtener la imagen seleccionada
        File archivo = fileChooser.showOpenDialog(null);
        String archivoElegido = archivo.getAbsoluteFile().toString();

        Path path = Paths.get("");
        String directoryName = path.toAbsolutePath().toString();
        System.out.println(directoryName);

        String destinationPath = directoryName+"\\src\\main\\resources\\Archivos\\";  // destination file path
        File sourceFile = new File(archivoElegido);        // Creating A Source File
        File destinationFile = new File(destinationPath + sourceFile.getName());   //Creating A Destination File. Name stays the same this way, referring to getName()
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath());
            // Static Methods To Copy Copy source path to destination path
        } catch (Exception e) {
            System.out.println(e);  // printing in case of error.
        }

    }

}
