/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systematiendaropa;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan2
 */
public class frmSistemaTiendaRopa extends javax.swing.JFrame {
    
    /**
     * Creates new form frmSistemaTiendaRopa
     */
    public frmSistemaTiendaRopa() {
        initComponents();
        this.tabladetalles.setModel(modelo);
        this.modelo.addColumn("NACIONALIDAD");
        this.modelo.addColumn("GENERO");
        this.modelo.addColumn("TALLAS");
        this.modelo.addColumn("PRENDAS");
        this.modelo.addColumn("CANTIDAD");
        this.modelo.addColumn("PRECIO UNITARIO");
        this.modelo.addColumn("TOTAL A PAGAR");
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    DefaultTableModel modelo= new DefaultTableModel();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbonacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        botonh = new javax.swing.JRadioButton();
        botonm = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cbotallas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_prendas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btngenerar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalles = new javax.swing.JTable();
        btnlimpiartabla = new javax.swing.JButton();
        btnquitar = new javax.swing.JButton();
        btnnetopagar = new javax.swing.JButton();
        txt_netopagar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sistema Tienda de Ropa");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos y/o Promociones"));

        jLabel2.setText("Nacional");

        jLabel3.setText("HOMBRE TALLA: S= 0.05, M=0.07, L=0.10");

        jLabel4.setText("MUJER TALLA:    S=0.04, M=0.09, L=0.12");

        jLabel5.setText("Extranjeros");

        jLabel6.setText("HOMBRE TALLA: S=0.04, M=0.09, L=0.12");

        jLabel7.setText("MUJER TALLA :   S=0.05, M=0.07, L=0.10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Realizar Compra"));

        jLabel8.setText("Nacionalidad");

        cbonacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Argentino", "Extranjero" }));

        jLabel9.setText("Genero");

        buttonGroup1.add(botonh);
        botonh.setText("Hombre");
        botonh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonm);
        botonm.setText("Mujer");

        jLabel10.setText("Talles");

        cbotallas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "S", "M", "L" }));

        jLabel11.setText("Prenda");

        jLabel13.setText("Cantidad");

        jLabel14.setText("Precio");

        jLabel15.setText("Total a Pagar: ");

        btngenerar.setText("Generar Compra");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel9)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonm))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btngenerar)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnlimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbotallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12)
                                        .addGap(57, 57, 57))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(txt_prendas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel11)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel14)
                                .addGap(38, 38, 38))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonh)
                    .addComponent(botonm)
                    .addComponent(cbotallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_prendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Compras"));

        tabladetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalles);

        btnlimpiartabla.setText("Limpiar Tabla");
        btnlimpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartablaActionPerformed(evt);
            }
        });

        btnquitar.setText("Quitar Compra");
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });

        btnnetopagar.setText("Neto a Pagar");
        btnnetopagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnetopagarActionPerformed(evt);
            }
        });

        jLabel16.setText("Neto a Pagar S/.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(btnlimpiartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnnetopagar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txt_netopagar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiartabla)
                    .addComponent(btnquitar)
                    .addComponent(btnnetopagar)
                    .addComponent(txt_netopagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(415, 415, 415))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonhActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        descuentos_hombres_argentinos();
        descuentos_mujeres_argentinas();
        descuentos_hombres_extrangeros();
        descuentos_mujeres_extrangeras();
        
        if(botonh.isSelected()){
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedItem(),"Hombre",
                this.cbotallas.getSelectedItem(),this.txt_prendas.getText(),this.txt_cantidad.getText(),
                this.txt_precio.getText(),this.txt_total.getText()});
        }
        else if (botonm.isSelected()){
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedItem(),"Mujer",
                this.cbotallas.getSelectedItem(),this.txt_prendas.getText(),this.txt_cantidad.getText(),
                this.txt_precio.getText(),this.txt_total.getText()});
        }
    
        
    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       this.cbonacionalidad.setSelectedIndex(0);
       if(botonh.isSelected()){
        }    
       if(botonm.isSelected()){
        }
       this.cbotallas.setSelectedIndex(0);
       this.txt_prendas.setText("");
       this.txt_cantidad.setText("");
       this.txt_precio.setText("");
       this.txt_total.setText("");
       
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        modelo.removeRow(this.tabladetalles.getSelectedRow());
    }//GEN-LAST:event_btnquitarActionPerformed

    private void btnlimpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartablaActionPerformed
      int x = this.modelo.getRowCount();
        for (int y = 0; y <= x; y++) {
            this.modelo.removeRow(0);
        }
        this.txt_netopagar.setText("");
    }//GEN-LAST:event_btnlimpiartablaActionPerformed

    private void btnnetopagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnetopagarActionPerformed
        double sumatoria;
        double sumatoria1=0;
        int totalrow = tabladetalles.getRowCount();
        totalrow-=1;
        
        for (int i = 0; i <= (totalrow); i++) {
            sumatoria = Double.parseDouble(String.valueOf(tabladetalles.getValueAt(i, 6)));
            sumatoria1+=sumatoria; 
        }
        txt_netopagar.setText("$. "+String.valueOf(sumatoria1));
    }//GEN-LAST:event_btnnetopagarActionPerformed
    public void descuentos_hombres_extrangeros(){
        double cantidad_s, precio_s, total_s, desc_s=0.04;
        double cantidad_m, precio_m, total_m, desc_m=0.09;
        double cantidad_l, precio_l, total_l, desc_l=0.12;
        
        if(cbonacionalidad.getSelectedIndex()==2){
            if(this.botonh.isSelected()){
                if(cbotallas.getSelectedIndex()==1){
                    cantidad_s = Double.parseDouble(this.txt_cantidad.getText());
                    precio_s = Double.parseDouble(this.txt_precio.getText());
                    total_s = (precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                    this.txt_total.setText(String.valueOf(total_s));
                }
            }
        }
        if(cbonacionalidad.getSelectedIndex()==2){
            if(this.botonh.isSelected()){
                if(cbotallas.getSelectedIndex()==2){
                    cantidad_m = Double.parseDouble(this.txt_cantidad.getText());
                    precio_m = Double.parseDouble(this.txt_precio.getText());
                    total_m = (precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                    this.txt_total.setText(String.valueOf(total_m));
                }
            }
        }
        if(cbonacionalidad.getSelectedIndex()==2){
            if(this.botonh.isSelected()){
                if(cbotallas.getSelectedIndex()==3){
                    cantidad_l = Double.parseDouble(this.txt_cantidad.getText());
                    precio_l = Double.parseDouble(this.txt_precio.getText());
                    total_l = (precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                    this.txt_total.setText(String.valueOf(total_l));
                }
            }
        }
    }
    
    public void descuentos_mujeres_extrangeras(){
        Double cantidad_s, precio_s,total_s,desc_s=0.05;
        Double cantidad_m, precio_m,total_m,desc_m=0.07;
        Double cantidad_l, precio_l,total_l,desc_l=0.10;
        
        if(cbonacionalidad.getSelectedIndex()==2){
            if(this.botonm.isSelected()){
                if(cbotallas.getSelectedIndex()==1){
                    cantidad_s = Double.parseDouble(this.txt_cantidad.getText());
                    precio_s = Double.parseDouble(this.txt_precio.getText());
                    total_s = (precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                    this.txt_total.setText(String.valueOf(total_s));
                }
            }
        }
        if(cbonacionalidad.getSelectedIndex()==2){
            if(this.botonm.isSelected()){
                if(cbotallas.getSelectedIndex()==2){
                    cantidad_m = Double.parseDouble(this.txt_cantidad.getText());
                    precio_m = Double.parseDouble(this.txt_precio.getText());
                    total_m = (precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                    this.txt_total.setText(String.valueOf(total_m));
                }
            }
        }
        if(cbonacionalidad.getSelectedIndex()==2){
            if(this.botonm.isSelected()){
                if(cbotallas.getSelectedIndex()==3){
                    cantidad_l = Double.parseDouble(this.txt_cantidad.getText());
                    precio_l = Double.parseDouble(this.txt_precio.getText());
                    total_l = (precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                    this.txt_total.setText(String.valueOf(total_l));
                }
            }
        }
    }
    public void descuentos_mujeres_argentinas(){
        double cantidad_s,precio_s,total_s,desc_s=0.04;
        double cantidad_m,precio_m,total_m,desc_m=0.09;
        double cantidad_l,precio_l,total_l,desc_l=0.12;
        
        if(cbonacionalidad.getSelectedIndex()==1){
            if(this.botonm.isSelected()){
                if(cbotallas.getSelectedIndex()==1){
                    cantidad_s=Double.parseDouble(this.txt_cantidad.getText());
                    precio_s=Double.parseDouble(this.txt_precio.getText());
                    total_s = (precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                    this.txt_total.setText(String.valueOf(total_s));
                }
            }
        }
        if(cbonacionalidad.getSelectedIndex()==1){
            if(this.botonm.isSelected()){
                if(cbotallas.getSelectedIndex()==2){
                    cantidad_m=Double.parseDouble(this.txt_cantidad.getText());
                    precio_m=Double.parseDouble(this.txt_precio.getText());
                    total_m = (precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                    this.txt_total.setText(String.valueOf(total_m));
                }
            }
        }
        if(cbonacionalidad.getSelectedIndex()==1){
            if(this.botonm.isSelected()){
                if(cbotallas.getSelectedIndex()==3){
                    cantidad_l=Double.parseDouble(this.txt_cantidad.getText());
                    precio_l=Double.parseDouble(this.txt_precio.getText());
                    total_l = (precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                    this.txt_total.setText(String.valueOf(total_l));
                }
            }
        }
    }
    
    public void descuentos_hombres_argentinos(){
       double cantidad_s, precio_s, total_s, desc_s=0.05;
       double cantidad_m, precio_m, total_m, desc_m=0.07;
       double cantidad_l, precio_l, total_l, desc_l=0.10;
       
       if(cbonacionalidad.getSelectedIndex()==1){
           if(this.botonh.isSelected()){
               if(cbotallas.getSelectedIndex()==1){
                   cantidad_s=Double.parseDouble(this.txt_cantidad.getText());
                   precio_s=Double.parseDouble(this.txt_precio.getText());
                   total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                   this.txt_total.setText(String.valueOf(total_s));
               }
           }
       }
       if(cbonacionalidad.getSelectedIndex()==1){
           if(this.botonh.isSelected()){
               if(cbotallas.getSelectedIndex()==2){
                   cantidad_m=Double.parseDouble(this.txt_cantidad.getText());
                   precio_m=Double.parseDouble(this.txt_precio.getText());
                   total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                   this.txt_total.setText(String.valueOf(total_m));
               }
           }
       }
       if(cbonacionalidad.getSelectedIndex()==1){
           if(this.botonh.isSelected()){
               if(cbotallas.getSelectedIndex()==3){
                   cantidad_l=Double.parseDouble(this.txt_cantidad.getText());
                   precio_l=Double.parseDouble(this.txt_precio.getText());
                   total_l=(precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                   this.txt_total.setText(String.valueOf(total_l));
               }
           }
       }
    }
    
    
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
            java.util.logging.Logger.getLogger(frmSistemaTiendaRopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSistemaTiendaRopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSistemaTiendaRopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSistemaTiendaRopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSistemaTiendaRopa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonh;
    private javax.swing.JRadioButton botonm;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiartabla;
    private javax.swing.JButton btnnetopagar;
    private javax.swing.JButton btnquitar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbonacionalidad;
    private javax.swing.JComboBox<String> cbotallas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladetalles;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_netopagar;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_prendas;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
