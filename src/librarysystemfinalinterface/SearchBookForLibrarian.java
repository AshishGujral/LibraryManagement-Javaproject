package librarysystemfinalinterface;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import librarysystemfinalinterface.Invoice;
//import librarysystemfinalinterface.LoanBook;
import librarysystemfinalinterface.Main;
//import librarysystemfinalinterface.ReturnBookForLibrarian;
import librarysystemfinalinterface.SearchBookForLibrarian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cec06
 */
public class SearchBookForLibrarian extends javax.swing.JFrame {

    /**
     * Creates new form SearchBookForUser
     */
	// creating class object to close the frame-Ashish Gujral
		static SearchBookForLibrarian frame;
		
    public SearchBookForLibrarian() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
	String Option;
	  int q,i;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title_staff = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btn_staff_login = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_invoice = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_user_searchBook = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Search Book");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Title", "ISBN", "Author", "Due date", "Book Status" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Author", "Publisher", "Edition", "Status", "ISBN"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setText("Display all books");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setText("Reset");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7))
                            .addComponent(jLabel6))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton12))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 490, 290));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_staff.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-user-32.png"))); // NOI18N
        jLabel5.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel5.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Librarian");

        javax.swing.GroupLayout title_staffLayout = new javax.swing.GroupLayout(title_staff);
        title_staff.setLayout(title_staffLayout);
        title_staffLayout.setHorizontalGroup(
            title_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_staffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        title_staffLayout.setVerticalGroup(
            title_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_staffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
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
                .addContainerGap(164, Short.MAX_VALUE))
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

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-invoice-32.png"))); // NOI18N
        jLabel19.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel19.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Invoice");

        javax.swing.GroupLayout btn_invoiceLayout = new javax.swing.GroupLayout(btn_invoice);
        btn_invoice.setLayout(btn_invoiceLayout);
        btn_invoiceLayout.setHorizontalGroup(
            btn_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        btn_invoiceLayout.setVerticalGroup(
            btn_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btn_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 40));

        btn_user_searchBook.setBackground(new java.awt.Color(255, 255, 255));
        btn_user_searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_user_searchBookMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-search-32.png"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel3.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Search Book");

        javax.swing.GroupLayout btn_user_searchBookLayout = new javax.swing.GroupLayout(btn_user_searchBook);
        btn_user_searchBook.setLayout(btn_user_searchBookLayout);
        btn_user_searchBookLayout.setHorizontalGroup(
            btn_user_searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_user_searchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        btn_user_searchBookLayout.setVerticalGroup(
            btn_user_searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_user_searchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btn_user_searchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDisplayAllActionPerformed
        try {
            //Declare the jdbc driver.
        	Connection con=DB.getConnection();
            //Declare the connection to the database.
            //Set the prepared SQL statement.
            PreparedStatement ps=con.prepareStatement
 					("SELECT * FROM BOOK");
            //Excute the SQL statement and get the result set.
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            //Get the amount of column of result set. 
            q = stData.getColumnCount();
            
            //Declare the record table.
            DefaultTableModel RecordTable = (DefaultTableModel)jTable3.getModel();
            RecordTable.setRowCount(0);
            
            //Read the data from result set untill the end.
            while(rs.next()) {
                //Declare a 
                Vector columnData = new Vector();
                
                //Get each values in a row of result set.
                //Then add them to columnData.
                for(i=0;i<q;i++) {
                    columnData.add(rs.getString("BOOK_ID"));
                    columnData.add(rs.getString("BOOK_Title"));
                    columnData.add(rs.getString("BOOK_Author"));
                    columnData.add(rs.getString("BOOK_Publisher"));
                    columnData.add(rs.getString("Book_Edition"));
                    columnData.add(rs.getString("BOOK_Status"));
                    columnData.add(rs.getString("ISBN"));
                }
                //Append each to RecordTable.
                RecordTable.addRow(columnData);
                //Close the connection.
                //con.close();  
            }
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnUserDisplayAllActionPerformed
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
   	 jTextField6.setText(""); // TODO add your handling code here:
   }//GEN-LAST:event_jButton12ActionPerformed
   
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
   	 Option = jComboBox1.getSelectedItem().toString();
   	 if(Option.equals("Book ID")) {
			 Option = "Book_id";
		 }
		 else if(Option.equals("Book Title")) {
			 Option = "Book_title";
		 }
		 else if(Option.equals("Author")) {
			 Option = "Book_author";
		 }
		 else if(Option.equals("Publisher")) {
			 Option = "Book_publisher";
		 }
		 else if(Option.equals("Book_Edition")) {
			 Option = "Book_edition";
		 }
		 else if(Option.equals("Book Status")) {
			 Option = "Book_status";
		 }
		 else if(Option.equals("ISBN")) {
			 Option = "ISBN";
		 }
		 else {
		 Option="Book_title";
		 }
        
        try {
       	 Connection con=DB.getConnection();
            //Declare the connection to the database.
            //Set the prepared SQL statement.
       	 PreparedStatement ps=con.prepareStatement
	 					("select * from book where "+Option+" =? ");
        
         ps.setString(1, jTextField6.getText());
            ResultSet rs = ps.executeQuery();
 		            ResultSetMetaData stData = rs.getMetaData();
            //Declare the connection to the database.
            
 		         
          
            
            //Excute the SQL statement and get the result set.
           
            
            //Get the amount of column of result set. 
            q = stData.getColumnCount();
            
            //Declare the record table.
            DefaultTableModel RecordTable = (DefaultTableModel)jTable3.getModel();
            RecordTable.setRowCount(0);
            
            //Read the data from result set untill the end.
            while(rs.next()) {
                //Declare a 
                Vector columnData = new Vector();
                
                //Get each values in a row of result set.
                //Then add them to columnData.
                for(i=0;i<q;i++) {
                    columnData.add(rs.getString("BOOK_ID"));
                    columnData.add(rs.getString("BOOK_Title"));
                    columnData.add(rs.getString("BOOK_Author"));
                    columnData.add(rs.getString("BOOK_Publisher"));
                    columnData.add(rs.getString("Book_Edition"));
                    columnData.add(rs.getString("BOOK_Status"));
                    columnData.add(rs.getString("ISBN"));
                }
                //Append each to RecordTable.
                RecordTable.addRow(columnData);
                //Close the connection.
                //con.close();  
            }
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } // TODO add your handling code here:
   }


    private void btn_user_searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_user_searchBookMouseClicked
        // TODO add your handling code here:
        //        setColor(btn_user_searchBook);
        //        resetColor(btn_user_login);
    }//GEN-LAST:event_btn_user_searchBookMouseClicked

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
            java.util.logging.Logger.getLogger(SearchBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	 try {
 					frame =  new SearchBookForLibrarian();
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel title_staff;
    // End of variables declaration//GEN-END:variables
}