/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mylibsys.libsystem.ui;

import com.mylibsys.libsystem.utils.DateTimeRanDomID;
import com.mylibsys.libsystem.dao.phieuMuonCTDao;
import com.mylibsys.libsystem.dao.phieuTraDao;
import com.mylibsys.libsystem.entity.phieuMuonChiTiet;
import com.mylibsys.libsystem.entity.phieuTra;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.time.LocalDate;

/**
 *
 * @author kuteb
 */
public class phieuTraUI extends javax.swing.JPanel {

    lichSuXoaPtraUi ptralsx = new lichSuXoaPtraUi();

//    boolean sua = false;
//    int thanhtien1;
//    phieuMuonDao pmd = new phieuMuonDao();
    phieuTraDao pt = new phieuTraDao();
//    phieuTra phieuTra = new phieuTra();

    private DefaultTableModel tblModel;

    /**
     * Creates new form formTra
     */
    public phieuTraUI() {
        initComponents();
        inittables();
        fillDataTable();
        fillCbb();
        lblPT.requestFocus();
        txtTim.setText("Nhập Mã Phiếu Trả Để Tìm");
    }

    public void inittables() {
        tblModel = new DefaultTableModel();
        String[] colum = new String[]{"Mã Phiếu Trả", "Mã PMCT", "Ngày Trả", "Tiền Phạt", "Ghi Chú"};
        tblModel.setColumnIdentifiers(colum);
        tblPhieuTra.setModel(tblModel);
    }

    public void fillDataTable() {
        List<phieuTra> list = new phieuTraDao().selectAllBySql();
        for (phieuTra pt1 : list) {
            tblModel.addRow(new String[]{pt1.getMaPhieuTra(), pt1.getMaPmct(), pt1.getNgayTra(), String.valueOf(pt1.getTienPhat()), pt1.getGhiChu()});
        }
    }

    public void fillDataTableLoc(List<phieuTra> list) {

        for (phieuTra pt1 : list) {
            tblModel.addRow(new String[]{pt1.getMaPhieuTra(), pt1.getMaPmct(), pt1.getNgayTra(), String.valueOf(pt1.getTienPhat()), pt1.getGhiChu()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuTra = new javax.swing.JTable();
        txtTienPhat = new javax.swing.JTextField();
        txtSoNgayMuon = new javax.swing.JTextField();
        txtMaPT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        dateTra = new com.toedter.calendar.JDateChooser();
        lblPT = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbbPMCT = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtSoSachDaMUon = new javax.swing.JTextField();
        settiencocdt = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        panelShow = new javax.swing.JPanel();
        btnLuuPhieuSua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbbLoaiTim = new javax.swing.JComboBox<>();
        txtTenSach = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(737, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(737, 450));

        tblPhieuTra.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPhieuTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPhieuTraMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieuTra);

        txtTienPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienPhatActionPerformed(evt);
            }
        });

        txtSoNgayMuon.setBackground(new java.awt.Color(153, 153, 153));
        txtSoNgayMuon.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSoNgayMuon.setForeground(new java.awt.Color(102, 102, 102));
        txtSoNgayMuon.setEnabled(false);

        txtMaPT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaPT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaPT.setEnabled(false);

        jLabel3.setText("TIền Phạt :");

        jLabel4.setText("Ngày Trả :");

        jLabel6.setText("Mã Phiếu Trả Theo Bảng :");

        jLabel7.setText("Mã Phiếu Mượn Chi Tiết :");

        btnSua.setBackground(new java.awt.Color(254, 231, 197));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(254, 231, 197));
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(254, 231, 197));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        dateTra.setDateFormatString("dd-MM-yyyy");

        lblPT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPT.setText("Phiếu Trả");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        jLabel8.setText("Ghi Chú :");

        reset.setBackground(new java.awt.Color(254, 231, 197));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel5.setText("Số Ngày Mượn:");

        cbbPMCT.setEditable(true);
        cbbPMCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn PMCT" }));

        jLabel1.setText("Số Lượng sách đã mượn :");

        txtSoSachDaMUon.setBackground(new java.awt.Color(153, 153, 153));
        txtSoSachDaMUon.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSoSachDaMUon.setText("Số Lượng Sách Được Mượn Theo PMCT");
        txtSoSachDaMUon.setEnabled(false);

        settiencocdt.setBackground(new java.awt.Color(254, 231, 197));
        settiencocdt.setText("TÌm");
        settiencocdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settiencocdtActionPerformed(evt);
            }
        });

        txtTim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimFocusLost(evt);
            }
        });

        panelShow.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelShowLayout = new javax.swing.GroupLayout(panelShow);
        panelShow.setLayout(panelShowLayout);
        panelShowLayout.setHorizontalGroup(
            panelShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        panelShowLayout.setVerticalGroup(
            panelShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        btnLuuPhieuSua.setBackground(new java.awt.Color(254, 231, 197));
        btnLuuPhieuSua.setText("Lưu P.Sửa");
        btnLuuPhieuSua.setMaximumSize(new java.awt.Dimension(72, 23));
        btnLuuPhieuSua.setMinimumSize(new java.awt.Dimension(72, 23));
        btnLuuPhieuSua.setPreferredSize(new java.awt.Dimension(72, 23));
        btnLuuPhieuSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuPhieuSuaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setText("Tính số ngày mượn ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(254, 231, 197));
        jButton3.setText("Lịch Sử Xoá");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbbLoaiTim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại Tìm", "PMCT Theo SDT chưa có PT", "Tên sách theo mã PMCT", "Mã PT" }));
        cbbLoaiTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiTimActionPerformed(evt);
            }
        });

        txtTenSach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenSach.setText("Tên sách");
        txtTenSach.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenSach.setEnabled(false);

        jButton4.setText("Reset PMCT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btnLuuPhieuSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoSachDaMUon)
                            .addComponent(txtTienPhat)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoNgayMuon)
                            .addComponent(dateTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbPMCT, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenSach))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbLoaiTim, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(settiencocdt)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(lblPT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPT)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(settiencocdt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbLoaiTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(btnSua))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbbPMCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLuuPhieuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtSoNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoSachDaMUon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuPhieuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuPhieuSuaActionPerformed
        if (pt.update(txtMaPT.getText(), parseDate(dateTra.getDate()), Double.parseDouble(txtTienPhat.getText()), txtGhiChu.getText()) == 1) {
            JOptionPane.showMessageDialog(this, "update thanh cong");
        } else {
            JOptionPane.showMessageDialog(this, "update that bai");
        }
        tblModel.setRowCount(0);
        fillDataTable();
        txtMaPT.setEnabled(true);
        cbbPMCT.setEnabled(true);
    }//GEN-LAST:event_btnLuuPhieuSuaActionPerformed

    private void settiencocdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settiencocdtActionPerformed
        if (txtTim.getText().isEmpty() || cbbLoaiTim.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã cần tím !");
            return;
        }

        if (cbbLoaiTim.getSelectedIndex() == 1) {
            if (pt.getPMCTchuaPT(txtTim.getText()) != null) {
                cbbPMCT.removeAllItems();
                for (String ma : pt.getListPMCTchuaPT(txtTim.getText())) {
                    cbbPMCT.addItem(ma);
                }
                cbbPMCT.setSelectedItem(pt.getPMCTchuaPT(txtTim.getText()));
                JOptionPane.showMessageDialog(this, "Đã chọn ra mã PMCT của người dùng này!");

            } else {
                JOptionPane.showMessageDialog(this, "Không Tồn Tại");

            }
        }
        if (cbbLoaiTim.getSelectedIndex() == 2) {
            if (pt.getBookNameByPmcT(txtTim.getText()) != null) {
                txtTenSach.setText(pt.getBookNameByPmcT(txtTim.getText()));
                JOptionPane.showMessageDialog(this, "Đã chọn ra mã PMCT của người dùng này!");

            } else {
                JOptionPane.showMessageDialog(this, "Không Tồn Tại");

            }
        }
        if (cbbLoaiTim.getSelectedIndex() == 3) {
            if (timPT() == null) {
                JOptionPane.showMessageDialog(this, "Không Tồn Tại");

            }

        }
// 


    }//GEN-LAST:event_settiencocdtActionPerformed
    public phieuTra timPT() {
        for (phieuTra ptraS : pt.selectAllBySql()) {
            if (txtTim.getText().equalsIgnoreCase(ptraS.getMaPhieuTra())) {
                txtMaPT.setText(ptraS.getMaPhieuTra());
                cbbPMCT.setSelectedItem(ptraS.getMaPmct());
                txtGhiChu.setText(ptraS.getGhiChu());
                txtMaPT.setText(ptraS.getMaPhieuTra());
                txtSoSachDaMUon.setText(String.valueOf(pt.soLuong(ptraS.getMaPmct())));
                dateTra.setDate(parseStringToDate(ptraS.getNgayTra()));
                txtSoNgayMuon.setText(String.valueOf(pt.soNgayMuon((String) cbbPMCT.getSelectedItem(), parseDateEnd(ptraS.getNgayTra()))));
                txtTienPhat.setText(String.valueOf(parseInt(ptraS.getTienPhat())));
                txtTenSach.setText(pt.getBookNameByPmcT(ptraS.getMaPmct()));

                JOptionPane.showMessageDialog(this, "Đã Tìm Thấy !");
                return ptraS;
            }

        }
        return null;
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (Integer.parseInt(txtSoNgayMuon.getText()) > 20) {
            int a = JOptionPane.showConfirmDialog(this, "Số ngày mượn lớn hơn 20 bạn muốn tiếp tục thêm không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Đã dừng thêm!");
                return;
            }
        }
        try {
            Integer.parseInt(txtTienPhat.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiền phạt là số trong khoảng!");
            return;
        }
        if (Integer.parseInt(txtTienPhat.getText()) < 0 || Integer.parseInt(txtTienPhat.getText()) > 1000000) {
            JOptionPane.showMessageDialog(this, "Tiền phạt là số trong khoảng >0 và nhỏ hơn 1tr!");
            return;

        }

        for (phieuTra ptrane : pt.selectAllBySql()) {
            if (ptrane.getMaPmct().equals(cbbPMCT.getSelectedItem())) {
                JOptionPane.showMessageDialog(this, "PMCT này đã được trả !");
                return;
            }

        }
        if (validateForm() == false) {
            return;
        }

        them();
        pt.setSoLuongSachTang((String) cbbPMCT.getSelectedItem());

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int a = tblPhieuTra.getSelectedRow();
        if (checkTT() == true) {
            if (pt.del((String) tblPhieuTra.getValueAt(a, 0)) == 1) {
                JOptionPane.showMessageDialog(this, "xoá thành công", "Delete phiếu trả", HEIGHT);
                tblModel.setRowCount(0);
                fillDataTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "xoá thất bại do không tồn tại mã PT", "Delete phiếu trả", HEIGHT);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        sua();

    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTienPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhatActionPerformed

    private void tblPhieuTraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuTraMousePressed
        int a = tblPhieuTra.getSelectedRow();
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy"); // định dạng của ngày tháng
        String dateString1 = (String) tblModel.getValueAt(a, 2); // lấy giá trị trả về từ bảng ở dòng thứ a, cột thứ 4
        Date date1 = null;
        try {
            date1 = formatter1.parse(dateString1); // chuyển đổi chuỗi thành đối tượng Date
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dateTra.setDate(date1);
        updateUI();
        Date selectedDate = dateTra.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        txtTenSach.setText(pt.getBookNameByPmcT((String) tblPhieuTra.getValueAt(a, 1)));

        txtMaPT.setText((String) tblModel.getValueAt(a, 0));
        cbbPMCT.setSelectedItem((String) tblModel.getValueAt(a, 1));
        txtTienPhat.setText((String) tblModel.getValueAt(a, 3));
        txtGhiChu.setText((String) tblModel.getValueAt(a, 4));
        txtSoNgayMuon.setText(String.valueOf(pt.soNgayMuon((String) cbbPMCT.getSelectedItem(), formattedDate)));
        txtSoSachDaMUon.setText(String.valueOf(pt.soLuong((String) cbbPMCT.getSelectedItem())));
    }//GEN-LAST:event_tblPhieuTraMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtSoNgayMuon.setText(String.valueOf(pt.soNgayMuon(cbbPMCT.getSelectedItem().toString(), parseDate(dateTra.getDate()))));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ptralsx.setVisible(true);
        ptralsx.setDefaultCloseOperation(ptralsx.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusGained
        if (txtTim.getText().equals("") || txtTim.getText().equals("Nhập Mã Phiếu Trả Để Tìm")) {
            txtTim.setText("");

        }
    }//GEN-LAST:event_txtTimFocusGained

    private void txtTimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusLost
        if (txtTim.getText().equals("")) {
            txtTim.setText("Nhập Mã Phiếu Trả Để Tìm");

        }
    }//GEN-LAST:event_txtTimFocusLost

    private void cbbLoaiTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLoaiTimActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        fillCbb();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLuuPhieuSua;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbLoaiTim;
    private javax.swing.JComboBox<String> cbbPMCT;
    private com.toedter.calendar.JDateChooser dateTra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPT;
    private javax.swing.JPanel panelShow;
    private javax.swing.JButton reset;
    private javax.swing.JButton settiencocdt;
    private javax.swing.JTable tblPhieuTra;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtMaPT;
    private javax.swing.JTextField txtSoNgayMuon;
    private javax.swing.JTextField txtSoSachDaMUon;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTienPhat;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables

    public void fillCbb() {
        for (phieuMuonChiTiet pm : new phieuMuonCTDao().selectBySql()) {
            cbbPMCT.addItem(pm.getMaPmct());
        }

    }

    public void them() {
        DateTimeRanDomID dt = new DateTimeRanDomID();

        String value = null;
        try {
            phieuTra ptAdd = new phieuTra();
            ptAdd.setMaPmct((String) cbbPMCT.getSelectedItem());
            ptAdd.setMaPhieuTra("PT" + dt.generateUniqueRandomCode());
            Date selectedDate = dateTra.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            ptAdd.setNgayTra(formattedDate);
            ptAdd.setTienPhat((int) Double.parseDouble(txtTienPhat.getText()));
            ptAdd.setGhiChu(txtGhiChu.getText());
            if (pt.them(ptAdd) == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công !");
                tblModel.setRowCount(0);
                fillDataTable();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại !");

            }
        } catch (Exception e) {
        }

    }

    public boolean checkTT() {
        boolean check = false;
        for (phieuTra ptra : pt.selectAllBySql()) {
            if (ptra.getMaPhieuTra().equals(txtMaPT.getText())) {
                check = true;
                return check;
            }
        }
        return check;
    }

    public void reset() {
        txtGhiChu.setText("");
        txtMaPT.setText("");
        txtSoNgayMuon.setText("");
        txtSoSachDaMUon.setText("Số Lượng Sách Được Mượn Theo PMCT");
        txtTienPhat.setText("0");
        dateTra.setDate(null);
        cbbPMCT.setSelectedIndex(0);
        tblModel.setRowCount(0);
        fillDataTable();
    }

    public boolean sua() {
        boolean check = false;
        int b = tblPhieuTra.getSelectedRow();
        if (b == -1) {
            JOptionPane.showMessageDialog(panelShow, "Bạn Chưa chọn Dòng Sửa");
            return false;
        }
        String a = txtMaPT.getText();
//        String a = JOptionPane.showInputDialog(panelShow, "Nhập mã phiếu trả để sửa");
//        if (a == null) {
//            return false;
//        }
        for (phieuTra ptraS : pt.selectAllBySql()) {
            if (a.equalsIgnoreCase(ptraS.getMaPhieuTra())) {
                JOptionPane.showMessageDialog(panelShow, "Bạn chỉ được sửa tiền phạt,ngày trả và ghi chú ! " + ptraS.getMaPhieuTra());
                txtMaPT.setText(ptraS.getMaPhieuTra());
                cbbPMCT.setSelectedItem(ptraS.getMaPmct());
                txtGhiChu.setText(ptraS.getGhiChu());
                txtMaPT.setText(ptraS.getMaPhieuTra());
                dateTra.setDate(parseStringToDate(ptraS.getNgayTra()));
                txtSoNgayMuon.setText(String.valueOf(pt.soNgayMuon((String) cbbPMCT.getSelectedItem(), parseDateEnd(ptraS.getNgayTra()))));
                txtTienPhat.setText(String.valueOf(parseInt(ptraS.getTienPhat())));
                check = true;
                break;
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(panelShow, "Không tồn tại!");
            check = false;
        }
        return check;
    }

    public String parseDateEnd(String date) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = inputFormat.parse(date);
            String outputDate = outputFormat.format(parsedDate);
            return outputDate;
        } catch (ParseException e) {
//            System.out.println("ParseException: " + e.getMessage());
            return null;
        }
    }

    public Date parseStringToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = formatter.parse(dateString);
            return date;
        } catch (ParseException e) {
//            System.out.println("ParseException: " + e.getMessage());
            return null;
        }
    }

    public String parseDate(Date selectedDate) {
//        Date selectedDate = dateTra.getDate();
        String formattedDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            formattedDate = dateFormat.format(selectedDate);
        } catch (Exception e) {
        }
        return formattedDate;
    }

    public String parseDateYYYY(Date selectedDate) {
//        Date selectedDate = dateTra.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        return formattedDate;
    }

    public void setForground() {
        txtGhiChu.setForeground(Color.red);
//        txtThanhTien.setForeground(Color.red);
        txtSoNgayMuon.setForeground(Color.red);
        txtSoSachDaMUon.setForeground(Color.red);

    }

//    public void thanhTien2() {
//        result = pt.tinhTienCoc((String) cbbPMCT.getSelectedItem());
//        tienCoc = (Double) result[0];
//        maND1 = (String) result[1];
////        txtSoNgayMuon.setText(String.valueOf(pt.soNgayMuon((String) cbbPMCT.getSelectedItem(), parseDate(dateTra.getDate()))));
//        txtSoSachDaMUon.setText(String.valueOf(pt.soLuong((String) cbbPMCT.getSelectedItem())));
////        txtThanhTien.setText(txtSoSachDaMUon.getText() + "*" + txtSoNgayMuon.getText() + "*1000=" + String.valueOf(pt.thanhTien((String) cbbPMCT.getSelectedItem(), parseDate(dateTra.getDate()), pt.soLuong((String) cbbPMCT.getSelectedItem()))) + " VND");
////        setTienCocConLai = Double.valueOf(String.valueOf(tienCoc - Double.valueOf(txtTienPhat.getText())));
////        txtGhiChu.setText("Tiền cọc sau khi trừ tiền phạt của bạn là: " + String.valueOf(tienCoc - Double.valueOf(txtTienPhat.getText())));
//        setForground();
//
//    }
    public int SubString(String s) {
        int index = s.indexOf("=") + 1; // tìm vị trí của dấu bằng và thêm 1 để lấy ký tự tiếp theo
        int endIndex = s.indexOf(" "); // tìm vị trí của dấu cách
        String subString = s.substring(index, endIndex); // lấy chuỗi con từ vị trí index đến vị trí endIndex
        int tien = Integer.parseInt(subString);
//        System.out.println(tien);
        return tien;
    }

    public int parseInt(double s) {
//        double d = 3.14;
        int i = (int) s;
        return i;
    }

    public String inANHD() {
        String a = pt.getTenNguoiDungByMaPhieuTra(txtMaPT.getText());
        return a;

    }

    public boolean validateForm() {
        String regexMa = "PT\\d+";
//
//        if (txtMaPT.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Không được để trắng mã phiếu");
//            return false;
//        }

        if (cbbPMCT.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Chọn mã phiếu chi tiết !");
            return false;
        }

        if (dateTra.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày trả chưa được chọn !");
            return false;
        }

//        if (txtThanhTien.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Bạn chưa tính tiền cho phiếu trả");
//            return false;
//        }
//        if (txtMaPT.getText().matches(regexMa) == false) {
//            JOptionPane.showMessageDialog(this, "Mã PMCT có dạng: PT01(PT+số)");
//            return false;
//        }
        return true;

    }

    public void inHoaDon() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int userSelection = fileChooser.showDialog(panelShow, "Lưu");
        String fileName = JOptionPane.showInputDialog(panelShow, "Tên File");
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            try {
                String filePath1 = System.getProperty("user.dir") + "/src/main/resources/HDMAU.docx";
                FileInputStream file = new FileInputStream(new File(filePath1));
                try ( XWPFDocument document = new XWPFDocument(file)) {
                    // Tìm và thay thế giá trị trong tài liệu
                    for (XWPFParagraph p : document.getParagraphs()) {
                        List<XWPFRun> runs = p.getRuns();
                        if (runs != null) {
                            for (XWPFRun r : runs) {
                                String text = r.getText(0);
                                if (text != null && text.contains("Name")) {
                                    text = text.replace("Name", inANHD());
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("date")) {
                                    text = text.replace("date", LocalDate.now().toString());
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("Phat")) {
                                    text = text.replace("Phat", txtTienPhat.getText());
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("Coc")) {
                                    text = text.replace("Coc", txtGhiChu.getText());
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("Muon")) {
                                    text = text.replace("Muon", txtTienPhat.getText());
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("cocconlai")) {
                                    text = text.replace("cocconlai", txtGhiChu.getText());
                                    r.setText(text, 0);
                                }
                            }
                        }
                    }

                    try ( FileOutputStream out = new FileOutputStream(new File(filePath + "\\" + fileName + ".docx"))) {
                        document.write(out);
                        out.flush();
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "in thất bại!");
            }
        }

    }
}
