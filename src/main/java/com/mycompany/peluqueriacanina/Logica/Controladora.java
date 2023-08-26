
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPersis=new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raz, String col, String cel, String nombreDue, String observ, String alerg, String atencion) {
        
        // Creamos el dueño y asignamos sus valores
        Duenio duenio=new Duenio();
        duenio.setNombre(nombreDue);
        duenio.setCel_Duenio(cel);
        
        
        // Creamos la mascota y le asignamos sus valores...8 parametros
        // El setDuenio se le asigna el dueño definido en el objeto duenio
        Mascota masco=new Mascota();
        masco.setNombre(nombreMasco);
        masco.setColor(col);
        masco.setRaza(raz);
        masco.setAlergico(alerg);
        masco.setAtencion_especial(atencion);
        masco.setObservaciones(observ);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
        
        
        
        
        
        
    }
 
    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascota();
    
    }

    public void borrarMasctota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
        
    
    }

    public
    Mascota traerMascota(int num_cliente) {
        
    return controlPersis.traerMascota(num_cliente);
    
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raz, String col, String cel, String nombreDue, String observ, String alerg, String atencion) {
       // Cuando se hace la modificacion de datos no sabemos que cambio dentro de masco
       // masco es el registro original , como estaba en la base de datos y el resto de los parametros son valores nuevos
       // o iguales.
       // Entonces aqui hay que reasignar a masco los valores que vienen como parametros
       // Los parametros relacionados con la mascota
       masco.setNombre(nombreMasco);
       masco.setRaza(raz);
       masco.setColor(col);
       masco.setObservaciones(observ);
       masco.setAlergico(alerg);
       masco.setAtencion_especial(atencion);
       
       // Ahora mandamos a Modificar la mascota
       controlPersis.modificarMascota(masco);
       
       // para buscar el dueño hacemos un objeto y metodo en el controador que busque el dueño
       // que est asociado a masco.
       Duenio duenio=this.buscarDuenio(masco.getUnDuenio().getId_Duenio());
       
       // Ya con el dueño traido , entonces le seteamos sus campos
       duenio.setCel_Duenio(cel);
       duenio.setNombre(nombreDue);
       
       this.modificarDueno(duenio);
       
       
       // Ahora con el dueño.
       
       
       
        
    
    }

    private Duenio buscarDuenio(int id_Duenio) {
    return controlPersis.traerDueno(id_Duenio);   
    
    }

    private void modificarDueno(Duenio duenio) {
    controlPersis.modificarDuenio(duenio);
    
    }

    
    
    
    
    
}
