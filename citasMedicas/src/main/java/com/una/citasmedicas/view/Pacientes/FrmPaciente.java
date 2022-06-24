package com.una.citasmedicas.view.Pacientes;

import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import javax.swing.JOptionPane;

public class FrmPaciente extends javax.swing.JInternalFrame {

    PacienteInterface obj;

    public FrmPaciente() throws Exception {
        try {
            obj = new PacienteController();
            initComponents();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos", "Error de Sistema", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CedulaActualdelete = new javax.swing.JTextField();
        Cancelardelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NacimientoAgregar = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        NombreAgregar = new javax.swing.JTextField();
        TituloAgregar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CorreoAgregar = new javax.swing.JTextField();
        ApellidoAgregar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GuardarAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TelefonoAgregar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NumeroAgregar = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        CedulaAgregar = new javax.swing.JTextField();
        CancelarAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DireccionAgregar = new javax.swing.JTextField();
        PersonaAgregar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        DireccionModificar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NumeroModificar = new javax.swing.JTextField();
        PersonaModificar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NacimientoModificar = new javax.swing.JTextField();
        cedulaModificar = new javax.swing.JTextField();
        TelefonoModificar = new javax.swing.JTextField();
        correoModificar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CancelarModificar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        ApellidoModificar = new javax.swing.JTextField();
        NombreModificar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BuscarBuscar = new javax.swing.JButton();
        CedulaActualBuscar = new javax.swing.JTextField();
        CancelarBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Cedula Actual:");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Eliminar Pacientes ");

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

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ingrese la cedula del paciente a eliminar");

        delete.setBackground(new java.awt.Color(0, 255, 51));
        delete.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(Cancelardelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(CedulaActualdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CedulaActualdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelardelete)
                    .addComponent(delete))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Paciente", jPanel3);

        NacimientoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacimientoAgregarActionPerformed(evt);
            }
        });

        cedula.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cedula.setText("Cédula:");
        cedula.setToolTipText("");

        NombreAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAgregarActionPerformed(evt);
            }
        });

        TituloAgregar.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        TituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloAgregar.setText("Ingreso de Pacientes ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono:");

        CorreoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoAgregarActionPerformed(evt);
            }
        });

        ApellidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoAgregarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Numero de emergencia");

        GuardarAgregar.setBackground(new java.awt.Color(0, 255, 51));
        GuardarAgregar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        GuardarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        GuardarAgregar.setText("Guardar");
        GuardarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAgregarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Persona de Contacto:");

        TelefonoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoAgregarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");

        NumeroAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroAgregarActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre:");

        CedulaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaAgregarActionPerformed(evt);
            }
        });

        CancelarAgregar.setBackground(new java.awt.Color(255, 51, 0));
        CancelarAgregar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CancelarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        CancelarAgregar.setText("Cancelar");
        CancelarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");

        DireccionAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionAgregarActionPerformed(evt);
            }
        });

        PersonaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonaAgregarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de nacimiento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(TituloAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cedula)
                            .addComponent(nombre)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CorreoAgregar)
                            .addComponent(TelefonoAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(ApellidoAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CedulaAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DireccionAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NacimientoAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PersonaAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumeroAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(CancelarAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarAgregar)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloAgregar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CedulaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DireccionAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NacimientoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PersonaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumeroAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuardarAgregar)
                    .addComponent(CancelarAgregar))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Paciente", jPanel1);

        DireccionModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionModificarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Modificar Pacientes  ");

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Numero de emergencia");

        NumeroModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroModificarActionPerformed(evt);
            }
        });

        PersonaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonaModificarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Telefono:");

        Modificar.setBackground(new java.awt.Color(0, 255, 51));
        Modificar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha de nacimiento:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Persona de Contacto:");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Datos que desea modificar");
        jLabel20.setToolTipText("");

        NacimientoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacimientoModificarActionPerformed(evt);
            }
        });

        cedulaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaModificarActionPerformed(evt);
            }
        });

        TelefonoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoModificarActionPerformed(evt);
            }
        });

        correoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoModificarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Cedula Actual:");
        jLabel21.setToolTipText("");

        CancelarModificar.setBackground(new java.awt.Color(255, 51, 0));
        CancelarModificar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CancelarModificar.setForeground(new java.awt.Color(0, 0, 0));
        CancelarModificar.setText("Cancelar");
        CancelarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarModificarActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Correo:");

        ApellidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoModificarActionPerformed(evt);
            }
        });

        NombreModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreModificarActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Apellidos:");

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Dirección:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cedulaModificar))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ApellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PersonaModificar)
                                    .addComponent(NumeroModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DireccionModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NacimientoModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(CancelarModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Modificar))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(DireccionModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(NacimientoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(PersonaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumeroModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CancelarModificar)
                    .addComponent(Modificar))
                .addGap(123, 123, 123))
        );

        jTabbedPane1.addTab("Modificar Paciente", jPanel4);

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

        CancelarBuscar.setBackground(new java.awt.Color(255, 51, 0));
        CancelarBuscar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CancelarBuscar.setForeground(new java.awt.Color(0, 0, 0));
        CancelarBuscar.setText("Cancelar");
        CancelarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBuscarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ingrese la cedula del paciente a buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(CancelarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BuscarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(CedulaActualBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CedulaActualBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarBuscar)
                    .addComponent(BuscarBuscar))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Paciente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NacimientoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacimientoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NacimientoAgregarActionPerformed

    private void NombreAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAgregarActionPerformed

    private void CorreoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoAgregarActionPerformed

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
            String respuesta = obj.add(data);
            JOptionPane.showMessageDialog(this, respuesta);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFrm1();
        this.setVisible(false);
    }//GEN-LAST:event_GuardarAgregarActionPerformed
    private void clearFrm1() {
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
    private void TelefonoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoAgregarActionPerformed

    private void NumeroAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroAgregarActionPerformed

    private void CedulaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaAgregarActionPerformed

    private void CancelarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarAgregarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarAgregarActionPerformed

    private void DireccionAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionAgregarActionPerformed

    private void PersonaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonaAgregarActionPerformed

    private void BuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBuscarActionPerformed
        boolean band = true;
        String Cedula = CedulaActualBuscar.getText();
        if (Cedula.isBlank()) {
            band = false;
        }
        if (band) {
            String[] reponse = obj.buscar(Cedula);
            JOptionPane.showMessageDialog(this, reponse);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFrm2();
        this.setVisible(false);
    }//GEN-LAST:event_BuscarBuscarActionPerformed
    private void clearFrm2() {
        CedulaActualBuscar.setText("");
    }
    private void CedulaActualBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActualBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActualBuscarActionPerformed

    private void CancelarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBuscarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarBuscarActionPerformed

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
            String reponse = obj.delete(Cedula);
            JOptionPane.showMessageDialog(this, reponse);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFrm3();
        this.setVisible(false);
    }//GEN-LAST:event_deleteActionPerformed
    private void clearFrm3() {
        CedulaActualdelete.setText("");
    }
    private void DireccionModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionModificarActionPerformed

    private void NumeroModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroModificarActionPerformed

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
            String reponse = obj.modificar(data, cedula);
            JOptionPane.showMessageDialog(this, reponse);
        } else {
            JOptionPane.showMessageDialog(this, "Hay espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        clearFrm4();
        this.setVisible(false);
    }//GEN-LAST:event_ModificarActionPerformed
    private void clearFrm4() {
        cedulaModificar.setText("");
        NombreModificar.setText("");
        ApellidoModificar.setText("");
        TelefonoModificar.setText("");
        correoModificar.setText("");
        DireccionModificar.setText("");
        NacimientoModificar.setText("");
        PersonaModificar.setText("");
        NumeroModificar.setText("");
    }
    private void NacimientoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacimientoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NacimientoModificarActionPerformed

    private void cedulaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaModificarActionPerformed

    private void TelefonoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoModificarActionPerformed

    private void correoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoModificarActionPerformed

    private void CancelarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarModificarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelarModificarActionPerformed

    private void ApellidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoModificarActionPerformed

    private void NombreModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoAgregar;
    private javax.swing.JTextField ApellidoModificar;
    private javax.swing.JButton BuscarBuscar;
    private javax.swing.JButton CancelarAgregar;
    private javax.swing.JButton CancelarBuscar;
    private javax.swing.JButton CancelarModificar;
    private javax.swing.JButton Cancelardelete;
    private javax.swing.JTextField CedulaActualBuscar;
    private javax.swing.JTextField CedulaActualdelete;
    private javax.swing.JTextField CedulaAgregar;
    private javax.swing.JTextField CorreoAgregar;
    private javax.swing.JTextField DireccionAgregar;
    private javax.swing.JTextField DireccionModificar;
    private javax.swing.JButton GuardarAgregar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NacimientoAgregar;
    private javax.swing.JTextField NacimientoModificar;
    private javax.swing.JTextField NombreAgregar;
    private javax.swing.JTextField NombreModificar;
    private javax.swing.JTextField NumeroAgregar;
    private javax.swing.JTextField NumeroModificar;
    private javax.swing.JTextField PersonaAgregar;
    private javax.swing.JTextField PersonaModificar;
    private javax.swing.JTextField TelefonoAgregar;
    private javax.swing.JTextField TelefonoModificar;
    private javax.swing.JLabel TituloAgregar;
    private javax.swing.JLabel cedula;
    private javax.swing.JTextField cedulaModificar;
    private javax.swing.JTextField correoModificar;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
