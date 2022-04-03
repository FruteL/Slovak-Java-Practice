package com.company.Figures;

public class FabricTriangle {

    public static Triangle create(int sideA, int sideB, int sideC){

        if( sideA + sideB >= sideC && sideA + sideC >= sideB && sideB + sideC >= sideA){
            return new Triangle(sideA, sideB, sideC);
        }

        return null;
    }

}
