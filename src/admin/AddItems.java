/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbconnection.DbConnection;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.AdminDetails;
import validations.Validations;

/**
 *
 * @author julia
 */
public class AddItems extends javax.swing.JFrame {

    /**
     * Creates new form AddItems
     */
    
    AdminDetails ad ;
    File file ;
    
    String item_id , item_name , item_price , item_category , item_desc , item_quantity ;
    
    public AddItems( AdminDetails ad ) {
        initComponents();
        
        this.ad = ad ;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD ITEMS IN STORE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 13, 571, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 127, 230, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 213, 220, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Price :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 240, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item Category :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 240, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Description :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 240, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Item Quantity :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 250, 50));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 380, 50));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 380, 50));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 380, 50));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 0, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "Books", "Caps", "Casma", "Computer", "Charger", "Drawing Sets ", "Dupatta", "Headphones", "Heighter", "Jackets", "Jeans", "Kurtas", "Key Boards", "Laptop", "Light", "Lungi", "Mobiles", "Mouse", "Pens", "Pencils", "Power Banks", "Sarees", "Shirt", "Shoes", "Tab", "Toys", "T-Shirt", "Wifi Routers", "Wire", "Others" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 380, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 380, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 204, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Quantity", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90", "95", "100", "105", "110", "115", "120", "125", "130", "135", "140", "145", "150", "155", "160", "165", "170", "175", "180", "185", "190", "195", "200", "250", "300", "350", "400", "450", "500", "600", "700", "800", "900", "1000", "1200", "1400", "1600", "1800", "2000", "2500", "3000", "3500", "4000", "4500", "5000", "6000", "7000", "8000", "9000", "10000" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 380, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("       Select Item Image ");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 250, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 250, 180));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Item");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, 150, 50));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear Item");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 670, 170, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/add_all_items_img.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(rootPane);
        
        file = filechooser.getSelectedFile();
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().getScaledInstance( jLabel10.getWidth() , jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(imageIcon);
        
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        AdminProfile ap = new AdminProfile(ad);
        ap.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        FileInputStream fis = null ;
        
        if( file != null )
        {
            try
            {
                fis = new FileInputStream(file);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            item_id = jTextField1.getText();
            item_name = jTextField2.getText();
            item_price = jTextField3.getText();
            item_category = (String) jComboBox1.getSelectedItem();
            item_desc = jTextArea1.getText();
            item_quantity = (String) jComboBox2.getSelectedItem();
            
            Validations v = new Validations();
            
            if( !v.itemIdValidate(item_id))
            {
                JOptionPane.showMessageDialog(this, "Item Id is not valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if( !v.itemNameValidate(item_name))
            {
                JOptionPane.showMessageDialog(this, "Item Name is not valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if( !v.itemPriceValidate(item_price))
            {
                JOptionPane.showMessageDialog(this, "Item Price is not valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if( item_category.trim().equals("Select Category"))
            {
                JOptionPane.showMessageDialog(this, "Please select Item Category", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if( !v.itemDescValidate(item_desc))
            {
                JOptionPane.showMessageDialog(this, "Item Description is not valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if( item_quantity.trim().equals("Select Quantity"))
            {
                JOptionPane.showMessageDialog(this, "Please select Item Quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try(
                        
                        Connection con = DbConnection.getConnect();
                        PreparedStatement ps = con.prepareStatement("insert into items values (?,?,?,?,?,?,?)");
                        
                    )
                {
                    ps.setString(1, item_id);
                    ps.setString(2, item_name);
                    ps.setString(3, item_price);
                    ps.setString(4, item_category);
                    ps.setString(5, item_desc);
                    ps.setString(6, item_quantity);

                    ps.setBinaryStream(7, fis , file.length() );
                    
                    int i = ps.executeUpdate();
                    
                    if( i > 0)
                    {
                        JOptionPane.showMessageDialog(this, "Item added successfully");

                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jComboBox1.setSelectedItem("Select Category");
                        jTextArea1.setText("");
                        jComboBox2.setSelectedItem("Select Quantity");
                        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
                    
                        //fis = null ;
                        file = null ;
                        
                        // for generate random number 
                        generateItemId();
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Item not added due to some error", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Select Image first","Error" , JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedItem("Select Category");
        jTextArea1.setText("");
        jComboBox2.setSelectedItem("Select Quantity");
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
        
        //fis = null ;
        file = null ;
        
        generateItemId();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        generateItemId();
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        
        jLabel9.setForeground(Color.GREEN);
        
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        
        jLabel9.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
        jLabel2.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
        jLabel2.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
        jLabel1.setForeground(Color.RED);
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        
        jLabel1.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel1MouseExited

    void generateItemId()
    {
        
        int total = 0 ;
        try(
            
                Connection con = DbConnection.getConnect();
                PreparedStatement ps = con.prepareStatement("select count(*) AS total from items");
                ResultSet rs = ps.executeQuery();
                
            )
        {
            while( rs.next() )
            {
                total = rs.getInt("total");
                //System.out.println(total);
                jTextField1.setText("BS01/44/ItemName/"+(total+1));
                
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItems(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
