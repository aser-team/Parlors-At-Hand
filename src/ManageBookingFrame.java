
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ManageBookingFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageBookingFrame
     */
    public ManageBookingFrame() {
        initComponents();
        getConnection();
        Show_Bookings_In_JTable();
    }

    public Connection getConnection()
    {
        Connection con=null;
        try 
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");
            JOptionPane.showMessageDialog(null,"Connected");
            return con;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ManageBookingFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
    }
    
    
        public ArrayList<ParlorManageBooking> getBookingList()
        {
        ArrayList<ParlorManageBooking> bookList=new ArrayList<ParlorManageBooking>();
        Connection con=getConnection();
        //String query="SELECT parlor.pname, service.sname, service.sprice, booking.date_and_time, booking.payment_status from parlor,service INNER JOIN booking ON parlor.pid=booking.pid";
        //String query="SELECT pname,sname,sprice FROM parlor p JOIN booking b ON p.pid=b.pid JOIN service s ON b.sid=s.sid";
       // mysql> SELECT emp_name, dept_name FROM Employee e JOIN Register r ON e.emp_id=r.emp_id JOIN Department d ON r.dept_id=d.dept_id;
        String query="SELECT pname,sname,sprice,date_and_time,book_status FROM parlor,service,booking WHERE parlor.pid=booking.pid and booking.sid=service.sid";
       Statement st;
        ResultSet rs;
        
        try 
        {
            st=con.createStatement();
            rs=st.executeQuery(query);
            ParlorManageBooking bookings;
            
            while(rs.next())
            {
               bookings=new ParlorManageBooking(rs.getString("pname"),rs.getString("sname"),rs.getString("sprice"),rs.getString("date_and_time"),rs.getString("book_status"));
               bookList.add(bookings);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ManageBookingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bookList;
        }
        
    public void Show_Bookings_In_JTable()
    {
         ArrayList<ParlorManageBooking> list=getBookingList();
        DefaultTableModel model=(DefaultTableModel)Booking_table.getModel();
        
        Object[] row=new Object[5];
        for (int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getParlorName();
            row[1]=list.get(i).getServiceName();
            row[2]=list.get(i).getPrice();
            row[3]=list.get(i).getDateandTime();
            row[4]=list.get(i).getBookStatus();
            
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Booking_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Manage Your Bookings");

        Booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parlor Name", "Service Name", "Price", "Date and Time", "Book Status"
            }
        ));
        jScrollPane1.setViewportView(Booking_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

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
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(ManageBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBookingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Booking_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
