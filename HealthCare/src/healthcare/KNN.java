package healthcare;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class KNN extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    String u_name = "root";
    String u_pwd = "";
    String URL = "jdbc:mysql://localhost:3306/";
    String databaseName = "treatment";

    public KNN() {
        initComponents();
        jPanel2.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("2.jpg")));
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(URL + databaseName, u_name, u_pwd);
            st = con.createStatement();
            st.executeUpdate("Truncate table `knnfulrec`");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Id Based KNN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(510, 113, 140, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(720, 110, 140, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(320, 110, 132, 40);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 160, 870, 340);

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Find K  Distance ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 110, 170, 40);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KNN Classification");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 50, 180, 30);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DiseasePrediction by Machine Learning over Big Data from Healthcare Communities");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 20, 770, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 940, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel2.setVisible(true);
        try {
            FileReader file = new FileReader("C:\\Users\\user\\Desktop\\CMP\\Sourcecode\\PROJ8122\\HealthCare\\knn.txt");
            BufferedReader br = new BufferedReader(file);
            String read = null;
            while ((read = br.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(read, ",");
                while (str.hasMoreTokens()) {

                    System.out.println("\n Success");

                    String query = "INSERT INTO knnfulrec VALUES ('" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "','" + str.nextToken() + "')";
                    st.executeUpdate(query);

                }
            }
            br.close();
            file.close();
            JOptionPane.showMessageDialog(this, "Find K Distance Sucessfully ");
            System.out.println("\n Inserted Successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Patient Name");
            model.addColumn("BMI");
            model.addColumn("SBP");
            model.addColumn("DBP");
            model.addColumn("HDL");
            model.addColumn("TCHOL");
            model.addColumn("TRIGL");
            model.addColumn("BB");
            model.addColumn("ASPRIN");
            model.addColumn("FIBRA");
            model.addColumn("K Distance");

            jTable1.setModel(model);

            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM knnfulrec");
            int i = 0;
            while (rs.next()) {
                model.insertRow(i, new Object[]{""});
                model.setValueAt(rs.getString(1), i, 0);
                model.setValueAt(rs.getString(2), i, 1);
                model.setValueAt(rs.getString(3), i, 2);
                model.setValueAt(rs.getString(4), i, 3);
                model.setValueAt(rs.getString(5), i, 4);
                model.setValueAt(rs.getString(6), i, 5);
                model.setValueAt(rs.getString(7), i, 6);
                model.setValueAt(rs.getString(8), i, 7);
                model.setValueAt(rs.getString(9), i, 8);
                model.setValueAt(rs.getString(10), i, 9);
                model.setValueAt(rs.getString(11), i, 10);
                i++;
            }
            //jTextField2.setText(""+i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("K Distance");

            jTable1.setModel(model);

            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM knninfo");
            int i = 0;
            while (rs.next()) {
                model.insertRow(i, new Object[]{""});
                model.setValueAt(rs.getString(1), i, 0);
                model.setValueAt(rs.getString(2), i, 1);
                i++;
            }
            //jTextField2.setText(""+i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new DT().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            new KNN().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(KNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
