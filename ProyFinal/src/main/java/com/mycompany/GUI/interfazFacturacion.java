package com.mycompany.GUI;

import static com.mycompany.GUI.Main.cl;
import java.sql.SQLOutput;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class interfazFacturacion extends javax.swing.JFrame {
    
    public interfazFacturacion() {
        initComponents();
        relcomboboxInv();
        relcomboboxCli();
        relcomboboxcant();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        scrollfactura = new javax.swing.JScrollPane();
        tablaFacturacion = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        SelCliente = new javax.swing.JComboBox<>();
        TitCliente = new javax.swing.JLabel();
        SelInventario = new javax.swing.JComboBox<>();
        TitProd = new javax.swing.JLabel();
        titcant = new javax.swing.JLabel();
        SelCant = new javax.swing.JComboBox<>();
        refreshBoton = new javax.swing.JButton();
        Agregarfac = new javax.swing.JButton();
        encabezadoFac = new javax.swing.JLabel();
        Totalfac = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturación Tienda Nordic Style");
        setBackground(new java.awt.Color(102, 102, 102));

        tablaFacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Subtotal"
            }
        ));
        tablaFacturacion.setColumnSelectionAllowed(true);
        tablaFacturacion.getTableHeader().setReorderingAllowed(false);
        scrollfactura.setViewportView(tablaFacturacion);
        tablaFacturacion.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Titulo.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menú de Facturación");

        SelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelClienteActionPerformed(evt);
            }
        });

        TitCliente.setText("Cliente");

        SelInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelInventarioActionPerformed(evt);
            }
        });

        TitProd.setText("Producto");

        titcant.setText("Cantidad");

        refreshBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        refreshBoton.setText("Actualizar");
        refreshBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBotonActionPerformed(evt);
            }
        });

        Agregarfac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add.png"))); // NOI18N
        Agregarfac.setText("Agregar");
        Agregarfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarfacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitCliente)
                            .addComponent(TitProd)
                            .addComponent(titcant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SelCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelInventario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelCant, 0, 184, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Agregarfac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(encabezadoFac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addGap(178, 178, 178))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(scrollfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Totalfac, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TitCliente)
                        .addComponent(SelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refreshBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Agregarfac)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titcant))))
                .addGap(32, 32, 32)
                .addComponent(encabezadoFac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Totalfac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelClienteActionPerformed
       // TODO
    }//GEN-LAST:event_SelClienteActionPerformed

    private void refreshBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBotonActionPerformed
        clearCombobox();
        relcomboboxInv();
        relcomboboxCli();
    }//GEN-LAST:event_refreshBotonActionPerformed

    private void SelInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelInventarioActionPerformed

    private void AgregarfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarfacActionPerformed
        
        
        if (evt.getSource()== Agregarfac) {
            faccli();
            facprod();
            cargarFactura();
            sumarColumna();
        }
    }//GEN-LAST:event_AgregarfacActionPerformed
    
    
    private void relcomboboxCli(){
        
        for (int i = 0; i < Main.cl.size(); i++) {
            SelCliente.addItem(Main.cl.get(i).getClnombre());
        }
    }
    private void clearCombobox(){
        
       SelCliente.removeAllItems();
       SelInventario.removeAllItems();
    }
    private void relcomboboxInv(){
        
        for (int i = 0; i < Main.inv.size(); i++) {
            SelInventario.addItem(Main.inv.get(i).getInvNombre());
            
        }
    }
    private void relcomboboxcant(){
        
        for (int i = 0; i < 100; i++) {
            SelCant.addItem(String.valueOf(i));
        }
    }

    private void cargarFactura(){
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Producto", "Cantidad", "Subtototal"}, Main.fac.size());
        tablaFacturacion.setModel(modelo);
        
        TableModel modeloDatos= tablaFacturacion.getModel();
        for (int i = 0; i < Main.fac.size(); i++) {
            Factura factura=Main.fac.get(i);
            modeloDatos.setValueAt(factura.getProducto(), i, 0);
            modeloDatos.setValueAt(factura.getCantidadart(), i, 1);
            modeloDatos.setValueAt(factura.getSubtotal(), i, 2);
            
        }
       
    }
    private void facprod(){
        int prod = SelInventario.getSelectedIndex();
            String produc= "";
            Factura fact =  new Factura(produc);
            String nombre =Main.inv.get(prod).getInvNombre();
            String precio =Main.inv.get(prod).getPrecio();
            String cant= (String) SelCant.getSelectedItem();
            int sub1 = Integer.parseInt(precio);
            int can = Integer.parseInt(cant);
            int subt = (sub1*can);
            String subto= Integer.toString(subt);
            fact.setProducto(nombre);
            fact.setSubtotal(subto);
            fact.setCantidadart(cant);
            Main.fac.add(fact);
    }
    private void faccli(){
        int prod = SelCliente.getSelectedIndex();
        String nombre = Main.cl.get(prod).getClnombre();
        String tel = Main.cl.get(prod).getClnumeroTel();
        String ema = Main.cl.get(prod).getClemail();
        encabezadoFac.setText("Bienvenido " +nombre+ " su numero telefonico: "+ tel +" y su correo electronico "+ ema+" .");
    }
    private void sumarColumna(){
        int fila=0;
        int tot=0;
        for (int i = 0; i < tablaFacturacion.getRowCount(); i++) {
            fila= Integer.parseInt(tablaFacturacion.getValueAt(i, 2).toString());
            tot+= fila;
        }
        Totalfac.setText("Total:..... " +tot);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregarfac;
    private javax.swing.JComboBox<String> SelCant;
    private javax.swing.JComboBox<String> SelCliente;
    private javax.swing.JComboBox<String> SelInventario;
    private javax.swing.JLabel TitCliente;
    private javax.swing.JLabel TitProd;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Totalfac;
    private javax.swing.JLabel encabezadoFac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton refreshBoton;
    private javax.swing.JScrollPane scrollfactura;
    private javax.swing.JTable tablaFacturacion;
    private javax.swing.JLabel titcant;
    // End of variables declaration//GEN-END:variables

    
}
