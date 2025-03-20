package com.flota;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaRegistrarVehiculo extends javax.swing.JFrame {
    private static List<Vehiculo> listaVehiculos = new ArrayList<>();
    
    private static VentanaRegistrarVehiculo instancia = null;
    
    //  Método para obtener la única instancia de la ventana
    public static VentanaRegistrarVehiculo getInstance() {
        if (instancia == null) {
            instancia = new VentanaRegistrarVehiculo();
        }
        return instancia;
    }
    


    public VentanaRegistrarVehiculo() {
        initComponents();
        getContentPane().setBackground(Color.yellow);
        
        setSize(400,300);
        setLocationRelativeTo(null);
        
        // Evitar que se abran múltiples ventanas
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                instancia = null; 
            }
        });
        
        btnRegresar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        new VentanaPrincipal().setVisible(true); 
    }
});
        
        btnMostrarVehiculos.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        mostrarVehiculos(); 
    }
});
btnMostrarVehiculos.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        mostrarVehiculos(); 
    }
});
        
         btnGuardar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guardarVehiculo(); 
        }
    });

          
    }
    
    
   
    private void mostrarVehiculos() {
    txtAreaVehiculos.setText(""); 

    if (listaVehiculos.isEmpty()) {
        txtAreaVehiculos.append("No hay vehículos registrados.\n");
        return;
    }

   
    for (Vehiculo vehiculo : listaVehiculos) {
        txtAreaVehiculos.append("Placa:       " + vehiculo.getPlaca() + "\n");
        txtAreaVehiculos.append("Marca:       " + vehiculo.getMarca() + "\n");
        txtAreaVehiculos.append("Modelo:      " + vehiculo.getModelo() + "\n");
        txtAreaVehiculos.append("Capacidad:   " + vehiculo.getCapacidadTanque() + " Litros\n");
        txtAreaVehiculos.append("Kilometraje: " + vehiculo.getKilometrajeActual() + " km\n");
        txtAreaVehiculos.append("---------------------------\n");
    }
}

    
    private void guardarVehiculo() {
    String placa = txtPlaca.getText().trim();
    String marca = txtMarca.getText().trim();
    String modelo = txtModelo.getText().trim();
    String capacidadStr = txtCapacidad.getText().trim();
    String kilometrajeStr = txtKilometraje.getText().trim(); 

    
    if (placa.isEmpty() || marca.isEmpty() || modelo.isEmpty() || capacidadStr.isEmpty() || kilometrajeStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    double capacidad;
    double kilometraje;
    try {
        capacidad = Double.parseDouble(capacidadStr);
        kilometraje = Double.parseDouble(kilometrajeStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Capacidad y Kilometraje deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

   
    Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo, capacidad, kilometraje);
    listaVehiculos.add(nuevoVehiculo);

   
    JOptionPane.showMessageDialog(this, "Vehículo registrado con éxito:\n"
        + "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCapacidad: " + capacidad + " litros\n"
        + "Kilometraje: " + kilometraje + " km");

    
    txtPlaca.setText("");
    txtMarca.setText("");
    txtModelo.setText("");
    txtCapacidad.setText("");
    txtKilometraje.setText("");
}



    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVehiculos = new javax.swing.JTextArea();
        btnMostrarVehiculos = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Registrar Vehiculo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 160, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Valdez\\Downloads\\8c3fe3e81642a851bf270f659be55e4d (1).png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 50, 60);

        jLabel3.setText("Placa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 60, 16);

        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 130, 50, 16);

        jLabel5.setText("Marca");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 100, 50, 16);

        jLabel6.setText("Capacidad");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 160, 70, 16);
        getContentPane().add(txtPlaca);
        txtPlaca.setBounds(110, 70, 80, 26);
        getContentPane().add(txtMarca);
        txtMarca.setBounds(110, 100, 80, 26);
        getContentPane().add(txtModelo);
        txtModelo.setBounds(110, 130, 80, 26);
        getContentPane().add(txtCapacidad);
        txtCapacidad.setBounds(110, 160, 80, 26);

        btnGuardar.setBackground(new java.awt.Color(255, 51, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 0));
        btnGuardar.setText("Guardar");
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(140, 220, 100, 27);

        jLabel7.setText("Kilometraje");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 190, 70, 16);
        getContentPane().add(txtKilometraje);
        txtKilometraje.setBounds(110, 190, 80, 26);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        txtAreaVehiculos.setEditable(false);
        txtAreaVehiculos.setColumns(20);
        txtAreaVehiculos.setRows(5);
        jScrollPane1.setViewportView(txtAreaVehiculos);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 100, 200, 80);

        btnMostrarVehiculos.setBackground(new java.awt.Color(255, 51, 0));
        btnMostrarVehiculos.setForeground(new java.awt.Color(255, 255, 0));
        btnMostrarVehiculos.setText("Mostrar Vehiculos");
        getContentPane().add(btnMostrarVehiculos);
        btnMostrarVehiculos.setBounds(230, 60, 140, 27);

        btnRegresar.setBackground(new java.awt.Color(255, 51, 0));
        btnRegresar.setForeground(new java.awt.Color(255, 255, 0));
        btnRegresar.setText("Menu");
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(20, 220, 100, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarVehiculos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVehiculos;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
