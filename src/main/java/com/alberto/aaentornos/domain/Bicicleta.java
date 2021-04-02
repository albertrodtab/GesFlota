package com.alberto.aaentornos.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Bicicleta extends Vehiculo {

    private boolean electrico;
    private boolean incluyeCasco;
    private Float potencia;


    public Bicicleta(String marca, String modelo, int kms, String anoFabricacion, String numBastidor, boolean alquilado,
                     boolean incluyeCasco, Float potencia, boolean electrico) {
        super(marca, modelo, kms, anoFabricacion, numBastidor, alquilado);
        this.incluyeCasco = incluyeCasco;
        this.potencia = potencia;
        this.electrico = electrico;
    }

    public Bicicleta(){

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
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Bicicleta)) return false;

        Bicicleta bicicleta = (Bicicleta) o;

        return new EqualsBuilder().appendSuper(super.equals(o)).
                append(isElectrico(), bicicleta.isElectrico()).
                append(isIncluyeCasco(), bicicleta.isIncluyeCasco()).
                append(getPotencia(), bicicleta.getPotencia()).isEquals();
    }

    @Override
    public String toString() {
        return super.toString().replace("Vehículo: ", "Bicicleta: ")
                + ", incluye casco= " + incluyeCasco
                + ", potencia= " + potencia
                + ", eléctrico= " + electrico;
    }
}