package com.una.citasmedicas.view.Pacientes;

import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import com.una.citasmedicas.AdministracionPaciente.Model.PacienteEntity;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();

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
        CedulaActualBuscar.setToolTipText("Agregue la cedula que quiere buscar");
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

        jTable11.setBorder(new javax.swing.border.MatteBorder(null));
        jTable11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable11.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable11AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1a)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(CedulaActualBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(CancelarBuscarbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(161, 161, 161)
                            .addComponent(BuscarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(342, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarBuscar)
                    .addComponent(CancelarBuscarbotton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBuscarActionPerformed

        String Cedula = CedulaActualBuscar.getText();
        PacienteEntity paciente1 = paciente.buscar(Cedula);
        String[][] tabla = new String[1][9];

        if (paciente1 != null) {
            tabla[0][0] = paciente1.getCedula();
            tabla[0][1] = paciente1.getNombre();
            tabla[0][2] = paciente1.getApellidos();
            tabla[0][3] = paciente1.getTelefono();
            tabla[0][4] = paciente1.getCorreo();
            tabla[0][5] = paciente1.getDireccion();
            tabla[0][6] = paciente1.getFechaNacimiento();
            tabla[0][7] = paciente1.getPersonaContacto();
            tabla[0][8] = paciente1.getNumeroContacto();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el paciente");
        }
        DefaultTableModel model = new DefaultTableModel(tabla, new String[]{"Cedula", "Nombre", "Apellido", "Telefono", "Email","Correo","Direccion","Fecha de Nacimiento", "Persona Emergencia", "Numero Emergencia"});
        jTable11.setModel(model);
        clearFrm();

    }//GEN-LAST:event_BuscarBuscarActionPerformed
    private void clearFrm() {
        CedulaActualBuscar.setText("");
    }
    private void CedulaActualBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActualBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActualBuscarActionPerformed

    private void CancelarBuscarbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBuscarbottonActionPerformed
        clearFrm();
        this.setVisible(false);
    }//GEN-LAST:event_CancelarBuscarbottonActionPerformed

    private void jTable11AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable11AncestorAdded
/////
    }//GEN-LAST:event_jTable11AncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBuscar;
    private javax.swing.JButton CancelarBuscarbotton;
    private javax.swing.JTextField CedulaActualBuscar;
    private javax.swing.JLabel jLabel1a;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable11;
    // End of variables declaration//GEN-END:variables
}
