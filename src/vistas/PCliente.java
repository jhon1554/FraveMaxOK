
package vistas;


import control.ClienteData;
import entidades.Cliente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class PCliente extends javax.swing.JPanel {
    
    private MenuFravemax menuFravemax;
    private DefaultTableModel dtm = new DefaultTableModel();
    private ClienteData cd = new ClienteData();
    public PCliente(MenuFravemax menuFravemax) {
        
        this.menuFravemax = menuFravemax;
        
        initComponents();
        crearTabla();
        jRadioBActivos.setSelected(true);
        llenarTabla();
        jTableClientes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                seleccionRowTabla();
            }
        });

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBActualizar = new javax.swing.JButton();
        jBEliminiar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioBInactivos = new javax.swing.JRadioButton();
        jRadioBActivos = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jBLimpiarAdmC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();
        jTApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLNumeroID = new javax.swing.JLabel();
        jRadioBDni = new javax.swing.JRadioButton();
        jRadioBApellido = new javax.swing.JRadioButton();
        jTID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTNuevoDni = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTNuevoDomicilio = new javax.swing.JTextField();
        jTNuevoTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBAgregar1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTNuevoNombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTNuevoApellido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        JBClearNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(6, 89, 138));

        JBActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_arrows_habit_reload_again_sync_icon_252398.png"))); // NOI18N
        JBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActionPerformed(evt);
            }
        });

        jBEliminiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEliminiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biggarbagebin_121980.png"))); // NOI18N
        jBEliminiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminiarActionPerformed(evt);
            }
        });

        jBAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_icon-icons.com_74429.png"))); // NOI18N
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableClientes);

        jPanel2.setBackground(new java.awt.Color(6, 89, 112));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CLIENTES");

        jRadioBInactivos.setText("INACTIVOS");
        jRadioBInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBInactivosActionPerformed(evt);
            }
        });

        jRadioBActivos.setText("ACTIVOS");
        jRadioBActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioBActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioBInactivos)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addComponent(jRadioBInactivos)
                .addComponent(jRadioBActivos))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("TELEFONO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("DOMICILIO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jTTelefono.setEditable(false);
        jTTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoActionPerformed(evt);
            }
        });

        jBLimpiarAdmC.setText("Limpiar");
        jBLimpiarAdmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarAdmCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("APELLIDO:");

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jTApellido.setEditable(false);
        jTApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("DNI:");

        jTDomicilio.setEditable(false);
        jTDomicilio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ingrese Datos del Cliente segun Eleccion.");

        jTDni.setEditable(false);
        jTDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });

        jTNombre.setEditable(false);
        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(6, 89, 112));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ADMINISTRAR CLIENTE ID:");

        jLNumeroID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLNumeroID.setForeground(new java.awt.Color(255, 255, 255));
        jLNumeroID.setText("-");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNumeroID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLNumeroID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioBDni.setText("DNI");
        jRadioBDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBDniActionPerformed(evt);
            }
        });

        jRadioBApellido.setText("APELLIDO");
        jRadioBApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBApellidoActionPerformed(evt);
            }
        });

        jTID.setEditable(false);
        jTID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });
        jTID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jBLimpiarAdmC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(276, 276, 276)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jRadioBDni)
                            .addComponent(jRadioBApellido)))
                    .addComponent(jLabel3))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(587, Short.MAX_VALUE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioBDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioBApellido))
                .addGap(3, 3, 3)
                .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarAdmC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTNuevoDni.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("DOMICILIO");

        jTNuevoDomicilio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTNuevoTelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("TELEFONO");

        jBAgregar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_icon-icons.com_74429.png"))); // NOI18N
        jBAgregar1.setText("    AGREGAR");
        jBAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregar1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("NOMBRE ");

        jTNuevoNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("APELLIDO");

        jTNuevoApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("DNI");

        jPanel5.setBackground(new java.awt.Color(6, 89, 112));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NUEVO CLIENTE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JBClearNuevo.setText("Limpiar");
        JBClearNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClearNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jTNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTNuevoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNuevoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jBAgregar1)
                        .addGap(18, 18, 18)
                        .addComponent(JBClearNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNuevoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNuevoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBClearNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminiar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminiar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if(jTableClientes.getSelectedRow()>0){
            ActivarSelectdeTable();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        }
       
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        jRadioBActivos.setSelected(true);
        jRadioBInactivos.setSelected(false);
        llenarTabla();
        clear();
        clearAdm();
        jTID.setText("");
        jTID.setEditable(false);
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void jBEliminiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminiarActionPerformed
        
        eliminarSelectDeTabla();
        
    }//GEN-LAST:event_jBEliminiarActionPerformed

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed

    }//GEN-LAST:event_jTDomicilioActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoActionPerformed

    private void jBLimpiarAdmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarAdmCActionPerformed
        clearAdm();
    }//GEN-LAST:event_jBLimpiarAdmCActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        try{
            
                Cliente c = new Cliente();
                c.setIdCliente(Integer.parseInt(jLNumeroID.getText()));
                c.setNombre(jTNombre.getText());
                c.setApellido(jTApellido.getText());
                c.setDni(Integer.parseInt(jTDni.getText()));
                c.setDomicilio(jTDomicilio.getText());
                c.setTelefono(Integer.parseInt(jTTelefono.getText()));
                cd.actualizar(c);

                clearAdm();
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "debe ingresar un numero");
        }
        llenarTabla();
        jTID.setText("");
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoActionPerformed

    private void jBAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregar1ActionPerformed
        Cliente c = new Cliente();
        c.setNombre(jTNuevoNombre.getText());
        c.setApellido(jTNuevoApellido.getText());
        c.setDni(Integer.parseInt(jTNuevoDni.getText()));
        c.setDomicilio(jTNuevoDomicilio.getText());
        c.setTelefono(Integer.parseInt(jTNuevoTelefono.getText()));

        cd.insertar(c);

        JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
        clear();
    }//GEN-LAST:event_jBAgregar1ActionPerformed

    private void JBClearNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClearNuevoActionPerformed
        clear();
    }//GEN-LAST:event_JBClearNuevoActionPerformed

    private void jRadioBInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBInactivosActionPerformed
      jRadioBActivos.setSelected(false);
       llenarTabla(); 
        
        
    }//GEN-LAST:event_jRadioBInactivosActionPerformed

    private void jRadioBActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBActivosActionPerformed
       jRadioBInactivos.setSelected(false);
       llenarTabla();
    }//GEN-LAST:event_jRadioBActivosActionPerformed

    private void jRadioBDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBDniActionPerformed
        llenarTabla();
        jRadioBApellido.setSelected(false);
        jTID.setText("");
        jTID.setEditable(true);
        noEnablejtf();
    }//GEN-LAST:event_jRadioBDniActionPerformed

    private void jRadioBApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBApellidoActionPerformed
         llenarTabla();
        jRadioBDni.setSelected(false);
        jTID.setText("");
         jTID.setEditable(true);
         noEnablejtf();
    }//GEN-LAST:event_jRadioBApellidoActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jTIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDKeyReleased
        llenarTablaPorSeleccion();
    }//GEN-LAST:event_jTIDKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton JBClearNuevo;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBAgregar1;
    private javax.swing.JButton jBEliminiar;
    private javax.swing.JButton jBLimpiarAdmC;
    private javax.swing.JLabel jLNumeroID;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioBActivos;
    private javax.swing.JRadioButton jRadioBApellido;
    private javax.swing.JRadioButton jRadioBDni;
    private javax.swing.JRadioButton jRadioBInactivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNuevoApellido;
    private javax.swing.JTextField jTNuevoDni;
    private javax.swing.JTextField jTNuevoDomicilio;
    private javax.swing.JTextField jTNuevoNombre;
    private javax.swing.JTextField jTNuevoTelefono;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable jTableClientes;
    // End of variables declaration//GEN-END:variables

    private void crearTabla(){
        String [] cabecera = {"ID","APELLIDO","NOMBRE","DNI","DOMICILIO","TELEFONO"};
        dtm.setColumnIdentifiers(cabecera);
        jTableClientes.setModel(dtm); 
    }
    
    private void llenarTabla(){
        
        dtm.setRowCount(0);
        ArrayList<Object>listaCliente = cd.obtenerTodo();
        for (Object aux : listaCliente) {
            Cliente cliente = (Cliente)aux;
            if(jRadioBActivos.isSelected()){
                if(cliente.isEstado()){
                   dtm.addRow(new Object[]{cliente.getIdCliente(),cliente.getApellido(),cliente.getNombre(),cliente.getDni(),cliente.getDomicilio(),cliente.getTelefono()}); 
                }
            }else if(jRadioBInactivos.isSelected()){
                if(!cliente.isEstado()){
                   dtm.addRow(new Object[]{cliente.getIdCliente(),cliente.getApellido(),cliente.getNombre(),cliente.getDni(),cliente.getDomicilio(),cliente.getTelefono()});  
                }
            }else{
                dtm.addRow(new Object[]{cliente.getIdCliente(),cliente.getApellido(),cliente.getNombre(),cliente.getDni(),cliente.getDomicilio(),cliente.getTelefono()});
            }
        }
        noEnablejtf();
    }
    
    public void llenarTablaPorSeleccion(){
    
        if(jRadioBDni.isSelected()){
            dtm.setRowCount(0);
        ArrayList<Cliente>listaCliente = cd.buscarClienteDNI(jTID.getText());
        for (Object aux : listaCliente) {
            Cliente cliente = (Cliente)aux;
            dtm.addRow(new Object[]{cliente.getIdCliente(),cliente.getApellido(),cliente.getNombre(),cliente.getDni(),cliente.getDomicilio(),cliente.getTelefono()});
        }
        }
        
        if(jRadioBApellido.isSelected()){
            
        dtm.setRowCount(0);
        ArrayList<Cliente>listaCliente = cd.buscarClienteApellido(jTID.getText());
        for (Object aux : listaCliente) {
            Cliente cliente = (Cliente)aux;
            dtm.addRow(new Object[]{cliente.getIdCliente(),cliente.getApellido(),cliente.getNombre(),cliente.getDni(),cliente.getDomicilio(),cliente.getTelefono()});
        }
        
        }    
        
    }
    
    
    
   public void eliminarSelectDeTabla(){
       
       DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
       
       int id = (int) model.getValueAt(jTableClientes.getSelectedRow(), 0);
        
        Cliente c = (Cliente) cd.obtenerUno(id);
        if(c.isEstado()){
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de dar de BAJA este cliente?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION) {
                cd.bajaLogicaCliente(c.getIdCliente());
               
            }
        }
       llenarTabla();
   } 

   public void ActivarSelectdeTable(){
       DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
       
       int id = (int) model.getValueAt(jTableClientes.getSelectedRow(), 0);
        
        Cliente c = (Cliente) cd.obtenerUno(id);
        if(!c.isEstado()){
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de dar de ALTA este cliente?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION) {
                cd.habilitarCliente(c);
               
            }
        }
        llenarTabla();
   }
   
   public void seleccionRowTabla(){
       
       if (jTableClientes.getSelectedRow() != -1) {
           
            DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
            int numColumnas = model.getColumnCount();
            Object[] fila = new Object[numColumnas];
            for (int i = 0; i < numColumnas; i++) {
                fila[i] = model.getValueAt(jTableClientes.getSelectedRow(), i);
            }
            
            jTNombre.setEditable(true);
            jTApellido.setEditable(true);
            jTDni.setEditable(true);
            jTDomicilio.setEditable(true);
            jTTelefono.setEditable(true);
            
            jLNumeroID.setText(String.valueOf(fila[0]));
            jTNombre.setText(String.valueOf(fila[2]));
            jTApellido.setText(String.valueOf(fila[1]));
            jTDni.setText(String.valueOf(fila[3]));
            jTDomicilio.setText(String.valueOf(fila[4]));
            jTTelefono.setText(String.valueOf(fila[5]));
   }else{
           jLNumeroID.setText("-");
       }
   }
   
    private void clear() {
        jTNuevoNombre.setText("");
        jTNuevoApellido.setText("");
        jTNuevoDni.setText("");
        jTNuevoDomicilio.setText("");
        jTNuevoTelefono.setText("");
    }
    private void clearAdm() {
        jTNombre.setText("");
        jTApellido.setText("");
        jTDni.setText("");
        jTDomicilio.setText("");
        jTTelefono.setText("");
    }
    
    public void noEnablejtf(){
        if(!jRadioBDni.isSelected()&&!jRadioBApellido.isSelected()){
            jTID.setEditable(false);
        }
    }
    
}
