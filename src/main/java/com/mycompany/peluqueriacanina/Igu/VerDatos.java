
package com.mycompany.peluqueriacanina.Igu;

import com.mycompany.peluqueriacanina.Logica.Controladora;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {

    // Se crea fuera para que sea accesible dese cualquier metodo .
    // Es la controladora de la logica.
    Controladora control =null; // Super buena practica para que lo tome bien
  
    public VerDatos() {
                // Dentro del constructor la inicializamos.
             control=new Controladora();
                
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCerrarVerDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("VISUALIZACION DE DATOS");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaMascotas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Datos de Mascota");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnCerrarVerDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cerrar.png"))); // NOI18N
        btnCerrarVerDatos.setText("Cerrar");
        btnCerrarVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVerDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarVerDatos)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCerrarVerDatos))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // veamos que la tabla NO este vacia.
       // getRowCount regresa el numero de filas seleccionadas //
       
       
        if (tablaMascotas.getRowCount()>0) {
            // Que se haya seleccionado al menos un elemento de la tabla
            // Al no seleccionar nada getSelectedRow retorna -1 
            if (tablaMascotas.getSelectedRow()!=-1) {
                /* Traer el numero de cliente , que se almacenara en la variable num:cliente //
                   la Tabla lo que tiene son objetos  ( NO string , No numeros) 
                   Con getValueAt le indicamos que tome el valor en en fila seleccionada en la primera columna ( la cero) 
                   la fila seleccionada se obtiene con el getSelectedRow// 
                    El objeto se convierte a String con String.valueOff 
                    Y luego el string se convierte a numero con el Integer.parseInt //
                */

               int num_cliente= Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                System.out.println("El cliente seleccionado fue:"+ num_cliente);
              
                // hacemos e Borrado de Mascota
                control.borrarMasctota(num_cliente);
                
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Eliminacion de Mascota");
    
                // Volvemos a cargar la Tabla para que muestre la misma sin el registro elimnado
                 cargarTabla();
                
            } else  {
                mostrarMensaje("No seleccionaste ninguna mascota", "Error", "No se elimino mascota");
                
            }
            
            
            
            
            
        } else{
            mostrarMensaje("No hay mascotas para eliminar", "Error", "Elimnas solo si hay datos en la tabla");
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    // veamos que la tabla NO este vacia.
       // getRowCount regresa el numero de filas seleccionadas //
       
       
        if (tablaMascotas.getRowCount()>0) {
            // Que se haya seleccionado al menos un elemento de la tabla
            // Al no seleccionar nada getSelectedRow retorna -1 
            if (tablaMascotas.getSelectedRow()!=-1) {
                /* Traer el numero de cliente , que se almacenara en la variable num:cliente //
                   la Tabla lo que tiene son objetos  ( NO string , No numeros) 
                   Con getValueAt le indicamos que tome el valor en en fila seleccionada en la primera columna ( la cero) 
                   la fila seleccionada se obtiene con el getSelectedRow// 
                    El objeto se convierte a String con String.valueOff 
                    Y luego el string se convierte a numero con el Integer.parseInt //
                */

               int num_cliente= Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                System.out.println("El cliente seleccionado fue:"+ num_cliente);
              
                
        // Creamos instancia formulario ModificarDatos
        ModificarDatos modificardatos=new ModificarDatos(num_cliente);
        // Hacemos visibe el formulario modificar Datos
        modificardatos.setVisible(true);
        // Indicamos que no haya posicion relativa lo cual lo centra en la pantalla
        modificardatos.setLocationRelativeTo(null);        

        
                
            } else  {
                mostrarMensaje("No seleccionaste ninguna mascota", "Error", "No se modificó mascota");  
            }           
            
        } else{
            mostrarMensaje("No hay mascotas para modificar", "Error", "Modificas solo si hay datos en la tabla");
        }   
        // Cerramos la ventana de VerDatos pues luego necesitaremos volver a cargarla 
        // pero abrirla con datso que hayan sido modificados.
        // Cerramos con:
        

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCerrarVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVerDatosActionPerformed
       this.dispose();
        
    }//GEN-LAST:event_btnCerrarVerDatosActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo){
    
        //Mostramos un mensaje en pantalla de Grabacion correcta.
        // Creamos el objeto y le pasamos el mensaje.
        JOptionPane optionPane=new JOptionPane(mensaje);
        
        // Al objeto le indicamos que tipo de mensaje mostrara ( hay varios tipos)
        // Mensaje de Informacion.
        if (tipo.equals("Info")) {
                  
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            // Para que aparezca el mensaje de error debe ir acompañado ERROR_MESSAGE
            // asi son todos los mensajes que se mostraran....deben ir acompañado de MESSAJE
             optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        // Mostrat la pantallita del mensaje que aparecera dentro de JOptionPane.
        JDialog dialogo =optionPane.createDialog(titulo);
        
        //Que se muestre arriba de la ventanita el dialogo
        dialogo.setAlwaysOnTop(true);
        //Que este visible
        dialogo.setVisible(true);
    
    
    }
    
   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVerDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    // Inicialmente este metodo es private pero para acceder desde fuera 
    // hay que colocar el metodo publico.
    public void cargarTabla() {
        System.out.println("Vino a cargar tabla");
        // Permite creaar el diseño de la tabla
        DefaultTableModel modeloTabla= new DefaultTableModel(){
           // Hace que el cuerpo de la modeloTabla no sea editable. 
            // El control de la edicion se hace solo con los botones
            @Override
            public boolean isCellEditable(int row, int column){
            return false;
                        }               
        };  // ; porque es parte de la declaracion de instancia del DefaultTableMpdel
        
        // Establecemos el nombre de las columnas.
        // Creamos un arreglo para el nombre de las columnas.
        String titulos[]={"Num", "Nombre", "Color","Raza", "Alergico", "At.Especial", "Nombre D.", "Cel","Observaciones" };
        // Le indicamos a la tabla los titulos
        modeloTabla.setColumnIdentifiers(titulos);
        
        // Cargar los datos de la base de datos.
        // Cada mascota se carga en una lista de Mascotas 
        List<Mascota> listaMascotas = control.traerMascotas();
        
                
                
        
        if(listaMascotas!=null){
            
            for(Mascota  masco: listaMascotas){
                
        // creamos un arreglo tipo objeto porque los campos de Mascota son diversos
        
                Object[] objeto= {masco.getNum_Cliente(), masco.getNombre(), masco.getColor(),
                    masco.getRaza(), masco.getAlergico(), masco.getAtencion_especial(),
                    masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCel_Duenio(), masco.getObservaciones()};
        
                // A cada fila de la tabla le añade una mascota traida.
                modeloTabla.addRow(objeto);
                
                
                
                
        } // For

        } // If
        
        // Para que la tabla muestre los datos de la base de datos hay que asignarle a la tabla del formuario el Modelo.
        tablaMascotas.setModel(modeloTabla);
} // Cargar Tabla
} // Ver Datos
