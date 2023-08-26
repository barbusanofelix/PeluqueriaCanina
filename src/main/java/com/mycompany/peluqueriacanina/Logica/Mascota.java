
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.persistence.Entity; // Al colocar Entity pide importar 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// Anotaciones se escriben sobre el campo que afecta.

@Entity  // Con esto hacemos la clase una entidad para la base de datos.
public class Mascota implements Serializable {

    @Id  // cLAVE PRINCIPAL
    @GeneratedValue(strategy= GenerationType.SEQUENCE) // gENERA AUTOMATICO
    private int num_Cliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    
    @OneToOne   // Relacion con el dueño 1 a 1 
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_Cliente, String nombre, String raza, String color, String alergico, String atencion_especial, String observaciones, Duenio unDuenio) {
        this.num_Cliente = num_Cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio; // Recibe 1 dueño.
    }

    public int getNum_Cliente() {
        return num_Cliente;
    }

    public void setNum_Cliente(int num_Cliente) {
        this.num_Cliente = num_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
    
            
        
    
}
