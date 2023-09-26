/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author estudiante
 */
public class GestionDeAlumnos extends javax.swing.JInternalFrame {
    private AlumnoData alumData = new AlumnoData();
    private Alumno alumnoEncontrado = null;
    
    public GestionDeAlumnos() {
        initComponents();
        limpiarCampos();
        desactivarCampos();
        desactivarBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateCalendario = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jREstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLBaja = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel7.setText("jLabel7");

        setTitle("Gestión de Alumnos");
        setMinimumSize(new java.awt.Dimension(0, 0));
        setNormalBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(585, 486));
        setRequestFocusEnabled(false);

        escritorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(563, 440));
        escritorio.setVerifyInputWhenFocusTarget(false);

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jDateCalendario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jREstado.setSelected(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jLBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLBaja.setForeground(new java.awt.Color(255, 0, 0));
        jLBaja.setText("Alumno dado de Baja");

        jTDni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ALUMNOS");

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("N° Documento:");

        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Apellido:");

        escritorio.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jDateCalendario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jREstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLBaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel3))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(96, 96, 96)))
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jBBuscar))
                                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                        .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(26, 43, Short.MAX_VALUE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addGroup(escritorioLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jREstado)))
                                        .addGap(18, 18, 18)
                                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addComponent(jBNuevo)
                                        .addGap(53, 53, 53)
                                        .addComponent(jBEliminar)
                                        .addGap(48, 48, 48)
                                        .addComponent(jBGuardar)
                                        .addGap(58, 58, 58)
                                        .addComponent(jBSalir))
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jREstado)
                            .addComponent(jLBaja))
                        .addGap(3, 3, 3)))
                .addGap(34, 34, 34)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGuardar)
                        .addComponent(jBNuevo)
                        .addComponent(jBSalir))
                    .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            int dni = Integer.parseInt(jTDni.getText());
            alumnoEncontrado = alumData.buscarAlumnoPorDni(dni);
            if (alumnoEncontrado != null) {
                jTApellido.setText(alumnoEncontrado.getApellido());
                jTNombre.setText(alumnoEncontrado.getNombre());
                jREstado.setSelected(alumnoEncontrado.isActivo());
                LocalDate localDate = alumnoEncontrado.getFechaNacimiento();
                Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()); //se genera un instant que pasado al from genera un date
                jDateCalendario.setDate(date);
                if (jREstado.isSelected()) {
                    habilitarCampos();
                    habilitarBotones();
                } else {
                    desactivarCampos();
                    jLBaja.setVisible(true);
                    jREstado.setEnabled(true);
                    jBGuardar.setEnabled(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El Dni no existe");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dni invalido");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        habilitarCampos();
        limpiarCampos();
        jBGuardar.setEnabled(true);
        jBEliminar.setEnabled(false);
        alumnoEncontrado = null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (alumnoEncontrado != null){
            alumData.eliminarAlumno(alumnoEncontrado.getIdAlumno());
            alumnoEncontrado = null;
            //limpiarCampos();
            JOptionPane.showMessageDialog(this, "Alumno eliminado");
        }else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Alumno");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            int dni = Integer.parseInt(jTDni.getText());
            String apellido = jTApellido.getText();
            String nombre = jTNombre.getText();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            java.util.Date fecha = jDateCalendario.getDate();
            LocalDate fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jREstado.isSelected();

            if (alumnoEncontrado == null) {
                alumnoEncontrado = new Alumno(dni, apellido, nombre, fechaN, estado);
                alumData.guardarAlumno(alumnoEncontrado);
            } else if ((alumnoEncontrado != null) && (alumnoEncontrado.isActivo() == true)) {
                alumnoEncontrado.setDni(dni);
                alumnoEncontrado.setApellido(apellido);
                alumnoEncontrado.setNombre(nombre);
                alumnoEncontrado.setFechaNacimiento(fechaN);
                alumData.modificarAlumno(alumnoEncontrado);
                JOptionPane.showMessageDialog(this, "Alumno Modificado");

            } else if ((alumnoEncontrado != null) && (alumnoEncontrado.isActivo() == false)) {
                alumnoEncontrado.setActivo(true);
                alumData.modificarAlumno(alumnoEncontrado);
                jLBaja.setVisible(false);
                jREstado.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Alumno dado de alta");

            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese Dni Válido");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "No debe haber campos vácios");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDateCalendario;
    private javax.swing.JLabel jLBaja;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
    
    public void limpiarCampos(){
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jREstado.setEnabled(false);
        jDateCalendario.setDate(null);
        jLBaja.setVisible(false);
    }
   
    public void desactivarCampos(){
        jTApellido.setEnabled(false);
        jTNombre.setEnabled(false);
        jREstado.setEnabled(false);
        jDateCalendario.setEnabled(false);
    }
    
    public void habilitarCampos(){
        jTApellido.setEnabled(true);
        jTNombre.setEnabled(true);
        //jREstado.setEnabled(true);
        jDateCalendario.setEnabled(true);
    }
    
    public void desactivarBotones() {
        jBEliminar.setEnabled(false);
        jBGuardar.setEnabled(false);
    }
    
    public void habilitarBotones(){
        jBEliminar.setEnabled(true);
        jBGuardar.setEnabled(true);
    }    
}
