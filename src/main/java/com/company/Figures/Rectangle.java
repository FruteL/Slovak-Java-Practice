package main.java.com.company.Figures;

import java.util.Objects;

public class Rectangle implements IFigure{

    private double lenght;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getArea() {
        return this.getWidth() * this.getLenght();
    }

    public double getPerimeter() {
        return 2 * (getLenght() * getWidth());
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(getLenght(), 2) + Math.pow(getWidth(), 2));
    }

    public double describedRadius(){
        return diagonal()/2;
    }

    public double inscribedRadius(){
        return (double) getWidth()/2;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return (getLenght() == rectangle.getLenght() && getWidth() == rectangle.getWidth()) ||
                (getLenght() == rectangle.getWidth() && getWidth() == rectangle.getLenght());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLenght(), getWidth());
    }
}
