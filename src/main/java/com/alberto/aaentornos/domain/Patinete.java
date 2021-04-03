package com.alberto.aaentornos.domain;

public class Patinete extends Vehiculo{

    private boolean electrico;
    private boolean incluyeCasco;
    private Float potencia;


    public Patinete(String marca, String modelo, int kms, String anoFabricacion, String numBastidor, boolean alquilado,
                    boolean incluyeCasco, Float potencia, boolean electrico) {
        super(marca, modelo, kms, anoFabricacion, numBastidor, alquilado);
        this.incluyeCasco = incluyeCasco;
        this.potencia = potencia;
        this.electrico = electrico;
    }

    public Patinete(){

    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean isIncluyeCasco() {
        return incluyeCasco;
    }

    public void setIncluyeCasco(boolean incluyeCasco) {
        this.incluyeCasco = incluyeCasco;
    }

    public Float getPotencia() {
        return potencia;
    }

    public void setPotencia(Float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString().replace("Vehículo: ", "Patinete: ")
                + ", incluye casco= " + incluyeCasco
                + ", potencia= " + potencia
                + ", eléctrico= " + electrico;
    }
}
