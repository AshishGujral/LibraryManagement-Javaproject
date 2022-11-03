package librarysystemfinalinterface;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


//import LibrarySystem.BorrowBook;
//import LibrarySystem.Main;
//import LibrarySystem.PlaceAHold;
//import LibrarySystem.ReturnBookForUser;
//import LibrarySystem.SearchBookForUser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cec06
 */
public class ReturnBookForUser extends javax.swing.JFrame {
	
    String selectedBook_Book_ID  = null;
    String selectedStart_Date = null;
    String selectedDue_Date = null;
    String selectedReturn_Date = null;
    String selectedUser_ID = null;
    String selectedBorrow_ID = null;
    String selectedBook_Status = null;

    String Borrow_ID,Start_Date,Due_Date,Return_Date,User_User_ID,Book_Book_ID,Book_Title;
    Double Amount;
	  /**
     * Created by Ashish Gujral
     */
	 int GlobalrowCount = 0;
	    String Option = "Book_Status";
	// creating class object to close the frame-Ashish Gujral
	static ReturnBookForUser frame;
    public ReturnBookForUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void jTable1() {
       
      //  String query = "Borrow_ID,Start_Date,Due_Date,Return_Date,User_User_ID,Book_Book_ID";
        String query = "Borrow_ID,Start_Date,Due_Date,Return_Date,User_User_ID,Book_Book_ID";
      
        try{
        	 
            Connection con = DB.getConnection();
 			PreparedStatement ps=con.prepareStatement
 					("select * from borrow_detail");
 			ResultSet rs=ps.executeQuery();
 			 int rowCount=0;
 			DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
 			model.setRowCount(0);
 			
 			while(rs.next()) {
 				Borrow_ID = rs.getString("Borrow_ID");
 				Start_Date = rs.getString("Start_Date");
                Due_Date = rs.getString("Due_Date");
                Return_Date = rs.getString("Return_Date");
                User_User_ID = rs.getString("User_User_ID");                
                Book_Book_ID = rs.getString("Book_Book_ID");
 				  rowCount = model.getRowCount();			
 				model.addRow(new Object[] {Book_Book_ID,Borrow_ID,Due_Date,Start_Date,});
 			}
                 
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        title_user3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_user_login = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_user_searchBook = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_borrow_book4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        
        
        // Ashish -- start
        // for logout button
           btn_user_login.addMouseListener(new MouseAdapter()  
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
               	SearchBookForUser.main(new String[] {});
               	frame.dispose();
               }  
           }); 
           btn_borrow_book4.addMouseListener(new MouseAdapter()  
           {  
               public void mouseClicked(MouseEvent e)  
               {  
               	ReturnBookForUser.main(new String[] {});
                
               	frame.dispose();
               	
               }  
           }); 
           jButton10.addMouseListener(new MouseAdapter()  
           {  
               public void mouseClicked(MouseEvent e)  
               {  
               	
               	
               }  
           }); 
           // Ashish --End
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Return Book");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Search Books");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Borrow ID", "Due Date", "Start Date"
            }
        ));
        jTable1();
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        
        jScrollPane2.setViewportView(jTable2);

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setText("Return a book");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 260));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_user3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-user-32.png"))); // NOI18N
        jLabel30.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel30.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("User");

        javax.swing.GroupLayout title_user3Layout = new javax.swing.GroupLayout(title_user3);
        title_user3.setLayout(title_user3Layout);
        title_user3Layout.setHorizontalGroup(
            title_user3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_user3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        title_user3Layout.setVerticalGroup(
            title_user3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_user3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel5.add(title_user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        btn_user_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_user_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_user_loginMousePressed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-login-32.png"))); // NOI18N
        jLabel31.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel31.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Logout");

        javax.swing.GroupLayout btn_user_loginLayout = new javax.swing.GroupLayout(btn_user_login);
        btn_user_login.setLayout(btn_user_loginLayout);
        btn_user_loginLayout.setHorizontalGroup(
            btn_user_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_user_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        btn_user_loginLayout.setVerticalGroup(
            btn_user_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_user_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(btn_user_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 40));

        btn_user_searchBook.setBackground(new java.awt.Color(255, 255, 255));
        btn_user_searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_user_searchBookMouseClicked(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-search-32.png"))); // NOI18N
        jLabel32.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel32.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Search Book");

        javax.swing.GroupLayout btn_user_searchBookLayout = new javax.swing.GroupLayout(btn_user_searchBook);
        btn_user_searchBook.setLayout(btn_user_searchBookLayout);
        btn_user_searchBookLayout.setHorizontalGroup(
            btn_user_searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_user_searchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        btn_user_searchBookLayout.setVerticalGroup(
            btn_user_searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_user_searchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(btn_user_searchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 40));

        btn_borrow_book4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystemfinalinterface/Icons/icons8-return-book-32.png"))); // NOI18N
        jLabel38.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel38.setPreferredSize(new java.awt.Dimension(128, 128));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Return Book ");

        javax.swing.GroupLayout btn_borrow_book4Layout = new javax.swing.GroupLayout(btn_borrow_book4);
        btn_borrow_book4.setLayout(btn_borrow_book4Layout);
        btn_borrow_book4Layout.setHorizontalGroup(
            btn_borrow_book4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_borrow_book4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        btn_borrow_book4Layout.setVerticalGroup(
            btn_borrow_book4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(btn_borrow_book4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(btn_borrow_book4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Eunchong -- start
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {          
        //  String query = "Borrow_ID,Start_Date,Due_Date,Return_Date,User_User_ID,Book_Book_ID";
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int selectedRows =jTable2.getSelectedRow();
        
        selectedBook_Book_ID = model.getValueAt(selectedRows, 0).toString(); 
        selectedBorrow_ID = model.getValueAt(selectedRows, 1).toString(); 
//        selectedStart_Date = model.getValueAt(selectedRows, 1).toString(); 
        selectedDue_Date = model.getValueAt(selectedRows, 2).toString(); 
        
//        selectedReturn_Date = model.getValueAt(selectedRows, 3).toString();
//        selectedUser_ID = model.getValueAt(selectedRows, 4).toString();

//        selectedBook_Status = RecordTable.getValueAt(selectedRows, 3).toString();
    }
        
       
        
 
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
    	  try{
//   		   String selectedBook_Status;
  			Connection con=DB.getConnection();
  			PreparedStatement ps=con.prepareStatement
  					("select * from book where Book_ID = ? ");
  			ps.setString(1, selectedBook_Book_ID);
  			ResultSet rs=ps.executeQuery();
  			 int rowCount=0;
  			while(rs.next()) {
  				selectedBook_Status = rs.getString("Book_Status"); 
  			}
   	   }
  			catch(Exception ex){System.out.println(ex);System.out.println("error"); }
//      }// End -- Ashish Gujral
    	
    	if(selectedBorrow_ID == null) {
            JOptionPane.showMessageDialog(this, "Please select at least one book.");
        } else {
        	try{
        		ZoneId systemTimeZone = ZoneId.systemDefault();
                LocalDate returnDate = LocalDate.now();  
                LocalDate dueDate= LocalDate.parse(selectedDue_Date);
                ZonedDateTime zonedDateTime = returnDate.atStartOfDay(systemTimeZone);
                Date startDay = Date.from(zonedDateTime.toInstant());
                java.sql.Date sqlStartDate = new java.sql.Date(startDay.getTime());
                if(returnDate.compareTo(dueDate)<0) {
                	Amount=0.0;
                }
                else {
                	
                	Amount=(double) ((Duration.between(dueDate.atStartOfDay(),returnDate.atStartOfDay())).toDays())*1.0;
                	
                	
                }int status=0;
                String bookid="",userid="",borrowid="",returndate="";
                try{
               	 
                    Connection con = DB.getConnection();
         			PreparedStatement ps=con.prepareStatement
         					("select * from borrow_detail where Borrow_ID=?");
         			ps.setString(1,selectedBorrow_ID);
         			ResultSet rs=ps.executeQuery();    
         			while(rs.next()) {
         				borrowid = rs.getString("Borrow_ID");
                        returndate = rs.getString("Return_Date");
                        userid= rs.getString("User_User_ID");                
                        bookid= rs.getString("Book_Book_ID");
         			}
                         
                }catch(Exception ex) {
                    System.out.println(ex);
                }
                if(returndate!=null) {
                	JOptionPane.showMessageDialog(this,"Book Already Returned ");
                }
                else {
                	JOptionPane.showMessageDialog(this, "Total Amount Due is"+Amount);
                	JOptionPane.showMessageDialog(this, "Book Return Successfully"+Amount);
                	 try{
                      	
              			Connection con=DB.getConnection();
              			PreparedStatement ps=con.prepareStatement("update borrow_detail SET Return_Date=?"
              					+" where Borrow_ID=?");
              			ps.setString(1,returnDate.toString());
              			ps.setString(2,selectedBorrow_ID);
              			status=ps.executeUpdate();
              			
              		}catch(Exception ex){System.out.println(ex);}
                  	try {
                  		Connection con=DB.getConnection();
                  		PreparedStatement ps1=con. prepareStatement("insert into fine(Book_ID,User_ID,Amount,Borrow_Detail_Borrow_ID) "
          						+ "values(?,?,?,?)" ); 
          				ps1.setString(1,bookid); 
          				ps1.setString(2,userid);
          				ps1.setString(3,Amount.toString()); 
          				ps1.setString(4,borrowid);
          				status=ps1.executeUpdate(); 
          				con.close();
                  	}catch(Exception ex){System.out.println(ex);}
                }
               
                
                
				
				 
    			
    		}catch(Exception ex){System.out.println(ex);}
        
                	
                    //String formattedDueDate = dueDate.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
         
//                    ps = con.prepareStatement("UPDATE book SET Book_Status=1 WHERE Book_ID=?");
//                    ps.setString(1, selectedBook_ID);
//                    //Excute the SQL statement and get the result set.
//                    ps.executeUpdate();
//                    ps= con.prepareStatement("Select User_ID from user where User_Eamil=?");
//                    ps.setString(1,UserLogin.globalName);
//                    ResultSet rs=ps.executeQuery();
//        			 if(rs.next()) {
//        				userid=rs.getInt("User_ID");
//        			 }
//                    ps = con.prepareStatement("INSERT INTO borrow_detail (Start_Date, Due_Date,User_User_ID, Book_Book_ID) "
//                            + "VALUES(?, ?, ?, ?)");
//                    ps.setDate(1, sqlStartDate);
//                    ps.setDate(2, sqlDueDate);
//                    ps.setInt(3, userid);
//                    ps.setString(4,selectedBook_ID);
//                    //Excute the SQL statement and get the result set.
//                    ps.executeUpdate();
//                    
//                    JOptionPane.showMessageDialog(this, "Borrowed!");
//                   
//                    
        } // TODO add your handling code here:
    }                                         
    // Eunchong -- End
    

    private void btn_user_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_user_loginMousePressed
        // TODO add your handling code here:
        //        setColor(btn_user_login);
        //        resetColor(btn_user_searchBook);
    }//GEN-LAST:event_btn_user_loginMousePressed

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
         * 
         */
    	
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	   try {
      					frame =  new ReturnBookForUser();
      					frame.setVisible(true);
      					} 
                     catch (Exception e) {
      					e.printStackTrace();
      				}
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_borrow_book4;
    private javax.swing.JPanel btn_user_login;
    private javax.swing.JPanel btn_user_searchBook;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel title_user3;
    // End of variables declaration//GEN-END:variables


}

