package sample;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surName;
    private LocalDate birthdate;
    private String age;
    private boolean isAlive;
    private Gender gender;


    //relative type eklencek

    //program ilk açıldığında ana ekrandan sonra kullanan kişinin bilgileri istenecek ondan sonra ona göre relationlar alınacak ???

    // relation type sıkıntı çöz

    public Person(String name, String surName, String age, LocalDate birthdate, boolean isAlive, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.birthdate = birthdate;
        this.isAlive = isAlive;
        this.gender = gender;
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



    public void showInfo(Person person) {
        person.getName();
    }
}
