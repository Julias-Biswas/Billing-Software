/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

import dbconnection.DbConnection;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmpDetails;

/**
 *
 * @author julia
 */
public class AllItemsList extends javax.swing.JFrame {

    /** Creates new form AllItemsList */
    
    HashMap<String , ArrayList> hm ;
    DefaultTableModel dtm ;
    int srno = 0 ;
    double totalbill = 0 ;
    int i = 0 ;
    int row ;
    
    EmpDetails ed ;
    
    public AllItemsList( EmpDetails ed , HashMap<String , ArrayList> hm ) {
        initComponents();
        
        this.ed = ed ;
        this.hm = hm ;
        
        dtm = (DefaultTableModel) jTable1.getModel();
        
        for(Map.Entry me : hm.entrySet() )
        {
            srno = srno + 1 ;
            
            ArrayList al = (ArrayList) me.getValue();
            
            Object[] o = { srno ,al.get(0) , al.get(1) , al.get(2) , al.get(3) , (Double.parseDouble((String) al.get(2)) * Double.parseDouble((String) al.get(3))) };
            
            dtm.addRow(o);
            
            totalbill = totalbill + (Double.parseDouble((String) al.get(2)) * Double.parseDouble((String) al.get(3)));
            jLabel9.setText(String.valueOf(totalbill));
            
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Back");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALL ITEMS LIST OF CUSTOMER");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 750, 60));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Item Id", "Item Name", "Item Price", "Item Quantity", "Item Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 990, 490));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Amount :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 190, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("             Item Image :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 100, 250, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 140, 250, 200));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item Description :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 130, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 0, 153));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 350, 250, 120));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Quantity :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, 140, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 480, 250, 50));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 560, 160, 50));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, 160, 50));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Continue");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 640, 270, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("______________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 210, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/billing_cus_immm.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        row = jTable1.getSelectedRow();
        String itemid = (String) jTable1.getValueAt(row, 1);
        
        String item_desc , item_quantity ;
        
        try(
                
                Connection con = DbConnection.getConnect();
                PreparedStatement ps = con.prepareStatement("select * from items where item_id = '"+itemid+"' ");
                ResultSet rs = ps.executeQuery();
                
            )
        {
            if( rs.next() )
            {
                item_desc = rs.getString("item_desc");
                item_quantity = rs.getString("item_quantity");
                
                BufferedImage im = ImageIO.read(rs.getBinaryStream("item_image"));
                
                jLabel5.setIcon(new ImageIcon(im.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
                jTextArea1.setText(item_desc);
                //jComboBox1.setSelectedIndex(Integer.parseInt(item_quantity));
                
            }
        }
        catch(SQLException | IOException e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        StartBilling sb = new StartBilling(ed , hm);
        sb.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
        jLabel1.setForeground(Color.RED);
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        
        jLabel1.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
        jLabel2.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
        jLabel2.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String item_desc = jTextArea1.getText();
        
        if( item_desc.equals("") )
        {
            JOptionPane.showMessageDialog(this, "Please selected any item ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            totalbill = 0 ;
        
            String item_quantity = (String) jComboBox1.getSelectedItem();

            /* Exception in thread "AWT-EventQueue-0" java.lang.ArrayIndexOutOfBoundsException: 2 >= 2 */
            String item_price = (String) jTable1.getValueAt(row, 3);

            String item_total_price = String.valueOf( Double.parseDouble(item_quantity) * Double.parseDouble(item_price));

            jTable1.setValueAt(item_quantity, row, 4);
            jTable1.setValueAt(item_total_price, row, 5);
            
            dtm = (DefaultTableModel) jTable1.getModel();

            //System.out.println("Row : "+row);
            //System.out.println("Map Id : "+dtm.getValueAt(row, 1));
            
            //System.out.println("hm : "+hm);

            ArrayList collection_quantity = hm.get(dtm.getValueAt(row, 1).toString());

            //System.out.println("Collection Quantity : "+collection_quantity);
            //System.out.println("Quantity : "+item_quantity);

            /*

                Row : 1
                Map Id : 2
                Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException Line 345
                Collection Quantity : null
                Quantity : 1

            */

            collection_quantity.set(3, item_quantity);

            ArrayList al ;

            for( Map.Entry me : hm.entrySet() )
            {
                //System.out.println(me.getKey()+" : "+me.getValue());

                al = (ArrayList) me.getValue();

                totalbill = totalbill + (Double.parseDouble((String) al.get(2)) * Double.parseDouble((String) al.get(3)));
                jLabel9.setText(String.valueOf(totalbill));

            }

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
            jTextArea1.setText("");
            jComboBox1.setSelectedItem("1");
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String item_desc = jTextArea1.getText();
        
        if( item_desc.equals("") )
        {
            JOptionPane.showMessageDialog(this, "Please selected any item ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            int i = JOptionPane.showConfirmDialog(this, "Do you want to delete this item ?");
        
            if( i == 0 )
            {
                //((DefaultTableModel)myJTable.getModel()).removeRow(rowToRemove);

                totalbill = 0 ;

                String id = dtm.getValueAt(row, 1).toString();
                //System.out.println("map id : "+id);
                
                /*   remove item from HashMap   */
                hm.remove(id);
                
                //System.out.println("hmm all item list : "+hm);

                ArrayList al ;

                for( Map.Entry me : hm.entrySet() )
                {
                    //System.out.println(me.getKey()+" : "+me.getValue());

                    al = (ArrayList) me.getValue();

                    totalbill = totalbill + (Double.parseDouble((String) al.get(2)) * Double.parseDouble((String) al.get(3)));
                    
                }
                
                jLabel9.setText(String.valueOf(totalbill));
                
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                
                /* Exception in thread "AWT-EventQueue-0" java.lang.ArrayIndexOutOfBoundsException: 2 >= 2 */
                
                dtm.removeRow(row);

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
                jTextArea1.setText("");
                jComboBox1.setSelectedItem("1");

            }
            else if( i == 1 )
            {
                
                /*   No   */
                
            }
            else if( i == 2 )
            {
                
                /*   Cancel    */
                
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
                jTextArea1.setText("");
                jComboBox1.setSelectedItem("1");
            }
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Payment p = new Payment(ed , hm);
        p.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AllItemsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllItemsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllItemsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllItemsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllItemsList( null , null ).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
