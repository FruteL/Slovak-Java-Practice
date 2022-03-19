package com.company;

import com.company.Figures.Rectangle;

public class Monitor extends Rectangle {

    private String brand;
    private String country;
    private boolean audio;
    private byte responseTime;
    private short refreshRate;
    private short price;
    private String conectionType;
    private String color;

    public Monitor(int lenght, int width) {
        super(lenght, width);
    }

    public Monitor() {
    }

    public Monitor(String brand, String country, boolean audio, byte responseTime, short refreshRate, short price, String conectionType, String color) {
        this.brand = brand;
        this.country = country;
        this.audio = audio;
        this.responseTime = responseTime;
        this.refreshRate = refreshRate;
        this.price = price;
        this.conectionType = conectionType;
        this.color = color;
    }

    public Monitor(int lenght, int width, String brand, String country, boolean audio, byte responseTime, short refreshRate, short price, String conectionType, String color) {
        super(lenght, width);
        this.brand = brand;
        this.country = country;
        this.audio = audio;
        this.responseTime = responseTime;
        this.refreshRate = refreshRate;
        this.price = price;
        this.conectionType = conectionType;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isAudio() {
        return audio;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }

    public byte getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(byte responseTime) {
        this.responseTime = responseTime;
    }

    public short getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(short refreshRate) {
        this.refreshRate = refreshRate;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public String getConectionType() {
        return conectionType;
    }

    public void setConectionType(String conectionType) {
        this.conectionType = conectionType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", audio=" + audio +
                ", responseTime=" + responseTime +
                ", refreshRate=" + refreshRate +
                ", price=" + price +
                ", conectionType='" + conectionType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void switchON(){
        System.out.println("Monitor is working");
    }
    public void switchOff(){
        System.out.println("Monitor is sleeping");
    }
}
