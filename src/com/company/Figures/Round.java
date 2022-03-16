package com.company.Figures;

import java.util.Objects;

public class Round {

    private int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    public Round() {
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public int getDiametr(){
        return radius*2;
    }

    public int getRadius() {
        return radius;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Round{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Round)) return false;
        Round round = (Round) o;
        return getRadius() == round.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
