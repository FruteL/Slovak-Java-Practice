package com.company.Figures;

public class FabricTriangle {

    public static Triangle create(double sideA, double sideB, double sideC){

        if( sideA + sideB >= sideC && sideA + sideC >= sideB && sideB + sideC >= sideA){
            return new Triangle(sideA, sideB, sideC);
        }

        return null;
    }

}
