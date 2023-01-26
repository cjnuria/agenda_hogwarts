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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.rgb;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import com.agenda.agenda_v1.Delta;

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
    @FXML
    private TextField _tfDocumentoSubir;
    @FXML
    private TextField _tfComentario;
    @FXML
    private Button botonSalirAlumno1;
    @FXML
    private TextField _tfNombreEstudiante;
    @FXML
    private TextField _tfApellidosEstudiante;
    @FXML
    private TextField _tfEmailEstudiante;
    @FXML
    private TextField _tfDniEstudiante;
    @FXML
    private TextField _tfTelefonoEstudiante;
    @FXML
    private TextField _tfFechaNacEstudiante;
    @FXML
    private TextField _tfPassEstudiante;
    @FXML
    private Button botonSalirAlumno11;
    @FXML
    private Pane panelSelecionAsignatura;
    @FXML
    private ImageView _asignaturaPociones11;
    @FXML
    private ImageView _asignaturaTransformaciones11;
    @FXML
    private ImageView _asignaturaEncantamientos11;
    @FXML
    private ImageView _asignaturaDefensa11;
    @FXML
    private ImageView _asignaturaCriaturas11;
    @FXML
    private ImageView _asignaturaHistoria11;
    @FXML
    private ImageView _asignaturaVuelo11;
    @FXML
    private ImageView _asignaturaRunas11;
    @FXML
    private ImageView _asignaturaAdivinacion11;
    @FXML
    private ComboBox<String> _cbCursos;
    @FXML
    private Label _labelSesionEstudiante;
    @FXML
    private CheckBox _checkPociones;
    @FXML
    private CheckBox _checkTransformaciones;
    @FXML
    private CheckBox _checkDefensa;
    @FXML
    private CheckBox _checkCriaturas;
    @FXML
    private CheckBox _checkEncantamientos;
    @FXML
    private CheckBox _checkRunas;
    @FXML
    private CheckBox _checkAdivinacion;
    @FXML
    private CheckBox _checkVuelo;

    @FXML
    private CheckBox _checkHistoria;
    @FXML
    private TableView<Alumnos_objeto> _tablaProfesor_cursos;
    @FXML
    private TableColumn<Alumnos_objeto, String> _columAlumno;

    @FXML
    private TableColumn<Alumnos_objeto, String> _columCasa;
    @FXML
    private TableColumn<Alumnos_objeto, String> _columCursos;
    @FXML
    private TableColumn<Alumnos_objeto, String> _columApellidos;
    @FXML
    private Label _labelSesionProfesor;
    @FXML
    private ComboBox<String> _cbTareas_cursos;
    @FXML
    private ComboBox<String> _cbTareas_alumnos;
    @FXML
    private TextArea _taTareas_descripcion;
    @FXML
    private TextField _tfNombreTarea;
    @FXML
    private TextArea _taTarea_destinatario;
    @FXML
    private ComboBox<String> _cbTareas_tipo;
    @FXML
    private ComboBox<String> _cbTarea_casa;
    @FXML
    private DatePicker _dpTareas_fechaIni;
    @FXML
    private DatePicker _dpTareas_fechaFin;
    @FXML
    private TableView<tareas_profesores_objeto> _tbTarea_correciones;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasCursos;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasTareas;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasFechaFin;
    @FXML
    private TextField _tfTareas_alumno;
    @FXML
    private TextField _tfTareasComentario;
    @FXML
    private TextField _tfTareasNota;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareaNombre;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasApellidos;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareaTipo;
    @FXML
    private TableView<tareas_alumnos_objeto> _tbA_tareas;
    @FXML
    private TableColumn<tareas_alumnos_objeto, String> _columA_tareaAsignatura;
    @FXML
    private TableColumn<tareas_alumnos_objeto, String> _columA_tareaTipo;
    @FXML
    private TableColumn<tareas_alumnos_objeto, String> _columA_tareaNombre;
    @FXML
    private TableColumn<tareas_alumnos_objeto, String> _columA_tareafecha_fin;
    @FXML
    private TableColumn<tareas_alumnos_objeto, String> _columA_tareaArchivo;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_tarea_nombre;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_tarea_apellidos;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_tarea_cursos;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_tarea_tareas;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_tarea_tipo;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_tarea_fecha;
    @FXML
    private TableView<tareas_profesores_objeto> _tbprofesores_semanal;
    @FXML
    private ImageView _iconPergamino;
    @FXML
    private ImageView _iconTemario;
    @FXML
    private Pane _panelAsistencia;
    @FXML
    private Pane _paneTemario;
    @FXML
    private Pane panelAdministrador;
    @FXML
    private Pane panelTareas11;
    @FXML
    private Label label_titulo11;
    @FXML
    private Pane panelMenuLateral1;
    @FXML
    private ImageView _imagen_bandera1;
    @FXML
    private Button _boton_alumnos_administrador;
    @FXML
    private Button _boton_profesores_administrador;
    @FXML
    private Button _boton_cerrar_sesion;
    @FXML
    private Button _boton_salir;
    @FXML
    private Label _labelSesionEstudiante1;
    @FXML
    private Pane _panelAdministadorAlumnos;
    @FXML
    private Pane _panelAdministrador_profesor;
    @FXML
    private TextField _tfNombreEstudiante11;
    @FXML
    private TextField _tfApellidosEstudiante11;
    @FXML
    private TextField _tfEmailEstudiante11;
    @FXML
    private TextField _tfDniEstudiante11;
    @FXML
    private TextField _tfTelefonoEstudiante11;
    @FXML
    private TextField _tfFechaNacEstudiante11;
    @FXML
    private Button _boton_sala_comun111;
    @FXML
    private TextField _tfPassEstudiante11;
    @FXML
    private ComboBox<?> _cbCursos11;
    @FXML
    private Pane _panelAdministradorConfiguracion;
    @FXML
    private TextField _tfNombreEstudiante1;
    @FXML
    private TextField _tfApellidosEstudiante1;
    @FXML
    private TextField _tfEmailEstudiante1;
    @FXML
    private TextField _tfDniEstudiante1;
    @FXML
    private TextField _tfTelefonoEstudiante1;
    @FXML
    private TextField _tfFechaNacEstudiante1;
    @FXML
    private Button _boton_sala_comun11;
    @FXML
    private TextField _tfPassEstudiante1;
    @FXML
    private ComboBox<?> _cbCursos1;
    @FXML
    private TableColumn<Alumnos_objeto, String> _columP_nombre;
    @FXML
    private TableColumn<Alumnos_objeto, String> _columP_apellidos;
    @FXML
    private TableColumn<Alumnos_objeto, String> _columP_asistencia;
    @FXML
    private ComboBox<String> _comboP_AsistenciaCursos;
    @FXML
    private ComboBox<String> _comboP_AsistenciaCasa;
    @FXML
    private TableView<Alumnos_objeto> _tablaP_asistencia;

    private static List<String> valoresLista = new ArrayList<>();
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columP_dni;
    @FXML
    private TableView<tareas_profesores_objeto> _tbTarea_correciones_pendientes;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareaNombrePendientes;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasApellidosPendientes;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasCursosPendientes;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasTareasPendientes;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareaTipoPendientes;
    @FXML
    private TableColumn<tareas_profesores_objeto, String> _columTareasFechaFinPendientes;
    @FXML
    private TableColumn<tareas_alumnoConProfesor_objeto, String> _columAluSema_asignatura;
    @FXML
    private TableColumn<tareas_alumnoConProfesor_objeto, String> _columAluSema_profesor;
    @FXML
    private TableColumn<tareas_alumnoConProfesor_objeto, String> _columAluSema_tareas;
    @FXML
    private TableColumn<tareas_alumnoConProfesor_objeto, String> _columAluSema_tipo;
    @FXML
    private TableColumn<tareas_alumnoConProfesor_objeto, String> _columAluSema_fecha;
    @FXML
    private TableView<tareas_alumnoConProfesor_objeto> _tablaAlum_salaComun;
    @FXML
    private TableView<notas_objeto> _tablaAlu_notas;
    @FXML
    private TableColumn<notas_objeto, String> _columAlu_notas_asignatura;
    @FXML
    private TableColumn<notas_objeto, String> _columAlu_notas_tipo;
    @FXML
    private TableColumn<notas_objeto, String> _columAlu_notas_nombre;
    @FXML
    private TableColumn<notas_objeto, String> _columAlu_notas_nota;
    @FXML
    private TableColumn<notas_objeto, String> _columAlu_notas;
    @FXML
    private ComboBox<?> _jcFilto_notas_alumno;
    @FXML
    private ImageView _imagNotas1;
    @FXML
    private Label _labelNotas1;
    @FXML
    private ImageView _imagNotas2;
    @FXML
    private Label _labelNotas5;
    @FXML
    private ImageView _imagNotas3;
    @FXML
    private Label _labelNotas2;
    @FXML
    private ImageView _imagNotas4;
    @FXML
    private Label _labelNotas4;
    @FXML
    private ImageView _imagNotas5;
    @FXML
    private Label _labelNotas3;
    @FXML
    private Label _labelNotas6;
    @FXML
    private ImageView _imagNotas6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vaciarPanelTodo();
        panelLog.setVisible(true);
        connect();

        filtras_notas_asignatura(53);
        controlcheck();
        controTareas();
        solo_combo_casa();
        solo_combo_curos();
        _cbCursos.getItems().addAll("Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo");
        _cbCursos.setValue("Primero");

        _tbTarea_correciones.setOnMouseClicked((MouseEvent mouseEvent) -> {
            // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
            comprobar();
        });

        rellenar_tablaProfesor_semanal(14);

        labelUser.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                abrirCasaLogin();
            }
        });
        labelPass.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                abrirCasaLogin();
            }
        });

    }

    public void panepressed(MouseEvent me) {
        Stage a = (Stage) ((Node) me.getSource()).getScene().getWindow();
        Delta.x = a.getX() - me.getScreenX();
        Delta.y = a.getY() - me.getScreenY();

    }

    public void panedraged(MouseEvent me) {
        Stage b = (Stage) ((Node) me.getSource()).getScene().getWindow();
        b.setX(Delta.x + me.getScreenX());
        b.setY(Delta.y + me.getScreenY());

    }

    //Método para controlar los click que se hacen al elegir asignaturas para poder bloquearlas al elegir 6
    public void controlcheck() {

        _checkAdivinacion.setOnMouseClicked((MouseEvent mouseEvent) -> {
            // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
            contarCheck();
        });
        _checkCriaturas.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkDefensa.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkEncantamientos.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkPociones.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkRunas.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkTransformaciones.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkVuelo.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });
        _checkHistoria.setOnMouseClicked((MouseEvent mouseEvent) -> {
            contarCheck();
        });

    }

    //Método para controlar click en los combobox de tareas
    public void controTareas() {

    }

    //Método para abrir la casa según dni(no terminado)
    @FXML
    public void abrirCasaLogin() {
        String dni = labelUser.getText();
//        String casa= casa_por_dni(dni);
//        System.out.println(casa);
        switch (dni) {

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
                break;
//            case "minerva":
//                _labelSesionProfesor.setText("minerva");
//                cambiarImagenProfe();
//            case "SLYTHERIN":
//                cambiarImagenSl();
//                
        }
    }

    ////////////MÉTODOS PARA CAMBIAR APARIENCIA SEGÚN CASA///////////////
    /////////////////////////////////////////////////////////////////////
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
        //solo csss para menu lateral si se pone asi
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

    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    //MÉTODO PARA VACIAR PANELES//
    public void vaciarPanelTodo() {

        panelAsignaturas.setVisible(false);
        panelNotas.setVisible(false);
        panelTareas.setVisible(false);
        panelSalaComun.setVisible(false);
        paneAsignaturasIndividual.setVisible(false);
        panelAlumnos.setVisible(false);
        panelLog.setVisible(false);
        panelProfesores.setVisible(false);
        panelRegistro.setVisible(false);
        paneConfiguracion.setVisible(false);
        panelSelecionAsignatura.setVisible(false);
        paneConfiguracion.setVisible(false);
        _panelCorreccionesProfes.setVisible(false);
        _panelCursosProfes.setVisible(false);
        _panelSalaComunProfes.setVisible(false);
        _panelAsignaerTareasProfes.setVisible(false);
        _panelAsistencia.setVisible(false);
        _paneTemario.setVisible(false);
        _panelAdministadorAlumnos.setVisible(false);
        _panelAdministradorConfiguracion.setVisible(false);
        _panelAdministrador_profesor.setVisible(false);

    }

    public void vaciarPanelProfes() {
        _panelCorreccionesProfes.setVisible(false);
        _panelCursosProfes.setVisible(false);
        _panelSalaComunProfes.setVisible(false);
        _panelAsignaerTareasProfes.setVisible(false);
        _panelAsistencia.setVisible(false);

    }

    //===========================================================================================================
    //////////////MÉTODOS PARA CABIAR PANELES SEGÚN DONDE HAGAS CLICK/////////
    //////////////////////////////////////////////////////////////////////////
    @FXML
    private void cambiarPanelSalaComun(ActionEvent event) {
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelSalaComun.setVisible(true);
        _tablaAlum_salaComun.getItems().clear();
        rellenar_tareas_alumnos_semanal(53);//??????????????

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

        _jcFilto_notas_alumno.getItems().clear();
        notas_por_asignatura(53);

        _tablaAlu_notas.getItems().clear();
        rellenar_notas_alumnos(53);//?????????????????????????

    }

    @FXML
    private void cambiarPanelTareas(ActionEvent event) {
        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelTareas.setVisible(true);
        //totalAlumnos();
        _tbA_tareas.getItems().clear();
        rellenar_tareas_alumnos(53);
    }

    @FXML
    private void cambiarSalaProfes() {
        vaciarPanelProfes();
        _panelSalaComunProfes.setVisible(true);
        _tbprofesores_semanal.getItems().clear();
        rellenar_tablaProfesor_semanal(14);

    }

    @FXML
    private void cambiarTareasProfes() {

        vaciarPanelProfes();
        _panelAsignaerTareasProfes.setVisible(true);
        _cbTareas_cursos.getItems().addAll("Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo");
        //_cbTareas_cursos.setValue("Primero");
        _cbTarea_casa.getItems().addAll("Gryffindor", "Slytherin", "Hafflepuff", "Ravenclaw");
        //_cbTarea_casa.setValue("Gryffindor");
        _cbTareas_tipo.getItems().addAll("Examen", "Proyecto", "Recuperación", "Ejercicios");
        _cbTareas_tipo.setValue("Ejercicios");
        totalAlumnos();
        solo_combo_casa();
        solo_combo_curos();

    }

    @FXML
    private void cambiarCorreccionesProfes() {
        vaciarPanelProfes();
        _tbTarea_correciones.getItems().clear();
        _panelCorreccionesProfes.setVisible(true);
        rellenar_tabla_correcciones(14);
        rellenar_tabla_correccionesPendientes(14);

    }

    @FXML
    private void cambiarCursosProfes() {
        _cbCursos.getItems().addAll("Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo");
        _cbCursos.setValue("Primero");
        vaciarPanelProfes();
        _panelCursosProfes.setVisible(true);
        int id_profesor = id_profesor_Con_dni(_labelSesionProfesor.getText());
        int id_asigProf = id_profesor_obtener_asifprof(id_profesor);
        rellenar_tabla(7);//????????????????????????????????????????'
    }

    /////////////////////////////////////////////////////////////////////////////////
    /////////MÉTODOS PARA ABRIR ASIGNATURAS AL HACER CLICK EN SU ICONO///////////////
    /////////////////////////////////////////////////////////////////////////////////
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

        //System.out.println(a); //para comprobar los nodos y saber donde estoy entrando
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

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    @FXML
    public void salirProg() {
        System.exit(0);
    }

    @FXML
    private void cerrarTodo(ActionEvent event) {
        System.exit(0);
    }

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
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
                break;
            case "SLYTHERIN":
                cambiarImagenSl();
                break;
            case "HAFFLEPUFF":
                cambiarImagenHu();
                break;
            case "RAVENCLAW":
                cambiarImagenRa();
                break;
        }

    }

    private void guardarPerfil(MouseEvent event) {

        vaciarPanelTodo();
        panelAlumnos.setVisible(true);
        panelSalaComun.setVisible(true);

    }

    private void elegirAsignaturaPanel(MouseEvent event) {

        String asignatura = event.getPickResult().toString();

    }

    @FXML
    private void atrasAsignatura(MouseEvent event) {

        paneAsignaturasIndividual.setVisible(false);
        panelAsignaturas.setVisible(true);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //método para copiar un archivo elegido del sistema a una ruta específica (en este caso la carpeta archivos)
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private void fileChooser(MouseEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Archivo");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll();

        // Obtener la imagen seleccionada
        File archivo = fileChooser.showOpenDialog(null);
        String archivoElegido = archivo.getAbsoluteFile().toString();

        _tfDocumentoSubir.setText(archivoElegido);

    }

    @FXML
    private void GuardarDocumentoComentario() {
        System.out.println(_tbA_tareas.getSelectionModel().getSelectedItem().getNombre_tarea());
        String archivoElegido = _tfDocumentoSubir.getText();
        String comentario_alumno = _tfComentario.getText();

        Path path = Paths.get("");
        String directoryName = path.toAbsolutePath().toString();

        String destinationPath = directoryName + "\\src\\main\\resources\\archivos\\";  // destination file path
        File sourceFile = new File(archivoElegido);        // Creating A Source File
        File destinationFile = new File(destinationPath + sourceFile.getName());   //Creating A Destination File. Name stays the same this way, referring to getName()

        try {
            Alert dialogoAlerta = new Alert(AlertType.CONFIRMATION);
            dialogoAlerta.setTitle("Ventana de Confirmación");
            dialogoAlerta.setHeaderText(null);
            dialogoAlerta.initStyle(StageStyle.UTILITY);
            dialogoAlerta.setContentText("¿Seguro que quieres subir el archivo?");

            Optional<ButtonType> result = dialogoAlerta.showAndWait();
            if (result.get() == ButtonType.OK) {
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
            }

            // Static Methods To Copy Copy source path to destination path
        } catch (Exception e) {
            Jopane("Error", "Error, el comentario no se ha guardado");
        }

    }

    public void guardarP_comentarioYnota_tareas() {

        String comentarioTarea = _tfTareasComentario.getText();
        float notatarea = Float.parseFloat(_tfTareasNota.getText());
    }

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    ////////////////CONEXION///////////////////
    // Conexión a la base de datos
    private static Connection conn = null;

    // Configuración de la conexión a la base de datos
    private static final String DB_HOST = "servidor.choto.es";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "alu_nurismy_agenda";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + ""
            + "?serverTimezone=UTC";
    private static final String DB_USER = "unalumno";
    private static final String DB_PASS = "soyunalumno2022";

    /**
     * Intenta conectar con la base de datos.
     *
     * @return true si pudo conectarse, false en caso contrario
     */
    public static boolean connect() {
        try {
            //System.out.print("Conectando a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void transaccion(String sql) {
        try {

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            conn.setAutoCommit(false); ////// ----->> Desactivamos auto commit

            Statement st = conn.createStatement();

            // Crear un registro de envíos si se cumple una determinada condición
            if (st.executeUpdate(sql) != 0) {
                //JOptionPane.showMessageDialog(null, "Transacción Correcta");
                conn.commit();  ///// ---->> reflejar las operaciones en la base de datos

            } else {
                //JOptionPane.showMessageDialog(null, "Error, desacemos los cambios");
                conn.rollback(); ///// -----> Deshacer operaciones
            }
        } catch (SQLException e) {  //Si se produce una Excepción deshacemos las operaciones

            if (conn != null) {
                try {
                    //JOptionPane.showMessageDialog(null, "Error, desacemos los cambios");
                    conn.rollback();///// -----> Deshacer operaciones
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                    //JOptionPane.showMessageDialog(null, "Error, desacemos los cambios");
                }
            }

        }
    }

    /////////////////////////////////////////////////////////////////////////////////
    ////////////////MÉTODO PARA DAR DE ALTA UN ESTUDIANTE////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    @FXML
    public void altaEstudiante() {

        //String sql = "";
        try {

            PreparedStatement pst = conn.prepareStatement("INSERT INTO estudiantes (nombre, apellidos, dni, telefono, fecha_nac, correo, pass, casa, curso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            String nombre = _tfNombreEstudiante.getText();
            String apellidos = _tfApellidosEstudiante.getText();
            String dni = _tfDniEstudiante.getText();
            int telefono = Integer.parseInt(_tfTelefonoEstudiante.getText());
            String fecha_nac = _tfFechaNacEstudiante.getText();
            String correo = _tfEmailEstudiante.getText();
            String pass = _tfPassEstudiante.getText();
            String casa = label_casa_seleccion.getText();
            String curso = _cbCursos.getValue();

            //sql = "INSERT INTO estudiantes (nombre, apellidos, telefono, dni, fecha_nac, correo, pass, casa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pst.setString(1, nombre);
            pst.setString(2, apellidos);
            pst.setString(3, dni);
            pst.setInt(4, telefono);
            pst.setString(5, fecha_nac);
            pst.setString(6, correo);
            pst.setString(7, pass);
            pst.setString(8, casa);
            pst.setString(9, curso);

            boolean a = pst.execute();

            if (!a) {

                vaciarPanelTodo();
                panelAlumnos.setVisible(true);
                panelSelecionAsignatura.setVisible(true);
                Jopane("Añadido correctamente, seleccione ahora 6 asignaturas", "Añadir estudiantes");
                borrar_datos_registro();
                _labelSesionEstudiante.setText(dni);
            } else {
                Jopane("Error", "error al insertar");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /////////////////////////////////////////////////////////////////////////////////
    //ARREGLAR PARA CERRAR SESIÓN DE VERDAD, REINICIAR TODOS LOS VALORES O ALGO ASI
    @FXML
    private void cerrarSesion(MouseEvent event) {
        Window win = App.getScene().getWindow();
        win.setWidth(858);
        win.setHeight(458);
        vaciarPanelTodo();
        panelLog.setVisible(true);
        borrarTodo();

    }

    public void borrarTodo() {
        _cbCursos.getItems().clear();
        _cbTarea_casa.getItems().clear();
        _cbTareas_alumnos.getItems().clear();
        _cbTareas_tipo.getItems().clear();
        _cbTareas_cursos.getItems().clear();
        _tfApellidosEstudiante.setText("");
        _tfComentario.setText("");
        _tfDniEstudiante.setText("");
        _tfDocumentoSubir.setText("");
        _tfEmailEstudiante.setText("");
        _tfFechaNacEstudiante.setText("");
        _tfNombreEstudiante.setText("");
        _tfNombreTarea.setText("");
        _tfPassEstudiante.setText("");
        _tfTelefonoEstudiante.setText("");
        _checkAdivinacion.setSelected(false);
        _checkCriaturas.setSelected(false);
        _checkDefensa.setSelected(false);
        _checkEncantamientos.setSelected(false);
        _checkHistoria.setSelected(false);
        _checkPociones.setSelected(false);
        _checkRunas.setSelected(false);
        _checkTransformaciones.setSelected(false);
        _checkVuelo.setSelected(false);
        _taTarea_destinatario.setText("");
        _taTareas_descripcion.setText("");
        _labelSesionEstudiante.setText("");
        _labelSesionProfesor.setText("");

    }

    //========Metodo para las alertas=============================
    public void Jopane(String mensaje, String titulo) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.show();

    }

    //============Metodo seleccion asignaturas==================
    @FXML
    public void Asignaturas_elegidas() {
        String dni = _labelSesionEstudiante.getText();
        int id_estudiante = obtner_id_estudiante(dni);

        if (contarCheck() < 6) {
            Jopane("Hay que añadir 6 asignaturas obligatoriamente", "error");
        } else {

            if (_checkAdivinacion.isSelected()) {
                insertar_asigEstu("Adivinacion");
            }
            if (_checkCriaturas.isSelected()) {
                insertar_asigEstu("Criaturas");
            }
            if (_checkDefensa.isSelected()) {
                insertar_asigEstu("Defensa");
            }
            if (_checkEncantamientos.isSelected()) {
                insertar_asigEstu("Encantamientos");
            }
            if (_checkPociones.isSelected()) {
                insertar_asigEstu("Pociones");
            }
            if (_checkRunas.isSelected()) {
                insertar_asigEstu("Runas");
            }
            if (_checkTransformaciones.isSelected()) {
                insertar_asigEstu("Transformaciones");
            }
            if (_checkVuelo.isSelected()) {
                insertar_asigEstu("Vuelo");
            }
            if (_checkHistoria.isSelected()) {
                insertar_asigEstu("Historia");
            }

            vaciarPanelTodo();

            panelAlumnos.setVisible(true);
            panelSalaComun.setVisible(true);
            Jopane("Asignaturas elegidas correctamente", "Elegir asignaturas");

        }
    }

    public void insertar_asigEstu(String asignatura) {
        String dni = _labelSesionEstudiante.getText();

        int id_asignatura = obtener_id_asignatura(asignatura);
        int id_asigProf = obtener_id_asigProf(id_asignatura);
        int id_estudiante = obtner_id_estudiante(dni);
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO asigEstu (id_estudiante, id_asigProf) VALUES (?, ?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            pst.setInt(2, id_asigProf);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /////////////////////////////////////////////////////////////////////////////////
    ///////////////////MÉTDOS PARA OBTENER DATOS/////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    public int obtner_id_estudiante(String dni) {
        ResultSet resultado;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes WHERE dni = ? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, dni);
            resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id = resultado.getInt("id_estudiante");
                return id;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public int obtener_id_asigProf(int id_asignatura) {
        ResultSet resultado;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM asigProf WHERE id_asignatura = ? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asignatura);
            resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id = resultado.getInt("id_asigProf");
                return id;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public int obtener_id_asignatura(String asignatura) {
        ResultSet resultado;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM asignaturas WHERE nombre = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, asignatura);
            resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id = resultado.getInt("id_asignatura");
                return id;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public int totalAsignaturas(int id_estudiante) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(id_estudiante) AS total FROM asigEstu WHERE id_estudiante = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            ResultSet resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int num = resultado.getInt("total");
                return num;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int contarCheck() {

        int cont = 0;

        if (_checkAdivinacion.isSelected()) {
            cont++;
        }
        if (_checkCriaturas.isSelected()) {
            cont++;
        }

        if (_checkDefensa.isSelected()) {
            cont++;
        }

        if (_checkEncantamientos.isSelected()) {
            cont++;
        }

        if (_checkPociones.isSelected()) {
            cont++;
        }

        if (_checkRunas.isSelected()) {
            cont++;
        }
        if (_checkTransformaciones.isSelected()) {
            cont++;
        }

        if (_checkVuelo.isSelected()) {
            cont++;
        }

        if (_checkHistoria.isSelected()) {
            cont++;

        }

        if (cont > 5) {
            desactivarCheckAsignatura();
        } else {
            activarAsignaturas();
        }

        return cont;
    }

    public void desactivarCheckAsignatura() {

        _checkAdivinacion.setDisable(true);
        _checkCriaturas.setDisable(true);
        _checkDefensa.setDisable(true);
        _checkEncantamientos.setDisable(true);
        _checkPociones.setDisable(true);
        _checkRunas.setDisable(true);
        _checkTransformaciones.setDisable(true);
        _checkVuelo.setDisable(true);
        _checkHistoria.setDisable(true);

        ArrayList<CheckBox> a = new ArrayList(9);
        a.add(_checkTransformaciones);
        a.add(_checkRunas);
        a.add(_checkAdivinacion);
        a.add(_checkCriaturas);
        a.add(_checkDefensa);
        a.add(_checkEncantamientos);
        a.add(_checkHistoria);
        a.add(_checkPociones);
        a.add(_checkVuelo);

        for (int i = 0; i < 9; i++) {
            if (a.get(i).isSelected()) {
                a.get(i).setDisable(false);
            }
        }

    }

    public void activarAsignaturas() {
        _checkAdivinacion.setDisable(false);
        _checkCriaturas.setDisable(false);
        _checkDefensa.setDisable(false);
        _checkEncantamientos.setDisable(false);
        _checkPociones.setDisable(false);
        _checkRunas.setDisable(false);
        _checkTransformaciones.setDisable(false);
        _checkVuelo.setDisable(false);
        _checkHistoria.setDisable(false);
    }

// metodo devuelve la casa del alumno por el id================
    public String casa_por_id(int id_estudiante) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes where id_estudiante= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            ResultSet resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                String casa = resultado.getString("casa");
                return casa;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public int id_profesor_Con_dni(String dni) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM profesores where dni= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, dni);
            ResultSet resultado = pst.executeQuery();
            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id_profesor = resultado.getInt("id_profesor");
                return id_profesor;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public int id_asignatura_Con_id_profesor(int id_profesor) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM asigProf where id_profesor = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_profesor);
            ResultSet resultado = pst.executeQuery();
            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id_asignatura = resultado.getInt("id_asignatura");
                return id_asignatura;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public int id_profesor_obtener_asifprof(int id_profesor) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM asigProf where id_profesor= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_profesor);
            ResultSet resultado = pst.executeQuery();
            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id_asigProf = resultado.getInt("id_asigProf");
                return id_asigProf;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public ResultSet datos_tabla_profesor(int id_asigProf) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.nombre, estudiantes.apellidos, estudiantes.casa, estudiantes.curso \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?));", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //============rellena tabla de los profesores==========================================
    public ObservableList<Alumnos_objeto> rellenar_tabla(int id_asigProf) {
        ObservableList<Alumnos_objeto> obs = FXCollections.observableArrayList();
        _columAlumno.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        _columCursos.setCellValueFactory(new PropertyValueFactory<>("curso"));
        _columCasa.setCellValueFactory(new PropertyValueFactory<>("casa"));
        try {
            ResultSet rs = datos_tabla_profesor(id_asigProf);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String curso = rs.getString("curso");
                String casa = rs.getString("casa");

                Alumnos_objeto a = new Alumnos_objeto(nombre, apellidos, curso, casa);
                obs.add(a);
                _tablaProfesor_cursos.getItems().addAll(a);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    public void borrar_datos_registro() {
        _tfApellidosEstudiante.setText("");
        _tfDniEstudiante.setText("");
        _tfEmailEstudiante.setText("");
        _tfFechaNacEstudiante.setText("");
        _tfNombreEstudiante.setText("");
        _tfTelefonoEstudiante.setText("");
        _tfPassEstudiante.setText("");

    }

    public int obtener_id_profesor(String dni) {
        ResultSet resultado;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM profesores WHERE dni = ? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, dni);
            resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return -1;
            } else {
                int id = resultado.getInt("id_profesor");
                return id;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public String casa_por_dni(String dni) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes where dni= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, dni);
            ResultSet resultado = pst.executeQuery();
            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                String casa = resultado.getString("casa");
                return casa;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String cursos_por_dni(String dni) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes where dni= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, dni);
            ResultSet resultado = pst.executeQuery();
            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                String curso = resultado.getString("curso");
                return curso;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void totalAlumnos() {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().clear();// limpia los combo box para no duplicar datos
                _cbTareas_alumnos.getItems().addAll(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void totalAlumnos_por_curso(String curso) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes WHERE curso = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, curso);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();

            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void totalAlumnos_por_casa(String casa) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes WHERE casa = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, casa);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();

            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void totalAlumnos_por_casa_curso(String curso, String casa) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes WHERE curso = ? AND casa = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, curso);
            pst.setString(2, casa);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();

            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //== metodo para filtar los alumnos por casa=================
    public void filtar_alumnos_por_casa(int id_asigProf) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.casa \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?));", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();

            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//== metodo para filtar los alumnos por curso=================

    public void filtar_alumnos_por_curso(int id_asigProf) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.curso \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?));", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();
            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //== metodo para filtar los alumnos dependiendo de la casa y el curso=================

    public void alumnos_segun_casaYcurso(int id_asigProf) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.* \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?))AND estudiantes.casa=? AND estudiantes.curso=?;", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            pst.setString(2, _cbTarea_casa.getValue());
            pst.setString(3, _cbTareas_cursos.getValue());
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();
            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //== metodo para filtar los alumnos dependiendo de la casa sin selecionar otro combobox=================

    public void alumnos_segun_casa(int id_asigProf, String p2) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.* \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?))AND estudiantes.casa=?;", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            pst.setString(2, p2);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();

            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //== metodo para filtar los alumnos dependiendo del curso sin seleccionar otro combox=================

    public void alumnos_segun_curso(int id_asigProf, String p2) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.* \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?))AND  estudiantes.curso=?;", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            pst.setString(2, p2);
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();
            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void solo_combo_curos() {
        // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
        int id_asigProf = id_profesor_obtener_asifprof(id_profesor_Con_dni("sybill"));

        _cbTareas_cursos.valueProperty().addListener((ov, p1, p2) -> {
            if (_cbTarea_casa.getValue() == null) {
                alumnos_segun_curso(id_asigProf, p2);
            } else {
                alumnos_segun_casaYcurso(id_asigProf);
            }
        });
    }

    public void solo_combo_casa() {

        int id_asigProf = id_profesor_obtener_asifprof(id_profesor_Con_dni("minerva"));

        _cbTarea_casa.valueProperty().addListener((ov, p1, p2) -> {
            if (_cbTareas_cursos.getValue() == null) {
                alumnos_segun_casa(id_asigProf, p2);
            } else {
                alumnos_segun_casaYcurso(id_asigProf);
            }
        });
    }

    @FXML
    public void alta_tareas() {

        int id_profesor = obtener_id_profesor("minerva");//???????????????????????????????????

        int id_alumno;
        int id_asignatura = id_asignatura_Con_id_profesor(id_profesor);

        for (int i = 0; i < valoresLista.size(); i++) {
            try {
                PreparedStatement pst = conn.prepareStatement("INSERT INTO tareas (id_profesor,id_asignatura,id_estudiante,nombre_tarea,tipo_tarea,fecha_inicio,fecha_fin,descripcion_tarea) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                String correo = valoresLista.get(i);
                String dni = obtener_correo_dniEStudiante(correo);
                String nombre_tarea = _tfNombreTarea.getText();
                String tareas_cursos = cursos_por_dni(dni);
                String casa = casa_por_dni(dni);
                //String alumno = _cbTareas_alumnos.getValue();

                id_alumno = obtner_id_estudiante(dni);
                String Tipo = _cbTareas_tipo.getValue();
                String fec_ini = _dpTareas_fechaIni.getValue().toString();
                String fec_fin = _dpTareas_fechaFin.getValue().toString();
                String descripcion = _taTareas_descripcion.getText();
                String destinatarios = _taTarea_destinatario.getText();

                //sql = "INSERT INTO estudiantes (nombre, apellidos, telefono, dni, fecha_nac, correo, pass, casa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                pst.setInt(1, id_profesor);
                pst.setInt(2, id_asignatura);
                pst.setInt(3, id_alumno);
                pst.setString(4, nombre_tarea);
                pst.setString(5, Tipo);
                pst.setString(6, fec_ini);
                pst.setString(7, fec_fin);
                pst.setString(8, descripcion);

                boolean a = pst.execute();

                if (!a) {

                    vaciarPanelTodo();
                    panelProfesores.setVisible(true);
                    _panelSalaComunProfes.setVisible(true);
                    Jopane("Añadido correctamente", "Añadir Tareas");
                    borrar_datos_registro();

                } else {
                    Jopane("Error", "Error al insertar");
                }

            } catch (SQLException ex) {
                Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public ObservableList<tareas_profesores_objeto> rellenar_tabla_correcciones(int id_profesor) {

        ObservableList<tareas_profesores_objeto> obs = FXCollections.observableArrayList();
        _columTareaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columTareasApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        _columTareasCursos.setCellValueFactory(new PropertyValueFactory<>("curso"));
        _columTareasTareas.setCellValueFactory(new PropertyValueFactory<>("nombre_tarea"));
        _columTareaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo_tarea"));
        _columTareasFechaFin.setCellValueFactory(new PropertyValueFactory<>("fecha_fin"));
        try {
            ResultSet rs = datos_para_correcciones(id_profesor);

            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String cursos = rs.getString("curso");
                String nombre_tarea = rs.getString("nombre_tarea");
                String tipo_tarea = rs.getString("tipo_tarea");
                String fecha_fin = rs.getString("fecha_fin");

                tareas_profesores_objeto c = new tareas_profesores_objeto(nombre, apellidos, cursos, nombre_tarea, tipo_tarea, fecha_fin);
                obs.add(c);
                _tbTarea_correciones.getItems().addAll(c);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    public ResultSet datos_para_correcciones(int id_profesor) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.nombre, estudiantes.apellidos, estudiantes.curso, tareas.nombre_tarea, tareas.tipo_tarea, tareas.fecha_fin\n"
                    + "FROM alu_nurismy_agenda.estudiantes estudiantes, alu_nurismy_agenda.tareas tareas\n"
                    + "WHERE \n"
                    + "	tareas.id_estudiante = estudiantes.id_estudiante AND tareas.id_profesor = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_profesor);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResultSet datos_para_correccionesPendientes(int id_profesor) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.nombre, estudiantes.apellidos, estudiantes.curso, tareas.nombre_tarea, tareas.tipo_tarea, tareas.fecha_fin\n"
                    + "FROM alu_nurismy_agenda.estudiantes estudiantes, alu_nurismy_agenda.tareas tareas\n"
                    + "WHERE \n"
                    + "	tareas.id_estudiante = estudiantes.id_estudiante AND tareas.id_profesor = ? AND tareas.corregido=0 ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_profesor);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ObservableList<tareas_profesores_objeto> rellenar_tabla_correccionesPendientes(int id_profesor) {

        ObservableList<tareas_profesores_objeto> obs = FXCollections.observableArrayList();
        _columTareaNombrePendientes.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columTareasApellidosPendientes.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        _columTareasCursosPendientes.setCellValueFactory(new PropertyValueFactory<>("curso"));
        _columTareasTareasPendientes.setCellValueFactory(new PropertyValueFactory<>("nombre_tarea"));
        _columTareaTipoPendientes.setCellValueFactory(new PropertyValueFactory<>("tipo_tarea"));
        _columTareasFechaFinPendientes.setCellValueFactory(new PropertyValueFactory<>("fecha_fin"));
        try {
            ResultSet rs = datos_para_correccionesPendientes(id_profesor);

            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String cursos = rs.getString("curso");
                String nombre_tarea = rs.getString("nombre_tarea");
                String tipo_tarea = rs.getString("tipo_tarea");
                String fecha_fin = rs.getString("fecha_fin");

                tareas_profesores_objeto c = new tareas_profesores_objeto(nombre, apellidos, cursos, nombre_tarea, tipo_tarea, fecha_fin);
                obs.add(c);
                _tbTarea_correciones_pendientes.getItems().addAll(c);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    public ObservableList<tareas_alumnos_objeto> rellenar_tareas_alumnos(int id_estudiante) {

        ObservableList<tareas_alumnos_objeto> obs = FXCollections.observableArrayList();
        _columA_tareaAsignatura.setCellValueFactory(new PropertyValueFactory<>("asignatura"));
        _columA_tareaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo_tarea"));
        _columA_tareaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre_tarea"));
        _columA_tareafecha_fin.setCellValueFactory(new PropertyValueFactory<>("fecha_fin"));
        _columA_tareaArchivo.setCellValueFactory(new PropertyValueFactory<>("archivo"));

        try {
            ResultSet rs = datos_para_tareas_alumnos(id_estudiante);

            while (rs.next()) {

                String asignatura = rs.getString("nombre_asignatura");
                String tipo_tarea = rs.getString("tipo_tarea");
                String nombre_tarea = rs.getString("nombre_tarea");
                String fecha_fin = rs.getString("fecha_fin");
                String archivo = rs.getString("archivo");

                tareas_alumnos_objeto e = new tareas_alumnos_objeto(asignatura, tipo_tarea, nombre_tarea, fecha_fin, archivo);
                obs.add(e);
                _tbA_tareas.getItems().addAll(e);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    public void comprobar() {
        if (_tbTarea_correciones.getSelectionModel().getSelectedItem() != null) {
            tareas_profesores_objeto p = _tbTarea_correciones.getSelectionModel().getSelectedItem();
            String nombre_alumno = p.getNombre();
            String apellidos_alumno = p.getApellidos();
            String nombreCompleto = nombre_alumno + " " + apellidos_alumno;
            _tfTareas_alumno.setText(nombreCompleto);

        } else {
            Jopane("Error", "No ha selecionado nada");
        }
    }

    public ResultSet datos_para_tareas_alumnos(int id_estudiante) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT asignaturas.nombre AS nombre_asignatura, tareas.nombre_tarea, tareas.tipo_tarea, tareas.fecha_fin, tareas.archivo\n"
                    + "FROM alu_nurismy_agenda.asignaturas asignaturas, alu_nurismy_agenda.tareas tareas\n"
                    + "WHERE \n"
                    + "	tareas.id_asignatura = asignaturas.id_asignatura AND tareas.id_estudiante=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResultSet datos_tablaProfesores_semanal(int id_profesor) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.nombre, estudiantes.apellidos, estudiantes.curso, tareas.nombre_tarea, tareas.tipo_tarea, tareas.fecha_fin\n"
                    + "FROM alu_nurismy_agenda.estudiantes estudiantes, alu_nurismy_agenda.tareas tareas\n"
                    + "WHERE \n"
                    + "	tareas.id_estudiante = estudiantes.id_estudiante AND tareas.id_profesor = ? AND tareas.fecha_fin<CURRENT_DATE() +7;", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_profesor);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ObservableList<tareas_profesores_objeto> rellenar_tablaProfesor_semanal(int id_profesor) {

        ObservableList<tareas_profesores_objeto> obs = FXCollections.observableArrayList();
        _columP_tarea_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columP_tarea_apellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        _columP_tarea_cursos.setCellValueFactory(new PropertyValueFactory<>("curso"));
        _columP_tarea_tareas.setCellValueFactory(new PropertyValueFactory<>("nombre_tarea"));
        _columP_tarea_tipo.setCellValueFactory(new PropertyValueFactory<>("tipo_tarea"));
        _columP_tarea_fecha.setCellValueFactory(new PropertyValueFactory<>("fecha_fin"));
        try {
            ResultSet rs = datos_tablaProfesores_semanal(id_profesor);

            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String cursos = rs.getString("curso");
                String nombre_tarea = rs.getString("nombre_tarea");
                String tipo_tarea = rs.getString("tipo_tarea");
                String fecha_fin = rs.getString("fecha_fin");

                tareas_profesores_objeto f = new tareas_profesores_objeto(nombre, apellidos, cursos, nombre_tarea, tipo_tarea, fecha_fin);
                obs.add(f);
                _tbprofesores_semanal.getItems().addAll(f);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    //metodo rellenar comboxs asistencia de curso y casa
    public void rellenar_comboAsistencia() {

    }

    //metodo para  rellenar tabla asistencia alumnos
    public ObservableList<Alumnos_objeto> rellenar_tabla_asistencia(int id_profesor) {

        ObservableList<Alumnos_objeto> obs = FXCollections.observableArrayList();
        _columP_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columP_apellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        _columP_asistencia.setCellValueFactory(new PropertyValueFactory<>("asistencia"));

        ObservableList<String> asistencia = FXCollections.observableArrayList("Falta", "Retraso", "Presente");
        // combo box dentro de la tabla 
        _columP_asistencia.setCellFactory(ComboBoxTableCell.forTableColumn(asistencia));
        String nombre = null;
        try {
            ResultSet rs = datos_asistencia(7);
            while (rs.next()) {
                int id = rs.getInt("id_estudiante");
                ResultSet rst = totalAlumnos_porId(id);
                while (rst.next()) {
                    nombre = rst.getString("nombre");
                }

                String apellidos = rst.getString("apellidos");
                String dni = rst.getString("dni");
                Alumnos_objeto p = new Alumnos_objeto(nombre, apellidos, dni);
                obs.add(p);
                _tablaP_asistencia.getItems().addAll(p);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            Jopane("Error", "Error al rellenar la tabla asistencias");
        }
        return obs;
    }

    //==========================metodo rellenar datos asistencia===============================
    public ResultSet datos_asistencia(int id_asigProf) {

        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * from asigEstu WHERE id_asigProf= ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //=========icono asistencia sala comun profesores=======================
    @FXML
    public void cambiar_asistencia() {
        _comboP_AsistenciaCursos.getItems().addAll("Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo");
        _comboP_AsistenciaCasa.getItems().addAll("Gryffindor", "Slytherin", "Hafflepuff", "Ravenclaw");
        vaciarPanelTodo();
        panelProfesores.setVisible(true);
        _panelAsistencia.setVisible(true);
        rellenar_tabla_asistencia(7);//???????????????????????????
    }

    public ResultSet totalAlumnos_porId(int id_estudiante) {
        try {
            ResultSet rs;
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes WHERE id_estudiante=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //=============para rellenar asistencia================
    public void alumnosAsistencia_segun_casaYcurso(int id_asigProf) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT estudiantes.* \n"
                    + "FROM alu_nurismy_agenda.estudiantes\n"
                    + "WHERE id_estudiante IN (SELECT id_estudiante\n"
                    + "FROM alu_nurismy_agenda.asigEstu\n"
                    + "WHERE (id_asigProf) IN (?))AND estudiantes.casa=? AND estudiantes.curso=?;", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asigProf);
            pst.setString(2, _cbTarea_casa.getValue());
            pst.setString(3, _cbTareas_cursos.getValue());
            rs = pst.executeQuery();
            _cbTareas_alumnos.getItems().clear();
            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                String c = dni + " - " + nombre + " " + apellidos;
                a.add(c);
                _cbTareas_alumnos.getItems().addAll(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //===========enviar destinatarios tareas===========
    @FXML
    public List<String> insertar_destinatarios() {
        try {
            String alumno = _cbTareas_alumnos.getValue();
            String dni = alumno.substring(0, 9);
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM estudiantes WHERE dni=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, dni);
            ResultSet rs = pst.executeQuery();
            if (!rs.first()) {
                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {

                String correo = rs.getString("correo");

                String email = correo;
                valoresLista.add(email);
                Iterator<String> iter = valoresLista.iterator();
                while (iter.hasNext()) {
                    String next = iter.next();

                }

                _taTarea_destinatario.appendText(email + ", ");
                //correo.split(", ");

                return valoresLista;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String obtener_correo_dniEStudiante(String correo) {
        try {
            ResultSet rs = null;
            String sql = "SELECT * FROM estudiantes WHERE correo='" + correo + "'";
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
            if (!rs.first()) {
                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                //rs = pst.executeQuery();
                String dni = rs.getString("dni");
                return dni;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //========================rellenar sala comun alumno===========================================
    public ObservableList<tareas_alumnoConProfesor_objeto> rellenar_tareas_alumnos_semanal(int id_estudiante) {

        ObservableList<tareas_alumnoConProfesor_objeto> obs = FXCollections.observableArrayList();
        _columAluSema_asignatura.setCellValueFactory(new PropertyValueFactory<>("asignatura"));
        _columAluSema_profesor.setCellValueFactory(new PropertyValueFactory<>("profesor"));
        _columAluSema_tareas.setCellValueFactory(new PropertyValueFactory<>("nombre_tarea"));
        _columAluSema_tipo.setCellValueFactory(new PropertyValueFactory<>("tipo_tarea"));
        _columAluSema_fecha.setCellValueFactory(new PropertyValueFactory<>("fecha_fin"));

        try {
            ResultSet rs = rellenar_tabla_salaComum_alu(id_estudiante);
            System.out.println("hola");

            while (rs.next()) {

                int id_asignatura = rs.getInt("id_asignatura");
                String asignatura = obtener_nombre_asignatura(id_asignatura);
                String nombre_tarea = rs.getString("nombre_tarea");
                String tipo_tarea = rs.getString("tipo_tarea");
                String fecha_fin = rs.getString("fecha_fin");
                int id_profe = rs.getInt("id_profesor");
                String profesor = obtenerNombreProfesor_porID(id_profe);

                tareas_alumnoConProfesor_objeto v = new tareas_alumnoConProfesor_objeto(asignatura, tipo_tarea, nombre_tarea, fecha_fin, profesor);
                obs.add(v);
                _tablaAlum_salaComun.getItems().addAll(v);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    //============================rellanar tabla sala comun alumnos con profesor==================================================================
    public ResultSet rellenar_tabla_salaComum_alu(int id_estudiante) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM tareas WHERE id_estudiante =? AND tareas.fecha_fin<CURRENT_DATE() +7;", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //======================================================================================
    public String obtenerNombreProfesor_porID(int id_profesor) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM profesores where id_profesor= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_profesor);
            ResultSet resultado = pst.executeQuery();
            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                String apellido = resultado.getString("apellidos");
                return apellido;

            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //==========================================================================================
    public String obtener_nombre_asignatura(int id_asignatura) {
        ResultSet resultado;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM asignaturas WHERE id_asignatura = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_asignatura);
            resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                String nombre = resultado.getString("nombre");
                return nombre;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //========================Notas===========================================================
    public ObservableList<notas_objeto> rellenar_notas_alumnos(int id_estudiante) {

        ObservableList<notas_objeto> obs = FXCollections.observableArrayList();
        _columAlu_notas_asignatura.setCellValueFactory(new PropertyValueFactory<>("asignatura"));
        _columAlu_notas_tipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        _columAlu_notas_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columAlu_notas_nota.setCellValueFactory(new PropertyValueFactory<>("nota"));
        _columAlu_notas.setCellValueFactory(new PropertyValueFactory<>("comentario"));

        try {
            ResultSet rs = rellenar_tabla_notas_alumno(id_estudiante);

            while (rs.next()) {

                int id_asignatura = rs.getInt("id_asignatura");
                String asignatura = obtener_nombre_asignatura(id_asignatura);
                String nombre_tarea = rs.getString("nombre_tarea");
                String tipo_tarea = rs.getString("tipo_tarea");
                String nota = rs.getString("nota");
                String comentario = rs.getString("comentario_profesor");
                notas_objeto t = new notas_objeto(asignatura, tipo_tarea, nombre_tarea, nota, comentario);
                obs.add(t);
                _tablaAlu_notas.getItems().addAll(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }
    //============================rellanar tabla sala comun alumnos con profesor==================================================================

    public ResultSet rellenar_tabla_notas_alumno(int id_estudiante) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT tareas.id_asignatura, tareas.tipo_tarea, tareas.nombre_tarea, notas.nota,  notas.comentario_profesor \n"
                    + "FROM alu_nurismy_agenda.notas notas, alu_nurismy_agenda.tareas tareas\n"
                    + "WHERE \n"
                    + "notas.id_tarea = tareas.id_tarea AND tareas.id_estudiante =?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            ResultSet resultado = pst.executeQuery();
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //==========================================================================================
    public String obtener_nombre_tarea(int id_tarea) {
        ResultSet resultado;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM tareas WHERE id_tarea=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_tarea);
            resultado = pst.executeQuery();

            if (!resultado.first()) {

                Jopane("No se han encontrado datos", "Error");
                return null;
            } else {
                String nombre = resultado.getString("nombre");
                return nombre;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void notas_por_asignatura(int id_estudiante) {
        ResultSet rs;
        ArrayList a = new ArrayList();
        _jcFilto_notas_alumno.getItems().clear();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT DISTINCT asignaturas.nombre \n"
                    + "FROM alu_nurismy_agenda.asigEstu asigEstu, alu_nurismy_agenda.asigProf asigProf, alu_nurismy_agenda.asignaturas asignaturas\n"
                    + "WHERE \n"
                    + "	asigEstu.id_asigProf = asigProf.id_asigProf\n"
                    + "	AND asigProf.id_asignatura = asignaturas.id_asignatura AND id_estudiante = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            rs = pst.executeQuery();

            while (rs.next()) {
                String asignatura = rs.getString("nombre");
                String c = asignatura;
                a.add(c);
            }

            _jcFilto_notas_alumno.getItems().addAll(a);

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void filtras_notas_asignatura(int id_estudiante) {

        _jcFilto_notas_alumno.valueProperty().addListener((ov, p1, p2) -> {
            _tablaAlu_notas.getItems().clear();
            String asignatura = p2.toString();
            System.out.println(asignatura);
            rellenar_notas_alumnos_por_asignaturas(id_estudiante, asignatura);

        });
    }

    public ResultSet rellenar_tabla_notas_alumno_por_asignatura(int id_estudiante, String p2) {

        int id_asignatura = obtener_id_asignatura(p2);
        if (_jcFilto_notas_alumno.getItems().toString().equals(null)) {
            rellenar_notas_alumnos(id_estudiante);
        }

        try {
            PreparedStatement pst = conn.prepareStatement("SELECT DISTINCT tareas.id_asignatura, tareas.tipo_tarea, "
                    + "tareas.nombre_tarea, notas.nota,  notas.comentario_profesor FROM alu_nurismy_agenda.asignaturas asignaturas, "
                    + "alu_nurismy_agenda.notas notas, alu_nurismy_agenda.tareas tareas WHERE notas.id_tarea = tareas.id_tarea "
                    + "AND tareas.id_estudiante =? AND tareas.id_asignatura = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, id_estudiante);
            pst.setInt(2, id_asignatura);
            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ObservableList<notas_objeto> rellenar_notas_alumnos_por_asignaturas(int id_estudiante, String p2) {

        ObservableList<notas_objeto> obs = FXCollections.observableArrayList();
        _columAlu_notas_asignatura.setCellValueFactory(new PropertyValueFactory<>("asignatura"));
        _columAlu_notas_tipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        _columAlu_notas_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        _columAlu_notas_nota.setCellValueFactory(new PropertyValueFactory<>("nota"));
        _columAlu_notas.setCellValueFactory(new PropertyValueFactory<>("comentario"));

        try {
            ResultSet rs = rellenar_tabla_notas_alumno_por_asignatura(id_estudiante, p2);
            System.out.println(p2);

            while (rs.next()) {

                int id_asignatura = rs.getInt("id_asignatura");
                String asignatura = obtener_nombre_asignatura(id_asignatura);
                System.out.println(asignatura);
                String nombre_tarea = rs.getString("nombre_tarea");
                String tipo_tarea = rs.getString("tipo_tarea");
                String nota = rs.getString("nota");
                String comentario = rs.getString("comentario_profesor");
                notas_objeto t = new notas_objeto(asignatura, tipo_tarea, nombre_tarea, nota, comentario);
                obs.add(t);
                _tablaAlu_notas.getItems().addAll(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obs;
    }

    public void cambiarImagenAsignaturas_Notas() {//¿¿¿¿¿¿¿esto para que era??????????

        Image image1 = new Image(getClass().getResourceAsStream("/img/escudos/verde.png"));
        ImageView imageView1 = new ImageView(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/img/casas/banderaVerde.png"));
        ImageView imageView2 = new ImageView(image2);
        //panelMenuLateral.getChildren().add(imageView1);//para coger nodo hijo y añadir nueva imagen
        _imgEScudo.setImage(image1);
        _imagen_bandera.setImage(image2);

    }

    @FXML
    public void subirTarea_Alumno() {

        try {
            String comentarioAlumno = _tfComentario.getText();
            String rutaTarea = _tfDocumentoSubir.getText();
            
            System.out.println(_tbA_tareas.getSelectionModel().getSelectedItem().getNombre_tarea());
            
            
            PreparedStatement pst = conn.prepareStatement("UPDATE alu_nurismy_agenda.tareas\n"
                    + "SET entregado=1, archivo=?, comentario_alumno=?\n"
                    + "WHERE id_tarea=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, rutaTarea);
            pst.setString(2, comentarioAlumno);
            pst.setInt(3, 0);//modificar el id tarea para que lo coja automático al seleccionar la tarea
            ResultSet rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipalCasasController.class.getName()).log(Level.SEVERE, null, ex);
        }
// hola ismael
    }

}

/*

----------------------ERRORES PARA ARREGLAR-------------------------------------

----PROFESORES----
*correcciones duplica en pendientes al pinchar en correcciones del menu
*error en filtrar al entrar ya que 'p2' es null
*cursos sigue dando dos errores y tmbn carga datos duplicados al pinchar en cursos
*la sala comun no carga nada
*cargar todos los datos con el id de inicio

----ALUMNOS----
*al entrar como alumno sigue cargando la ventana de configuracion vacía, hay que poner los datos del alumno actual que entra
*sala comun no carga nada
*en tareas hay que hacer que se suba la ruta del archivo y que le cargue al profe en su tabla con algo para descargar el archivo
*coger comentario del alumno y ponerlo en la tabla del profe de correcciones
*en notas da error en java al entrar ya que p2 está vacío... no es error pero hacer un catch
*añadir botón para añadir una foto y que cargue en su sitio (donde aparezco yo...)


----GENERAL----
*hacer el chat entre profe y alumno (recargar cada 15 segundo)
*hacer documentacion (los param y esas cosas)
*control de datos (de todos)
*en registro aunque no pulses el sombrero te lleva a Gryffindor, no dar opción.
*si cierras sesión realmente no cierra, solo vuelve a la pantalla de inicio
*modificar el botón atrás, la daga de dobby
*¿?¿?¿?¿?¿buscar un gif con más resolución para el inicio?¿?¿?¿?¿?
*quitar todos los souts

*/

