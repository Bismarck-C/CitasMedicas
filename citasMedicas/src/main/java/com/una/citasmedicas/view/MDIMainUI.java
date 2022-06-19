/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package com.una.citasmedicas.view;


import com.una.citasmedicas.view.Paciente.FrmAgregarPaciente;
import com.una.citasmedicas.view.Paciente.FrmBuscarPaciente;
import com.una.citasmedicas.view.Paciente.FrmDeletePaciente;
import com.una.citasmedicas.view.Paciente.FrmModificarPaciente;
import com.una.citasmedicas.view.medicos.FrmAgregarMedico;
import com.una.citasmedicas.view.medicos.FrmBuscarMedico;
import com.una.citasmedicas.view.medicos.FrmEliminarMedico;
import com.una.citasmedicas.view.medicos.FrmModificarMedico;

//import com.una.citasmedicas.view.usuarios.FrmAgregarUsuario;
//import com.una.citasmedicas.view.usuarios.FrmEliminarUsuario;
import com.una.citasmedicas.view.usuarios.FrmModificarUsuario;

/**
 *
 * @author PC
 */
public class MDIMainUI extends javax.swing.JFrame {

    FrmAgregarMedico frmAgregarMedico;
    FrmBuscarMedico frmBuscarMedico;
    FrmModificarMedico frmModificarMedico;
    FrmEliminarMedico frmEliminarMedico;
    
    FrmAgregarPaciente frmAgregarPaciente;
    FrmBuscarPaciente frmBuscarPaciente;
    FrmModificarPaciente frmModificarPaciente;
    FrmDeletePaciente frmEliminarPaciente;
    

    //FrmEliminarUsuario frmEliminarUsuario;
    //FrmAgregarUsuario frmAgregarUsuario;
    FrmModificarUsuario frmModificarUsuario;
    /**
     * Creates new form MDIMainUI
     * @throws java.lang.Exception
     */
    public MDIMainUI() throws Exception {
        frmAgregarMedico = new FrmAgregarMedico();
        frmBuscarMedico = new FrmBuscarMedico();
        frmModificarMedico = new FrmModificarMedico();
        frmEliminarMedico = new FrmEliminarMedico();
        
        frmAgregarPaciente  = new FrmAgregarPaciente();
        frmBuscarPaciente  = new FrmBuscarPaciente();
        frmModificarPaciente  = new FrmModificarPaciente();
        frmEliminarPaciente  = new FrmDeletePaciente();
        
        
        //frmEliminarUsuario = new FrmEliminarUsuario();
        //frmAgregarUsuario = new FrmAgregarUsuario();
        frmModificarUsuario = new FrmModificarUsuario();
        initComponents();
        this.desktopPane.add(frmAgregarMedico);
        this.desktopPane.add(frmModificarMedico);
        this.desktopPane.add(frmBuscarMedico);
        this.desktopPane.add(frmEliminarMedico);
        
        this.desktopPane.add(frmEliminarPaciente);
        this.desktopPane.add(frmModificarPaciente);
        this.desktopPane.add(frmAgregarPaciente);
        this.desktopPane.add(frmBuscarPaciente);
        
       // this.desktopPane.add(frmEliminarUsuario);
        //this.desktopPane.add(frmAgregarUsuario);
        this.desktopPane.add(frmModificarUsuario);
        this.setExtendedState(MAXIMIZED_BOTH);
      
      
        
        
        
        
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMedicos = new javax.swing.JMenu();
        jMenuAgregar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuPacientes = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuCitas = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));
        desktopPane.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración de modulos");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(520, 200, 230, 50);

        jMenuMedicos.setText("Medicos");

        jMenuAgregar.setText("Agregar");
        jMenuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarActionPerformed(evt);
            }
        });

        jMenuItem1.setText("ir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAgregar.add(jMenuItem1);

        jMenuMedicos.add(jMenuAgregar);

        jMenu2.setText("Buscar");

        jMenuItem2.setText("Ir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuMedicos.add(jMenu2);

        jMenu3.setText("Modificar");

        jMenuItem4.setText("Ir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuMedicos.add(jMenu3);

        jMenu4.setText("Eliminar");

        jMenuItem5.setText("ir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuMedicos.add(jMenu4);

        jMenuBar1.add(jMenuMedicos);

        jMenuPacientes.setText("Pacientes");
        jMenuBar1.add(jMenuPacientes);

        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuariosActionPerformed(evt);
            }
        });

        jMenu1.setText("Agregar");

        jMenuItem6.setText("Ir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuUsuarios.add(jMenu1);

        jMenu5.setText("Eliminar");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem8.setText("Ir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuUsuarios.add(jMenu5);

        jMenu6.setText("Modificar");

        jMenuItem7.setText("Ir");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuUsuarios.add(jMenu6);

        jMenuBar1.add(jMenuUsuarios);

        jMenuCitas.setText("Citas");
        jMenuBar1.add(jMenuCitas);

        jMenuAbout.setText("About");
        jMenuBar1.add(jMenuAbout);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Aceptar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItem3);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed

    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        frmEliminarMedico.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        frmModificarMedico.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmBuscarMedico.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarActionPerformed

    }//GEN-LAST:event_jMenuAgregarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        frmAgregarMedico.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       //frmAgregarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      //frmEliminarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuariosActionPerformed
        
    }//GEN-LAST:event_jMenuUsuariosActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
      
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      frmModificarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuAgregar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCitas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu jMenuMedicos;
    private javax.swing.JMenu jMenuPacientes;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

}
