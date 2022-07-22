package main.java.com.company;

import java.time.LocalDate;

public class Student extends Person {

    private String university;
    private long studentID;
    private long libraryCardId;
    private String faculty;
    private String group;
    private byte year;
    private int missLessons;
    private byte averageMark;
    private boolean groupLeader;
    private boolean expelled;


    public Student(String firstName, String secondName, String patronymic, LocalDate dateofBirthd, long passportId, String countryFrom, String cityFrom, String street, short numberOfHouse, String phoneNumber, short growth, short weight, boolean isLive, boolean haveWork, int income, String university, long studentID, long libraryCardId, String faculty, String group, byte year, int missLessons, byte averageMark, boolean groupLeader, boolean expelled) {
        super(firstName, secondName, patronymic, dateofBirthd, passportId, countryFrom, cityFrom, street, numberOfHouse, phoneNumber, growth, weight, isLive, haveWork, income);
        this.university = university;
        this.studentID = studentID;
        this.libraryCardId = libraryCardId;
        this.faculty = faculty;
        this.group = group;
        this.year = year;
        this.missLessons = missLessons;
        this.averageMark = averageMark;
        this.groupLeader = groupLeader;
        this.expelled = expelled;
    }

    public Student(String university, long studentID, long libraryCardId, String faculty, String group, byte year, int missLessons, byte averageMark, boolean groupLeader, boolean expelled) {
        this.university = university;
        this.studentID = studentID;
        this.libraryCardId = libraryCardId;
        this.faculty = faculty;
        this.group = group;
        this.year = year;
        this.missLessons = missLessons;
        this.averageMark = averageMark;
        this.groupLeader = groupLeader;
        this.expelled = expelled;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getLibraryCardId() {
        return libraryCardId;
    }

    public void setLibraryCardId(long libraryCardId) {
        this.libraryCardId = libraryCardId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public byte getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    public int getMissLessons() {
        return missLessons;
    }

    public void setMissLessons(int missLessons) {
        this.missLessons = missLessons;
    }

    public byte getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(byte averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(boolean groupLeader) {
        this.groupLeader = groupLeader;
    }

    public boolean isExpelled() {
        return expelled;
    }

    public void setExpelled(boolean expelled) {
        this.expelled = expelled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", studentID=" + studentID +
                ", libraryCardId=" + libraryCardId +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                ", missLessons=" + missLessons +
                ", averageMark=" + averageMark +
                ", groupLeader=" + groupLeader +
                ", expelled=" + expelled +
                '}';
    }

    public static class Builder {

        private Student student;

        public Builder() {
            student =new Student();
        }

        public Builder withUniversity(String university){
            student.university = university;
            return this;
        }

        public Builder withStudentID(long studentID){
            student.studentID = studentID;
            return this;
        }

        public Builder withLibraryIDCard(long setLibraryIDCard){
            student.libraryCardId = setLibraryIDCard;
            return this;
        }

        public Builder withFaculty(String faculty){
            student.faculty = faculty;
            return this;
        }

        public Builder withGroup (String group){
            student.group = group;
            return this;
        }

        public Builder withYear(byte year){
            student.year = year;
            return this;
        }

        public Builder withMissLessons(int missLessons){
            student.missLessons = missLessons;
            return this;
        }

        public  Builder withAverageMark(byte averageMark){
            student.averageMark = averageMark;
            return this;
        }

        public Builder withGroupLeader(boolean groupLeader){
            student.groupLeader = groupLeader;
            return this;
        }

        public Builder withExpelled (boolean expelled){
            student.expelled = expelled;
            return this;
        }

        public Student build(){
            return student;
        }

    }
}
