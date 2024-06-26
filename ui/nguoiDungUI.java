/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mylibsys.libsystem.ui;

import com.mylibsys.libsystem.dao.nguoiDungDao;
import com.mylibsys.libsystem.entity.NguoiDung;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kuteb
 */
public class nguoiDungUI extends javax.swing.JPanel {

    nguoiDungDao us = new nguoiDungDao();
    DefaultTableModel model;
    JFrame fr = new JFrame();

    /**
     * Creates new form nguoiDung
     */
    public nguoiDungUI() {
        initComponents();
        inittable();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        borderApp1 = new com.mylibsys.libsystem.ui.borderApp();
        txtND = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaND = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMaTK = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnRecycle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiDung = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Người Dùng");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        borderApp1.setBackground(new java.awt.Color(0, 204, 204));

        btnTimKiem.setBackground(new java.awt.Color(254, 231, 197));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tên ND :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Địa chỉ : ");

        javax.swing.GroupLayout borderApp1Layout = new javax.swing.GroupLayout(borderApp1);
        borderApp1.setLayout(borderApp1Layout);
        borderApp1Layout.setHorizontalGroup(
            borderApp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderApp1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtND, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnTimKiem)
                .addGap(18, 18, 18))
        );
        borderApp1Layout.setVerticalGroup(
            borderApp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderApp1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(borderApp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        add(borderApp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 590, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Người Dùng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã ND :");

        txtMaND.setEnabled(false);
        txtMaND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Họ Tên :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("SDT :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Địa Chỉ :");

        txtEmail.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã TK : ");

        txtMaTK.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaND, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 595, -1));

        btnDelete.setBackground(new java.awt.Color(254, 231, 197));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 30));

        btnRecycle.setBackground(new java.awt.Color(254, 231, 197));
        btnRecycle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRecycle.setText("Recycle Bin");
        btnRecycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecycleActionPerformed(evt);
            }
        });
        add(btnRecycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Thành Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblNguoiDung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNguoiDungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNguoiDung);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 840, 210));

        btnUpdate.setBackground(new java.awt.Color(254, 231, 197));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 30));

        jButton1.setBackground(new java.awt.Color(254, 231, 197));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Update MK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        btnReset.setBackground(new java.awt.Color(254, 231, 197));
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNDActionPerformed

    private void tblNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiDungMouseClicked
        // TODO add your handling code here:
        int row = tblNguoiDung.getSelectedRow();
        String maND = tblNguoiDung.getValueAt(row, 0).toString();
        NguoiDung nd = us.findbyMa(maND);
        ClickFill(nd);
    }//GEN-LAST:event_tblNguoiDungMouseClicked

    private void btnRecycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecycleActionPerformed
        // TODO add your handling code here:
        JPanel jp = new ThungRacND_UI();
        JDialog dialog = new JDialog();
        dialog.add(jp);
        dialog.setSize(900, 600);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnRecycleActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        if (txtND.getText().trim().equals("") && txtDC.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thông tin!");
        } else {
           
            fillToTableByName();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            if (us.findbyMa(txtMaND.getText()) == null) {
                JOptionPane.showMessageDialog(this, "Không tồn tại mã ND ");
                return;
            }
//            if (us.findbyEmail(txtEmail.getText()) != null) {
//                JOptionPane.showMessageDialog(this, "Đã tồn tại email , vui lòng nhập mail khác !");
//                return;
//            }
            try {
                NguoiDung nd = getModel();
                int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn cập nhật người dùng này", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    if (us.update(nd) > 0) {
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                        fillTable();
                    }
                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(this, "Bạn chọn không!");
                    fillTable();
                } else {
                    JOptionPane.showMessageDialog(this, "không chọn!");
                    fillTable();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtMaND.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã người dùng !");
        } else {
            int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa người dùng này", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (us.delete(txtMaND.getText()) > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa người dùng thành công !");
                    fillTable();
                    reset();
                }
            } else if (result == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Bạn chọn không !");
                fillTable();
            } else {
                JOptionPane.showMessageDialog(this, "Không chọn !");
                fillTable();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
        fillTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JPanel jp = new quenMkUi();
        fr.add(jp);
        fr.setSize(900, 600);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mylibsys.libsystem.ui.borderApp borderApp1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRecycle;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblNguoiDung;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaND;
    private javax.swing.JTextField txtMaTK;
    private javax.swing.JTextField txtND;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
// my code
    public void inittable() {
        model = new DefaultTableModel();
        String[] colums = new String[]{"MaND", "TenND", "SDT", "Email", "DiaChi", "MaTK"};
        model.setColumnIdentifiers(colums);
        tblNguoiDung.setModel(model);
    }

    public void fillTable() {
        model.setRowCount(0);
        for (NguoiDung s : us.getAllND()) {
            Object[] row = new Object[]{s.getMaND(), s.getTenND(), s.getSdt(), s.getEmail(), s.getDiaChi(), s.getMaTK()};
            model.addRow(row);
        }
    }

    public void ClickFill(NguoiDung nd) {
        txtMaND.setText(nd.getMaND());
        txtHoTen.setText(nd.getTenND());
        txtSDT.setText(nd.getSdt());
        txtEmail.setText(nd.getEmail());
        txtDiaChi.setText(nd.getDiaChi());
        txtMaTK.setText(nd.getMaTK());
    }

    public void fillToTableByName() {
        model = (DefaultTableModel) tblNguoiDung.getModel();
        model.setRowCount(0);
        for (NguoiDung nd : us.ListByName(txtND.getText(), txtDC.getText())) {
            Object row[] = new Object[6];
            row[0] = nd.getMaND();
            row[1] = nd.getTenND();
            row[2] = nd.getSdt();
            row[3] = nd.getEmail();
            row[4] = nd.getDiaChi();
            row[5] = nd.getMaTK();
            model.addRow(row);
        }
    }

    public NguoiDung getModel() {
        NguoiDung nd = new NguoiDung();
        nd.setMaND(txtMaND.getText());
        nd.setTenND(txtHoTen.getText());
        nd.setSdt(txtSDT.getText());
        nd.setEmail(txtEmail.getText());
        nd.setDiaChi(txtDiaChi.getText());
        nd.setMaTK(txtMaTK.getText());
        return nd;
    }

    public void reset() {
        txtMaND.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtMaTK.setText("");
        txtND.setText("");
        txtDC.setText("");
    }

    public boolean validateForm() {
        if (txtMaND.getText().equals("") && txtHoTen.getText().equals("") && txtSDT.getText().equals("") && txtDiaChi.getText().equals("")
                && txtEmail.getText().equals("") && txtMaTK.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa có thông tin !");
            txtMaND.requestFocus();
            return false;
        }
        if (txtMaND.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa điền mã người dùng !");
            txtMaND.requestFocus();
            return false;
        }
        if (txtHoTen.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa điền tên người dùng !");
            txtHoTen.requestFocus();
            return false;
        }
        if (txtSDT.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập số điện thoại!");
            txtSDT.requestFocus();
            return false;
        }
        if (txtDiaChi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập vào địa chỉ !");
            txtDiaChi.requestFocus();
            return false;
        }
        if (txtEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập email !");
            txtEmail.requestFocus();
            return false;
        }
        if (txtMaTK.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã TK !");
            txtMaTK.requestFocus();
            return false;
        }

        String sdt = "^0+\\d*[0-9]{9}$";
        String email = "^[A-Za-z0-9._%+]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,}$";
        if (txtSDT.getText().matches(sdt) == false) {
            JOptionPane.showMessageDialog(this, "SĐT sai định dạng !");
            txtSDT.requestFocus();
            return false;

        }
        if (txtEmail.getText().matches(email) == false) {
            JOptionPane.showMessageDialog(this, "Email sai định dạng !");
            txtEmail.requestFocus();
            return false;
        }

        return true;
    }

}
