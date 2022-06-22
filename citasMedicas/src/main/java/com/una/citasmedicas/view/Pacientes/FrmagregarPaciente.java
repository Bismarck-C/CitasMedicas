package com.una.citasmedicas.view.Pacientes;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import javax.swing.JOptionPane;

public class FrmAgregarPaciente extends javax.swing.JInternalFrame {

    PacienteInterface paciente;

    public FrmAgregarPaciente() throws Exception {
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

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NumeroAgregar = new javax.swing.JTextField();
        CedulaAgregar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PersonaAgregar = new javax.swing.JTextField();
        NacimientoAgregar = new javax.swing.JTextField();
        NombreAgregar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ApellidoAgregar = new javax.swing.JTextField();
        GuardarAgregar = new javax.swing.JButton();
        TelefonoAgregar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        CancelarAgregar = new javax.swing.JButton();
        DireccionAgregar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        TituloAgregar = new javax.swing.JLabel();
        CorreoAgregar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Persona de Contacto:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Correo:");

        NumeroAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroAgregarActionPerformed(evt);
            }
        });

        CedulaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");

        PersonaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonaAgregarActionPerformed(evt);
            }
        });

        NacimientoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacimientoAgregarActionPerformed(evt);
            }
        });

        NombreAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono:");

        ApellidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoAgregarActionPerformed(evt);
            }
        });

        GuardarAgregar.setBackground(new java.awt.Color(0, 255, 51));
        GuardarAgregar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        GuardarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        GuardarAgregar.setText("Guardar");
        GuardarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAgregarActionPerformed(evt);
            }
        });

        TelefonoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");

        nombre.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre:");

        CancelarAgregar.setBackground(new java.awt.Color(255, 51, 0));
        CancelarAgregar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CancelarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        CancelarAgregar.setText("Cancelar");
        CancelarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarAgregarActionPerformed(evt);
            }
        });

        DireccionAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionAgregarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de nacimiento:");

        cedula.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cedula.setText("Cédula:");
        cedula.setToolTipText("");

        TituloAgregar.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        TituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloAgregar.setText("Ingreso de Pacientes ");

        CorreoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoAgregarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Numero de emergencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(TituloAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nombre)
                                            .addComponent(jLabel7)
                                            .addComponent(cedula))
                                        .addGap(6, 6, 6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(CancelarAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CedulaAgregar)
                                .addComponent(NombreAgregar)
                                .addComponent(ApellidoAgregar)
                                .addComponent(DireccionAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NacimientoAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PersonaAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NumeroAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CorreoAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardarAgregar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NacimientoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarAgregar)
                    .addComponent(CancelarAgregar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumeroAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroAgregarActionPerformed

    private void CedulaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaAgregarActionPerformed

    private void PersonaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonaAgregarActionPerformed

    private void NombreAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAgregarActionPerformed

    private void ApellidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoAgregarActionPerformed

    private void GuardarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAgregarActionPerformed
        boolean band = true;
        String[] data = new String[9];
        data[0] = CedulaAgregar.getText();
        data[1] = NombreAgregar.getText();
        data[2] = ApellidoAgregar.getText();
        data[3] = TelefonoAgregar.getText();
        data[4] = CorreoAgregar.getText();
        data[5] = DireccionAgregar.getText();
        data[6] = NacimientoAgregar.getText();
        data[7] = PersonaAgregar.getText();
        data[8] = NumeroAgregar.getText();
        for (int i = 0; i < data.length; i++) {
            if (data[i].isEmpty()) {
                band = false;
            }
        }
        if (band) {
            String respuesta = paciente.add(data);
            JOptionPane.showMessageDialog(this, respuesta);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFrm();
        this.setVisible(false);
    }//GEN-LAST:event_GuardarAgregarActionPerformed

    private void TelefonoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoAgregarActionPerformed

    private void CancelarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarAgregarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarAgregarActionPerformed
 private void clearFrm() {
        CedulaAgregar.setText("");
        NombreAgregar.setText("");
        ApellidoAgregar.setText("");
        TelefonoAgregar.setText("");
        CorreoAgregar.setText("");
        DireccionAgregar.setText("");
        NacimientoAgregar.setText("");
        PersonaAgregar.setText("");
        NumeroAgregar.setText("");
    }
    private void DireccionAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionAgregarActionPerformed

    private void CorreoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoAgregarActionPerformed

    private void NacimientoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacimientoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NacimientoAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoAgregar;
    private javax.swing.JButton CancelarAgregar;
    private javax.swing.JTextField CedulaAgregar;
    private javax.swing.JTextField CorreoAgregar;
    private javax.swing.JTextField DireccionAgregar;
    private javax.swing.JButton GuardarAgregar;
    private javax.swing.JTextField NacimientoAgregar;
    private javax.swing.JTextField NombreAgregar;
    private javax.swing.JTextField NumeroAgregar;
    private javax.swing.JTextField PersonaAgregar;
    private javax.swing.JTextField TelefonoAgregar;
    private javax.swing.JLabel TituloAgregar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
