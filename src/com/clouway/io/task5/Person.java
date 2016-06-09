package com.clouway.io.task5;

public class Person implements java.io.Serializable{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }
}
