package ImageEditor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jcc
 */
public class MyInterface extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;
    private BufferedImage OriginalBI;
    String fileName;
    ImageIcon icon, icon2;
    Picture pic, pic2;

    public MyInterface() {
        initComponents();
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("PNG image", "png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        browseButton = new javax.swing.JButton();
        gScalejButton = new javax.swing.JButton();
        rotateLeftButton = new javax.swing.JButton();
        rotate180Button = new javax.swing.JButton();
        rotateRightButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtRedColor = new javax.swing.JTextField();
        txtGreenColor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtBlueColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        btnApplyColors = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        verticalRadioButton = new javax.swing.JRadioButton();
        horizontalRadioButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayLabel.setText("Desplay Area");
        displayLabel.setAlignmentY(0.0F);
        getContentPane().add(displayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 410));

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        gScalejButton.setText("Gray Scale");
        gScalejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gScalejButtonActionPerformed(evt);
            }
        });

        rotateLeftButton.setText("Rotate Left");
        rotateLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateLeftButtonActionPerformed(evt);
            }
        });

        rotate180Button.setText("Rotate 180");
        rotate180Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotate180ButtonActionPerformed(evt);
            }
        });

        rotateRightButton2.setText("Rotate Right");
        rotateRightButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateRightButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(browseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gScalejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotateLeftButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotate180Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotateRightButton2)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(gScalejButton)
                    .addComponent(rotateLeftButton)
                    .addComponent(rotate180Button)
                    .addComponent(rotateRightButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 830, 50));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Red Color");

        txtRedColor.setEditable(false);
        txtRedColor.setBackground(new java.awt.Color(204, 204, 204));
        txtRedColor.setMinimumSize(new java.awt.Dimension(60, 20));
        txtRedColor.setPreferredSize(new java.awt.Dimension(60, 20));
        txtRedColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedColorActionPerformed(evt);
            }
        });

        txtGreenColor.setEditable(false);
        txtGreenColor.setBackground(new java.awt.Color(204, 204, 204));
        txtGreenColor.setText(" ");
        txtGreenColor.setMinimumSize(new java.awt.Dimension(60, 20));
        txtGreenColor.setPreferredSize(new java.awt.Dimension(60, 20));
        txtGreenColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGreenColorActionPerformed(evt);
            }
        });

        jLabel3.setText("Green Color");

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        txtBlueColor.setEditable(false);
        txtBlueColor.setBackground(new java.awt.Color(204, 204, 204));
        txtBlueColor.setMinimumSize(new java.awt.Dimension(60, 20));
        txtBlueColor.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel2.setText("Blue Color");

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        btnApplyColors.setText("Apply Colors");
        btnApplyColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyColorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jCheckBox2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtGreenColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jCheckBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRedColor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBlueColor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnApplyColors))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtRedColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGreenColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtBlueColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnApplyColors))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 180));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        verticalRadioButton.setText("Vertical");
        verticalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticalRadioButtonActionPerformed(evt);
            }
        });

        horizontalRadioButton.setText("Horizontal");
        horizontalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontalRadioButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verticalRadioButton)
                    .addComponent(horizontalRadioButton)
                    .addComponent(jButton1))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horizontalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verticalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 150, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        fileName = FileChooser.pickAFile();
        pic = new Picture(fileName);
        icon = new ImageIcon(pic.getImage());
        displayLabel.setIcon(icon);
    }//GEN-LAST:event_browseButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        txtRedColor.setEditable(true);
        txtRedColor.setBackground(Color.white);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtRedColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedColorActionPerformed

    private void txtGreenColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGreenColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGreenColorActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        txtGreenColor.setEditable(true);
        txtGreenColor.setBackground(Color.white);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        txtBlueColor.setEditable(true);
        txtBlueColor.setBackground(Color.white);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void btnApplyColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyColorsActionPerformed
        int red, blue, green;
        pic2 = new Picture(pic);
        pic2.changeColors(txtRedColor.getColumns(), txtGreenColor.getColumns(), txtBlueColor.getColumns());
        icon = new ImageIcon(pic2.getImage());
        displayLabel.setIcon(icon);
    }//GEN-LAST:event_btnApplyColorsActionPerformed

    private void gScalejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gScalejButtonActionPerformed
        pic2 = new Picture(pic);
        pic2.grayscale();
        icon = new ImageIcon(pic2.getImage());
        displayLabel.setIcon(icon);
    }//GEN-LAST:event_gScalejButtonActionPerformed

    private void rotateLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateLeftButtonActionPerformed
        pic = pic.rotateLeft();
        icon = new ImageIcon(pic.getImage());
        displayLabel.setIcon(icon);
    }//GEN-LAST:event_rotateLeftButtonActionPerformed

    private void rotate180ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotate180ButtonActionPerformed
        pic.rotate180();
        icon = new ImageIcon(pic.getImage());
        displayLabel.setIcon(icon);
    }//GEN-LAST:event_rotate180ButtonActionPerformed

    private void rotateRightButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateRightButton2ActionPerformed
        pic.rotateRight();
        icon = new ImageIcon(pic.getImage());
        displayLabel.setIcon(icon);
    }//GEN-LAST:event_rotateRightButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (horizontalRadioButton.isSelected()) {
            pic = pic.mirrorAllHorizontal();
            icon = new ImageIcon(pic.getImage());
            displayLabel.setIcon(icon);
        } else if (verticalRadioButton.isSelected()) {
            pic = pic.mirrorAllVertical();
            icon = new ImageIcon(pic.getImage());
            displayLabel.setIcon(icon);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void horizontalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontalRadioButtonActionPerformed
        verticalRadioButton.setSelected(false);
    }//GEN-LAST:event_horizontalRadioButtonActionPerformed

    private void verticalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verticalRadioButtonActionPerformed
       horizontalRadioButton.setSelected(false);
    }//GEN-LAST:event_verticalRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton btnApplyColors;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JButton gScalejButton;
    private javax.swing.JRadioButton horizontalRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton rotate180Button;
    private javax.swing.JButton rotateLeftButton;
    private javax.swing.JButton rotateRightButton2;
    private javax.swing.JTextField txtBlueColor;
    private javax.swing.JTextField txtGreenColor;
    private javax.swing.JTextField txtRedColor;
    private javax.swing.JRadioButton verticalRadioButton;
    // End of variables declaration//GEN-END:variables
}