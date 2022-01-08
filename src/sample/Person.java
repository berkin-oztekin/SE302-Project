package sample;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surName;
    private LocalDate birthdate;
    private String age;
    private boolean isAlive;
    private Gender gender;
    private Parent parent;

    //relative type eklencek

    //program ilk açıldığında ana ekrandan sonra kullanan kişinin bilgileri istenecek ondan sonra ona gre relationlar alınacak ???

    // relation type sıkıntı çöz

    public Person(String name, String surName, String age, LocalDate birthdate, boolean isAlive, Gender gender, Parent parent) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.birthdate = birthdate;
        this.isAlive = isAlive;
        this.gender = gender;
        this.parent = parent;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
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

    public void showInfo(Person person) {
        System.out.println(person.getName()+person.getSurName()+person.getAge()+person.getGender()+person.getBirthdate()+person.isAlive()+person.getParent());
    }
}
