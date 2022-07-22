package main.java.com.company.Figures;

public class AbstractFabricFigure {

    public static IFigure create(double sideA, double sideB, double sideC, String type){
        if (type.equals("Triangle")){
            return FabricTriangle.create(sideA, sideB, sideC);
        }
        if (type.equals("Rectangle")){
            return FabricRectangle.create(sideA, sideB);
        }

        return null;
    }
}
