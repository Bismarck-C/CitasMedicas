package com.una.citasmedicas.view.Pacientes;

import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import javax.swing.JOptionPane;

public class FrmBuscarPaciente extends javax.swing.JInternalFrame {

    PacienteInterface paciente;

    public FrmBuscarPaciente() throws Exception {
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
        BuscarBuscar = new javax.swing.JButton();
        CedulaActualBuscar = new javax.swing.JTextField();
        CancelarBuscarbotton = new javax.swing.JButton();
        jLabel1a = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cedula Actual:");
        jLabel2.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar Pacientes ");

        BuscarBuscar.setBackground(new java.awt.Color(0, 255, 51));
        BuscarBuscar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        BuscarBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BuscarBuscar.setText("Buscar");
        BuscarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBuscarActionPerformed(evt);
            }
        });

        CedulaActualBuscar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CedulaActualBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActualBuscarActionPerformed(evt);
            }
        });

        CancelarBuscarbotton.setBackground(new java.awt.Color(255, 51, 0));
        CancelarBuscarbotton.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CancelarBuscarbotton.setForeground(new java.awt.Color(0, 0, 0));
        CancelarBuscarbotton.setText("Cancelar");
        CancelarBuscarbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBuscarbottonActionPerformed(evt);
            }
        });

        jLabel1a.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1a.setText("Ingrese la cedula del paciente a buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1a)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(CancelarBuscarbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BuscarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(CedulaActualBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel1a)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CedulaActualBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarBuscarbotton)
                    .addComponent(BuscarBuscar))
                .addGap(0, 117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBuscarActionPerformed
         boolean band = true;
        String Cedula = CedulaActualBuscar.getText();

        if (Cedula.isBlank()) {
            band = false;
        }
        if (band) {
            String[] reponse = paciente.buscar(Cedula);
            JOptionPane.showMessageDialog(this, reponse);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        clearFrm();
        this.setVisible(false);
    }//GEN-LAST:event_BuscarBuscarActionPerformed

    private void clearFrm() {
        CedulaActualBuscar.setText("");
    }
    private void CedulaActualBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActualBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActualBuscarActionPerformed

    private void CancelarBuscarbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBuscarbottonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarBuscarbottonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBuscar;
    private javax.swing.JButton CancelarBuscarbotton;
    private javax.swing.JTextField CedulaActualBuscar;
    private javax.swing.JLabel jLabel1a;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
