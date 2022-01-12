package sample;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String age;
    private Gender gender;


    //relative type eklencek

    //program ilk açıldığında ana ekrandan sonra kullanan kişinin bilgileri istenecek ondan sonra ona göre relationlar alınacak ???

    // relation type sıkıntı çöz

    public Person(String name, String age, Gender gender) {
        this.name = name;
        this.age = age;
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
