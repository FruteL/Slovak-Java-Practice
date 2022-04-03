package com.company.Figures;

import java.util.Objects;

public class Triangle implements IFigure {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    public double height(){
        double p = (double)getPerimeter()/2;
        double h = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC)) * 2 / sideA;
        return h;
    }

    public double getArea(){
        return height() * sideA / 2;
    }

    public double inscribedRadius(){
        double p = (double) getPerimeter()/2;
        double r = Math.sqrt((p-sideA) * (p-sideB) * (p-sideC)/p);
        return r;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getSideA() == triangle.getSideA() &&
                getSideB() == triangle.getSideB() &&
                getSideC() == triangle.getSideC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getSideC());
    }
}
