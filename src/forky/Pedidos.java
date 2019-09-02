
package forky;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Pedidos extends javax.swing.JFrame{
    //private Comidas comida;
    //private Comidas precio;
    public static DefaultTableModel dtm2;
    public static DefaultTableModel dtm3;
    
    

    public Pedidos() {
        
        initComponents();
        setResizable(false);
        setVisible(true);
        dtm2 = new DefaultTableModel();
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mozo = new javax.swing.JComboBox<>();
        mesa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pedir = new javax.swing.JButton();
        realizado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pedir1 = new javax.swing.JButton();
        pedir2 = new javax.swing.JButton();
        pedir3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(165, 200, 254));

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel2.setText("Elegir mozo...");

        mozo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licho", "Paolo", "Octi", "Facu" }));
        mozo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mozoItemStateChanged(evt);
            }
        });

        mesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5 ", "Mesa 6" }));
        mesa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mesaItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel3.setText("Elegir mesa...");

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jLabel1.setText("Restaurante Forky");

        pedir.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        pedir.setText("Platos");
        pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirActionPerformed(evt);
            }
        });

        realizado.setBackground(new java.awt.Color(10, 230, 65));
        realizado.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        realizado.setText("REALIZAR PEDIDO");
        realizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizadoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Plato", "Precio", "Mozo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        pedir1.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        pedir1.setText("SALIR");
        pedir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedir1ActionPerformed(evt);
            }
        });

        pedir2.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        pedir2.setText("Bebidas");
        pedir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedir2ActionPerformed(evt);
            }
        });

        pedir3.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        pedir3.setText("Postres");
        pedir3.setMaximumSize(new java.awt.Dimension(115, 36));
        pedir3.setMinimumSize(new java.awt.Dimension(115, 36));
        pedir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mozo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pedir1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(138, 138, 138)
                                            .addComponent(realizado))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(pedir2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pedir3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(377, 377, 377)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pedir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(pedir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pedir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realizado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedir1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizadoActionPerformed
        this.setVisible(false);
        if(jTable1.getRowCount()>0){
        MenuPrincipal.numero_pedido ++;
        MenuPrincipal.ped.addElement(MenuPrincipal.numero_pedido);
        }
        for (int i = 0; i < jTable1.getRowCount(); i++){
            MenuPrincipal.pen.addRow(new Object[]{MenuPrincipal.numero_pedido,jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),jTable1.getValueAt(i, 2),jTable1.getValueAt(i, 3)});
               
    }//GEN-LAST:event_realizadoActionPerformed
    }
    private void pedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirActionPerformed

        Comidas comida = new Comidas();
    }//GEN-LAST:event_pedirActionPerformed

    private void pedir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedir1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_pedir1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        int fila = jTable1.getSelectedRow();
        modelo.removeRow(fila);
        jTable1.setModel(modelo);
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void mozoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mozoItemStateChanged
        for (int i = 0; i < jTable1.getRowCount(); i++){
            jTable1.setValueAt(mozo.getSelectedItem(), i, 3);       
    }//GEN-LAST:event_mozoItemStateChanged
    }
    private void mesaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mesaItemStateChanged
        for (int i = 0; i < jTable1.getRowCount(); i++){
            jTable1.setValueAt(mesa.getSelectedIndex()+1, i, 0);
    }//GEN-LAST:event_mesaItemStateChanged
    }
    private void pedir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedir2ActionPerformed
        Bebidas bebida = new Bebidas();       
    }//GEN-LAST:event_pedir2ActionPerformed

    private void pedir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedir3ActionPerformed
        Postres postre = new Postres();   
    }//GEN-LAST:event_pedir3ActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JComboBox<String> mesa;
    public static javax.swing.JComboBox<String> mozo;
    private javax.swing.JButton pedir;
    private javax.swing.JButton pedir1;
    private javax.swing.JButton pedir2;
    private javax.swing.JButton pedir3;
    private javax.swing.JButton realizado;
    // End of variables declaration//GEN-END:variables

}


