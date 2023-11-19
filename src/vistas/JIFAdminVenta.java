
package vistas;


import control.ClienteData;
import control.DetalleVentaData;
import control.ProductoData;
import control.VentaData;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
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
public class JIFAdminVenta extends javax.swing.JInternalFrame {

    private ClienteData cd = new ClienteData();
    private ProductoData pd = new ProductoData();
    private VentaData vd = new VentaData();
    private DetalleVentaData dvd = new DetalleVentaData();
    private DefaultComboBoxModel comboModelCliente ; 
    private SpinnerNumberModel snm = new SpinnerNumberModel();
    private DefaultTableModel dtm = new DefaultTableModel() ;
    private DefaultTableModel dtmC = new DefaultTableModel() ;
    private double precioAPagar=0;
    
    
    public JIFAdminVenta() {
        initComponents();
        llenarCBCliente();
        setSpinner(0);
        modeloTabla();
        llenarTablaProdcuto();
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
        jBGenerarVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jDateDiaVenta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFCodigoProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTFStock = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTFPrecioUnidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JTFPrecioTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jBBuscarProducto = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jBAgregarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaCarrito = new javax.swing.JTable();
        jTFBuscarSelectiva = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jBLimpiarTabla = new javax.swing.JButton();
        jlPrecioApagar = new javax.swing.JLabel();
        jlP = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Nueva Venta");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBGenerarVenta.setBackground(new java.awt.Color(6, 89, 138));
        jBGenerarVenta.setText("Generar venta");
        jBGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarVentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NUEVA VENTA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("CLIENTE:");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jComboBoxCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Calendar cal = Calendar.getInstance();
        jDateDiaVenta.setMinSelectableDate(cal.getTime());
        jDateDiaVenta.setMaxSelectableDate(cal.getTime());

        jDateDiaVenta.setDate(cal.getTime()); // Establecer la fecha actual

        jDateDiaVenta.setDateFormatString("yyyy-MM-dd"); // Formato de fecha

        jDateDiaVenta.setEnabled(false); // Deshabilitar la edición
        jDateDiaVenta.setBackground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("PRODUCTO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("CODIGO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("CANTIDAD");

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
        jTableListaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableListaProductos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("CARRITO DEL CLIENTE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("STOCK");

        JTFStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFStock.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        JTFStock.setEnabled(false);

        jTFDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFDescripcion.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        jTFDescripcion.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("DESCRIPCION");

        JTFPrecioUnidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFPrecioUnidad.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        JTFPrecioUnidad.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("PRECIO UNIDAD");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("FECHA");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("$");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("PRECIO TOTAL");

        JTFPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFPrecioTotal.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        JTFPrecioTotal.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("$");

        jBBuscarProducto.setText("BUSCAR");
        jBBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProductoActionPerformed(evt);
            }
        });

        jSpinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantidadStateChanged(evt);
            }
        });

        jBAgregarProducto.setText("+ Agregar producto");
        jBAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarProductoActionPerformed(evt);
            }
        });

        jTableListaCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableListaCarrito.setEnabled(false);
        jScrollPane2.setViewportView(jTableListaCarrito);

        jTFBuscarSelectiva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBuscarSelectiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscarSelectivaKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("ID:");

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelID.setText("-");

        jBLimpiarTabla.setText("Limpiar Tabla");
        jBLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarTablaActionPerformed(evt);
            }
        });

        jlPrecioApagar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlPrecioApagar.setText("-");

        jlP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlP.setText("PRECIO A PAGAR $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFBuscarSelectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(499, 499, 499))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel12)
                                                        .addComponent(JTFPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel14)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jBGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jBAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(5, 5, 5)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(JTFPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(7, 7, 7))
                                                .addComponent(jLabel15)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel17)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabelID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(30, 30, 30))
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBLimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlP))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jlPrecioApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jBBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscarSelectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(JTFPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPrecioApagar)
                            .addComponent(jlP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBLimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenerarVentaActionPerformed
        

        ArrayList<DetalleVenta> listaDV = new ArrayList();
        Venta v = new Venta();
        
        Date fechaSeleccionada = jDateDiaVenta.getDate();
        Instant instant = fechaSeleccionada.toInstant();
        LocalDate EnLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        
        v.setCliente((Cliente) jComboBoxCliente.getSelectedItem());
        v.setFecha(EnLocalDate);
        
        vd.insertar(v);
       
        
     
        for (int i = 0; i < jTableListaCarrito.getRowCount(); i++) {
        
        DetalleVenta dv = new DetalleVenta();
        dv.setVenta(v);
        
        dv.setProducto((Producto) pd.obtenerUno((int)jTableListaCarrito.getValueAt(i, 0)));
        dv.setCantidad((int) jTableListaCarrito.getValueAt(i, 3));
        dv.setPrecioVenta(Double.parseDouble((String) jTableListaCarrito.getValueAt(i, 4)));
        
        dvd.insertar(dv);
        System.out.println(listaDV);
        listaDV.add(dv);
        controlStock(dv.getProducto(), dv.getCantidad());
        }
 
        precioFinal();
        
         JIFDetalleVenta jifDV = new JIFDetalleVenta(v.getCliente().toString(),listaDV,EnLocalDate,Double.parseDouble(jlPrecioApagar.getText()),v.getIdVenta());   
         jifDV.setVisible(true);
            
        
        
        
//        JIFDetalleVenta jifDV = new JIFDetalleVenta(v.getIdVenta(),dv.getIdDetalleVenta(),v.getCliente().toString()
//                ,dv.getProducto().toString(),dv.getPrecioVenta(),dv.getCantidad(),
//                precioT,EnLocalDate);
//        jifDV.setVisible(true);
        
        //falta confirmacion....
        
       
        clear();
        dispose();
    }//GEN-LAST:event_jBGenerarVentaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        clear();       
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProductoActionPerformed
        
        if(!jTFCodigoProd.getText().equals("")){
            jSpinnerCantidad.setValue(1);
            Producto p = (Producto) pd.obtenerUno(Integer.parseInt(jTFCodigoProd.getText()));
            jLabelID.setText(String.valueOf(p.getIdProducto()));
            jTFDescripcion.setText(p.getDescripcion());
            JTFStock.setText(String.valueOf(p.getStock()));
            JTFPrecioUnidad.setText(String.valueOf(p.getPrecioActual()));
            JTFPrecioTotal.setText(String.valueOf(precioTotal()));
            setSpinner(p.getStock());
            
        }else{
              JOptionPane.showMessageDialog(null, "Debe ingresar un numero ");
          }

    }//GEN-LAST:event_jBBuscarProductoActionPerformed

    private void jSpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantidadStateChanged
       
        if(!JTFPrecioUnidad.getText().equals("")){
            JTFPrecioTotal.setText(String.valueOf(precioTotal()));
        }
        
    }//GEN-LAST:event_jSpinnerCantidadStateChanged

    private void jBAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarProductoActionPerformed
        if(!JTFStock.getText().equals("0")){
 
        Producto p = new Producto();
        p.setIdProducto(Integer.parseInt(jLabelID.getText()));
        p.setDescripcion(jTFDescripcion.getText());
        p.setPrecioActual(Double.parseDouble(JTFPrecioUnidad.getText()));
        p.setStock(Integer.parseInt(JTFStock.getText()));
        p.setEstado(true);
//        if(jTableListaCarrito.get){
            dtmC.addRow(new Object[]{p.getIdProducto(),p.getDescripcion(),p.getPrecioActual(),jSpinnerCantidad.getValue(),JTFPrecioTotal.getText()});
//        }
        precioFinal();
        clear();
        }else{
            JOptionPane.showMessageDialog(null, "No hay stock del producto solicitado");
        }
       

    }//GEN-LAST:event_jBAgregarProductoActionPerformed

    private void jTFBuscarSelectivaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarSelectivaKeyReleased
        
        dtm.setRowCount(0);
        ArrayList<Producto>listaProductos = dvd.buscarProductoNombre(jTFBuscarSelectiva.getText());
        for (Object aux : listaProductos) {
            Producto p = (Producto)aux;
            dtm.addRow(new Object[]{p.getIdProducto(),p.getDescripcion(),p.getPrecioActual(),p.getStock()});
        }
        
        
    }//GEN-LAST:event_jTFBuscarSelectivaKeyReleased

    private void jBLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarTablaActionPerformed
        dtmC.setRowCount(0);
    }//GEN-LAST:event_jBLimpiarTablaActionPerformed

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
    
    public void llenarCBCliente(){
     ArrayList<Object> ListaClientes = cd.obtenerTodo();
     comboModelCliente = new DefaultComboBoxModel(ListaClientes.toArray()); 
     jComboBoxCliente.setModel(comboModelCliente);
    }
    
    public double precioTotal(){
        double precioTotal = Integer.parseInt( jSpinnerCantidad.getValue().toString())*Double.parseDouble(JTFPrecioUnidad.getText());
        return precioTotal;
    }
    
    public void setSpinner(int max){
      
        snm.setMinimum(0);
        snm.setMaximum(max);
        jSpinnerCantidad.setModel(snm);

    }
    
    private void modeloTabla(){
        
        String [] cabecera = {"ID","DESCRIPCION","PRECIO ACTUAL","STOCK"};
        dtm.setColumnIdentifiers(cabecera);
        jTableListaProductos.setModel(dtm);
        
        
        String [] cabeceraCarrito = {"ID","DESCRIPCION","PRECIO ACTUAL","CANTIDAD","PRECIO TOTAL"};
        dtmC.setColumnIdentifiers(cabeceraCarrito);
        jTableListaCarrito.setModel(dtmC);
    }
    
    private void llenarTablaProdcuto(){
        dtm.setRowCount(0);
        Cliente c = (Cliente) jComboBoxCliente.getSelectedItem();
        ArrayList<Object> ListaProductos = (ArrayList<Object>) pd.obtenerTodo();
        for (Object aux : ListaProductos) {
            
            Producto producto = (Producto)aux;
            if(producto.isEstado()){
            dtm.addRow(new Object[]{producto.getIdProducto(),producto.getDescripcion(),producto.getPrecioActual(),producto.getStock()});
            }
            
        }
    }
    private void controlStock(Producto p, int cantidad){
        
        Producto PStockActual = p;
        PStockActual.setStock(p.getStock()-cantidad);
        Producto PStockActualizado  = (Producto) pd.actualizar(p );

    }    
        
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFPrecioTotal;
    private javax.swing.JTextField JTFPrecioUnidad;
    private javax.swing.JTextField JTFStock;
    private javax.swing.JButton jBAgregarProducto;
    private javax.swing.JButton jBBuscarProducto;
    private javax.swing.JButton jBGenerarVenta;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBLimpiarTabla;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Cliente> jComboBoxCliente;
    private com.toedter.calendar.JDateChooser jDateDiaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTFBuscarSelectiva;
    private javax.swing.JTextField jTFCodigoProd;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTable jTableListaCarrito;
    private javax.swing.JTable jTableListaProductos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlP;
    private javax.swing.JLabel jlPrecioApagar;
    // End of variables declaration//GEN-END:variables

    private void precioFinal() {
        double precio=0;
        for (int i = 0; i < jTableListaCarrito.getRowCount(); i++) {
            
           precio +=  Double.parseDouble((String) jTableListaCarrito.getValueAt(i, 4)) ;
           
        }
        jlPrecioApagar.setText(String.valueOf(precio));
    }
    
    public void seleccionRowTabla(){
        
       // "ID","DESCRIPCION","PRECIO ACTUAL","STOCK"
        
          if (jTableListaProductos.getSelectedRow() != -1) {

            DefaultTableModel model = (DefaultTableModel) jTableListaProductos.getModel();

            int numColumnas = model.getColumnCount();

            Object[] fila = new Object[numColumnas];
            for (int i = 0; i < numColumnas; i++) {
                fila[i] = model.getValueAt(jTableListaProductos.getSelectedRow(), i);
            }
            
            jSpinnerCantidad.setValue(1);
            JTFPrecioTotal.setText(String.valueOf(fila[2]));
            jLabelID.setText(String.valueOf(fila[0]));
            jTFDescripcion.setText((String) fila[1]);
            JTFPrecioUnidad.setText(String.valueOf(fila[2]));
            JTFStock.setText(String.valueOf(fila[3]));
             setSpinner((int) fila[3]);

    }
}
}