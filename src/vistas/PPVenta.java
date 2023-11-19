
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
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class PPVenta extends javax.swing.JPanel {
    private MenuFravemax menuFravemax;
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultTableModel dtmd = new DefaultTableModel();
    private DetalleVentaData dvd = new DetalleVentaData();
    private VentaData vd = new VentaData();
    private ClienteData cd = new ClienteData();
    private ProductoData pd = new ProductoData();
    public PPVenta(MenuFravemax menuFravemax) {
        this.menuFravemax = menuFravemax;
        
        initComponents();
        crearTabla();
        llenarTablaVenta();
        
         jTableVentas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLPrecioFinal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jBBuscarPorFecha = new javax.swing.JButton();

        setBackground(new java.awt.Color(6, 89, 138));

        JBActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_arrows_habit_reload_again_sync_icon_252398.png"))); // NOI18N
        JBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActionPerformed(evt);
            }
        });

        jTableDetalle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableDetalle);

        jTableVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableVentas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DETALLE DE VENTA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("PRECIO FINAL DE VENTA:");

        jLPrecioFinal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLPrecioFinal.setText("-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("BUSCAR VENTA POR FECHA:");

        jBBuscarPorFecha.setText("BUSCAR");
        jBBuscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(897, 897, 897)
                                .addComponent(jBBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jBBuscarPorFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLPrecioFinal))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(JBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        llenarTablaVenta();
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void jBBuscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPorFechaActionPerformed
       
        llenarTablaVentaFecha(jDateChooser.getDate());
        
        
    }//GEN-LAST:event_jBBuscarPorFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton jBBuscarPorFecha;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLPrecioFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalle;
    private javax.swing.JTable jTableVentas;
    // End of variables declaration//GEN-END:variables

        private void crearTabla(){
        String [] cabecera = {"FECHA","NUMERO DE VENTA","CLIENTE","DNI"};
        dtm.setColumnIdentifiers(cabecera);
        jTableVentas.setModel(dtm); 
        
        String [] cabeceraDetalle = {"PRODUCTO","CANTIDAD","PRECIO UNIDAD","PRECIO TOTAL"};
        dtmd.setColumnIdentifiers(cabeceraDetalle);
        jTableDetalle.setModel(dtmd); 
    }

    private void llenarTablaVenta(){
        
        dtm.setRowCount(0);
        ArrayList<Object>listaVentas = (ArrayList<Object>) vd.obtenerTodo();
        for (Object aux : listaVentas) {
            Venta v = (Venta) aux;
            Cliente c = (Cliente) cd.obtenerUno(v.getCliente().getIdCliente());
          
            dtm.addRow(new Object[]{v.getFecha().toString(),v.getIdVenta(),c.getApellido(),c.getDni()});
           
        }
    }
   private void llenarTablaDetalle(int id){
        double precioT = 0;
        dtmd.setRowCount(0);
        ArrayList<DetalleVenta>listaVentas =  dvd.obtenerProductosVenta(id);
       
        for (Object aux : listaVentas) {
            DetalleVenta dv = (DetalleVenta)aux;
            Venta v = (Venta) vd.obtenerUno(dv.getVenta().getIdVenta());
            Cliente c = (Cliente) cd.obtenerUno(v.getCliente().getIdCliente());
            Producto p = (Producto) pd.obtenerUno(dv.getProducto().getIdProducto());
            
            dtmd.addRow(new Object[]{p.getDescripcion(),dv.getCantidad(),p.getPrecioActual(),dv.getPrecioVenta()});
           
            precioT+=dv.getPrecioVenta();
        }
        jLPrecioFinal.setText(String.valueOf(precioT));
    }
      public void seleccionRowTabla(){
       
          int id = 0;
    
    if (jTableVentas.getSelectedRow() != -1) {
        DefaultTableModel model = (DefaultTableModel) jTableVentas.getModel();
        int selectedRow = jTableVentas.getSelectedRow();

        id = (int) model.getValueAt(selectedRow, 1); 

        llenarTablaDetalle(id);
    }
}
     
      private void llenarTablaVentaFecha(Date d){
        
        dtm.setRowCount(0);
        
        java.util.Date fechaSeleccionada = jDateChooser.getDate();

        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(fechaSeleccionada);
        
        ArrayList<Venta>listaVentas =  vd.obtenerTodoPorFecha( fechaFormateada);
        for (Object aux : listaVentas) {
            Venta v = (Venta) aux;
            Cliente c = (Cliente) cd.obtenerUno(v.getCliente().getIdCliente());
          
            dtm.addRow(new Object[]{v.getFecha().toString(),v.getIdVenta(),c.getApellido(),c.getDni()});
           
        }
    }
      
      
   }   
        

      
      


