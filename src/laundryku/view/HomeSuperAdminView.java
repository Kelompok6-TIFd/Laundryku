/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryku.view;


import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import laundryku.controller.HomeSuperAdminController;
import laundryku.controller.LoginController;
import laundryku.helper.DBConnection;
import laundryku.model.Admin;
import laundryku.model.HomeSuperAdminModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sulthonul Adib
 */
public class HomeSuperAdminView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    
    HomeSuperAdminModel model;
    HomeSuperAdminController controller;
    
    public HomeSuperAdminView() {
        initComponents();
    }

    public JLabel getLabelHi() {
        return labelHi;
    }

    public void setLabelHi(String labelHi) {
        this.labelHi.setText("Selamat Datang " + labelHi);
    }

    /*
    public JButton getBtnDataAdmin() {
    return btnDataAdmin;
    }
    public JButton getBtnDataTransaksi() {
    return btnDataTransaksi;
    } */
    
    public JTable getTableAdmin() {
        return tableAdmin;
    }
    
    public JTable getTableTransaksi() {
        return tableTransaksi;
    }
    
    public JTable getTablePelanggan() {
        return tablePelanggan;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }
    
    public JButton getBtnTambah() {
        return btnTambahAdmin;
    }
    
//    public JButton getBtnEdit() {
//        return btnEditAdmin;
//    }
//    
//    public JButton getBtnDelete() {
//        return btnDeleteAdmin;
//    }
    
    public void addActionListener(HomeSuperAdminController aThis) {
        btnLogout.addActionListener(aThis);
        btnTambahAdmin.addActionListener(aThis);
//        btnEditAdmin.addActionListener(aThis);
//        btnDeleteAdmin.addActionListener(aThis);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAdmin = new javax.swing.JTable();
        btnTambahAdmin = new javax.swing.JButton();
        btnDeleteAdmin = new javax.swing.JButton();
        btnEditAdmin = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePelanggan = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        labelHi.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        labelHi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHi.setText("Hi, Admin");

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAdmin);

        btnTambahAdmin.setText("TAMBAH ADMIN");
        btnTambahAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAdminActionPerformed(evt);
            }
        });

        btnDeleteAdmin.setText("DELETE ADMIN");
        btnDeleteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAdminActionPerformed(evt);
            }
        });

        btnEditAdmin.setText("EDIT ADMIN");
        btnEditAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTambahAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditAdmin)
                        .addGap(4, 4, 4)
                        .addComponent(btnDeleteAdmin)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahAdmin)
                    .addComponent(btnDeleteAdmin)
                    .addComponent(btnEditAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Admin", jPanel1);

        tablePelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablePelanggan);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Pelanggan", jPanel5);

        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableTransaksi);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Transaksi", jPanel6);

        Print.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Print.setText("PRINT");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelHi, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout)
                    .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEditAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAdminActionPerformed

    private void btnTambahAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahAdminActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        Connection con;
        DBConnection conn = new DBConnection();
        con = conn.getKoneksi();
        
        JasperReport jr;
        
        String fileAllAdmin = "./src/laundryku/report/AllAdmin.jrxml";
        String fileAllCustomer = "./src/laundryku/report/AllCustomer.jrxml";
        String fileAllTransaksi = "./src/laundryku/report/AllTransaksi.jrxml";
        if (jTabbedPane1.getSelectedIndex() == 0) {
           try {
               jr = JasperCompileManager.compileReport(fileAllAdmin);
               JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
               JasperViewer.viewReport(jp, false);
           } catch (JRException e) {
               Logger.getLogger(HomeSuperAdminView.class.getName()).log(Level.SEVERE, null, e);
           }
        } else if (jTabbedPane1.getSelectedIndex() == 1) {
                       try {
               jr = JasperCompileManager.compileReport(fileAllCustomer);
               JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
               JasperViewer.viewReport(jp, false);
           } catch (JRException e) {
               Logger.getLogger(HomeSuperAdminView.class.getName()).log(Level.SEVERE, null, e);
           }
        } else if (jTabbedPane1.getSelectedIndex() == 2) {
                       try {
               jr = JasperCompileManager.compileReport(fileAllTransaksi);
               JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
               JasperViewer.viewReport(jp, false);
           } catch (JRException e) {
               Logger.getLogger(HomeSuperAdminView.class.getName()).log(Level.SEVERE, null, e);
           }
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void btnDeleteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAdminActionPerformed
        // TODO add your handling code here:
        Connection con;
        DBConnection conn = new DBConnection();
        con = conn.getKoneksi();
        
        int selectedRow = this.getTableAdmin().getSelectedRow();
        String username;
        
//        System.out.println(username);
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih admin yang akan di hapus terlebih dahulu",
                "Error", JOptionPane.WARNING_MESSAGE);
//            System.out.println(username);
            
        } else  {
            username = this.getTableAdmin().getModel().getValueAt(selectedRow, 1).toString();
            try {
                String query = "DELETE from tb_admin "+ " where username = '" + username + "'";
                System.out.println(query);
                Statement s = con.createStatement();
                s.execute(query);
                JOptionPane.showMessageDialog(this, "Admin berhasil di hapus",
                        "Sukses", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel newModel = (DefaultTableModel)this.getTableAdmin().getModel();
                newModel.removeRow(selectedRow);
                
            } catch (SQLException se) {
//                Logger.getLogger(HomeSuperAdminModel.class.getName()).log(Level.SEVERE, null, se);
                System.out.println(se);
            }
        }
    }//GEN-LAST:event_btnDeleteAdminActionPerformed

    /**
     * @param args the command line arguments
     */

    public DefaultTableModel showDataAdmin() {
        ArrayList<Admin> dafAdmin = model.loadDataAdmin();
        String kolom[] = {"No.", "Username", "Nama", "Alamat", 
            "No. Telp", "Jenis Kelamin", "Role"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
              }
        };
        for (int i = 0; i < dafAdmin.size(); i++) {
            String no = Integer.toString((i+1));
            String username = dafAdmin.get(i).getUsername();
            String nama = dafAdmin.get(i).getNama();
            String alamat = dafAdmin.get(i).getAlamat();
            String noTelp = dafAdmin.get(i).getNoTelp();
            String jk = dafAdmin.get(i).getJenisKelamin();
            String role;
            if (dafAdmin.get(i).getRole().equals("1"))
                role = "Super Admin";
            else
                role = "Admin";
            String data[] = {no,username,nama,alamat,noTelp,jk,role};
            dtm.addRow(data);
        }
        return dtm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JButton btnDeleteAdmin;
    private javax.swing.JButton btnEditAdmin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambahAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelHi;
    private javax.swing.JTable tableAdmin;
    private javax.swing.JTable tablePelanggan;
    private javax.swing.JTable tableTransaksi;
    // End of variables declaration//GEN-END:variables
}
