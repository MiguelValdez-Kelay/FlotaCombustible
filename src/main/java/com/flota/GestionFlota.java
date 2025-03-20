package com.flota;

import java.util.ArrayList;
import java.util.List;

public class GestionFlota {
    private final List<Vehiculo> vehiculos;
    private List<CargaCombustible> cargas;

    // Constructor
    public GestionFlota() {
        this.vehiculos = new ArrayList<>();
        this.cargas = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void registrarCarga(Vehiculo vehiculo, CargaCombustible carga) {
        cargas.add(carga);
        vehiculo.setKilometrajeActual(carga.getKilometraje());
    }

    
   public double calcularConsumoPromedio(Vehiculo vehiculo) {
    List<CargaCombustible> cargasVehiculo = new ArrayList<>();
    
    
    for (CargaCombustible carga : cargas) {
        if (carga.getVehiculo().equals(vehiculo)) {
            cargasVehiculo.add(carga);
        }
    }

    
    if (cargasVehiculo.size() < 2) {
        return 0;
    }

    double totalKilometros = 0;
    double totalLitros = 0;
    double kmAnterior = cargasVehiculo.get(0).getKilometraje();  

    
    for (int i = 1; i < cargasVehiculo.size(); i++) {
        double kmActual = cargasVehiculo.get(i).getKilometraje();
        double litros = cargasVehiculo.get(i).getLitrosCargados();
        
        
        totalKilometros += (kmActual - kmAnterior);
        totalLitros += litros;

        
        kmAnterior = kmActual;
    }

    
    return totalLitros > 0 ? totalKilometros / totalLitros : 0;
}


    
    public boolean detectarAnomalia(Vehiculo vehiculo) {
        double consumo = calcularConsumoPromedio(vehiculo);
        return consumo < 5 || consumo > 20; 
    }

    
    public void mostrarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    
    public void mostrarCargas() {
        for (CargaCombustible c : cargas) {
            System.out.println(c);
        }
    }

    
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
