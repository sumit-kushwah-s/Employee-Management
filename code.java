import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeInfo extends javax.swing.JFrame {

     // Creates new form EmployeeInfo
    public EmployeeInfo() {
        initComponents();
         Connect();
         table_update();
    }
    Connection con;
    PreparedStatement pst;  
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/pavidb";
            con=DriverManager.getConnection(url,"root","pavi76");
        } catch (Exception ex) {
            Logger.getLogger(EmployeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

   
    @SuppressWarnings("unchecked");
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtLname = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtlname = new javax.swing.JLabel();
        Lastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Information");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Employee Information System");

        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("First Name");

        txtFname.setFont(new java.awt.Font("Segoe UI", 1, 18));
        txtFname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("City");

        txtCity.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        txtlname.setFont(new java.awt.Font("Segoe UI", 1, 18));
        txtlname.setForeground(new java.awt.Color(0, 0, 204));
        txtlname.setText("Last Name");

        Lastname.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Lastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Annual Salary");

        txtsalary.setFont(new java.awt.Font("Segoe UI", 1, 18));
        txtsalary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Phone");

txtphone.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        txtphone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        javax.swing.GroupLayout txtLnameLayout = new javax.swing.GroupLayout(txtLname);
        txtLname.setLayout(txtLnameLayout);
        txtLnameLayout.setHorizontalGroup(
            txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtLnameLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        txtLnameLayout.setVerticalGroup(
            txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtLnameLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtLnameLayout.createSequentialGroup()
                        .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(txtLnameLayout.createSequentialGroup()
                                .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtlname)
                                    .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5))
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7))
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtLnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        jTable1.setForeground(new java.awt.Color(0, 0, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "City", "Phone", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtLname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 386, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String fname,lname,city,phone,salary;
            fname=txtFname.getText();
            lname=Lastname.getText();
            city=txtCity.getText();
            phone=txtphone.getText();
            salary=txtsalary.getText();
              pst=con.prepareStatement("insert into Empdata(fname,lname,city,phone,salary) values(?,?,?,?,?)");
              pst.setString(1,fname);
              pst.setString(2,lname);
              pst.setString(3,city);
              pst.setString(4,phone);
              pst.setString(5,salary);
           
              pst.executeUpdate();
              
             JOptionPane.showMessageDialog(this,"Record Saved");
             table_update();
             
             txtFname.setText("");
             Lastname.setText("");
             txtCity.setText("");
             txtphone.setText("");
             txtsalary.setText("");
             txtFname.requestFocus();
             
             
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        int selectIndex;
        selectIndex = jTable1.getSelectedRow();
        
        int id=Integer.parseInt(model.getValueAt(selectIndex,0).toString());
        txtFname.setText(model.getValueAt(selectIndex,1).toString());
        Lastname.setText(model.getValueAt(selectIndex,2).toString());
        txtCity.setText(model.getValueAt(selectIndex,3).toString());
        txtphone.setText(model.getValueAt(selectIndex,4).toString()); 
        txtsalary.setText(model.getValueAt(selectIndex,5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
       
        //update data in table
        try {
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            int selectIndex= jTable1.getSelectedRow();
  
            int id=Integer.parseInt(model.getValueAt(selectIndex,0).toString());
        
            String fname,lname,city,phone,salary;
            fname=txtFname.getText();
            lname=Lastname.getText();
            city=txtCity.getText();
            phone=txtphone.getText();
            salary=txtsalary.getText();
              pst=con.prepareStatement("update Empdata set fname=?,lname=?,city=?,phone=?,salary=? where id=?");
              pst.setString(1,fname);
              pst.setString(2,lname);
              pst.setString(3,city);
              pst.setString(4,phone);
              pst.setString(5,salary);
              pst.setInt(6,id);
              pst.executeUpdate();
              
             JOptionPane.showMessageDialog(this,"Record Update..");
             table_update();
             
             txtFname.setText("");
             Lastname.setText("");
             txtCity.setText("");
             txtphone.setText("");
             txtsalary.setText("");
             txtFname.requestFocus();
             
             
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
