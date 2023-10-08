
package com.mycompany.tarea.igu;

import com.mycompany.tarea.logica.Controladora;
import com.mycompany.tarea.logica.DTOPelicula;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Pelicula extends javax.swing.JPanel {

    Controladora control = new Controladora();
    
    public Pelicula() {
        initComponents();
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PeliculaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEliminarPelicula = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        txtHs = new javax.swing.JTextField();
        txtFechaAlta = new com.toedter.calendar.JDateChooser();
        txtFechaBaja = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePelicula = new javax.swing.JTable();
        txtMin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtElenco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSeg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EditPeliLabel = new javax.swing.JLabel();
        EditPeliIdLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Fecha Baja");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Genero");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Director");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Duracion");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Fecha Alta");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnEliminarPelicula.setText("Eliminar");
        btnEliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPeliculaActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargar)
                .addGap(73, 73, 73)
                .addComponent(btnLimpiar)
                .addGap(94, 94, 94)
                .addComponent(jButton3)
                .addGap(85, 85, 85)
                .addComponent(btnEliminarPelicula)
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnEliminarPelicula)
                    .addComponent(btnCargar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        txtHs.setText("00");

        txtFechaAlta.setDateFormatString("dd/MM/yyyy");

        txtFechaBaja.setDateFormatString("dd/MM/yyyy");

        jTablePelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePelicula);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        txtMin.setText("00");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Elenco");

        txtSeg.setText("00");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText(":");

        EditPeliLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditPeliLabel.setText("Editanto Pelicula ID:");

        EditPeliIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditPeliIdLabel.setText("00");

        javax.swing.GroupLayout PeliculaPanelLayout = new javax.swing.GroupLayout(PeliculaPanel);
        PeliculaPanel.setLayout(PeliculaPanelLayout);
        PeliculaPanelLayout.setHorizontalGroup(
            PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeliculaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PeliculaPanelLayout.createSequentialGroup()
                        .addGroup(PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtElenco, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(txtDirector)
                            .addGroup(PeliculaPanelLayout.createSequentialGroup()
                                .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel9)
                                .addGap(7, 7, 7)
                                .addComponent(txtSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtGenero)
                            .addComponent(txtTitulo)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addGroup(PeliculaPanelLayout.createSequentialGroup()
                                .addComponent(EditPeliLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditPeliIdLabel)
                                .addGap(117, 117, 117))
                            .addComponent(txtFechaBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PeliculaPanelLayout.setVerticalGroup(
            PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeliculaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PeliculaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(PeliculaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditPeliLabel)
                            .addComponent(EditPeliIdLabel))
                        .addGap(17, 17, 17))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PeliculaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PeliculaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Administrar administrar = new Administrar();
        administrar.setSize(873, 555);
        administrar.setLocation(0, 0);
        
        PeliculaPanel.removeAll();
        PeliculaPanel.add(administrar, BorderLayout.CENTER);
        PeliculaPanel.revalidate();
        PeliculaPanel.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String titulo = txtTitulo.getText();
        String genero = txtGenero.getText();
        String director = txtDirector.getText();
        String elenco = txtElenco.getText();
        
        String hs = txtHs.getText();
        String min = txtMin.getText();
        String seg = txtSeg.getText();
        //LocalTime duracion = LocalTime.of(hs, min, seg);
        
        String fechaAlta = ((JTextField)txtFechaAlta.getDateEditor().getUiComponent()).getText();
        String fechaBaja = ((JTextField)txtFechaBaja.getDateEditor().getUiComponent()).getText();
        
        control.crearPelicula(titulo, genero, director, elenco, hs, min, seg, fechaAlta, fechaBaja);
        actualizarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        try {
            //optengo la id a borrar
            DTOPelicula DtoPeli = control.traerPelicula(seleccionTabla());
            //Cargar los datos en los campos
            EditPeliLabel.setText("Editando Pelicula ID: ");
            EditPeliIdLabel.setText(DtoPeli.getId());

            txtTitulo.setText(DtoPeli.getTitulo());
            txtGenero.setText(DtoPeli.getGenero());
            txtDirector.setText(DtoPeli.getDirector());
            txtElenco.setText(DtoPeli.getElenco());

            String[] partes = DtoPeli.getDuracion().split(":");
            String hs = partes[0];
            String min = partes[1];
            String seg = partes[2];

            txtHs.setText(hs);
            txtMin.setText(min);
            txtSeg.setText(seg);

            SimpleDateFormat formato = new SimpleDateFormat();
            Date FechaAlta = formato.parse(DtoPeli.getFechaAlta());
            Date FechaBaja = formato.parse(DtoPeli.getFechaBaja());
            txtFechaAlta.setDate(FechaAlta);
            txtFechaBaja.setDate(FechaBaja);

            JOptionPane optionPane = new JOptionPane("Se ha modificado la pelicula");
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Edicion Exitosa");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Pelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        actualizarTabla();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        EditPeliLabel.setText("");
        EditPeliIdLabel.setText("");        
        txtTitulo.setText("");
        txtGenero.setText("");
        txtDirector.setText("");
        txtElenco.setText("");
        txtHs.setText("");
        txtMin.setText("");
        txtSeg.setText("");
        txtFechaAlta.setDate(null);
        txtFechaBaja.setDate(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Id = EditPeliIdLabel.getText();
        String titulo = txtTitulo.getText();
        String genero = txtGenero.getText();
        String director = txtDirector.getText();
        String elenco = txtElenco.getText();
        
        String hs = txtHs.getText();
        String min = txtMin.getText();
        String seg = txtSeg.getText();
        //LocalTime duracion = LocalTime.of(hs, min, seg);
        
        String fechaAlta = ((JTextField)txtFechaAlta.getDateEditor().getUiComponent()).getText();
        String fechaBaja = ((JTextField)txtFechaBaja.getDateEditor().getUiComponent()).getText();
        
        control.editarPelicula(Id, titulo, genero, director, elenco, hs, min, seg, fechaAlta, fechaBaja);
        actualizarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPeliculaActionPerformed
        control.eliminarPelicula(seleccionTabla());
        
        JOptionPane optionPane = new JOptionPane("Se Eliminó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Eliminación Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        actualizarTabla();
    }//GEN-LAST:event_btnEliminarPeliculaActionPerformed
    
    public int seleccionTabla(){
        int IdPelicula = 0;
        if (jTablePelicula.getRowCount() > 0) {
            if (jTablePelicula.getSelectedRow() != -1) {
                IdPelicula = Integer.parseInt(String.valueOf(jTablePelicula.getValueAt(jTablePelicula.getSelectedRow(), 0)));
            }
            else{
                mostrarMensajes("No Seleccionó ningún alumno","Error", "No se elimnó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros","Error", "No se elimnó el registro");
        }
        return IdPelicula;
    }
    
    private void actualizarTabla(){
        DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //establecer nombre y columnas
        String titulos[] = {"ID", "Titulo", "Duracion", "FechaAlta", "FechaBaja"};
        tabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la base de datos
        List <DTOPelicula> listaDtoPelicula = control.traerPeliculas();
        
        //recorrer la lista y mostrar cada uno de llos elementos en la tabla
        if (listaDtoPelicula != null){
            for (DTOPelicula DtoPeli : listaDtoPelicula){
                Object[] objeto = {DtoPeli.getId(), DtoPeli.getTitulo(), DtoPeli.getDuracion(), DtoPeli.getFechaAlta(), DtoPeli.getFechaBaja()};    
                tabla.addRow(objeto);
            }
        }
        jTablePelicula.setModel(tabla);
    }
    
    public void mostrarMensajes(String mensaje, String tipo,String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EditPeliIdLabel;
    private javax.swing.JLabel EditPeliLabel;
    private javax.swing.JPanel PeliculaPanel;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminarPelicula;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePelicula;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtElenco;
    private com.toedter.calendar.JDateChooser txtFechaAlta;
    private com.toedter.calendar.JDateChooser txtFechaBaja;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtHs;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtSeg;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
