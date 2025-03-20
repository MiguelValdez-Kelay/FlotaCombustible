
package com.flota;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaRegistrarCarga ventanaRegistrarCarga; 
    private GestionFlota gestion;
    
    static VentanaPrincipal getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  

    public VentanaPrincipal() {
        initComponents();
         getContentPane().setBackground(Color.yellow); 
    configurarEventos();
        
        setSize(400,300);
        setLocationRelativeTo(null);
        
        configurarEventos();
    }
    
    private void configurarEventos(){
    
         btnAgregarVehiculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                abrirVentanaRegistrarVehiculo();
            }
        });
    
  btnRegistrar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
        
        if (ventanaRegistrarCarga == null || !ventanaRegistrarCarga.isVisible()) {
            GestionFlota gestion = new GestionFlota();  
            ventanaRegistrarCarga = new VentanaRegistrarCarga(gestion);  
            ventanaRegistrarCarga.setVisible(true);  
        }
    }
});
    
    }
    
   private void abrirVentanaRegistrarVehiculo() {
    VentanaRegistrarVehiculo ventana = VentanaRegistrarVehiculo.getInstance();
    ventana.setVisible(true);
} 
    private void abrirVentanaRegistrar(){
        JOptionPane.showMessageDialog(this, "Abrir ventana para registrar una carga de combustible.");
        
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblGestionAnuncio = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        btnAgregarVehiculo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        lblTitulo.setBackground(new java.awt.Color(255, 51, 0));
        lblTitulo.setText("SHELL");
        lblTitulo.setToolTipText("");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(30, 0, 40, 40);

        lblGestionAnuncio.setText("Gestion de Combustible");
        getContentPane().add(lblGestionAnuncio);
        lblGestionAnuncio.setBounds(100, 10, 140, 16);

        lblBienvenida.setText("Bienvenido al sistema");
        getContentPane().add(lblBienvenida);
        lblBienvenida.setBounds(250, 10, 130, 16);

        btnAgregarVehiculo.setBackground(new java.awt.Color(255, 51, 0));
        btnAgregarVehiculo.setForeground(new java.awt.Color(255, 255, 0));
        btnAgregarVehiculo.setText("Agregar Vehiculo");
        getContentPane().add(btnAgregarVehiculo);
        btnAgregarVehiculo.setBounds(110, 80, 160, 27);

        btnRegistrar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 0));
        btnRegistrar.setText("Registrar Carga");
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(110, 120, 160, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Valdez\\Downloads\\8c3fe3e81642a851bf270f659be55e4d.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblGestionAnuncio;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
