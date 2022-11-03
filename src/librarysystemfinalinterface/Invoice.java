package librarysystemfinalinterface;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import librarysystemfinalinterface.Invoice;
import librarysystemfinalinterface.Main;
import librarysystemfinalinterface.SearchBookForLibrarian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Invoice extends javax.swing.JFrame {

    Connection sqlConnection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String fineID = null;
    String bookID = null;
    String borrowID = null;
    String userID = null;
    String issueDate = null;
    String totalFine = "0";

    int q, i;
    
    /**
     * Creates new form Invoice
     */
	// creating class object to close the frame-Ashish Gujral
		static Invoice frame;
    public Invoice() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title_staff = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_staff_login = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_invoice = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_user_searchBook = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        
        // for logout button
        btn_staff_login.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            {  
            	Main.main(new String[] {});
            	frame.dispose();
            }  
        }); 
        // use mouse listener for clicked and open new activity 
        btn_user_searchBook.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            {  
            	SearchBookForLibrarian.main(new String[] {});
            	frame.dispose();
            }  
        }); 
      
        btn_invoice.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            {  
            	Invoice.main(new String[] {});
            	frame.dispose();
            }  
        }); // Ashish -- end



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Invoice");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fine ID", "Book ID", "Borrow ID", "User ID", "Fine"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               jTable3MouseClicked(evt);
            }
        });
        
        jScrollPane3.setViewportView(jTable3);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Print an Invoice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fine Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel27)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton7))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 570, 270));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_staff.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-user-32.png"))); // NOI18N
        jLabel5.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel5.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Librarian");

        javax.swing.GroupLayout title_staffLayout = new javax.swing.GroupLayout(title_staff);
        title_staff.setLayout(title_staffLayout);
        title_staffLayout.setHorizontalGroup(
            title_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_staffLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        title_staffLayout.setVerticalGroup(
            title_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_staffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel1.add(title_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        btn_staff_login.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-login-32.png"))); // NOI18N
        jLabel13.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel13.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Logout");

        javax.swing.GroupLayout btn_staff_loginLayout = new javax.swing.GroupLayout(btn_staff_login);
        btn_staff_login.setLayout(btn_staff_loginLayout);
        btn_staff_loginLayout.setHorizontalGroup(
            btn_staff_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_staff_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        btn_staff_loginLayout.setVerticalGroup(
            btn_staff_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_staff_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btn_staff_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 40));

        btn_invoice.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Invoice");

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-invoice-32.png"))); // NOI18N
        jLabel19.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel19.setPreferredSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout btn_invoiceLayout = new javax.swing.GroupLayout(btn_invoice);
        btn_invoice.setLayout(btn_invoiceLayout);
        btn_invoiceLayout.setHorizontalGroup(
            btn_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        btn_invoiceLayout.setVerticalGroup(
            btn_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btn_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 40));

        btn_user_searchBook.setBackground(new java.awt.Color(255, 255, 255));
        btn_user_searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_user_searchBookMouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-search-32.png"))); // NOI18N
        jLabel30.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel30.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Search Book");

        javax.swing.GroupLayout btn_user_searchBookLayout = new javax.swing.GroupLayout(btn_user_searchBook);
        btn_user_searchBook.setLayout(btn_user_searchBookLayout);
        btn_user_searchBookLayout.setHorizontalGroup(
            btn_user_searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_user_searchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        btn_user_searchBookLayout.setVerticalGroup(
            btn_user_searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_user_searchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btn_user_searchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

            pst = sqlConnection.prepareStatement("SELECT * FROM fine WHERE Fine_ID=?");
            pst.setString(1, jTextField6.getText());
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) jTable3.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                //Get each values in a row of result set.
                //Then add them to columnData.
                for (i = 0; i <= q; i++) {
                    columnData.add(rs.getString("Fine_ID"));
                    columnData.add(rs.getString("Book_ID"));
                    columnData.add(rs.getString("Borrow_Detail_Borrow_ID"));
                    columnData.add(rs.getString("User_ID"));
                    columnData.add(rs.getString("Amount"));
                    
                }
                //Append each to RecordTable.
                RecordTable.addRow(columnData);
                //Close the connection.
                //sqlConnection.close();  
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


                                            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_user_searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_user_searchBookMouseClicked
        // TODO add your handling code here:
        //        setColor(btn_user_searchBook);
        //        resetColor(btn_user_login);
    }//GEN-LAST:event_btn_user_searchBookMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable3.getModel();
        int selectedRows =jTable3.getSelectedRow();
        
        fineID = RecordTable.getValueAt(selectedRows, 0).toString();
        totalFine = RecordTable.getValueAt(selectedRows, 4).toString();
    }//GEN-LAST:event_jTable3MouseClicked
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(fineID==null){
                JOptionPane.showMessageDialog(this, 
                "Please select the fine you would like to print out" ,"Fine",JOptionPane.ERROR_MESSAGE);
        }else {JOptionPane.showMessageDialog(this, 
                "The total fine for this borrow is $ "+totalFine + "dollar" );}
    }//GEN-LAST:event_jButton1ActionPerformed

    
  
    
    
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	 try {
  					frame =  new Invoice();
  					frame.setVisible(true);
  					} 
                 catch (Exception e) {
  					e.printStackTrace();
  				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_invoice;
    private javax.swing.JPanel btn_staff_login;
    private javax.swing.JPanel btn_user_searchBook;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel title_staff;
    // End of variables declaration//GEN-END:variables
}