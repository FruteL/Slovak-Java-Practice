package com.company.Figures;

import java.util.Objects;

public class Trapezoid {

    private int height;
    private int sideA;
    private int sideB;

    public Trapezoid() {
    }

    public Trapezoid(int height, int sideA, int sideB) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area (){
        return (double)(getSideA()+getSideB())/2 * getHeight();
    }

    public double getSideC(){
        double shortSideTriangle = (double) (getSideB() - getSideA())/2;
        double sideC = Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));
        return sideC;
    }

    public double perimeter(){
        return getSideC()*2 + getSideA() + getSideB();
    }

    public double inscribedRadius(){
        return Math.sqrt(getSideA() * getSideB())/2;
    }

    public double sinAngle(){
        return getHeight()*getHeight() / area();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    @Override
    public String toString() {
        return "Trapezoid{" +
                "height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trapezoid)) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return getHeight() == trapezoid.getHeight() && getSideA() == trapezoid.getSideA() && getSideB() == trapezoid.getSideB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getSideA(), getSideB());
    }
}
