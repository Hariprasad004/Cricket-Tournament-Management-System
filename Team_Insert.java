package miniprjct;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Team_Insert extends javax.swing.JFrame {
    public Team_Insert() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpeg")));
        ConfigureFrame.ConfigureFrame(this,"Team Insert",1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        player = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        team = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1800, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Enter the Player Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(183, 64, 258, 44);

        player.setBackground(new java.awt.Color(255, 153, 153));
        player.setFont(new java.awt.Font("Tahoma", 3, 23)); // NOI18N
        player.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(player);
        player.setBounds(342, 121, 360, 35);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Enter Jersey Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(183, 207, 252, 53);

        jno.setBackground(new java.awt.Color(255, 153, 153));
        jno.setFont(new java.awt.Font("Tahoma", 3, 23)); // NOI18N
        jno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jno);
        jno.setBounds(342, 273, 360, 35);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Enter the Team Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(183, 355, 263, 47);

        team.setBackground(new java.awt.Color(255, 153, 153));
        team.setFont(new java.awt.Font("Tahoma", 3, 23)); // NOI18N
        team.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(team);
        team.setBounds(342, 415, 360, 35);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(235, 496, 220, 41);

        age.setBackground(new java.awt.Color(255, 153, 153));
        age.setFont(new java.awt.Font("Tahoma", 3, 23)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(age);
        age.setBounds(342, 550, 360, 35);

        add.setBackground(new java.awt.Color(255, 255, 0));
        add.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        add.setText("Save");
        add.setBorder(new javax.swing.border.MatteBorder(null));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(267, 668, 112, 51);

        cancel.setBackground(new java.awt.Color(255, 255, 0));
        cancel.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.MatteBorder(null));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(487, 668, 109, 51);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Cricket\\url.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -10, 1920, 1070);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1060));

        jMenu1.setText("More");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jMenuItem3.setText("Logout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      /* if (add.getText().equals("Add")){ 
             player.setText("");
             jno.setText(""); 
             team.setText("");
             age.setText("");
             player.setEditable(true); 
             jno.setEditable(true); 
             team.setEditable(true);
             age.setEditable(true);
            add.setText("Save"); 
         }
         else{*/        
             if( !player.getText().equals("") && !jno.getText().equals("") && !team.getText().equals("") && !age.getText().equals("")){ 
                 String SQL="INSERT INTO TEAMS VALUES ('"+player.getText().trim()+"',"+Integer.parseInt(jno.getText().trim())+",'"+team.getText().trim()+"',"+Integer.parseInt(age.getText().trim())+");";
              int retVal=Operation.UPDATE_Table(SQL); 
              if(retVal==-1){ 
                  JOptionPane.showMessageDialog(this, "Operation Failed", "Player insertion..", 1);
              }
              else{       
                  JOptionPane.showMessageDialog(this, "Operation successfully completed", "Player insertion..", 1);
              }                 
               player.setText("");
             jno.setText(""); 
             team.setText("");
             age.setText("");
             // add.setText("Add"); 
             player.setEditable(false); 
             jno.setEditable(false); 
             team.setEditable(false);
             age.setEditable(false);
            }
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Team.main(null);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Team.main(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Signup.main(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Team_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Team_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Team_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Team_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Team_Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField age;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jno;
    private javax.swing.JTextField player;
    private javax.swing.JTextField team;
    // End of variables declaration//GEN-END:variables
}
