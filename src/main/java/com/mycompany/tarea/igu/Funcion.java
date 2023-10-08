
package com.mycompany.tarea.igu;

import com.mycompany.tarea.logica.Controladora;
import com.mycompany.tarea.logica.DTOEstadoFuncion;
import com.mycompany.tarea.logica.DTOFuncion;
import com.mycompany.tarea.logica.DTOPelicula;
import com.mycompany.tarea.logica.DTOSala;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Funcion extends javax.swing.JPanel {

    Controladora control = new Controladora();
    private List<DTOPelicula> listadoDtoPelicula;
    private List<DTOSala> listadoDtoSala;
    private List<DTOEstadoFuncion> listadoDtoEstados;
    
    public void setList(List<DTOPelicula> listaPeliculas, List<DTOSala> listaDtoSalas, List<DTOEstadoFuncion> listaDtoEstados){
        this.listadoDtoPelicula = listaPeliculas;
        this.listadoDtoSala = listaDtoSalas;
        this.listadoDtoEstados = listaDtoEstados;
    }
    
    public Funcion() {
        initComponents();
        actualizarTabla();
        listarPeliculas();
        listarSalas();
        listarEstados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FuncionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaAlta = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFuncion = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtMin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxPelicula = new javax.swing.JComboBox<>();
        boxSala = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Funcion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Horario");

        txtHs.setText("00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Precio de la entrada");

        txtFechaAlta.setDateFormatString("dd/MM/yyyy");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JTableFuncion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTableFuncion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Atras");
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

        jButton4.setText("Eliminar");

        jButton5.setText("Ver");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(112, 112, 112)
                .addComponent(jButton4)
                .addGap(100, 100, 100)
                .addComponent(jButton3)
                .addGap(82, 82, 82)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        txtMin.setText("00");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Pelicula");

        boxPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Sala");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Estado Funcion");

        javax.swing.GroupLayout FuncionPanelLayout = new javax.swing.GroupLayout(FuncionPanel);
        FuncionPanel.setLayout(FuncionPanelLayout);
        FuncionPanelLayout.setHorizontalGroup(
            FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuncionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FuncionPanelLayout.createSequentialGroup()
                        .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FuncionPanelLayout.createSequentialGroup()
                                .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boxSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boxPelicula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12))
                            .addGroup(FuncionPanelLayout.createSequentialGroup()
                                .addComponent(boxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(FuncionPanelLayout.createSequentialGroup()
                                .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(txtFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)))
                                    .addGroup(FuncionPanelLayout.createSequentialGroup()
                                        .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        FuncionPanelLayout.setVerticalGroup(
            FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuncionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FuncionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FuncionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FuncionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FuncionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Administrar administrar = new Administrar();
        administrar.setSize(873, 555);
        administrar.setLocation(0, 0);
        
        FuncionPanel.removeAll();
        FuncionPanel.add(administrar, BorderLayout.CENTER);
        FuncionPanel.revalidate();
        FuncionPanel.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DTOPelicula DtoPeli = buscarPelicula(String.valueOf(boxPelicula.getSelectedItem()));
        DTOSala DtoSala = buscarSala(String.valueOf(boxSala.getSelectedItem()));
        DTOEstadoFuncion DtoEstado = buscarEstado(String.valueOf(boxEstado.getSelectedItem()));
        
        String hs = txtHs.getText();
        String min = txtMin.getText();
        String precio = txtPrecio.getText();
        String fechaAlta = ((JTextField)txtFechaAlta.getDateEditor().getUiComponent()).getText();
        
        control.crearFuncion(DtoPeli,DtoSala,DtoEstado,hs,min,precio,fechaAlta);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public DTOPelicula buscarPelicula(String nombrePelicula){
        DTOPelicula DtoPelicula = new DTOPelicula();
        for(DTOPelicula DtoPeli: this.listadoDtoPelicula){
            if(DtoPeli.getTitulo().equals(nombrePelicula)){
                DtoPelicula = DtoPeli;
            }else{
                JOptionPane optionPane = new JOptionPane("No se ha encontrado la pelicula");
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Error");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
        }
        return DtoPelicula;
    }
    
    public DTOSala buscarSala(String nombreSala){
        DTOSala DtoSala = new DTOSala();
        for(DTOSala DtoSla: this.listadoDtoSala){
            if(DtoSla.getNombreSala().equals(nombreSala)){
                DtoSala = DtoSla;
            }else{
                JOptionPane optionPane = new JOptionPane("No se ha encontrado la sala");
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Error");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
        }
        return DtoSala;
    }
    
    public DTOEstadoFuncion buscarEstado(String nombreEstado){
        DTOEstadoFuncion DtoEstadoFuncion = new DTOEstadoFuncion();
        for(DTOEstadoFuncion DtoEstado: this.listadoDtoEstados){
            if(DtoEstado.getNombreEstFun().equals(nombreEstado)){
                DtoEstadoFuncion = DtoEstado;
            }else{
                JOptionPane optionPane = new JOptionPane("No se ha encontrado el estado funcion");
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Error");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
        }
        return DtoEstadoFuncion;
    }
    
    public void listarPeliculas(){
        boxPelicula.removeAll();
        for(DTOPelicula DtoPeli: this.listadoDtoPelicula){
            boxPelicula.addItem(DtoPeli.getTitulo());
        }
    }
    
    public void listarSalas(){
        boxSala.removeAll();
        for(DTOSala DtoSala: this.listadoDtoSala){
            boxSala.addItem(DtoSala.getNombreSala());
        }
    }
    
    public void listarEstados(){
        boxEstado.removeAll();
        for(DTOEstadoFuncion DtoEstado: this.listadoDtoEstados){
            boxEstado.addItem(DtoEstado.getNombreEstFun());
        }
    }
    
    public int seleccionTabla(){
        int IdPelicula = 0;
        if (JTableFuncion.getRowCount() > 0) {
            if (JTableFuncion.getSelectedRow() != -1) {
                IdPelicula = Integer.parseInt(String.valueOf(JTableFuncion.getValueAt(JTableFuncion.getSelectedRow(), 0)));
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
        List <DTOFuncion> listaDtoFuncion = control.traerFunciones();
        
        //recorrer la lista y mostrar cada uno de llos elementos en la tabla
        if (listaDtoFuncion != null){
            for (DTOFuncion DtoFunc : listaDtoFuncion){
                Object[] objeto = {};    
                tabla.addRow(objeto);
            }
        }
        JTableFuncion.setModel(tabla);
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
    private javax.swing.JPanel FuncionPanel;
    private javax.swing.JTable JTableFuncion;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxPelicula;
    private javax.swing.JComboBox<String> boxSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtFechaAlta;
    private javax.swing.JTextField txtHs;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
