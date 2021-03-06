package Land;

import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gihan
 */
public class FinalDocuments extends javax.swing.JFrame {

    /**
     * Creates new form FinalDocuments
     */
    public FinalDocuments() {
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

        jLabel1 = new javax.swing.JLabel();
        P1_3_Per_1 = new javax.swing.JPanel();
        P1_3_Per_1_L1 = new javax.swing.JLabel();
        P1_3_Per_1_L2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Final Documents");

        P1_3_Per_1.setBackground(new java.awt.Color(66, 36, 132));

        P1_3_Per_1_L1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        P1_3_Per_1_L1.setForeground(new java.awt.Color(204, 204, 204));
        P1_3_Per_1_L1.setText("Plan No");

        P1_3_Per_1_L2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        P1_3_Per_1_L2.setForeground(new java.awt.Color(204, 204, 204));
        P1_3_Per_1_L2.setText("Name of the Land");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("G.N. Divition");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("District");

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t5KeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("D.S. Divition");

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t4KeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout P1_3_Per_1Layout = new javax.swing.GroupLayout(P1_3_Per_1);
        P1_3_Per_1.setLayout(P1_3_Per_1Layout);
        P1_3_Per_1Layout.setHorizontalGroup(
            P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1_3_Per_1Layout.createSequentialGroup()
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1_3_Per_1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1_3_Per_1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P1_3_Per_1_L1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P1_3_Per_1_L2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(40, 40, 40)
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t4)
                    .addComponent(t5)
                    .addComponent(jComboBox2, 0, 300, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        P1_3_Per_1Layout.setVerticalGroup(
            P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1_3_Per_1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1_3_Per_1_L1))
                .addGap(18, 18, 18)
                .addGroup(P1_3_Per_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1_3_Per_1_L2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/attach doc1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/attach doc2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setBounds(0, 0, 290, 150);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/Black.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBounds(20, 20, 260, 120);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(P1_3_Per_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(P1_3_Per_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyPressed
        
    }//GEN-LAST:event_t5KeyPressed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            t5.grabFocus();
        }
    }//GEN-LAST:event_t4KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            Std_image = bos.toByteArray();

            myimg = new ImageIcon(Std_image);
            jLabel2.setIcon(myimg);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        try {
            Statement st=DB.getconnection().createStatement();

            st.executeUpdate("INSERT INTO final_documents VALUES ('"+t4.getText()+"','"+Std_image+"')");

            t4.setText(null);
            t5.setText(null);
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FinalDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalDocuments().setVisible(true);
            }
        });
    }
    private ImageIcon myimg = null;
    String filename = null;
    byte[] Std_image = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P1_3_Per_1;
    private javax.swing.JLabel P1_3_Per_1_L1;
    private javax.swing.JLabel P1_3_Per_1_L2;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
