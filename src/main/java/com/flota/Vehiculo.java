
package com.flota;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double capacidadTanque;
    private double kilometrajeActual;

    public Vehiculo(String placa, String marca, String modelo, double capacidadTanque, double kilometrajeActual) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadTanque = capacidadTanque;
        this.kilometrajeActual = kilometrajeActual;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getCapacidadTanque() { return capacidadTanque; }
    public void setCapacidadTanque(double capacidadTanque) { this.capacidadTanque = capacidadTanque; }

    public double getKilometrajeActual() { return kilometrajeActual; }
    public void setKilometrajeActual(double kilometrajeActual) { this.kilometrajeActual = kilometrajeActual; }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadTanque=" + capacidadTanque +
                ", kilometrajeActual=" + kilometrajeActual +
                '}';
    }
}
