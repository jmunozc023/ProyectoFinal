package com.mycompany.GUI;

import static com.mycompany.GUI.Main.cl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class interfazFacturacion extends javax.swing.JFrame {
    
    public interfazFacturacion() {
        initComponents();
        relcomboboxInv();
        relcomboboxCli();
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

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturación Tienda Nordic Style");
        setBackground(new java.awt.Color(102, 102, 102));

        tablaFacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Subtotal", "Impuesto"
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

        SelCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        refreshBoton.setText("Actualizar");
        refreshBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(scrollfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(Titulo)))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
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
                .addComponent(refreshBoton)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TitCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshBoton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titcant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(scrollfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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
    
    /**
     * @param cl
     * @param args the command line arguments
     */
    private void relcomboboxCli(){
        
        for (int i = 0; i < Main.cl.size(); i++) {
            SelCliente.addItem(Main.cl.get(i).toString());
        }
    }
    private void clearCombobox(){
        
       SelCliente.removeAllItems();
       SelInventario.removeAllItems();
    }
    private void relcomboboxInv(){
        
        for (int i = 0; i < Main.inv.size(); i++) {
            SelInventario.addItem(Main.inv.get(i).toString());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelCant;
    private javax.swing.JComboBox<String> SelCliente;
    private javax.swing.JComboBox<String> SelInventario;
    private javax.swing.JLabel TitCliente;
    private javax.swing.JLabel TitProd;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton refreshBoton;
    private javax.swing.JScrollPane scrollfactura;
    private javax.swing.JTable tablaFacturacion;
    private javax.swing.JLabel titcant;
    // End of variables declaration//GEN-END:variables

    
}
