
package forky;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JFrame {
    private DefaultTableModel dtm;

    @SuppressWarnings("empty-statement")
    public Factura() {
        initComponents();
        setResizable(false);
        setVisible(true);
        //dtm=new DefaultTableModel();
        //dtm.setColumnIdentifiers(new Object[]{"Nro de Pedido","Mesa","Plato" ,"Precio","Mozo"});
        //cuenta.setModel(dtm);
        
    //if(Entregas.listos.getRowCount()>0){   
    //Object mesa = Entregas.listos.getValueAt(0, 1);
    //String m = mesa.toString();
    //mesas.addItem(m);
    //for (int i = 0; i < Entregas.listos.getRowCount(); i++){
      //  System.out.println("jaj");
        //for(int j = 0;j < mesas.getComponentCount();i++){
          //      if(mesas.getItemAt(j)!= m){
            //        m=mesas.getItemAt(j);
              //      mesas.addItem(m);
                    
                }
        
        
        
 

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuenta = new javax.swing.JTable();
        pedidospendi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(165, 200, 254));

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jLabel1.setText("Restaurante Forky");

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel2.setText("Mesa:");

        mesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        mesas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mesasItemStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(27, 195, 35));
        jButton1.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        jButton1.setText("Solicitar Factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(254, 1, 24));
        jButton2.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Mesa", "Plato", "Precio", "Mozo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cuenta);
        if (cuenta.getColumnModel().getColumnCount() > 0) {
            cuenta.getColumnModel().getColumn(0).setResizable(false);
            cuenta.getColumnModel().getColumn(1).setResizable(false);
            cuenta.getColumnModel().getColumn(2).setResizable(false);
            cuenta.getColumnModel().getColumn(3).setResizable(false);
            cuenta.getColumnModel().getColumn(4).setResizable(false);
        }

        pedidospendi.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        pedidospendi.setForeground(new java.awt.Color(255, 0, 0));
        pedidospendi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pedidospendiFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pedidospendi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidospendi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean ask = true;
        if(cuenta.getRowCount()>0){
            Object selected = mesas.getSelectedItem();
            String selected1=selected.toString();
            int selected2=Integer.parseInt(selected1);
            for(int i = 0;i<Entregas.pendientes.getRowCount();i++){
                Object pendiente = Entregas.pendientes.getValueAt(i,1);
                String pendiente1 = pendiente.toString();
                int pendiente2 = Integer.parseInt(pendiente1);
                if(selected2==pendiente2){
                    pedidospendi.setText("*Hay pedidos pendientes en esta mesa");
                    System.out.println("Hay pedidos pendientes");
                    ask = false;
                }
            }
            if(ask){
                Calendar fecha = new GregorianCalendar();
        
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hora = fecha.get(Calendar.HOUR_OF_DAY);
                int minuto = fecha.get(Calendar.MINUTE);
                FileWriter fichero = null;
                PrintWriter pw = null;
                try{
                fichero = new FileWriter("./src/forky/registro.txt",true);
                pw = new PrintWriter(fichero);
                for (int i = 0; i < cuenta.getRowCount()-1; i++){
                    pw.println(dia+"/"+mes+"/"+año+";"+ hora+":"+minuto+";"+cuenta.getValueAt(i, 1) + ";" + cuenta.getValueAt(i, 2)+";" + cuenta.getValueAt(i, 3) + ";" + cuenta.getValueAt(i, 4));
                }
                } catch (Exception e) {
                e.printStackTrace();
                } finally {
                try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
                } catch (Exception e2) {
                 e2.printStackTrace();
                }
                }
                
                Ticket a = new Ticket();
                
                
                for(int i = Entregas.listos.getRowCount() -1; i >= 0; i--){
                    Object listo = Entregas.listos.getValueAt(i,1);
                    String listo1 = listo.toString();
                    int listo2 = Integer.parseInt(listo1);
                    
                    if(selected2==listo2){
                        MenuPrincipal.ready.removeRow(i);
                    }
                }
            }
                
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mesasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mesasItemStateChanged
            pedidospendi.setText("");
            dtm=new DefaultTableModel();//creo tabla modelo
            dtm.setColumnIdentifiers(new Object[]{"Nro de Pedido","Mesa","Plato" ,"Precio","Mozo"}); 
            cuenta.setModel(dtm);
            
            Object a = mesas.getSelectedItem();//leo el combobox y lo transformo a 
            String a1 = a.toString();
            
            for(int i = 0;i<Entregas.listos.getRowCount();i++){//recorro tabla de listos
                Object b = Entregas.listos.getValueAt(i, 1);//leo el valor de la mesa y lo transformo a string
                String b1 = b.toString();

                if(b1.equals(a1)){
                    //comparo si son iguales
                    dtm.addRow(new Object[]{Entregas.listos.getValueAt(i,0),Entregas.listos.getValueAt(i,1),Entregas.listos.getValueAt(i,2),Entregas.listos.getValueAt(i,3),Entregas.listos.getValueAt(i,4)});
                    cuenta.setModel(dtm);
                    }          
            }
            if(cuenta.getRowCount()>0){
                double total=0;
                for(int i=0;i<cuenta.getRowCount();i++){
                    Object tot=cuenta.getValueAt(i,3);
                    String valor = tot.toString();
                    double doble = Double.parseDouble(valor);
                    //int num = Integer.parseInt(valor);
                    //System.out.println(num);
                    total=total+doble;
                }
                dtm.addRow(new Object[]{"Total","","",total,""});
            }
        
    }//GEN-LAST:event_mesasItemStateChanged

    private void pedidospendiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pedidospendiFocusLost
        System.out.println("funciona");
        pedidospendi.removeAll();
        
    }//GEN-LAST:event_pedidospendiFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable cuenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<String> mesas;
    private javax.swing.JLabel pedidospendi;
    // End of variables declaration//GEN-END:variables
}
