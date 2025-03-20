package com.flota;

import java.util.Date;

public class CargaCombustible {
    private Vehiculo vehiculo;
    private Date fecha;
    private double litrosCargados;
    private double kilometraje;
    private double precioPorLitro;

    // Constructor
    public CargaCombustible(Vehiculo vehiculo, Date fecha, double litrosCargados, double kilometraje, double precioPorLitro) {
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.litrosCargados = litrosCargados;
        this.kilometraje = kilometraje;
        this.precioPorLitro = precioPorLitro;
    }

    
    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public double getLitrosCargados() { return litrosCargados; }
    public void setLitrosCargados(double litrosCargados) { this.litrosCargados = litrosCargados; }

    public double getKilometraje() { return kilometraje; }
    public void setKilometraje(double kilometraje) { this.kilometraje = kilometraje; }

    public double getPrecioPorLitro() { return precioPorLitro; }
    public void setPrecioPorLitro(double precioPorLitro) { this.precioPorLitro = precioPorLitro; }

    @Override
    public String toString() {
        return "CargaCombustible{" +
                ", fecha=" + fecha +
                ", litrosCargados=" + litrosCargados +
                ", kilometraje=" + kilometraje +
                ", precioPorLitro=" + precioPorLitro +
                '}';
    }
}
