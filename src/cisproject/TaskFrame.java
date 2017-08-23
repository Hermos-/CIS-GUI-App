//Jessie Romero
package cisproject;

import javax.swing.DefaultListModel;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class TaskFrame extends javax.swing.JFrame {
    public TaskFrame() throws Exception {
        initComponents();
        loadToGui();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeJList = new javax.swing.JList<>();
        projectLabel = new javax.swing.JLabel();
        reportLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        projectJList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        reportJList = new javax.swing.JList<>();
        assignButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        employeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeLabel.setText("Employee:");

        jScrollPane1.setViewportView(employeeJList);

        projectLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        projectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectLabel.setText("Project:");

        reportLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        reportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportLabel.setText("Report:");

        jScrollPane2.setViewportView(projectJList);

        reportJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        reportJList.setToolTipText("");
        jScrollPane3.setViewportView(reportJList);

        assignButton.setMnemonic('s');
        assignButton.setText("Assign");
        assignButton.setToolTipText("");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        reportButton.setMnemonic('r');
        reportButton.setLabel("Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        exitButton.setMnemonic('x');
        exitButton.setLabel("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        addButton.setMnemonic('a');
        addButton.setLabel("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportButton))
                    .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assignButton)
                            .addComponent(reportButton)
                            .addComponent(exitButton)
                            .addComponent(addButton))
                        .addGap(31, 31, 31))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        Object[] options = {"Employee", "Project"};
        int optionChosen = JOptionPane.showOptionDialog(this, "Add a new employee or project?", 
                                     "Add Record", JOptionPane.YES_NO_OPTION, 
                                     JOptionPane.QUESTION_MESSAGE, null, options,
                                     options[0]);
        
        if(optionChosen == 0)//if employee is chosen
        {
            String newEmployee = (String)JOptionPane.showInputDialog(this,"Enter the name for a new employee(name can't be duplicated.)",
                                                                     "Add a new employee",JOptionPane.QUESTION_MESSAGE, null, null, "");
            
            
        }
        
        else if(optionChosen == 1)//if project is chosen
        {
            String newProject = (String)JOptionPane.showInputDialog(this,"Enter the name for a new project(project name can't be duplicated.)",
                                                                     "Add a new project",JOptionPane.QUESTION_MESSAGE, null, null, "");
        }
        
        
        
        

    }//GEN-LAST:event_addButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed

        DefaultListModel reportList = new DefaultListModel(); 
        
        if(employeeJList.isSelectionEmpty() && projectJList.isSelectionEmpty())
        {
            String errorMessage = "you must select either employee(s) or project(s)";
            JOptionPane.showMessageDialog(this, errorMessage ,"View Task Report", JOptionPane.ERROR_MESSAGE);
        }
 
        else if(employeeJList.isSelectionEmpty())//if employee list is not selected but project list is
        {        
            for(String projectSelected : projectJList.getSelectedValuesList())
            {
                ArrayList employeeHolder = new ArrayList();
                for(Employee employee : loader.empObjList)
                {
                    if(employee.getAssignedProjects().contains(projectSelected))
                    {
                        employeeHolder.add(employee.getName());
                    }
                }
                
                String s = projectSelected + " project has " + employeeHolder;
                reportList.addElement(s);
                reportList.addElement("\n");
            }
            
            reportJList.setModel(reportList);
            
        }
        
        
        else if(!employeeJList.isSelectionEmpty() && !projectJList.isSelectionEmpty())//if both are selected
        {
            for(String employeeSelected: employeeJList.getSelectedValuesList())
            {
                for(Employee employee: loader.empObjList)
                {
                 if(employeeSelected.equals(employee.getName()))
                 {
                     reportList.addElement(employee.getProjectReport());
                     reportList.addElement("\n");
                 }   
                }
            }
            String divider = "=========";
            reportList.addElement(divider);
            reportList.addElement("\n");
            
            for(String projectSelected: projectJList.getSelectedValuesList())
            {
                ArrayList employeeHolder = new ArrayList();
                for(Employee employee : loader.empObjList)
                {
                    if(employee.getAssignedProjects().contains(projectSelected))
                    {
                        employeeHolder.add(employee.getName());
                    }
                }
                String s =  projectSelected + " project has " + employeeHolder;
                reportList.addElement(s);
                reportList.addElement("\n");
            }
            reportJList.setModel(reportList);
        } 
        
        else //if only employee list is selected
        {
            for(String employeeSelected: employeeJList.getSelectedValuesList())
            {
                for(Employee employee: loader.empObjList)
                {
                 if(employeeSelected.equals(employee.getName()))
                 {
                     reportList.addElement(employee.getProjectReport());
                     reportList.addElement("\n");
                 }   
                }
            }
            reportJList.setModel(reportList);   
        }
    }//GEN-LAST:event_reportButtonActionPerformed

    public void loadToGui() 
    {   
        for(Employee e: loader.empObjList)
        {
            employeeList.addElement(e.getName());
        }
        
        for(Object projectName: loader.projectNamesArray)
        {
            projectList.addElement(projectName);
        }
        
        employeeJList.setModel(employeeList);
        projectJList.setModel(projectList);
    }

    
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
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try
                {
                    new TaskFrame().setVisible(true);
                }
                
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });
    }
    
//My variable declarations
    DefaultListModel employeeList = new DefaultListModel();
    DefaultListModel projectList = new DefaultListModel();
    TaskData loader = new TaskData();
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton assignButton;
    private javax.swing.JList<String> employeeJList;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> projectJList;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JButton reportButton;
    private javax.swing.JList<String> reportJList;
    private javax.swing.JLabel reportLabel;
    // End of variables declaration//GEN-END:variables
}
