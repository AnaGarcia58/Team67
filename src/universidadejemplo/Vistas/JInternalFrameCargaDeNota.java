package universidadejemplo.Vistas;

import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Equipo_67
 */
public class JInternalFrameCargaDeNota extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private InscripcionData inscripcionData;
    private Inscripcion incripcion;
    private JTextField jTextFieldCell;

    private DefaultTableModel model = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 2) {
                return true;
            }
            return false;
        }
    };

    public JInternalFrameCargaDeNota() {

        initComponents();
        jTextFieldCell = new JTextField();
        this.alumnoData = new AlumnoData();
        this.inscripcionData = new InscripcionData();
        this.incripcion = new Inscripcion();
        addElementToComboBox();
        armarCabecera();
        modificarNotas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        escritorio = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();
        jComboBoxAlumnos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setTitle("Carga de notas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Seleccionar un alumno");

        jTableAlumnos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAlumnos.setRowHeight(30);
        jScrollPane1.setViewportView(jTableAlumnos);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jComboBoxAlumnos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Para modificar las notas:  Seleccione, modifique y presione Enter.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Carga de notas");

        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButtonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jComboBoxAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(escritorioLayout.createSequentialGroup()
                            .addGap(292, 292, 292)
                            .addComponent(jButtonSalir))
                        .addGroup(escritorioLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(escritorioLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(jLabel6)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButtonSalir)
                .addGap(27, 27, 27))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel6)
                    .addContainerGap(410, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnosActionPerformed
        Alumno alumnoSeleccionado = (Alumno) jComboBoxAlumnos.getSelectedItem();

        double nota;

        List<Materia> materiasInscriptas = inscripcionData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
        List<Inscripcion> inscripciones = inscripcionData.obtenerInscripciones();

        deleteRowTable();
        for (Materia iterador : materiasInscriptas) {
            nota = buscarNota(inscripciones, iterador.getIdMateria());
            model.addRow(new Object[]{
                iterador.getIdMateria(),
                iterador.getNombre(),
                nota,});

        }
    }//GEN-LAST:event_jComboBoxAlumnosActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumnos;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Nota");

        jTableAlumnos.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));

        jTableAlumnos.setModel(model);
    }

    private void addElementToComboBox() {
        List<Alumno> alumnos = alumnoData.listarAlumnos();

        for (Alumno alumno : alumnos) {
            jComboBoxAlumnos.addItem(alumno);
        }
    }

    private void deleteRowTable() {

        int i = jTableAlumnos.getRowCount() - 1;
        for (; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private double buscarNota(List<Inscripcion> incripciones, int idMateria) {
        for (Inscripcion inscripcion : incripciones) {
            if (inscripcion.getMateria().getIdMateria() == idMateria) {
                return inscripcion.getNota();
            }
        }
        return -1;
    }

    private void modificarNotas() {

        //Cambiar el estilo del TextField
        jTextFieldCell.setPreferredSize(new Dimension(14, 10));
        jTextFieldCell.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextFieldCell.setFocusable(false);
        Border border = BorderFactory.createEmptyBorder();
        jTextFieldCell.setBorder(border);

        TableCellEditor customEditor = new DefaultCellEditor(jTextFieldCell) {
            @Override
            public boolean stopCellEditing() {
                
                int idMateria = 0;
                String nota = "";
                double notaModificada = 0;
                //A la variable idMateria se le asigna el id de la materia otenida de la tabla
                idMateria = (Integer) jTableAlumnos.getValueAt(jTableAlumnos.getSelectedRow(), 0);
                //nota recibida por el textFild
                nota = jTextFieldCell.getText();
                
                //Alumno obtenido del comboBox
                Alumno alumnoSeleccionado = (Alumno) jComboBoxAlumnos.getSelectedItem();

                boolean result = super.stopCellEditing();

                if (result) {
                    notaModificada = Double.parseDouble(nota);
                    // Aquí el usuario ha presionado "Enter" y la edición ha finalizado
                    
                     //Evaluamos la notaParseada de la variable notaModificada 
                     //y la longuitud de la variable nota(String)
                     
                    if (notaModificada >= 1 && notaModificada <= 10 && nota.length() < 5) {
                        //Double.ToString lo utilizo para convertir la variable notaModificada
                        //que es de tipo double y lo seteo al textField
                        jTextFieldCell.setText(Double.toString(notaModificada));
                        inscripcionData.actualizarNota(alumnoSeleccionado.getIdAlumno(), idMateria, notaModificada);
                        model.setValueAt(notaModificada,jTableAlumnos.getSelectedRow(), 2);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "nota invalida!");
                        //Con el for traemos la nota de la base de datos y la seteamos en la celda de la tabla
                        for(Inscripcion inscripcion : inscripcionData.obtenerInscripcionesPorAlumno(alumnoSeleccionado.getIdAlumno())){
                            if(inscripcion.getMateria().getIdMateria()==idMateria){
                                model.setValueAt(inscripcion.getNota()+"", jTableAlumnos.getSelectedRow(), 2);
                            }
                        }
                        
                    }
                }

                return result;

            }
        };

        // Asigna el editor personalizado a la columna deseada
        jTableAlumnos.getColumnModel().getColumn(2).setCellEditor(customEditor);
        

    }
    
}
