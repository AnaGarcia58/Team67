package universidadejemplo.Vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuFormAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        jMAlumnosPorMateria = new javax.swing.JMenuItem();
        Consultas1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(805, 803));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuFormAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuFormAlumno.setText("Formulario de Alumno");
        jMenuFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFormAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem2.setText("Formulario de Materia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem3.setText("Manejo de Inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem4.setText("Manipulación de Notas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        Consultas.setText("Consultas");
        Consultas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMAlumnosPorMateria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMAlumnosPorMateria.setText("Alumno por Materia");
        jMAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnosPorMateriaActionPerformed(evt);
            }
        });
        Consultas.add(jMAlumnosPorMateria);

        jMenuBar1.add(Consultas);

        Consultas1.setText("Salir");
        Consultas1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Consultas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Consultas1MouseClicked(evt);
            }
        });
        jMenuBar1.add(Consultas1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormAlumnoActionPerformed
        escritorio.removeAll(); // borra lo que hay en pantalla
        escritorio.repaint(); // recrea la ventana
        GestionDeAlumnos gestionAlumno = new GestionDeAlumnos();
        gestionAlumno.setVisible(true); // coloca visible la ventana nueva
        escritorio.add(gestionAlumno);
        escritorio.moveToFront(gestionAlumno);
        int x = (escritorio.getWidth() - gestionAlumno.getWidth()) / 2; // Divide en 2 el ancho del escritorio menos el ancho de la vistaAlumno
        int y = (escritorio.getHeight() - gestionAlumno.getHeight()) / 2;
        gestionAlumno.setLocation(x, y);// centra la vista Alumno
    }//GEN-LAST:event_jMenuFormAlumnoActionPerformed

    private void jMAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnosPorMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaAlumnosPorMateria vistaInterna = new ConsultaAlumnosPorMateria();
        vistaInterna.setVisible(true);
        escritorio.add(vistaInterna);
        escritorio.moveToFront(vistaInterna);
        int x = (escritorio.getWidth() - vistaInterna.getWidth()) / 2;
        int y = (escritorio.getHeight() - vistaInterna.getHeight()) / 2;
        vistaInterna.setLocation(x, y);

    }//GEN-LAST:event_jMAlumnosPorMateriaActionPerformed

    private void jMConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMConsultasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        GestionDeMaterias gdm = new GestionDeMaterias();
        escritorio.add(gdm);
        escritorio.moveToFront(gdm);
        escritorio.setVisible(true);
        gdm.setVisible(true);
        int x = (escritorio.getWidth() - gdm.getWidth()) / 2;
        int y = (escritorio.getHeight() - gdm.getHeight()) / 2;
        gdm.setLocation(x, y);
        escritorio.repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.removeAll();
        ManejoDeInscripciones mdi = new ManejoDeInscripciones();
        escritorio.add(mdi);
        escritorio.moveToFront(mdi);
        escritorio.setVisible(true);
        mdi.setVisible(true);
        int x = (escritorio.getWidth() - mdi.getWidth()) / 2;
        int y = (escritorio.getHeight() - mdi.getHeight()) / 2;
        mdi.setLocation(x, y);
        escritorio.repaint();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void Consultas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consultas1MouseClicked
        dispose();
    }//GEN-LAST:event_Consultas1MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JInternalFrameCargaDeNota internalView =new JInternalFrameCargaDeNota();
        internalView.setVisible(true);
        escritorio.add(internalView);
        escritorio.moveToFront(internalView);
        int x = (escritorio.getWidth() - internalView.getWidth()) / 2; // Divide en 2 el ancho del escritorio menos el ancho de la vistaAlumno
        int y = (escritorio.getHeight() - internalView.getHeight()) / 2;
        internalView.setLocation(x, y);// centra la vista Alumno
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenu Consultas1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMAlumnosPorMateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuFormAlumno;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
