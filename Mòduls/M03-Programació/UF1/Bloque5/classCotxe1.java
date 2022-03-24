package Bloque5;

import java.util.Scanner;

public class classCotxe1 {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the electric
     */
    public boolean isElectric() {
        return electric;
    }

    /**
     * @param electric the electric to set
     */
    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    private String marca;
    private String model;
    private int potencia;
    private boolean electric;

    public classCotxe1() {
        this.marca = "";
        this.model = "";
        this.potencia = 0;
        this.electric = false;
    }

    public classCotxe1(String mar, String mod, int pot) {
        this.marca = mar;
        this.model = mod;
        this.potencia = pot;
    }

    public void imprime() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModel());
        System.out.println("Potencia: " + this.getPotencia());
        if (this.isElectric()) {
            System.out.println("El vehículo es eléctrico");
        } else {
            System.out.println("El vehículo no es eléctrico");
        }
    }
    public int aumentaPotencia(int incremento){
        this.setPotencia(this.getPotencia() + incremento);
        return this.getPotencia();
    }
}
