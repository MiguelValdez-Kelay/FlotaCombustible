package com.flota;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class VentanaRegistrarCarga extends javax.swing.JFrame {
    private GestionFlota gestion;

    public VentanaRegistrarCarga(GestionFlota gestion) {
        this.gestion = gestion;
        initComponents();
        getContentPane().setBackground(Color.yellow);
        setSize(400,300);
        setLocationRelativeTo(null);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCarga();
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(); 
                ventanaPrincipal.setVisible(true); 
                dispose(); 
            }
        });

       
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });
    }
    
   private void guardarCarga() {
    String fechaStr = txtFecha.getText().trim();
    String litrosStr = txtLitros.getText().trim();
    String precioStr = txtPrecio.getText().trim();

    if (fechaStr.isEmpty() || litrosStr.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double litros, precio;
    try {
        litros = Double.parseDouble(litrosStr);
        precio = Double.parseDouble(precioStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los valores deben ser numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota", "Corolla", 50, 10000);

    
    CargaCombustible carga = new CargaCombustible(vehiculo, new java.util.Date(), litros, vehiculo.getKilometrajeActual(), precio);
    gestion.registrarCarga(vehiculo, carga); 

   
    double consumo = gestion.calcularConsumoPromedio(vehiculo);
    boolean esAnomalo = gestion.detectarAnomalia(vehiculo);

    lblConsumo.setText("Consumo: " + String.format("%.2f", consumo) + " km/l");

    if (esAnomalo) {
        lblConsumo.setForeground(java.awt.Color.RED);
        lblConsumo.setText(lblConsumo.getText() + " ANOMALÍA DETECTADA");
    } else {
        lblConsumo.setForeground(java.awt.Color.BLUE);
    }
    String mensaje = "Carga registrada con éxito:\n"
            + "Fecha: " + fechaStr + "\n"
            + "Litros: " + litros + "\n"
            + "Precio por Litro: " + precio + "\n"
            + "Consumo Promedio: " + String.format("%.2f", consumo) + " km/l";

    if (esAnomalo) {
        mensaje += "\n ALERTA: Posible anomalía detectada en el consumo.";
    }

    JOptionPane.showMessageDialog(this, mensaje);

   
    txtFecha.setText("");
    txtLitros.setText("");
    txtPrecio.setText("");
}




 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLitros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblConsumo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Registrar Carga");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 100, 16);

        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 76, 50, 30);
        getContentPane().add(txtFecha);
        txtFecha.setBounds(110, 80, 80, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Valdez\\Downloads\\8c3fe3e81642a851bf270f659be55e4d (1).png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 50, 40);

        jLabel5.setText("Litros");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 106, 29, 30);
        getContentPane().add(txtLitros);
        txtLitros.setBounds(110, 110, 80, 26);

        jLabel6.setText("Precio");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 136, 37, 30);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(110, 140, 80, 26);

        btnRegresar.setBackground(new java.awt.Color(255, 51, 0));
        btnRegresar.setForeground(new java.awt.Color(255, 255, 0));
        btnRegresar.setText("Regresar");
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(40, 210, 90, 27);

        btnGuardar.setBackground(new java.awt.Color(255, 51, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 0));
        btnGuardar.setText("Guardar");
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(150, 210, 90, 27);

        btnCancelar.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 0));
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(260, 210, 90, 27);
        getContentPane().add(lblConsumo);
        lblConsumo.setBounds(50, 180, 330, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    
     
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            GestionFlota gestion = new GestionFlota(); // Crear objeto GestionFlota
                gestion.agregarVehiculo(new Vehiculo("ABC123", "Toyota", "Corolla", 50, 10000));
                gestion.agregarVehiculo(new Vehiculo("XYZ789", "Honda", "Civic", 60, 20000));
                new VentanaRegistrarCarga(gestion).setVisible(true); // Pasar la instancia como parámetro
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblConsumo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLitros;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
