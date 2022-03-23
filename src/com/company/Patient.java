package com.company;

import java.time.LocalDate;

public class Patient extends Person {
    private String diagnise;

    public Patient() {
    }

    public Patient(String diagnise) {
        this.diagnise = diagnise;
    }

    public Patient(String firstName, String secondName, LocalDate dateofBirthd, String diagnise) {
        super(firstName, secondName, dateofBirthd);
        this.diagnise = diagnise;
    }

    public String getDiagnise() {
        return diagnise;
    }

    public void setDiagnise(String diagnise) {
        this.diagnise = diagnise;
    }
}
