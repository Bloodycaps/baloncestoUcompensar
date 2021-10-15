/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.ucompensar.baloncesto;

import javax.swing.JOptionPane;

/**
 *
 * @author blakc
 */
public class Baloncesto extends javax.swing.JFrame {

    String datos = "";

    /**
     * Creates new form Baloncesto
     */
    public Baloncesto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatEst = new javax.swing.JTextArea();
        jButtonVerEst = new javax.swing.JButton();
        jButtonGuardarEst = new javax.swing.JButton();
        jButtonCerProg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipo de Baloncesto Univesidad Compensar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione la opcion que desea realizar");

        jTextAreaDatEst.setEditable(false);
        jTextAreaDatEst.setColumns(20);
        jTextAreaDatEst.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jTextAreaDatEst.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDatEst);

        jButtonVerEst.setBackground(new java.awt.Color(255, 102, 0));
        jButtonVerEst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVerEst.setText("Ver Estudiantes");
        jButtonVerEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVerEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstActionPerformed(evt);
            }
        });

        jButtonGuardarEst.setBackground(new java.awt.Color(255, 102, 0));
        jButtonGuardarEst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGuardarEst.setText("Guardar estudiantes");
        jButtonGuardarEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGuardarEst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarEstActionPerformed(evt);
            }
        });

        jButtonCerProg.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCerProg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCerProg.setText("Cerrar programa");
        jButtonCerProg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCerProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerProgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerEst, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerProg, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonGuardarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVerEst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonCerProg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstActionPerformed
        jTextAreaDatEst.setText(verDatosEst(datos));
    }//GEN-LAST:event_jButtonVerEstActionPerformed

    private void jButtonGuardarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarEstActionPerformed
        datos = solicitarDatos();
    }//GEN-LAST:event_jButtonGuardarEstActionPerformed

    private void jButtonCerProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerProgActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCerProgActionPerformed

    public String solicitarDatos() {
        String text = "";
        int numEst;
        String nomEst[];
        double datosEst[][];
        try {
            numEst = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes a registrar:"));
            nomEst = new String[numEst];
            datosEst = new double[numEst][2];
            for (int i = 0; i < numEst; i++) {
                nomEst[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante No." + (i + 1));
                datosEst[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
                datosEst[i][1] = Double.parseDouble(JOptionPane.showInputDialog("ingrese la estatura del estudiante"));
                text = text + nomEst[i] + "\t" + datosEst[i][0] + "\t" + datosEst[i][1] + "\n";
            }
            JOptionPane.showMessageDialog(null, "Los datos fueron guardados Correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return text;
    }

    public String verDatosEst(String est) {
        String datEst;
        if (est == null) {
            JOptionPane.showMessageDialog(rootPane, "Usted no ha ingresado datos de estudiantes");
        } else {
            datEst = jTextAreaDatEst.getText() + est;
            return est;
        }
        return null;
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
            java.util.logging.Logger.getLogger(Baloncesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baloncesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baloncesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baloncesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baloncesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerProg;
    private javax.swing.JButton jButtonGuardarEst;
    private javax.swing.JButton jButtonVerEst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDatEst;
    // End of variables declaration//GEN-END:variables
}
