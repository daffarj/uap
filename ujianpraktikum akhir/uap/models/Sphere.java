package uap.models;

import uap.interfaces.*;
import uap.bases.*;

public class Sphere extends Shape implements ThreeDeminsional, Calculable, Convertible, PIRequired, ShippingCostCalculator{
    
    private double radius;

    public Sphere() {};
    public Sphere(double radius) {
        this.radius = radius;
    };
    
    @Override
    public double getVolume(){
        return 4.0/3.0 * PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea(){
        return 4 * PI * Math.pow(radius,2);
    }

    @Override
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

