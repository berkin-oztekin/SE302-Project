package sample;

public class Person {
    private String name;
    private String surName;
    private String birthdate;
    private boolean isAlive;
    private Gender gender;
    private Parent parent;

    public Person(String name, String surName, String birthdate, boolean isAlive, Gender gender, Parent parent) {
        this.name = name;
        this.surName = surName;
        this.birthdate = birthdate;
        this.isAlive = isAlive;
        this.gender = gender;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
