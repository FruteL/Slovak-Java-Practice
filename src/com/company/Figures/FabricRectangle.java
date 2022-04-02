package com.company.Figures;

public class FabricRectangle {

    public static Rectangle create(int lenght, int width){

        if( lenght > 0 && width > 0) {
            return new Rectangle(lenght, width);
        }
        return null;
    }

}
