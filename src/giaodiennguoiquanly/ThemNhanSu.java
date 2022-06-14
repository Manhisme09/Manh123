/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giaodiennguoiquanly;

import controller.CanBoController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CanBo;

/**
 *
 * @author manht
 */
public class ThemNhanSu extends javax.swing.JFrame {

    /**
     * Creates new form ThemNhanSu
     */
    public ThemNhanSu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        cBox_namsinh = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rad_nam = new javax.swing.JRadioButton();
        rad_nu = new javax.swing.JRadioButton();
        txt_hoten = new javax.swing.JTextField();
        rad_congnhan = new javax.swing.JRadioButton();
        rad_kysu = new javax.swing.JRadioButton();
        rad_nhanvien = new javax.swing.JRadioButton();
        txt_congviec = new javax.swing.JTextField();
        txt_bac = new javax.swing.JTextField();
        txt_nganhdaotao = new javax.swing.JTextField();
        chkBox_Admin = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ NHÂN SỰ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thêm nhân sự");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("UserName");

        txt_diachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diachiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        cBox_namsinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cBox_namsinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", " " }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Năm sinh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giới tính");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Chức vụ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Bậc (*Công nhân)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ngành đào tạo (*Kỹ sư)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Công việc (*Nhân viên)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cấp quyền Admin");

        buttonGroup1.add(rad_nam);
        rad_nam.setText("Nam");

        buttonGroup1.add(rad_nu);
        rad_nu.setText("Nữ");

        txt_hoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hotenActionPerformed(evt);
            }
        });

        buttonGroup2.add(rad_congnhan);
        rad_congnhan.setText("Công nhân");
        rad_congnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_congnhanActionPerformed(evt);
            }
        });

        buttonGroup2.add(rad_kysu);
        rad_kysu.setText("Kỹ sư");
        rad_kysu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_kysuActionPerformed(evt);
            }
        });

        buttonGroup2.add(rad_nhanvien);
        rad_nhanvien.setText("Nhân viên");
        rad_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_nhanvienActionPerformed(evt);
            }
        });

        txt_congviec.setEnabled(false);
        txt_congviec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_congviecActionPerformed(evt);
            }
        });

        txt_bac.setEnabled(false);
        txt_bac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bacActionPerformed(evt);
            }
        });

        txt_nganhdaotao.setEnabled(false);
        txt_nganhdaotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nganhdaotaoActionPerformed(evt);
            }
        });

        chkBox_Admin.setText("Yes");

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBox_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rad_nam)
                                .addGap(54, 54, 54)
                                .addComponent(rad_nu))
                            .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rad_congnhan)
                                .addGap(29, 29, 29)
                                .addComponent(rad_kysu))
                            .addComponent(rad_nhanvien)
                            .addComponent(txt_congviec, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nganhdaotao, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bac, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkBox_Admin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jButton1)
                        .addGap(106, 106, 106)
                        .addComponent(jButton2)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBox_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rad_nam)
                    .addComponent(rad_nu))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rad_congnhan)
                    .addComponent(rad_kysu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rad_nhanvien)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_bac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_nganhdaotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_congviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(chkBox_Admin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_diachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diachiActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_hotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hotenActionPerformed

    private void txt_congviecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_congviecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_congviecActionPerformed

    private void txt_bacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bacActionPerformed

    private void txt_nganhdaotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nganhdaotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nganhdaotaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Swing Tester");
        int result = JOptionPane.showConfirmDialog(frame,
                        "Bạn có chắc muốn thoát",
                        "Xác nhận",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    this.setVisible(false);
                    new MainForm().setVisible(true);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String gt = "", mt = "",cv = "";
        int isAdmin = 0;
        if(rad_nam.isSelected() == true){
            gt = "Nam";
        }else{
            gt = "Nữ";
        }
        if(rad_congnhan.isSelected() == true){            
            cv = "Công nhân";
            mt = "Bậc" + txt_bac.getText();          
        }
        if(rad_kysu.isSelected() == true){           
            cv = "Kỹ sư";
            mt = txt_nganhdaotao.getText();           
        }
        if(rad_nhanvien.isSelected() == true){           
            cv = "Nhân viên";
            mt = txt_congviec.getText();           
        }
        if(chkBox_Admin.isSelected() == true){
            isAdmin = 1;
        }else{
            isAdmin = 0;
        }
        CanBo cbAdd = new CanBo();
        try{
            if(CanBoController.checkUsername(txt_username.getText()) == 1){
                JOptionPane.showMessageDialog(rootPane,"Username đã tồn tại");
            }else{
                
                cbAdd.setHoTen(txt_hoten.getText());
                cbAdd.setNamSinh(cBox_namsinh.getSelectedItem().toString());
                cbAdd.setGioiTinh(gt);
                cbAdd.setDiaChi(txt_diachi.getText());
                cbAdd.setChucVu(cv);
                cbAdd.setMoTa(mt);
                cbAdd.setUsername(txt_username.getText());
                cbAdd.setPassword(txt_password.getText());
                cbAdd.setIsAdmin(isAdmin);    
                
                
                if(CanBoController.addPerson(cbAdd) > 0){
                    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                    JOptionPane.showMessageDialog(frame,
                    "Thêm thông tin thành công",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
                    txt_username.setText("");
                    txt_hoten.setText("");
                    txt_diachi.setText("");
                    txt_password.setText("");
                    txt_congviec.setText("");
                    txt_nganhdaotao.setText("");
                    txt_bac.setText("");
                    rad_nam.setSelected(false);
                    rad_nu.setSelected(false);                      
                    chkBox_Admin.setSelected(false);
                    rad_kysu.setSelected(false);
                    rad_nhanvien.setSelected(false);
                    rad_congnhan.setSelected(false);        
                    this.setVisible(false);
                    new MainForm().setVisible(true);                  
                }else{
                    JOptionPane.showMessageDialog(this,"Không thành công vui lòng thử lại",
                            "Thông Báo",JOptionPane.OK_CANCEL_OPTION);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rad_congnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_congnhanActionPerformed
        // TODO add your handling code here:
        txt_bac.enable(true);
        txt_nganhdaotao.enable(false);
        txt_congviec.enable(false);
    }//GEN-LAST:event_rad_congnhanActionPerformed

    private void rad_kysuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_kysuActionPerformed
        // TODO add your handling code here:
        txt_nganhdaotao.enable(true);
        txt_bac.enable(false);
        txt_congviec.enable(false);
    }//GEN-LAST:event_rad_kysuActionPerformed

    private void rad_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_nhanvienActionPerformed
        // TODO add your handling code here:
        txt_congviec.enable(true);
        txt_bac.enable(false);
        txt_nganhdaotao.enable(false);
    }//GEN-LAST:event_rad_nhanvienActionPerformed

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
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemNhanSu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cBox_namsinh;
    private javax.swing.JCheckBox chkBox_Admin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rad_congnhan;
    private javax.swing.JRadioButton rad_kysu;
    private javax.swing.JRadioButton rad_nam;
    private javax.swing.JRadioButton rad_nhanvien;
    private javax.swing.JRadioButton rad_nu;
    private javax.swing.JTextField txt_bac;
    private javax.swing.JTextField txt_congviec;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_nganhdaotao;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}