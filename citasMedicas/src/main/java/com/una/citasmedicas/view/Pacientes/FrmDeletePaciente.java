package com.una.citasmedicas.view.Pacientes;

import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import javax.swing.JOptionPane;

public class FrmDeletePaciente extends javax.swing.JInternalFrame {
PacienteInterface paciente;

    public FrmDeletePaciente() throws Exception {
        try {
            paciente = new PacienteController();
            initComponents();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos", "Error de Sistema", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CedulaActualdelete = new javax.swing.JTextField();
        Cancelardelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(null);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cedula Actual:");
        jLabel2.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel8.setForeground(null);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Eliminar Pacientes ");

        CedulaActualdelete.setForeground(null);
        CedulaActualdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActualdeleteActionPerformed(evt);
            }
        });

        Cancelardelete.setBackground(new java.awt.Color(255, 51, 0));
        Cancelardelete.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Cancelardelete.setForeground(new java.awt.Color(0, 0, 0));
        Cancelardelete.setText("Cancelar");
        Cancelardelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelardeleteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel9.setForeground(null);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingrese la cedula del paciente a eliminar");

        delete.setBackground(new java.awt.Color(0, 255, 51));
        delete.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Cancelardelete))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CedulaActualdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CedulaActualdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelardelete)
                    .addComponent(delete))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaActualdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActualdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActualdeleteActionPerformed

    private void CancelardeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelardeleteActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelardeleteActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        boolean band = true;
        String Cedula = CedulaActualdelete.getText();

        if (Cedula.isBlank()) {
            band = false;
        }
        if (band) {
            String reponse = paciente.delete(Cedula);
            JOptionPane.showMessageDialog(this, reponse);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFrm();
        this.setVisible(false);
    }//GEN-LAST:event_deleteActionPerformed
private void clearFrm() {
        CedulaActualdelete.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelardelete;
    private javax.swing.JTextField CedulaActualdelete;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
