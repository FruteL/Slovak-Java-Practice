package main.java.com.company;

import main.java.com.company.Figures.Rectangle;

public class Monitor extends Rectangle {

    private String brand;
    private String country;
    private boolean audio;
    private byte responseTime;
    private short refreshRate;
    private String conectionType;
    private String color;
    private byte warranty;

    public Monitor(int lenght, int width) {
        super(lenght, width);
    }

    public Monitor() {
    }

    public Monitor(int lenght, int width, String brand, String country, boolean audio, byte responseTime, short refreshRate, String conectionType, String color, byte warranty) {
        super(lenght, width);
        this.brand = brand;
        this.country = country;
        this.audio = audio;
        this.responseTime = responseTime;
        this.refreshRate = refreshRate;
        this.conectionType = conectionType;
        this.color = color;
        this.warranty = warranty;
    }

    public double createPrice(){
        double price = 0;
        if (diagonal() > 24){
            price+= 1000;
        }
        else if(diagonal() > 18){
            price+= 500;
        }
        else {
            price += 100;
        }
        if (getBrand().equals("LG")){
            price += 500;
        }
        if (getBrand().equals("Acer")){
            price += 750;
        }
        if (getBrand().equals("Sumsung")){
            price += 1000;
        }
        if(isAudio()){
            price+= 250;
        }
        if(refreshRate == 60){
            price+=500;
        }
        else if (refreshRate == 144){
            price+=1000;
        }
        else{
            price+= 200;
        }

        return price;
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
                ", conectionType='" + conectionType + '\'' +
                ", color='" + color + '\'' +
                ", warranty=" + warranty +
                '}';
    }


}
