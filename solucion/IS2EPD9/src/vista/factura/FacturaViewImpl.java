package vista.factura;

import controlador.FacturaController;
import java.util.List;
import modelo.entidades.Cliente;
import modelo.entidades.Factura;
import vista.cliente.ClienteTableAndComboModel;

/**
 *
 * @author Norberto Díaz-Díaz
 */
public class FacturaViewImpl extends javax.swing.JPanel implements FacturaView {

    //Atributos del MVC
    private FacturaController controller;

    //Atributos propios de Swing
    private FacturaTableModel facturaTableModel;
    private FacturaViewImplInternal panelFactura;
    private ClienteTableAndComboModel clienteComboModel;

    /** Creates new form ClienteViewImpl */
    public FacturaViewImpl() {
        facturaTableModel = new FacturaTableModel();
        //comboModel = new ClienteTableAndComboModel();
        clienteComboModel=ClienteTableAndComboModel.create();
        initComponents();

        this.panelFactura = new FacturaViewImplInternal(this);
        this.jPanelFactura.add(this.panelFactura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFacturas = new javax.swing.JTable();
        jPanelFactura = new javax.swing.JPanel();
        jComboBoxCliente = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonQuitarFiltro = new javax.swing.JButton();

        jTableFacturas.setModel(facturaTableModel);
        jTableFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFacturas);

        jPanelFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelFactura.setLayout(new javax.swing.BoxLayout(jPanelFactura, javax.swing.BoxLayout.LINE_AXIS));

        jComboBoxCliente.setModel(clienteComboModel);

        jLabel1.setText("Cliente");

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButtonQuitarFiltro.setText("QuitarFiltro");
        jButtonQuitarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxCliente, 0, 104, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButtonFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonQuitarFiltro)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFiltrar)
                            .addComponent(jButtonQuitarFiltro))))
                .addGap(18, 18, 18)
                .addComponent(jPanelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFacturasMouseClicked
        FacturaTableModel ctm = (FacturaTableModel) this.jTableFacturas.getModel();
        Factura factura = ctm.getRow(this.jTableFacturas.getSelectedRow());
        panelFactura.setFactura(factura);
    }//GEN-LAST:event_jTableFacturasMouseClicked

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        ClienteTableAndComboModel ccm=(ClienteTableAndComboModel)this.jComboBoxCliente.getModel();
        Cliente cliente= ccm.getRow(this.jComboBoxCliente.getSelectedIndex());
        List<Factura> facturas= this.getController().listaFacturasPorClienteGesture(cliente.getDNI());
        facturaTableModel.setFacturas(facturas);
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonQuitarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarFiltroActionPerformed
        dataModelChanged();
    }//GEN-LAST:event_jButtonQuitarFiltroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonQuitarFiltro;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelFactura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFacturas;
    // End of variables declaration//GEN-END:variables

    protected ClienteTableAndComboModel getComboModel() {
        return clienteComboModel;
    }

      protected void fireNuevaFacturaGesture(String identificador, Cliente cliente, String importe) {
        this.getController().nuevaFacturaGesture(identificador, cliente, importe);
    }

    protected void fireActualizaFacturaGesture(String identificador, Cliente cliente, String importe) {
        this.getController().actualizaFacturaGesture(identificador, cliente, importe);
    }

    protected void fireBorraFacturaGesture(String identificador) {
        this.getController().borraFacturaGesture(identificador);
    }

    @Override
    public FacturaController getController() {
        return controller;
    }

    @Override
    public void setController(FacturaController controller) {
        this.controller=controller;
    }

    @Override
    public void dataModelChanged() {
        facturaTableModel.setFacturas(this.getController().listaFacturasGesture());
    }

    @Override
    public void display(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                dataModelChanged();
            }
        });

    }    
}
