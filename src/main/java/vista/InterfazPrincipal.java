package vista;

public class InterfazPrincipal extends javax.swing.JFrame {

    public InterfazPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        // Inicializar el controlador de reportes
        new controlador.ReporteController(this);
        // Mostrar directamente el panel de Reportes (pestaña 5)
        jTabbedPane.setSelectedIndex(5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        panelSidebar = new javax.swing.JPanel();
        lblMenuIncidencias = new javax.swing.JLabel();
        lblMenuUsuarios = new javax.swing.JLabel();
        lblMenuTecnicos = new javax.swing.JLabel();
        lblMenuCategorias = new javax.swing.JLabel();
        lblMenuEspecialidades = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblMenuAsistenteIA = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        panelIncidenciasTab = new javax.swing.JPanel();
        panelUsuariosTab = new javax.swing.JPanel();
        panelTecnicosTab = new javax.swing.JPanel();
        panelCategoriasTab = new javax.swing.JPanel();
        panelEspecialidadesTab = new javax.swing.JPanel();
        panelReportes = new javax.swing.JPanel();
        lblTituloReportes = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnIncidencias = new javax.swing.JButton();
        btnTecnicos = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        panelAsistenteIATab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel Administrativo Help Desk");
        setPreferredSize(new java.awt.Dimension(1050, 640));

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 0, 102));
        lblLogo.setText("LOGO");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelHeader.setBackground(new java.awt.Color(0, 11, 118));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Asistente HelpDesk");

        lblFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblFoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFoto.setForeground(new java.awt.Color(51, 51, 51));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("FOTO");
        lblFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        lblFoto.setOpaque(true);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelSidebar.setBackground(new java.awt.Color(0, 11, 118));

        lblMenuIncidencias.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuIncidencias.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMenuIncidencias.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuIncidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuIncidencias.setText("Incidencias");
        lblMenuIncidencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuIncidencias.setOpaque(true);
        lblMenuIncidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuIncidenciasMouseClicked(evt);
            }
        });

        lblMenuUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMenuUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuUsuarios.setText("💻 Usuarios");
        lblMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuUsuarios.setOpaque(true);
        lblMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuUsuariosMouseClicked(evt);
            }
        });

        lblMenuTecnicos.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuTecnicos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMenuTecnicos.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuTecnicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuTecnicos.setText("👷 Tecnicos");
        lblMenuTecnicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuTecnicos.setOpaque(true);
        lblMenuTecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuTecnicosMouseClicked(evt);
            }
        });

        lblMenuCategorias.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuCategorias.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMenuCategorias.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCategorias.setText("Categorias");
        lblMenuCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuCategorias.setOpaque(true);
        lblMenuCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuCategoriasMouseClicked(evt);
            }
        });

        lblMenuEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMenuEspecialidades.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuEspecialidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuEspecialidades.setText("Especialidades");
        lblMenuEspecialidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuEspecialidades.setOpaque(true);
        lblMenuEspecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuEspecialidadesMouseClicked(evt);
            }
        });

        lblReportes.setBackground(new java.awt.Color(255, 255, 255));
        lblReportes.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(0, 0, 0));
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportes.setText("Reportes");
        lblReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReportes.setOpaque(true);

        lblMenuAsistenteIA.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuAsistenteIA.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMenuAsistenteIA.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuAsistenteIA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuAsistenteIA.setText("Asistente IA");
        lblMenuAsistenteIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuAsistenteIA.setOpaque(true);
        lblMenuAsistenteIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuAsistenteIAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(lblMenuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(lblMenuTecnicos, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(lblMenuCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(lblMenuEspecialidades, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(lblMenuAsistenteIA, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblMenuIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMenuUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMenuTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMenuCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMenuEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMenuAsistenteIA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelIncidenciasTabLayout = new javax.swing.GroupLayout(panelIncidenciasTab);
        panelIncidenciasTab.setLayout(panelIncidenciasTabLayout);
        panelIncidenciasTabLayout.setHorizontalGroup(
            panelIncidenciasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelIncidenciasTabLayout.setVerticalGroup(
            panelIncidenciasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Indicencias", panelIncidenciasTab);

        javax.swing.GroupLayout panelUsuariosTabLayout = new javax.swing.GroupLayout(panelUsuariosTab);
        panelUsuariosTab.setLayout(panelUsuariosTabLayout);
        panelUsuariosTabLayout.setHorizontalGroup(
            panelUsuariosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelUsuariosTabLayout.setVerticalGroup(
            panelUsuariosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Usuarios", panelUsuariosTab);

        javax.swing.GroupLayout panelTecnicosTabLayout = new javax.swing.GroupLayout(panelTecnicosTab);
        panelTecnicosTab.setLayout(panelTecnicosTabLayout);
        panelTecnicosTabLayout.setHorizontalGroup(
            panelTecnicosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelTecnicosTabLayout.setVerticalGroup(
            panelTecnicosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Técnicos", panelTecnicosTab);

        javax.swing.GroupLayout panelCategoriasTabLayout = new javax.swing.GroupLayout(panelCategoriasTab);
        panelCategoriasTab.setLayout(panelCategoriasTabLayout);
        panelCategoriasTabLayout.setHorizontalGroup(
            panelCategoriasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelCategoriasTabLayout.setVerticalGroup(
            panelCategoriasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Categorias", panelCategoriasTab);

        javax.swing.GroupLayout panelEspecialidadesTabLayout = new javax.swing.GroupLayout(panelEspecialidadesTab);
        panelEspecialidadesTab.setLayout(panelEspecialidadesTabLayout);
        panelEspecialidadesTabLayout.setHorizontalGroup(
            panelEspecialidadesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelEspecialidadesTabLayout.setVerticalGroup(
            panelEspecialidadesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Especialidades", panelEspecialidadesTab);

        panelReportes.setBackground(new java.awt.Color(232, 232, 232));

        lblTituloReportes.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloReportes.setText("REPORTES DEL SISTEMA HELPDESK");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado.setText("Estado:");

        cmbEstado.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pendiente", "Asignada", "En Proceso", "Resuelta" }));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCategoria.setText("Categoría:");

        cmbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Hardware", "Software Hospitalario", "Red", "Impresoras", "Correo Institucional", "Base de Datos", "Equipos Biomédicos", "Sistema HIS" }));

        btnIncidencias.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnIncidencias.setText("Reporte de Incidencias");
        btnIncidencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnTecnicos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTecnicos.setText("Incidencias por Técnico");
        btnTecnicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCategorias.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCategorias.setText("Incidencias por Categoría");
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addComponent(btnIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTituloReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Reportes", panelReportes);

        javax.swing.GroupLayout panelAsistenteIATabLayout = new javax.swing.GroupLayout(panelAsistenteIATab);
        panelAsistenteIATab.setLayout(panelAsistenteIATabLayout);
        panelAsistenteIATabLayout.setHorizontalGroup(
            panelAsistenteIATabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelAsistenteIATabLayout.setVerticalGroup(
            panelAsistenteIATabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Asistente IA", panelAsistenteIATab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void lblMenuIncidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuIncidenciasMouseClicked
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_lblMenuIncidenciasMouseClicked

    private void lblMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuUsuariosMouseClicked
        jTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_lblMenuUsuariosMouseClicked

    private void lblMenuTecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTecnicosMouseClicked
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_lblMenuTecnicosMouseClicked

    private void lblMenuCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCategoriasMouseClicked
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_lblMenuCategoriasMouseClicked

    private void lblMenuEspecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuEspecialidadesMouseClicked
        jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_lblMenuEspecialidadesMouseClicked

    private void lblMenuAsistenteIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuAsistenteIAMouseClicked
        jTabbedPane.setSelectedIndex(6);
    }//GEN-LAST:event_lblMenuAsistenteIAMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new InterfazPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCategorias;
    public javax.swing.JButton btnIncidencias;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnTecnicos;
    public javax.swing.JComboBox<String> cmbCategoria;
    public javax.swing.JComboBox<String> cmbEstado;
    public javax.swing.JTabbedPane jTabbedPane;
    public javax.swing.JLabel lblCategoria;
    public javax.swing.JLabel lblEstado;
    public javax.swing.JLabel lblFoto;
    public javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblMenuAsistenteIA;
    public javax.swing.JLabel lblMenuCategorias;
    public javax.swing.JLabel lblMenuEspecialidades;
    public javax.swing.JLabel lblMenuIncidencias;
    public javax.swing.JLabel lblMenuTecnicos;
    public javax.swing.JLabel lblMenuUsuarios;
    public javax.swing.JLabel lblReportes;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblTituloReportes;
    public javax.swing.JPanel panelAsistenteIATab;
    public javax.swing.JPanel panelCategoriasTab;
    public javax.swing.JPanel panelEspecialidadesTab;
    public javax.swing.JPanel panelHeader;
    public javax.swing.JPanel panelIncidenciasTab;
    public javax.swing.JPanel panelLogo;
    public javax.swing.JPanel panelReportes;
    public javax.swing.JPanel panelSidebar;
    public javax.swing.JPanel panelTecnicosTab;
    public javax.swing.JPanel panelUsuariosTab;
    // End of variables declaration//GEN-END:variables
}
