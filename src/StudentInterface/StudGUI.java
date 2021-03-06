/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInterface;

import StudentDatabase.StudentDB;
import StudentModel.Student;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author GRACE
 */
public class StudGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudGUI
     */
    public StudGUI() {
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
        IdInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DoB = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        GenderInput = new javax.swing.JTextField();
        DobInput = new javax.swing.JTextField();
        PhoneInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Id");

        IdInput.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        IdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInputActionPerformed(evt);
            }
        });
        IdInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IdInputKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Gender");

        DoB.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        DoB.setText("DoB");

        Phone.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Phone.setText("Phone");

        NameInput.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        GenderInput.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        GenderInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderInputActionPerformed(evt);
            }
        });

        DobInput.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        PhoneInput.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        PhoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneInputActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table);

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setText("Hibernate Student Registration System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(Phone)
                            .addComponent(DoB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IdInput)
                            .addComponent(NameInput)
                            .addComponent(GenderInput)
                            .addComponent(DobInput)
                            .addComponent(PhoneInput, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnRead)
                        .addGap(29, 29, 29)
                        .addComponent(btnUpdate)
                        .addGap(47, 47, 47)
                        .addComponent(btnDelete)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(GenderInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoB)
                    .addComponent(DobInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone)
                    .addComponent(PhoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenderInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderInputActionPerformed

    private void PhoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneInputActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
  
        String Id=IdInput.getText();
        String Name=NameInput.getText();
        String Gender=GenderInput.getText();
        String DoB=DobInput.getText();
        String Phone=PhoneInput.getText();
        
        Student st = new Student();
                
        
        st.setId(Id);
        st.setName(Name);
        st.setGender(Gender);
        st.setDoB(DoB);
        st.setPhone(Phone);
        
          StudentDB Db=new StudentDB();
         Db.saveStudent(st);
         JOptionPane.showMessageDialog(this,st+"Row Created" );
         clearInput();
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        displayTable();
       
    }//GEN-LAST:event_btnReadActionPerformed

    private void IdInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdInputKeyReleased
        // TODO add your handling code here:
//        String id=IdInput.getText();
//        StudentDB da= new StudentDB();
//        Student s= new Student();
//        s=da.getStudentById(id);
//        
//        //IdInput.setEditable(false);
//        NameInput.setText(s.getName());
//        DobInput.setText(s.getDoB());
//        GenderInput.setText(s.getGender());
//        PhoneInput.setText(s.getPhone());
//        clearInput();
        
        
    }//GEN-LAST:event_IdInputKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         String Id=IdInput.getText();
        String Name=NameInput.getText();
        String Gender=GenderInput.getText();
        String DoB=DobInput.getText();
        String Phone=PhoneInput.getText();
        
        Student st = new Student();
                
        
        st.setId(Id);
        st.setName(Name);
        st.setGender(Gender);
        st.setDoB(DoB);
        st.setPhone(Phone);
        
          StudentDB Db=new StudentDB();
         Db.updateStudent(st);
         JOptionPane.showMessageDialog(this,"Row Updated" );
         clearInput();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         String Id=IdInput.getText();
        String Name=NameInput.getText();
        String Gender=GenderInput.getText();
        String DoB=DobInput.getText();
        String Phone=PhoneInput.getText();
        
        Student st = new Student();
                
        
        st.setId(Id);
        st.setName(Name);
        st.setGender(Gender);
        st.setDoB(DoB);
        st.setPhone(Phone);
        
          StudentDB Db=new StudentDB();
         Db.DeleteStudent(st);
         JOptionPane.showMessageDialog(this,"Row Delete" );
         clearInput();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void IdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInputActionPerformed
public void displayTable(){
StudentDB db= new StudentDB();
       List<Student> ls=new ArrayList<>();
       ls=db.getStudents();
        DefaultTableModel model= new DefaultTableModel();
         Object cols[] = new Object[5];
         cols[0]="ID";
         cols[1]="Name";
         cols[2]="Gender";
         cols[3]="DoB";
         cols[4]="Phon";
         model.setColumnIdentifiers(cols);
       for(Student s:ls){
       Object row[]=new Object[5];
                  row[0]=s.getId();
                  row[1]=s.getName();
                  row[2]=s.getGender();
                  row[3]=s.getDoB();
                  row[4]=s.getPhone();
                  
                  model.addRow(row);
       }
       Table.setModel(model);
}
public void clearInput(){
         IdInput.setText("");
        NameInput.setText("");
        DobInput.setText("");
        GenderInput.setText("");
        PhoneInput.setText("");
}
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
            java.util.logging.Logger.getLogger(StudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoB;
    private javax.swing.JTextField DobInput;
    private javax.swing.JTextField GenderInput;
    private javax.swing.JTextField IdInput;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneInput;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
