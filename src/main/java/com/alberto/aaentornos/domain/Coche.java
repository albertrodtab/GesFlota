package com.alberto.aaentornos.domain;

public class Coche extends Vehiculo{

    private String combustible;
    private int numPuertas;
    private String matricula;
    private Float potencia;
    private boolean electrico;

    public Coche(String marca, String modelo, int kms, String anoFabricacion, String numBastidor, boolean alquilado, String combustible,
                 int numPuertas, String matricula, Float potencia, boolean electrico) {
        super(marca, modelo, kms, anoFabricacion, numBastidor, alquilado);
        this.combustible = combustible;
        this.numPuertas = numPuertas;
        this.matricula = matricula;
        this.potencia = potencia;
        this.electrico = electrico;
    }
    public Coche(){

    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Float getPotencia() {
        return potencia;
    }

    public void setPotencia(Float potencia) {
        this.potencia = potencia;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return super.toString().replace("Vehículo: ", "Coche: ")
                + ", combustible= " + combustible
                + ", número puertas= " + numPuertas
                + ", matrícula= " + matricula
                + ", potencia= " + potencia
                + ", eléctrico= " + electrico;
    }
}
