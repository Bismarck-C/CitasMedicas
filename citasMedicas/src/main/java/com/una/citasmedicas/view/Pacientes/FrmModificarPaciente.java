package com.una.citasmedicas.view.Pacientes;

import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import javax.swing.JOptionPane;

public class FrmModificarPaciente extends javax.swing.JInternalFrame {

    PacienteInterface paciente;

    public FrmModificarPaciente() throws Exception {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NacimientoModificar = new javax.swing.JTextField();
        TelefonoModificar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NombreModificar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NumeroModificar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cedulaModificar = new javax.swing.JTextField();
        correoModificar = new javax.swing.JTextField();
        CancelarModificar = new javax.swing.JButton();
        ApellidoModificar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DireccionModificar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PersonaModificar = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de nacimiento:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Persona de Contacto:");

        NacimientoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacimientoModificarActionPerformed(evt);
            }
        });

        TelefonoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cedula Actual:");
        jLabel2.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Correo:");

        NombreModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreModificarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar Pacientes  ");

        NumeroModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroModificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Datos que desea modificar");
        jLabel11.setToolTipText("");

        cedulaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaModificarActionPerformed(evt);
            }
        });

        correoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoModificarActionPerformed(evt);
            }
        });

        CancelarModificar.setBackground(new java.awt.Color(255, 51, 0));
        CancelarModificar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CancelarModificar.setForeground(new java.awt.Color(0, 0, 0));
        CancelarModificar.setText("Cancelar");
        CancelarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarModificarActionPerformed(evt);
            }
        });

        ApellidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoModificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");

        DireccionModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Numero de emergencia");

        PersonaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonaModificarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(0, 255, 51));
        Modificar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CancelarModificar)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedulaModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NacimientoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(DireccionModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(correoModificar)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PersonaModificar)
                                .addComponent(NumeroModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ApellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(correoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DireccionModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NacimientoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarModificar)
                    .addComponent(Modificar))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelefonoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoModificarActionPerformed
    private void clearFrm() {
        CancelarModificar.setText("");
        NombreModificar.setText("");
        ApellidoModificar.setText("");
        TelefonoModificar.setText("");
        correoModificar.setText("");
        DireccionModificar.setText("");
        NacimientoModificar.setText("");
        PersonaModificar.setText("");
        NumeroModificar.setText("");
    }
    private void NombreModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreModificarActionPerformed

    private void NumeroModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroModificarActionPerformed

    private void cedulaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaModificarActionPerformed

    private void CancelarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarModificarActionPerformed
        clearFrm();
        this.setVisible(false);
    }//GEN-LAST:event_CancelarModificarActionPerformed

    private void ApellidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoModificarActionPerformed

    private void DireccionModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionModificarActionPerformed

    private void PersonaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonaModificarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        boolean band = true;
        String[] data = new String[8];
        
        String cedula = cedulaModificar.getText();
        data[0] = NombreModificar.getText();
        data[1] = ApellidoModificar.getText();
        data[2] = TelefonoModificar.getText();
        data[3] = correoModificar.getText();
        data[4] = DireccionModificar.getText();
        data[5] = NacimientoModificar.getText();
        data[6] = PersonaModificar.getText();
        data[7] = NumeroModificar.getText();

        for (int i = 0; i < data.length; i++) {
            if (data[i].isEmpty()) {
                band = false;
            }
        }
        if (band) {
            String reponse = paciente.modificar(data,cedula);
            JOptionPane.showMessageDialog(this, reponse);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        clearFrm();
        this.setVisible(false);

    }//GEN-LAST:event_ModificarActionPerformed

    private void correoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoModificarActionPerformed

    private void NacimientoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacimientoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NacimientoModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoModificar;
    private javax.swing.JButton CancelarModificar;
    private javax.swing.JTextField DireccionModificar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NacimientoModificar;
    private javax.swing.JTextField NombreModificar;
    private javax.swing.JTextField NumeroModificar;
    private javax.swing.JTextField PersonaModificar;
    private javax.swing.JTextField TelefonoModificar;
    private javax.swing.JTextField cedulaModificar;
    private javax.swing.JTextField correoModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
