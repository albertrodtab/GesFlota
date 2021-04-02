package com.alberto.aaentornos.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Moto extends Vehiculo{

    private String combustible;
    private boolean incluyeCasco;
    private String matricula;
    private Float potencia;
    private boolean electrico;


    public Moto(String marca, String modelo, int kms, String anoFabricacion, String numBastidor, boolean alquilado, String combustible,
                boolean incluyeCasco, String matricula, Float potencia, boolean electrico){
        super(marca, modelo, kms, anoFabricacion, numBastidor, alquilado);
        this.combustible = combustible;
        this.incluyeCasco = incluyeCasco;
        this.matricula = matricula;
        this.potencia = potencia;
        this.electrico = electrico;
    }

    public Moto(){

    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public boolean isIncluyeCasco() {
        return incluyeCasco;
    }

    public void setIncluyeCasco(boolean incluyeCasco) {
        this.incluyeCasco = incluyeCasco;
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
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Moto)) return false;

        Moto moto = (Moto) o;

        return new EqualsBuilder().appendSuper(super.equals(o)).append(isIncluyeCasco(), moto.isIncluyeCasco()).
                append(isElectrico(), moto.isElectrico()).append(getCombustible(), moto.getCombustible()).
                append(getMatricula(), moto.getMatricula()).append(getPotencia(), moto.getPotencia()).isEquals();
    }

    @Override
    public String toString() {
        return super.toString().replace("Vehículo: ", "Moto: ")
                + ", combustible= " + combustible
                + ", incluye casco= " + incluyeCasco
                + ", matrícula= " + matricula
                + ", potencia= " + potencia
                + ", eléctrico= " + electrico;
    }
}
