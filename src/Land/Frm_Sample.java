package Land;

import com.sun.awt.AWTUtilities;

public class Frm_Sample extends javax.swing.JFrame {

    public Frm_Sample() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        SidePanel.setVisible(false);
//        P1_1.setVisible(false);
//        jPanel1.setVisible(true);
//        P1_2.setVisible(true);
//        P1_3.setVisible(false);
//        P1_3_1.setVisible(false);
//        P1_3_2.setVisible(false);
//        P1_3_3.setVisible(false);
//        P1_1_1.setVisible(false);
//        P1_1_2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new ImagePanelOne();
        SidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setOpaque(false);
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/white.png"))); // NOI18N
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 0, 120, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/b1.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/b2.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
        });
        SidePanel.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, 130, 80));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/home1.png"))); // NOI18N
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/home2.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
        });
        SidePanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 307, 130, 80));

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/cancel1.png"))); // NOI18N
        Cancel.setBorderPainted(false);
        Cancel.setContentAreaFilled(false);
        Cancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Land/Images/cancel2.png"))); // NOI18N
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
        });
        SidePanel.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 130, 70));

        jPanel1.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 140, 710));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 140, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        SidePanel.setVisible(true);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        SidePanel.setVisible(false);
    }//GEN-LAST:event_jButton1MouseExited
        
    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        SidePanel.setVisible(true);
    }//GEN-LAST:event_BackMouseEntered

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        SidePanel.setVisible(true);
    }//GEN-LAST:event_HomeMouseEntered

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        SidePanel.setVisible(true);
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        SidePanel.setVisible(false);
    }//GEN-LAST:event_CancelMouseExited

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        SidePanel.setVisible(false);
    }//GEN-LAST:event_HomeMouseExited

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        SidePanel.setVisible(false);
    }//GEN-LAST:event_BackMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Sample().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Home;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
