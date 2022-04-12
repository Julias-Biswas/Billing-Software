/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbconnection.DbConnection;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AdminDetails;

/**
 *
 * @author julia
 */
public class EditAllItems extends javax.swing.JFrame {

    /**
     * Creates new form EditAllItems
     */
    
    String itemid ;
    File file ;
    
    AdminDetails ad ;
    
    public EditAllItems( AdminDetails ad ) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EDIT ALL ITEMS IN STORE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 650, 60));

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 91, 35));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No ", "Item Id", "Item Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 500, 650));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Id :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Quantity :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item Price :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Item Desc :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Item Category :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("                Change Image ");
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
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 240, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 240, 180));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 320, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 320, 30));

        jTextField3.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 320, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Book", "Blouses", "Bra", "Casma", "Computer", " " }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 320, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 153, 153));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 320, 60));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 153, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Quantity", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 690, 320, 30));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update Item");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 750, 170, 50));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Item");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 750, 170, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/edit_all_items_img.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 840));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1110, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        tableFormWindowOpened();
        
    }//GEN-LAST:event_formWindowOpened

    void tableFormWindowOpened()
    {
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        String item_id , item_name ;
        int serial_no = 0 ;
        
        try(
                
                Connection con = DbConnection.getConnect();
                PreparedStatement ps = con.prepareStatement("select * from items");
                ResultSet rs = ps.executeQuery();
            )
        {
            while( rs.next() )
            {
                serial_no  = serial_no  + 1 ;
                
                item_id = rs.getString("item_id");
                item_name = rs.getString("item_name");
                
                Object[] ob = { serial_no , item_id , item_name };
                dtm.addRow(ob);
                
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row = jTable1.getSelectedRow();
        //System.out.println("Row :"+row);
        
        itemid =  (String) jTable1.getValueAt(row, 1);
        //System.out.println(itemid);
        
        String item_id1 , item_name1 , item_price1 , item_category1 , item_desc1 , item_quantity1 , item_img1 ;
        
        try(
                
                Connection con = DbConnection.getConnect();
                PreparedStatement ps = con.prepareStatement("select * from items where item_id = '"+itemid+"'");
                ResultSet rs = ps.executeQuery();
                
            )
        {
            if( rs.next() )
            {
                item_id1 = rs.getString("item_id");
                item_name1 = rs.getString("item_name");
                item_price1 = rs.getString("item_price");
                item_category1 = rs.getString("item_category");
                item_desc1 = rs.getString("item_desc");
                item_quantity1 = rs.getString("item_quantity");
                BufferedImage im = ImageIO.read(rs.getBinaryStream("item_image"));
                jLabel10.setIcon(new ImageIcon(im.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT)));
                
                
                jTextField1.setText(item_id1);
                jTextField2.setText(item_name1);
                jTextField3.setText(item_price1);
                jComboBox1.setSelectedItem(item_category1);
                jTextArea1.setText(item_desc1);
                jComboBox2.setSelectedItem(item_quantity1);
                
            }
        }
        catch(SQLException | IOException e)
        {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String item_id = jTextField1.getText();
        
        
        if( item_id.equals("") )
        {
            JOptionPane.showMessageDialog(this, "Please selected any items ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            FileInputStream fis = null ;
            
            String item_name = jTextField2.getText();
            String item_price = jTextField3.getText();
            String item_category = (String) jComboBox1.getSelectedItem();
            String item_desc = jTextArea1.getText();
            String item_quantity = (String) jComboBox2.getSelectedItem();
            
            /*   Update with image   */ 
            if( file != null )
            {
                try
                {
                    fis = new FileInputStream(file);
                }
                catch(IOException ee)
                {
                    ee.printStackTrace();
                }

                try(

                        Connection con = DbConnection.getConnect();
                        PreparedStatement ps = con.prepareStatement("update items set item_name = ? , item_price = ? , item_category = ? , item_desc = ? , item_quantity = ? , item_image = ? where item_id = ? ");

                    )
                {
                    ps.setString(1, item_name);
                    ps.setString(2, item_price);
                    ps.setString(3, item_category);
                    ps.setString(4, item_desc);
                    ps.setString(5, item_quantity);
                    ps.setBinaryStream(6, fis , file.length());
                    ps.setString(7, itemid);

                    int i = ps.executeUpdate();

                    if( i > 0 )
                    {
                        JOptionPane.showMessageDialog(this, "Item updated Successfully");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jComboBox1.setSelectedItem("Select Category");
                        jTextArea1.setText("");
                        jComboBox2.setSelectedItem("Select Quantity");

                        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Item not updated successfully , due to some error", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
            /*   Update without image   */
            else
            {
                
                try(

                        Connection con = DbConnection.getConnect();
                        PreparedStatement ps = con.prepareStatement("update items set item_name = ? , item_price = ? , item_category = ? , item_desc = ? , item_quantity = ?  where item_id = ? ");

                    )
                {
                    ps.setString(1, item_name);
                    ps.setString(2, item_price);
                    ps.setString(3, item_category);
                    ps.setString(4, item_desc);
                    ps.setString(5, item_quantity);
                    ps.setString(6, itemid);

                    int i = ps.executeUpdate();

                    if( i > 0 )
                    {
                        JOptionPane.showMessageDialog(this, "Item updated Successfully");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jComboBox1.setSelectedItem("Select Category");
                        jTextArea1.setText("");
                        jComboBox2.setSelectedItem("Select Quantity");
                        
                        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png"))); // NOI18N
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Item not updated successfully , due to some error", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
                
            }
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        // using try catch for Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(rootPane);
        file = filechooser.getSelectedFile();
        
        //System.out.println(file);
        
        /*    
            
            Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
            at admin.EditAllItems.jButton2ActionPerformed(EditAllItems.java:491)
            at admin.EditAllItems.access$700(EditAllItems.java:30)
            at admin.EditAllItems$7.actionPerformed(EditAllItems.java:165)
            
        */
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().getScaledInstance( jLabel10.getWidth() , jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(imageIcon);
        
        //jLabel9.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath()));
        
        
        
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String item_id = jTextField1.getText();
        
        if( item_id.equals("") )
        {
            JOptionPane.showMessageDialog(this, "Please selete any items ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int d = JOptionPane.showConfirmDialog(this, "Do you want to delete items in your store ?");
            
            if( d == 0 )
            {
                /*   Delete items   */
                
                try(
                        
                        Connection con = DbConnection.getConnect();
                        PreparedStatement ps = con.prepareStatement("delete from items where item_id = ? ");
                        
                    )
                {
                    ps.setString(1, itemid);
                    
                    int i = ps.executeUpdate();
                    
                    if( i > 0 )
                    {
                        JOptionPane.showMessageDialog(this, "Item deleted successfully");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jComboBox1.setSelectedItem("Select Category");
                        jTextArea1.setText("");
                        jComboBox2.setSelectedItem("Select Quantity");
                        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png")));
                        
                        //tableFormWindowOpened();
                    
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Item can't deleted successfully , due to some error .", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
                
            }
            else if( d == 1 )
            {
                /*    No   */
            }
            else if( d == 2 )
            {
                /*    Cancel    */
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jComboBox1.setSelectedItem("Select Category");
                jTextArea1.setText("");
                jComboBox2.setSelectedItem("Select Quantity");
                
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsimages/default_image.png")));
                
            }
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        AdminProfile ap = new AdminProfile(ad);
        ap.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
        jLabel1.setForeground(Color.RED);
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        
        jLabel1.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        
        jLabel9.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        
        jLabel9.setForeground(Color.GREEN);
        
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
        jLabel2.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
        jLabel2.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        
        /*     Nothing     */
        
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        
        /*       Nothing       */
        
    }//GEN-LAST:event_jTable1MouseExited

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
            java.util.logging.Logger.getLogger(EditAllItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAllItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAllItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAllItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAllItems(null).setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
