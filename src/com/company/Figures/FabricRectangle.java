package com.company.Figures;

public class FabricRectangle {

    public static Rectangle create(double lenght, double width){

        if( lenght > 0 && width > 0) {
            return new Rectangle(lenght, width);
        }
        return null;
    }

}
