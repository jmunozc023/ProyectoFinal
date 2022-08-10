package com.mycompany.GUI;

public class MenuGUI extends javax.swing.JFrame {

    interfazCliente incli=new interfazCliente();
    interfazInventario ininv= new interfazInventario();
    public MenuGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mantClientesGUI = new javax.swing.JButton();
        mantInvGUI = new javax.swing.JButton();
        facturacionGUI = new javax.swing.JButton();
        cierreCajaGUI = new javax.swing.JButton();
        salirGUI = new javax.swing.JButton();
        tituloMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tituloAut = new javax.swing.JLabel();
        Josename = new javax.swing.JLabel();
        Diananame = new javax.swing.JLabel();
        Julliamname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturación Tienda Nordic Style");

        mantClientesGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cliente.png"))); // NOI18N
        mantClientesGUI.setText("Mant.Clientes");
        mantClientesGUI.setFocusPainted(false);
        mantClientesGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantClientesGUIActionPerformed(evt);
            }
        });

        mantInvGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario.png"))); // NOI18N
        mantInvGUI.setText("Mant.Inventario");
        mantInvGUI.setFocusPainted(false);
        mantInvGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantInvGUIActionPerformed(evt);
            }
        });

        facturacionGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Facturacion.png"))); // NOI18N
        facturacionGUI.setText("Facturacion");
        facturacionGUI.setFocusPainted(false);

        cierreCajaGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cierrecaja.png"))); // NOI18N
        cierreCajaGUI.setText("Cierre de caja");
        cierreCajaGUI.setFocusPainted(false);

        salirGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salir.png"))); // NOI18N
        salirGUI.setText("Salir");
        salirGUI.setFocusPainted(false);
        salirGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirGUIActionPerformed(evt);
            }
        });

        tituloMenu.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 3, 24)); // NOI18N
        tituloMenu.setText("Programa de Facturación Tienda Nordic Style");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tituloAut.setText("Creado por:");

        Josename.setText("Jose Pablo Muñoz Carvajal");

        Diananame.setText("Diana Rodriguez Sole");

        Julliamname.setText("Julliam Salazar Garcia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAut)
                    .addComponent(Josename)
                    .addComponent(Diananame)
                    .addComponent(Julliamname))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Josename)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diananame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Julliamname)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mantClientesGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mantInvGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(facturacionGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cierreCajaGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirGUI)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tituloMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mantClientesGUI)
                    .addComponent(facturacionGUI))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cierreCajaGUI)
                    .addComponent(mantInvGUI))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirGUI))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirGUIActionPerformed
        if (evt.getSource()== salirGUI) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirGUIActionPerformed

    private void mantClientesGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantClientesGUIActionPerformed
        if (evt.getSource()== mantClientesGUI) {
            incli.setVisible(true);
        }
    }//GEN-LAST:event_mantClientesGUIActionPerformed

    private void mantInvGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantInvGUIActionPerformed
        if (evt.getSource()== mantInvGUI) {
            ininv.setVisible(true);
        }
    }//GEN-LAST:event_mantInvGUIActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Diananame;
    private javax.swing.JLabel Josename;
    private javax.swing.JLabel Julliamname;
    private javax.swing.JButton cierreCajaGUI;
    private javax.swing.JButton facturacionGUI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mantClientesGUI;
    private javax.swing.JButton mantInvGUI;
    private javax.swing.JButton salirGUI;
    private javax.swing.JLabel tituloAut;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
