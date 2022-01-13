package sample;

import javafx.beans.property.StringProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable {
    public String name;
    public String age;
    public Gender gender;
    public Person mother;
    public Person father;
    public ArrayList<Person> siblings = new ArrayList<Person>();
    public ArrayList<Person> child = new ArrayList<Person>();


    //relative type eklencek

    //program ilk açıldığında ana ekrandan sonra kullanan kişinin bilgileri istenecek ondan sonra ona göre relationlar alınacak ???

    // relation type sıkıntı çöz

    public Person() {

    }

    public Person(String name, String age, Gender gender, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public Person(String name, String age, Gender gender, Person mother, Person father, ArrayList<Person> siblings, ArrayList<Person> child) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.siblings = siblings;
        this.child = child;
    }

    public Person(String name, String age, Gender gender, Person mother, Person father, ArrayList<Person> siblings) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.siblings = siblings;
    }

    public Person(String name, String age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
