/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;


import control.ClienteData;
import control.CompraData;
import control.DetalleCompraData;
import control.DetalleVentaData;
import control.ProductoData;
import control.ProveedorData;
import control.VentaData;
import entidades.Cliente;
import entidades.Compra;
import entidades.DetalleCompra;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Proveedor;
import entidades.Venta;
import java.awt.Color;
import java.awt.Component;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauri
 */
public class JIFAdminCompra extends javax.swing.JInternalFrame {

    private ClienteData cd = new ClienteData();
    private ProductoData pd = new ProductoData();
    private ProveedorData pvd = new ProveedorData();
    private VentaData vd = new VentaData();
    private CompraData cpd= new CompraData();
    private DetalleCompraData dcd = new DetalleCompraData();
    private DetalleVentaData dvd = new DetalleVentaData();
    private DefaultComboBoxModel comboModelCliente ; 
    private SpinnerNumberModel snm = new SpinnerNumberModel();
    private DefaultTableModel dtm = new DefaultTableModel() ;
    private DefaultTableModel dtmp = new DefaultTableModel() ;
    private DefaultTableModel dtmi = new DefaultTableModel() ;
    
    private int idP ;
    public JIFAdminCompra(int idp) {
        this.idP=idp;
        initComponents();
        setSpinner(0);
        modeloTabla();
        llenarTablaProdcuto();
        llenarTablaInventario();
        llenarCampos();
        
        jTableListaProductos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                seleccionRowTabla();
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBRealizarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBBuscarCantidadStock = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLPrecioTotal = new javax.swing.JLabel();
        jTFCodigoProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaInventario = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTRazonSocial = new javax.swing.JTextField();
        jLID = new javax.swing.JLabel();
        jDateDiaVenta = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListaPedido = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTCantidadBuscar = new javax.swing.JTextField();
        jButtonRefresh = new javax.swing.JButton();
        jButtonRefreshInventario = new javax.swing.JButton();
        jLCompraNum = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Nueva Venta");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBRealizarCompra.setText("Realizar compra");
        jBRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRealizarCompraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("COMPRA PROVEEDOR ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("RAZON SOCIAL");

        jBBuscarCantidadStock.setText("Buscar");
        jBBuscarCantidadStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCantidadStockActionPerformed(evt);
            }
        });

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("CODIGO");

        jLPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLPrecioTotal.setText("-");

        jTFCodigoProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTableListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableListaProductos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("LISTA DE PRODUCTOS PROVEEDOR");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("FECHA");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("$");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("PRECIO TOTAL");

        jSpinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantidadStateChanged(evt);
            }
        });

        jTableListaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableListaInventario.setEnabled(false);
        jScrollPane2.setViewportView(jTableListaInventario);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("PEDIDO");

        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBAgregar.setText("<---");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBEliminar.setText("X");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("CANTIDAD");

        jTRazonSocial.setEditable(false);
        jTRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLID.setText("ID");

        Calendar cal = Calendar.getInstance();
        jDateDiaVenta.setMinSelectableDate(cal.getTime());
        jDateDiaVenta.setMaxSelectableDate(cal.getTime());

        jDateDiaVenta.setDate(cal.getTime()); // Establecer la fecha actual

        jDateDiaVenta.setDateFormatString("yyyy-MM-dd"); // Formato de fecha

        jDateDiaVenta.setEnabled(false); // Deshabilitar la edición
        jDateDiaVenta.setBackground(new java.awt.Color(0, 102, 153));

        jTableListaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableListaPedido.setEnabled(false);
        jScrollPane3.setViewportView(jTableListaPedido);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("LISTA DE INVENTARIO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("BUSCAR POR CANTIDAD:");

        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_arrows_habit_reload_again_sync_icon_252398.png"))); // NOI18N
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonRefreshInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_arrows_habit_reload_again_sync_icon_252398.png"))); // NOI18N
        jButtonRefreshInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshInventarioActionPerformed(evt);
            }
        });

        jLCompraNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLCompraNum))
                                    .addComponent(jTRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBBuscarCantidadStock)
                                    .addComponent(jTCantidadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRefreshInventario)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel16))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinnerCantidad)
                                            .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel14)
                                .addGap(36, 36, 36)
                                .addComponent(jLPrecioTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRefresh)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCompraNum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLID)
                    .addComponent(jLabel13))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLPrecioTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCantidadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(13, 13, 13)
                                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonRefresh)
                                    .addComponent(jButtonRefreshInventario))
                                .addGap(0, 12, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarCantidadStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Nueva Compra");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRealizarCompraActionPerformed

       
      
       Compra c = new Compra();
       
       Date fechaSeleccionada = jDateDiaVenta.getDate();
       Instant instant = fechaSeleccionada.toInstant();
       LocalDate EnLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
       
       c.setFecha(EnLocalDate);
       c.setProveedor((Proveedor) pvd.obtenerUno(Integer.parseInt(jLID.getText())));
       
       cpd.insertar(c);
       
        for (int i = 0; i < jTableListaPedido.getRowCount(); i++) {
            
       DetalleCompra dc = new DetalleCompra();
        
       dc.setCompra(c);
       
       dc.setProducto((Producto) pd.obtenerUno((int)jTableListaPedido.getValueAt(i, 0)));
       dc.setCantidad((int) jTableListaPedido.getValueAt(i, 2));
       dc.setPrecioCosto((double) jTableListaPedido.getValueAt(i, 3));
       
       dcd.insertar(dc);
       
        }
        
       controlStock();
    
       JIFDetalleCompra jif = new JIFDetalleCompra(c.getProveedor().getRazonSocial(),null, EnLocalDate, Double.parseDouble(jLPrecioTotal.getText()), c.getIdCompra());
       jif.setVisible(true);
       dispose();
    }//GEN-LAST:event_jBRealizarCompraActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarCantidadStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCantidadStockActionPerformed
        try {
            llenarTablainventarioStock();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe ingresar un numero en buscar");
        }
        
      
    }//GEN-LAST:event_jBBuscarCantidadStockActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

          if(!jTFCodigoProd.getText().equals("")){
              dtm.setRowCount(0);
              Producto p =  (Producto) pd.obtenerUno(Integer.parseInt(jTFCodigoProd.getText()));
//              double total =  precioCosto * (int)jSpinnerCantidad.getValue();
              dtm.addRow(new Object[]{p.getIdProducto(),p.getDescripcion(),p.getPrecioActual()/2});

          }else{
              JOptionPane.showMessageDialog(null, "Debe ingresar un numero ");
          }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jSpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantidadStateChanged
       

        
    }//GEN-LAST:event_jSpinnerCantidadStateChanged

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        dtmp.setRowCount(0);
        jLPrecioTotal.setText("0");
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
       
        if(jTableListaProductos.getSelectedRowCount() > 0){
            
            Producto p = new Producto();
            p.setIdProducto((int) dtm.getValueAt(jTableListaProductos.getSelectedRow(), 0));
            p.setDescripcion((String) dtm.getValueAt(jTableListaProductos.getSelectedRow(), 1));
           double precioCosto =(double) dtm.getValueAt(jTableListaProductos.getSelectedRow(), 2);
            
            double total =  precioCosto * (int)jSpinnerCantidad.getValue();
            dtmp.addRow(new Object[]{p.getIdProducto(),p.getDescripcion(),jSpinnerCantidad.getValue(),precioCosto,total});
            
            jSpinnerCantidad.setValue(0);
            
            precioLabelTotal();
        }
        
        
        
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        llenarTablaProdcuto();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonRefreshInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshInventarioActionPerformed
       llenarTablaInventario();
    }//GEN-LAST:event_jButtonRefreshInventarioActionPerformed

    public void clear(){
        
 Component[] componentes = getContentPane().getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField ) {
                 JTextField textField = (JTextField) componente;
                textField.setText("");
            }
        }
        jSpinnerCantidad.setValue(0);
    }
    
   
    
  
    
    public void setSpinner(int max){
      
        snm.setMinimum(0);
        snm.setMaximum(100);
        jSpinnerCantidad.setModel(snm);

    }
    
    private void modeloTabla(){
        
        String [] cabecera = {"ID","DESCRIPCION","PRECIO COSTO",};
        String [] cabeceraPedido = {"ID","DESCRIPCION","CANTIDAD","PRECIO COSTO","TOTAL"};
        String [] cabeceraInventario = {"ID","DESCRIPCION","PRECIO ACTUAL","STOCK"};
        
        dtm.setColumnIdentifiers(cabecera);
        jTableListaProductos.setModel(dtm);
        
        dtmp.setColumnIdentifiers(cabeceraPedido);
        jTableListaPedido.setModel(dtmp);
        
        dtmi.setColumnIdentifiers(cabeceraInventario);
        jTableListaInventario.setModel(dtmi);
        
        
    }
    
    private void llenarTablaProdcuto(){
        dtm.setRowCount(0);
        double precioCosto =0;
        ArrayList<Object> ListaProductos = (ArrayList<Object>) pd.obtenerTodo();
        for (Object aux : ListaProductos) {
            Producto producto = (Producto)aux;
            precioCosto = producto.getPrecioActual()/2;
           
            dtm.addRow(new Object[]{producto.getIdProducto(),producto.getDescripcion(),precioCosto});
            
            
        }
    }
    private void llenarTablaInventario(){    
        dtmi.setRowCount(0);
         ArrayList<Object> ListaProductosInventario = (ArrayList<Object>) pd.obtenerTodo();
        for (Object aux : ListaProductosInventario) {
            Producto producto = (Producto)aux;
             if(producto.isEstado()){
          
              dtmi.addRow(new Object[]{producto.getIdProducto(),producto.getDescripcion(),producto.getPrecioActual(),producto.getStock()});
             
             }
        }
        
    }
    private void controlStock(Producto p, int cantidad){
        
        Producto PStockActual = p;
        PStockActual.setStock(p.getStock()-cantidad);
        Producto PStockActualizado  = (Producto) pd.actualizar(p );

    }    

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }
        
    public void llenarCampos(){
        
         Proveedor p = (Proveedor) pvd.obtenerUno(this.idP);
         jTRazonSocial.setText(p.toString());
         jLID.setText(String.valueOf(this.idP));
         
    }
   
    public void seleccionRowTabla(){
       
       if (jTableListaProductos.getSelectedRow() != -1) {

            DefaultTableModel model = (DefaultTableModel) jTableListaProductos.getModel();

            int numColumnas = model.getColumnCount();

            Object[] fila = new Object[numColumnas];
            for (int i = 0; i < numColumnas; i++) {
                fila[i] = model.getValueAt(jTableListaProductos.getSelectedRow(), i);
            }
            
            
  
   }

   } 
    
    private void llenarTablainventarioStock(){
        dtmi.setRowCount(0);
        
        ArrayList<Producto> ListaProductos = pd.buscarPorStock(Integer.parseInt(jTCantidadBuscar.getText()));
        for (Object aux : ListaProductos) {
            Producto producto = (Producto)aux;
           
            dtmi.addRow(new Object[]{producto.getIdProducto(),producto.getDescripcion(),producto.getPrecioActual(),producto.getStock()});
        }
    }
    
    public void precioLabelTotal(){
        
       double suma = 0;
        
       int numR=jTableListaPedido.getRowCount();
        for (int i = 0; i < numR; i++) {
            
          suma +=  (double) dtmp.getValueAt(i, 4);
            
        }
      jLPrecioTotal.setText(String.valueOf(suma));
        
        
    }
   
    public void controlStock(){
        double suma = 0;
       int numID; 
       int numStock;
       Producto p = new Producto();
       int numR=jTableListaPedido.getRowCount();
        for (int i = 0; i < numR; i++) {
            
       numID = (int) jTableListaPedido.getValueAt(i, 0);
       numStock = (int) jTableListaPedido.getValueAt(i, 2);
       p=(Producto) pd.obtenerUno(numID);
       p.setStock(p.getStock()+numStock);
       pd.actualizar(p);
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarCantidadStock;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBRealizarCompra;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRefreshInventario;
    private com.toedter.calendar.JDateChooser jDateDiaVenta;
    private javax.swing.JLabel jLCompraNum;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLPrecioTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTCantidadBuscar;
    private javax.swing.JTextField jTFCodigoProd;
    private javax.swing.JTextField jTRazonSocial;
    private javax.swing.JTable jTableListaInventario;
    private javax.swing.JTable jTableListaPedido;
    private javax.swing.JTable jTableListaProductos;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
