
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  // Duenio es una entidad al igual que mascota
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_Duenio;
    private String nombre;
    private String cel_Duenio;

    public Duenio() { // Constructor vacio
    }

    public Duenio(int id_Duenio, String nombre, String cel_Duenio) {
        this.id_Duenio = id_Duenio;
        this.nombre = nombre;
        this.cel_Duenio = cel_Duenio;
    }

    public int getId_Duenio() {
        return id_Duenio;
    }

    public void setId_Duenio(int id_Duenio) {
        this.id_Duenio = id_Duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCel_Duenio() {
        return cel_Duenio;
    }

    public void setCel_Duenio(String cel_Duenio) {
        this.cel_Duenio = cel_Duenio;
    }
            
    
    
}
