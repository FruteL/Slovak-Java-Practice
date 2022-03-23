package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person implements IFormat{

    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateofBirthd;
    private long passportId;
    private String CountryFrom;
    private String CityFrom;
    private String street;
    private short numberOfHouse;
    private String phoneNumber;
    private short growth;
    private short weight;
    private boolean isLive;
    private boolean haveWork;
    private int income;


    public Person(String firstName, String secondName, LocalDate dateofBirthd) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateofBirthd = dateofBirthd;
    }

    public Person() {
    }

    public Person(String firstName, String secondName, String patronymic, LocalDate dateofBirthd, long passportId, String countryFrom, String cityFrom, String street, short numberOfHouse, String phoneNumber, short growth, short weight, boolean isLive, boolean haveWork, int income) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateofBirthd = dateofBirthd;
        this.passportId = passportId;
        CountryFrom = countryFrom;
        CityFrom = cityFrom;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
        this.phoneNumber = normalizeNumber(phoneNumber);
        this.growth = growth;
        this.weight = weight;
        this.isLive = isLive;
        this.haveWork = haveWork;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getDateofBirthd() {
        return dateofBirthd;
    }

    public void setDateofBirthd(LocalDate dateofBirthd) {
        this.dateofBirthd = dateofBirthd;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getPassportId() {
        return passportId;
    }

    public void setPassportId(long passportId) {
        this.passportId = passportId;
    }

    public String getCountryFrom() {
        return CountryFrom;
    }

    public void setCountryFrom(String countryFrom) {
        CountryFrom = countryFrom;
    }

    public String getCityFrom() {
        return CityFrom;
    }

    public void setCityFrom(String cityFrom) {
        CityFrom = cityFrom;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public short getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(short numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String normalizeNumber (String number){
        String newnumber;
        if (getCountryFrom().equals("Ukraine"))
            newnumber = "+380 (" + number.substring(0, 2) + ") " + number.substring(2, 5) + " " + number.substring(5, 7) + " " + number.substring(7, 9);
        else{
            newnumber = number;
        }
        return newnumber;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = normalizeNumber(number);
    }

    public short getGrowth() {
        return growth;
    }

    public void setGrowth(short growth) {
        this.growth = growth;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public boolean isHaveWork() {
        return haveWork;
    }

    public void setHaveWork(boolean haveWork) {
        this.haveWork = haveWork;
    }

    public boolean isAdult() {
        int age = getAge();
        return 18 >= age;
    }

    public int getAge() {
        int age = (int) ChronoUnit.YEARS.between(LocalDate.now(), getDateofBirthd());
        return age;
    }

    @Override
    public String toJSON() {
        return "{" +
                "\"firstName\": " + "\"" + firstName + '\"' +
                ", \"secondName\": " + "\"" + secondName + "\"" +
                ", \"patronymic\": " + "\"" + patronymic + "\"" +
                ", \"dateofBirthd\": " + "\"" + dateofBirthd + "\"" +
                ", \"passportId\": " + passportId +
                ", \"CountryFrom\": "+ "\"" + CountryFrom + "\"" +
                ", \"CityFrom\": " + "\"" + CityFrom + "\"" +
                ", \"street\": "  + "\"" + street + "\"" +
                ", \"numberOfHouse\": " + numberOfHouse +
                ", \"phoneNumber\": " + "\"" + phoneNumber +"\"" +
                ", \"growth\": " + growth +
                ", \"weight\": " + weight +
                ", \"isLive\": " + isLive +
                ", \"haveWork\": " + haveWork +
                ", \"income\": " + income +
                '}';
    }

    @Override
    public String toXML() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "\n <Person>" +
                "\n\t<firstName>" + firstName + "</firstName>" +
                "\n\t<secondName>"+ secondName+ "</secondName>" +
                "\n\t<patronymic>"+ patronymic + "</patronymic>"+
                "\n\t<dateofBirthd>"+ dateofBirthd +"</dateofBirthd>" +
                "\n\t<passportId>"+ passportId + "</passportId>" +
                "\n\t<CountryFrom>"+ CountryFrom +"</CountryFrom>" +
                "\n\t<CityFrom>"+CityFrom + "</CityFrom>"+
                "\n\t<street>"+street+"</street>"+
                "\n\t<numberOfHouse>"+numberOfHouse +"</numberOfHouse>"+
                "\n\t<phoneNumber>"+phoneNumber+"</phoneNumber>"+
                "\n\t<growth>"+growth + "</growth>"+
                "\n\t<weight>"+ weight + "</weight>"+
                "\n\t<isLive>"+ isLive +"</isLive>"+
                "\n\t<haveWork>"+haveWork+"</haveWork>"+
                "\n\t<income>"+income+"</income>"+
                "\n </Person>";
    }

    @Override
    public String toString() {
        return "Persone{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateofBirthd=" + dateofBirthd +
                ", passportId=" + passportId +
                ", CountryFrom='" + CountryFrom + '\'' +
                ", CityFrom='" + CityFrom + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", growth=" + growth +
                ", weight=" + weight +
                ", isLive=" + isLive +
                ", haveWork=" + haveWork +
                ", income=" + income +
                '}';
    }
}
