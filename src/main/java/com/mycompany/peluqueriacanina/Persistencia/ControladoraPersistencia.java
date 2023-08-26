
package com.mycompany.peluqueriacanina.Persistencia;

import com.mycompany.peluqueriacanina.Logica.Duenio;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import com.mycompany.peluqueriacanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa=new DuenioJpaController();
    MascotaJpaController mascotaJpa=new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
    // Creamos el dueño en la DB primero porque la mascota necesita un dueño.
    duenioJpa.create(duenio);
    
    // Creamos la mascota en la DB
    mascotaJpa.create(masco);
    
    
        
    
    }

    public List<Mascota> traerMascota() {
        System.out.println("Vino a recuperar datos de mascotas");
    
    return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        
        try {
            
            // Al llamar el metodo dará error en los bordes de num_cliente
            // se le indica que rodeo con Try / Catch
            mascotaJpa.destroy(num_cliente);
        }
        catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public
    Mascota traerMascota(int num_cliente) {
      return mascotaJpa.findMascota(num_cliente);
    
    
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        }
        catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public Duenio traerDueno(int id_Duenio) {
    return duenioJpa.findDuenio(id_Duenio);
        
    }

    public void modificarDuenio(Duenio duenio) {
       // Al querer llamar duenioJpa.edit(duenio) genera un warnning y hay que 
       // envolver la instruccion en try/catch
        
        try {
            duenioJpa.edit(duenio);
        }
        catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}


