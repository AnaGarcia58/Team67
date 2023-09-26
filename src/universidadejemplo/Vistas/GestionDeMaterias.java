package universidadejemplo.Vistas;

import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class GestionDeMaterias extends javax.swing.JInternalFrame {

    private MateriaData md;

    public GestionDeMaterias() {
        initComponents();
        md = new MateriaData();
        jLInactiva.setText("");
        estadoBotones(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JtfCodigo = new javax.swing.JTextField();
        JrbEstado = new javax.swing.JRadioButton();
        JbBuscar = new javax.swing.JButton();
        JbNuevo = new javax.swing.JButton();
        JbEliminar = new javax.swing.JButton();
        JbGuardar = new javax.swing.JButton();
        JbSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JtfAño = new javax.swing.JTextField();
        JtfNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLInactiva = new javax.swing.JLabel();
        jLErrorAño = new javax.swing.JLabel();
        jLErrorNombre1 = new javax.swing.JLabel();

        setTitle("Gestion de Materias");

        escritorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MATERIA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Código");

        JtfCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JrbEstado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JrbEstado.setSelected(false);
        JrbEstado.setEnabled(false);
        JrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbEstadoActionPerformed(evt);
            }
        });

        JbBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa1.png"))); // NOI18N
        JbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarActionPerformed(evt);
            }
        });

        JbNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbNuevo.setText("Nuevo");
        JbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbNuevoActionPerformed(evt);
            }
        });

        JbEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbEliminar.setText("Borrar");
        JbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEliminarActionPerformed(evt);
            }
        });

        JbGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbGuardar.setText("Guardar");
        JbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbGuardarActionPerformed(evt);
            }
        });

        JbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbSalir.setText("Salir");
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Año");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Estado");

        JtfAño.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JtfAño.setEnabled(false);
        JtfAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtfAñoKeyPressed(evt);
            }
        });

        JtfNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JtfNombre.setEnabled(false);
        JtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtfNombreKeyPressed(evt);
            }
        });

        jLInactiva.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLInactiva.setForeground(new java.awt.Color(204, 0, 0));

        jLErrorAño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLErrorAño.setForeground(new java.awt.Color(204, 0, 0));

        jLErrorNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLErrorNombre1.setForeground(new java.awt.Color(204, 0, 0));

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JrbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JtfAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JtfNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLInactiva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLErrorAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLErrorNombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLErrorNombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLErrorAño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioLayout.createSequentialGroup()
                                    .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JbBuscar)))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(JrbEstado)
                                .addGap(37, 37, 37)
                                .addComponent(jLInactiva, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(JbNuevo)
                        .addGap(26, 26, 26)
                        .addComponent(JbEliminar)
                        .addGap(26, 26, 26)
                        .addComponent(JbGuardar)
                        .addGap(26, 26, 26)
                        .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JbBuscar))
                .addGap(29, 29, 29)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLErrorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorAño, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(JrbEstado)
                    .addComponent(jLInactiva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEliminarActionPerformed
        Materia materia = new Materia();
        try {
            md.eliminarMateria(Integer.valueOf(JtfCodigo.getText()));
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros enteros.");
        }
    }//GEN-LAST:event_JbEliminarActionPerformed

    private void JrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbEstadoActionPerformed

    }//GEN-LAST:event_JrbEstadoActionPerformed

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JbSalirActionPerformed

    private void JbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarActionPerformed
        Materia materia = new Materia();
        habilitarTextFields();
        estadoBotones(true);
        try {
            if (!JtfCodigo.getText().isBlank()) {
                materia = md.buscarMateria(Integer.parseInt(JtfCodigo.getText()));
                if (materia != null) {
                    JtfNombre.setText(materia.getNombre());
                    JtfAño.setText(String.valueOf(materia.getAnioMateria()));
                    JrbEstado.setSelected(materia.isActivo());
                    if (materia.isActivo() == false) {
                        jLInactiva.setText("Materia Inactiva");
                    } else {
                        jLInactiva.setText("");
                    }
                } else {
                    limpiarCampos();
                }

            } else {
                JOptionPane.showMessageDialog(this, "El campo no puede estar vacío. Por favor ingrese un Id de la materia a buscar.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero entero.");
        }
    }//GEN-LAST:event_JbBuscarActionPerformed

    private void JbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbNuevoActionPerformed
        limpiarCampos();
        borrarMensajesDeError();
        habilitarTextFields();
        JrbEstado.setSelected(true);
        JtfCodigo.setEnabled(false);
        estadoBotones(true);
        JbBuscar.setEnabled(false);

    }//GEN-LAST:event_JbNuevoActionPerformed

    private void JbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbGuardarActionPerformed
        Materia materia = new Materia();
        try {
            if (JtfNombre.getText().isBlank()) {
                jLErrorNombre1.setText("El campo Nombre no debe estar vacío.");
            } else if (JtfAño.getText().isBlank()) {
                jLErrorAño.setText("El campo Año no debe estar vacío.");
            } else {
                materia.setNombre(JtfNombre.getText());
                materia.setAnioMateria(Integer.valueOf(JtfAño.getText()));
                materia.setActivo(JrbEstado.isSelected());
                borrarMensajesDeError();
                if (JtfCodigo.getText().isBlank()) {
                    JtfCodigo.setEnabled(false);
                    md.guardarMateria(materia);
                    limpiarCampos();
                    JtfCodigo.setEnabled(true);
                } else {
                    materia.setIdMateria(Integer.valueOf(JtfCodigo.getText()));
                    Materia materiaEncontrada = md.buscarMateria(materia.getIdMateria());
                    if (materiaEncontrada != null) {
                        md.modificarMateria(materia);
                        limpiarCampos();
                        JtfCodigo.setEnabled(true);
                    }
                }
                JbBuscar.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros enteros en Codigo y/o Año.");
        }

    }//GEN-LAST:event_JbGuardarActionPerformed

    private void JtfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfNombreKeyPressed
        borrarMensajesDeError();

    }//GEN-LAST:event_JtfNombreKeyPressed

    private void JtfAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfAñoKeyPressed
        borrarMensajesDeError();
    }//GEN-LAST:event_JtfAñoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscar;
    private javax.swing.JButton JbEliminar;
    private javax.swing.JButton JbGuardar;
    private javax.swing.JButton JbNuevo;
    private javax.swing.JButton JbSalir;
    private javax.swing.JRadioButton JrbEstado;
    private javax.swing.JTextField JtfAño;
    private javax.swing.JTextField JtfCodigo;
    private javax.swing.JTextField JtfNombre;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLErrorAño;
    private javax.swing.JLabel jLErrorNombre1;
    private javax.swing.JLabel jLInactiva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        JtfAño.setText("");
        JtfCodigo.setText("");
        JtfNombre.setText("");
    }

    public void habilitarTextFields() {
        JtfNombre.setEnabled(true);
        JtfAño.setEnabled(true);
        JrbEstado.setEnabled(true);
    }

    public void estadoBotones(Boolean estaHabilitado) {
        JbEliminar.setEnabled(estaHabilitado);
        JbGuardar.setEnabled(estaHabilitado);
    }

    public void borrarMensajesDeError() {
        jLErrorNombre1.setText("");
        jLErrorAño.setText("");
        jLInactiva.setText("");
    }
    
}
