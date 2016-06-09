package com.clouway.io.task5;

import java.io.*;

public class Demo5 {
    public static void main(String [] args){
        DataClass data = new DataClass();
        OutputStream output = null;
        InputStream input = null;
        Person man = new Person("John", 25, 'M');

        try {
            output = new FileOutputStream("Save.ser");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        try {
            input = new FileInputStream("Save.ser");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }

        try {
            data.saveObject(output,man);
        } catch (IOException e) {
            e.getStackTrace();
        }

        try {
            System.out.println("The object you saved is: ");
            Person temp = (Person) data.getObject(input);
            System.out.println("Person name is: " + temp.getName());
            System.out.println("His age is: " + temp.getAge());
            System.out.println("His gender is: " + temp.getGender());
        } catch (IOException e) {
            System.out.println("Error while reading the file!");
            System.out.println(e.getMessage());
        }
    }
}
