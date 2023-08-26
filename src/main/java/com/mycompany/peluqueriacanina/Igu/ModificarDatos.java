
package com.mycompany.peluqueriacanina.Igu;

import com.mycompany.peluqueriacanina.Logica.Controladora;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ModificarDatos extends javax.swing.JFrame {

    
    Controladora control= null; // Se comunica con la Logica
    
    // Definimos una variable global Masco ( de Mascota) para que traiga globalmente 
    // los datos de la mascota y el Id del cliente y mascota sean accedibles
    // Luego, en Cargar datos, que se define un Mascota masco, aprovechamos y a nuestra vriable 
    // global le asigmaos esa mascota  y asi estara disponible para todo.
    Mascota masco; 
    
    // Definimos un numero de cliente global para todos los metodos
    int num_cliente;
    
    // En el constructor definimos que se recibiera el num_cliente
    public ModificarDatos(int num_cliente) {
        control=new Controladora();  // Aqui la genera en constructor
        
        // El numero de cliente de esta clase ( definido antes del constructor) 
        // se le asigna el num_cliente recibido
        this.num_cliente=num_cliente;
        initComponents();
        // Cargar los datos en este formulario lo haremos distinto a VerDatos que se hizo por
        // metodo formWindowOpened y se llamo a un metodo de cargar tabla.
        // Aqui haremos directo el cargaDatos
        
        cargarDatos(num_cliente);
        
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrarVentana = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txNombreMascota = new javax.swing.JTextField();
        txRaza = new javax.swing.JTextField();
        txColor = new javax.swing.JTextField();
        txNombreDueno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txObservaciones = new javax.swing.JTextArea();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        txCelular = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Modificar Datos");

        btnCerrarVentana.setIcon(new javax.swing.ImageIcon("W:\\JAVA_PROYECTOS\\PeluqueriaCanina\\src\\resourses\\img\\Cerrar.png")); // NOI18N
        btnCerrarVentana.setText("Cerrar");
        btnCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(btnCerrarVentana)
                .addGap(252, 252, 252))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnCerrarVentana)
                .addGap(18, 18, 18))
        );

        jLabel3.setText("Nombre Mascota:");

        jLabel4.setText("Color:");

        jLabel5.setText("Raza:");

        jLabel6.setText("Alergico? :");

        jLabel7.setText("Atencion especial?");

        jLabel8.setText("Nombre del dueño:");

        jLabel9.setText("Observaciones:");

        jLabel10.setText("Celular dueño:");

        txNombreDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNombreDuenoActionPerformed(evt);
            }
        });

        txObservaciones.setColumns(20);
        txObservaciones.setRows(5);
        jScrollPane1.setViewportView(txObservaciones);

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon("W:\\JAVA_PROYECTOS\\PeluqueriaCanina\\src\\resourses\\img\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(102, 255, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon("W:\\JAVA_PROYECTOS\\PeluqueriaCanina\\src\\resourses\\img\\guardar.png")); // NOI18N
        btnGuardar.setText("Guardar  cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txNombreDueno)
                    .addComponent(txCelular)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txColor, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(562, 562, 562))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txColor, txNombreMascota, txRaza});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNombreMascota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txRaza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txNombreDueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 421, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNombreDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNombreDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNombreDuenoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      txNombreMascota.setText("");  // Todos los textos los colcamos en vacio
      txRaza.setText("");
      txColor.setText("");
      txCelular.setText("");
      txNombreDueno.setText("");
      txObservaciones.setText("");
      cmbAlergico.setSelectedIndex(0);          // Indice 0 que es -
      cmbAtencionEspecial.setSelectedIndex(0);  // Indice 0 que es -
      
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // GUADAR CAMBIOS DE MASCOTA
        
        String nombreMasco=txNombreMascota.getText();
        String raz =txRaza.getText();
        String col =txColor.getText();
        String cel=txCelular.getText();
        String nombreDue=txNombreDueno.getText();
        String observ =txObservaciones.getText();
        String alerg = (String) cmbAlergico.getSelectedItem();
        String atencion=(String) cmbAtencionEspecial.getSelectedItem(); // Convertir a String

      
        // Mandamos el registro que contiene la mascota a modificar en masco.
        // se manda la masco como parametro para tener la posicion rapida , en memoria, de los id de 
        // cliente y mascota
        control.modificarMascota(masco, nombreMasco, raz,col, cel, nombreDue, observ, alerg,atencion);   // Aun no se crea el metodo guardar.
        
        //Mostramos un mensaje en pantalla de Grabacion correcta.
        // Creamos el objeto y le pasamos el mensaje.
        VerDatos verDatos = new VerDatos();
        
        verDatos.mostrarMensaje("Se modificó Correctamente", "Info", "Mascota Modificada");
        
        /*
        JOptionPane optionPane=new JOptionPane("Se guardó correctamente");
        
        // Al objeto le indicamos que tipo de mensaje mostrara ( hay varios tipos)
        // Mensaje de Informacion.
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        
        // Mostrat la pantallita del mensaje que aparecera dentro de JOptionPane.
        JDialog dialogo =optionPane.createDialog("Guardado exitoso");
        
        //Que se muestre arriba de la ventanita el dialogo
        dialogo.setAlwaysOnTop(true);
        //Que este visible
        dialogo.setVisible(true);
        */
        
        // Cierra la ventana de Modificacion.
        this.dispose();
        
        // Abrimos nuevamente la ventana de verDatos
        verDatos.setVisible(true);  // Hago que ver datos se vuelva a ver. Fijate que hice una instancia de 
        verDatos.setLocationRelativeTo(null); // Centramos en la pantalla
        
        // Luego hay que hacer que en la ventana de visualizacion se vuelvan a cargar los datos
       // Asi que llamamos al metodo de cargar Tabla que actuara sobre la tabla en VerDatso
       
        
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentanaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarVentanaActionPerformed

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVentana;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txCelular;
    private javax.swing.JTextField txColor;
    private javax.swing.JTextField txNombreDueno;
    private javax.swing.JTextField txNombreMascota;
    private javax.swing.JTextArea txObservaciones;
    private javax.swing.JTextField txRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        /* Creamos una instancia de Mascota ( masco) para guardar el registro recuperado
         Le asignamos el metodo traerMascota ( SINGULAR ) porque es una sola.
         y la asignamos a la masco GLOBAl (que la definimos en la linea 19).
         Se hace asi para tener toda la informacion de la mascota y cliente, incluyendo el 
        id
        */  
      this.masco = control.traerMascota(num_cliente);
      
        
      txNombreMascota.setText(masco.getNombre());  // Todos los textos los colcamos en vacio
      txRaza.setText(masco.getRaza());
      txColor.setText(masco.getColor());
      txCelular.setText(masco.getUnDuenio().getCel_Duenio());
      txNombreDueno.setText(masco.getUnDuenio().getNombre());
      txObservaciones.setText(masco.getObservaciones());
      
        if (masco.getAlergico().equals("SI")) {
      cmbAlergico.setSelectedIndex(1);        
        } else{
            if (masco.getAlergico().equals("NO")) {
                cmbAlergico.setSelectedIndex(2); 
            }
        }
              
        if (masco.getAtencion_especial().equals("SI")) {
      cmbAtencionEspecial.setSelectedIndex(1);  // Indice 0 que es       
        } else{
            if (masco.getAtencion_especial().equals("NO")) {
                 cmbAtencionEspecial.setSelectedIndex(2);
                
            }
        
        }
      
        
      
        
       }
}
