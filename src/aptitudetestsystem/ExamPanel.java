
package aptitudetestsystem;


import static aptitudetestsystem.Login.txtuserhome;
import static aptitudetestsystem.Topics.cmbsub;
import static aptitudetestsystem.clock.s;
import static java.awt.PageAttributes.MediaType.A;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ExamPanel extends javax.swing.JFrame {
    DataBaseConnection db;
    public static String topic;
    ButtonGroup btnGroup = new ButtonGroup();

    public ExamPanel(String topic) {
        initComponents();
         
         clock c = new clock();
         c.start();
         c.abc(this);
        
        db=new DataBaseConnection();
        ImageIcon i=new ImageIcon("src\\Img\\call-icon.png");
         this.setIconImage(i.getImage());
        
        lblTopic.setText("Exam is "+topic);
        lblAns.setVisible(false);
        btnFinish.setVisible(false);
        
        btnGroup.add(Opt1);
        btnGroup.add(Opt2);
        btnGroup.add(Opt3);
        btnGroup.add(Opt4);
        
        try
        {
          db.rs=db.st.executeQuery("select * from TB_Test where Topic='"+topic+"' ");
          if(db.rs.next())
          {
              
               lblQuestion.setText(db.rs.getString("Questions"));
               Opt1.setText(db.rs.getString("Opt1"));
               Opt2.setText(db.rs.getString("Opt2"));
               Opt3.setText(db.rs.getString("Opt3"));
               Opt4.setText(db.rs.getString("Opt4"));
                    
               lblAns.setText(db.rs.getString("Ans"));
          }
  
        }
        catch(Exception ex)
        {
         //        JOptionPane.showMessageDialog(this, "Connection not Build");
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuestion = new javax.swing.JLabel();
        lblAns = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Opt4 = new javax.swing.JRadioButton();
        Opt3 = new javax.swing.JRadioButton();
        Opt2 = new javax.swing.JRadioButton();
        Opt1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnFinish = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exam Panel");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        lblQuestion.setBackground(new java.awt.Color(204, 0, 0));
        lblQuestion.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        getContentPane().add(lblQuestion);
        lblQuestion.setBounds(10, 95, 880, 74);

        lblAns.setText("jLabel1");
        lblAns.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblAnsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblAns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnsMouseClicked(evt);
            }
        });
        getContentPane().add(lblAns);
        lblAns.setBounds(38, 549, 34, 14);

        Opt4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Opt4.setText("D:");
        Opt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opt4ActionPerformed(evt);
            }
        });

        Opt3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Opt3.setText("B:");
        Opt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Opt2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Opt2.setText("C:");
        Opt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Opt1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Opt1.setText("A:");
        Opt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Opt3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opt1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Opt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opt4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Opt1)
                    .addComponent(Opt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Opt4)
                    .addComponent(Opt3))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 200, 880, 280);

        lblTopic.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(690, 10, 170, 78);

        jLabel2.setText("Start Your Time");

        jLabel3.setText("You have 60 Sec.");

        timer.setBackground(new java.awt.Color(102, 255, 204));
        timer.setForeground(new java.awt.Color(255, 255, 255));
        timer.setText("sdsadasd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 11, 210, 78);

        btnFinish.setText("Finish");
        btnFinish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(649, 517, 232, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exambg.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 900, 600);

        setSize(new java.awt.Dimension(916, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static int marks=0;
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        
        if(Opt1.isSelected() || Opt2.isSelected() || Opt3.isSelected() || Opt4.isSelected() )
        {
        try
        {
        if(Opt1.getText().equals(lblAns.getText()) && Opt1.isSelected())
        {
        marks ++;
        }
        else if(Opt2.getText().equals(lblAns.getText()) && Opt2.isSelected())
        {
        marks ++;
        }
       else if(Opt3.getText().equals(lblAns.getText()) && Opt3.isSelected())
        {
        marks ++;
        }
       else if(Opt4.getText().equals(lblAns.getText()) && Opt4.isSelected())
        {
        marks ++;
        }
        
        if(db.rs.next())
        {
              lblQuestion.setText(db.rs.getString("Questions"));
              Opt1.setText(db.rs.getString("Opt1"));
              Opt2.setText(db.rs.getString("Opt2"));
              Opt3.setText(db.rs.getString("Opt3"));
              Opt4.setText(db.rs.getString("Opt4"));
              
              lblAns.setText(db.rs.getString("Ans"));
        }
        else
        {
        btnFinish.setVisible(true);
        btnNext.setVisible(false);
        }
        btnGroup.clearSelection();
        
        }
        catch(Exception ex)
        {            
        }
        }     
        else
        {
        JOptionPane.showMessageDialog(this, "Please select atleast one option");
        }
        
        
    }//GEN-LAST:event_btnNextActionPerformed

    public static String str;
    public static String stop;
    
    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        
        int stud=marks;
        int totalmark=15;
        int per=100;
        int res;
        res =per*stud/totalmark;
        String str1 = String.valueOf(res);
        String str = String.valueOf(marks);
        
        Stud_Result q = new Stud_Result();
        q.setVisible(true);
        q.lbltopic.setText(cmbsub.getSelectedItem().toString());
        q.stop.setText(this.timer.getText());
        q.lbltime.setText(this.timer.getText());
        q.lblstudmark.setText(str);
        Stud_Result.percentage.setText(str1);
         
        this.dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void lblAnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnsMouseClicked
       
    }//GEN-LAST:event_lblAnsMouseClicked

    private void lblAnsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblAnsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnsAncestorAdded

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void Opt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opt4ActionPerformed

    private void Opt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opt1ActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Opt1;
    private javax.swing.JRadioButton Opt2;
    private javax.swing.JRadioButton Opt3;
    private javax.swing.JRadioButton Opt4;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAns;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTopic;
    public static javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables
}
