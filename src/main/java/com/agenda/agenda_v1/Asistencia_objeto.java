/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenda.agenda_v1;

import javafx.collections.ObservableList;

/**
 *
 * @author nuria
 */
public class Asistencia_objeto {
    private String nombre;
    private String apellidos;
    private ObservableList <String> asistencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ObservableList<String> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(ObservableList<String> asistencia) {
        this.asistencia = asistencia;
    }

    public Asistencia_objeto(String nombre, String apellidos, ObservableList<String> asistencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asistencia = asistencia;
    }

    
    
}
