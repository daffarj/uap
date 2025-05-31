package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements Calculable, Convertible, PIRequired, ShippingCostCalculator, ThreeDeminsional{
    private double majorRadius;
    private double minorRadius;

    public Torus(double majorRadius, double minorRadius){
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public Torus(){

    }

    @Override
    public double getVolume (){
        return 2 * Math.pow(PI, 2) * majorRadius * Math.pow(minorRadius, 2);
    }

    @Override
    public double getSurfaceArea(){
        return 4 * Math.pow(PI, 2) * majorRadius * minorRadius;
    }

    public double getMass(){
        return DESTINY * getSurfaceArea() * THICKNESS;
    }

    
    @Override
    public void printinfo(){
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas Permukaan: " + getSurfaceArea());
        System.out.println("Massa: " + getMass());

    }

    @Override
    public double gramToKilogram(){
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost(){
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

}

