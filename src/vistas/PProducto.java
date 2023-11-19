package vistas;

import control.ClienteData;
import control.ProductoData;
import entidades.Cliente;
import entidades.Producto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class PProducto extends javax.swing.JPanel {

    private MenuFravemax menuFravemax;
    private DefaultTableModel dtm = new DefaultTableModel();
    private ProductoData pd = new ProductoData();

    public PProducto(MenuFravemax menuFravemax) {
        this.menuFravemax = menuFravemax;

        initComponents();
        crearTabla();
        llenarTabla();
        buttonGroup1.add(jRHabilitados);
        buttonGroup1.add(jRDeshabilitados);
        jTableProductos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                seleccionRowTabla();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JBActualizar = new javax.swing.JButton();
        jBEliminiar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRHabilitados = new javax.swing.JRadioButton();
        jRDeshabilitados = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLNumeroID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTDescrip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTPrecioActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTStockk = new javax.swing.JTextField();
        jBLimpiarAdmC = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JBAgregar = new javax.swing.JButton();
        jTDescripcion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

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

        jPanel2.setBackground(new java.awt.Color(6, 89, 112));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRODUCTOS");

        jRHabilitados.setText("Habilitados");
        jRHabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRHabilitadosActionPerformed(evt);
            }
        });

        jRDeshabilitados.setText("Deshabilitados");
        jRDeshabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDeshabilitadosActionPerformed(evt);
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
                .addComponent(jRHabilitados)
                .addGap(35, 35, 35)
                .addComponent(jRDeshabilitados)
                .addGap(86, 86, 86))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRHabilitados)
                    .addComponent(jRDeshabilitados))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBackground(new java.awt.Color(6, 89, 112));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ADMINISTRAR CLIENTE:");

        jLNumeroID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLNumeroID.setForeground(new java.awt.Color(255, 255, 255));
        jLNumeroID.setText("-");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNumeroID)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addComponent(jLNumeroID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("DESCRIPCION:");

        jTDescrip.setEditable(false);
        jTDescrip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescripActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("PRECIO ACTUAL:");

        jTPrecioActual.setEditable(false);
        jTPrecioActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTPrecioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioActualActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("STOCK:");

        jTStockk.setEditable(false);
        jTStockk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTStockk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTStockkActionPerformed(evt);
            }
        });

        jBLimpiarAdmC.setText("Limpiar");
        jBLimpiarAdmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarAdmCActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ingrese una descripcion de producto");

        jTID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTIDInputMethodTextChanged(evt);
            }
        });
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });
        jTID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTIDPropertyChange(evt);
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
                            .addComponent(jLabel4)
                            .addComponent(jTStockk, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jBLimpiarAdmC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(604, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(249, 249, 249))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTStockk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarAdmC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBackground(new java.awt.Color(6, 89, 112));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRAR PRODUCTO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTPrecio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("$");

        JBAgregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JBAgregar.setText("AGREGAR");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        jTDescripcion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescripcionActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("DESCRIPCION:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("PRECIO:");

        jBLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimpiar.setText("   LIMPIAR");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(229, 229, 229)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(19, 19, 19)))
        );

        jTableProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableProductos);

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
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if (jTableProductos.getSelectedRow() > 0) {
            altaSelectDeTabla();
        } else {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila de la tabla");
        }


    }//GEN-LAST:event_jBAgregarActionPerformed

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        llenarTabla();
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void jBEliminiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminiarActionPerformed

        eliminarSelectDeTabla();

    }//GEN-LAST:event_jBEliminiarActionPerformed

    private void jTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioActionPerformed

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        try {
            Producto p = new Producto();
            p.setDescripcion(jTDescripcion.getText());
            p.setPrecioActual(Double.parseDouble(jTPrecio.getText()));
            pd.insertar(p);
            JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
            clear();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Faltan datos");
        }
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        clear();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescripcionActionPerformed

    private void jRHabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRHabilitadosActionPerformed
        llenarTablaRB();
    }//GEN-LAST:event_jRHabilitadosActionPerformed

    private void jRDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDeshabilitadosActionPerformed
        llenarTablaRB();
    }//GEN-LAST:event_jRDeshabilitadosActionPerformed

    private void jTDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescripActionPerformed

    private void jTPrecioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioActualActionPerformed

    private void jTStockkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTStockkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTStockkActionPerformed

    private void jBLimpiarAdmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarAdmCActionPerformed
        clearPro();
    }//GEN-LAST:event_jBLimpiarAdmCActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed

        try {
            Producto p = new Producto();
            p.setIdProducto(Integer.parseInt(jLNumeroID.getText()));
            p.setDescripcion(jTDescrip.getText());
            p.setPrecioActual(Double.parseDouble(jTPrecioActual.getText()));
            p.setStock(Integer.parseInt(jTStockk.getText()));
            pd.actualizar(p);
            clearPro();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "debe ingresar un numero");
        }
        llenarTabla();

    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jTIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDKeyReleased
        llenarTablaPorSeleccion();
    }//GEN-LAST:event_jTIDKeyReleased

    private void jTIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTIDInputMethodTextChanged
        System.out.println(evt.getText());
    }//GEN-LAST:event_jTIDInputMethodTextChanged

    private void jTIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTIDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton JBAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminiar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBLimpiarAdmC;
    private javax.swing.JLabel jLNumeroID;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRDeshabilitados;
    private javax.swing.JRadioButton jRHabilitados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDescrip;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTPrecioActual;
    private javax.swing.JTextField jTStockk;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables

    private void crearTabla() {
        String[] cabecera = {"CODIGO", "DESCRIPCION", "PRECIO", "STOCK"};
        dtm.setColumnIdentifiers(cabecera);
        jTableProductos.setModel(dtm);
    }

    private void llenarTabla() {

        dtm.setRowCount(0);
        ArrayList<Object> listaProductos = (ArrayList<Object>) pd.obtenerTodo();
        for (Object aux : listaProductos) {
            Producto producto = (Producto) aux;
            if (producto.isEstado()) {
                dtm.addRow(new Object[]{producto.getIdProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
            }
        }
    }

    private void llenarTabla(ArrayList<Producto> productos) {
        for (Object aux : productos) {
            Producto producto = (Producto) aux;
            if (producto.isEstado()) {
                dtm.addRow(new Object[]{producto.getIdProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
            }
        }
    }

    public void llenarTablaPorSeleccion() {
        dtm.setRowCount(0);
        ArrayList<Producto> listaProducto = pd.buscarProductoDesc(jTID.getText());
        llenarTabla(listaProducto);
    }

    public void clearPro() {
        jTDescrip.setText("");
        jTPrecioActual.setText("");
        jTStockk.setText("");
    }

    private void llenarTablaRB() {
        dtm.setRowCount(0);
        List<Object> listaProducto = pd.obtenerTodo();
        for (Object aux : listaProducto) {
            Producto producto = (Producto) aux;
            if (jRHabilitados.isSelected()) {
                if (producto.isEstado()) {
                    dtm.addRow(new Object[]{producto.getIdProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
                }
            } else if (jRDeshabilitados.isSelected()) {
                if (!producto.isEstado()) {
                    dtm.addRow(new Object[]{producto.getIdProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
                }
            } else {
                dtm.addRow(new Object[]{producto.getIdProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
            }
        }
    }

    public void eliminarSelectDeTabla() {

        DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();

        int id = (int) model.getValueAt(jTableProductos.getSelectedRow(), 0);

        Producto p = (Producto) pd.obtenerUno(id);
        if (p.isEstado()) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de dar de BAJA este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                pd.bajaLogicaProducto(p.getIdProducto());

            }
        }
    }

    public void altaSelectDeTabla() {

        DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();

        int id = (int) model.getValueAt(jTableProductos.getSelectedRow(), 0);

        Producto p = (Producto) pd.obtenerUno(id);
        if (!p.isEstado()) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de dar de ALTA este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                pd.altaLogicaProducto(p.getIdProducto());

            }
        }
    }

    public void seleccionRowTabla() {

        if (jTableProductos.getSelectedRow() != -1) {

            DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();
            int numColumnas = model.getColumnCount();
            Object[] fila = new Object[numColumnas];
            for (int i = 0; i < numColumnas; i++) {
                fila[i] = model.getValueAt(jTableProductos.getSelectedRow(), i);
            }

            jTDescrip.setEditable(true);
            jTPrecioActual.setEditable(true);
            jTStockk.setEditable(true);

            jLNumeroID.setText(String.valueOf(fila[0]));
            jTDescrip.setText(String.valueOf(fila[1]));
            jTPrecioActual.setText(String.valueOf(fila[2]));
            jTStockk.setText(String.valueOf(fila[3]));

        } else {
            jLNumeroID.setText("-");
        }
    }

    private void clear() {
        jTDescripcion.setText("");
        jTPrecio.setText("");
    }

    private void clearAdm() {

    }

}
