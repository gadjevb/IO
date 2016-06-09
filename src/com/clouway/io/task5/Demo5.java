package com.clouway.io.task5;

import java.io.*;

public class Demo5 {
    public static void main(String [] args){
        DataClass data = new DataClass();
        OutputStream output = null;
        InputStream input = null;

        try {
            output = new FileOutputStream("Save");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        try {
            input = new FileInputStream("Save");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }

        try {
            data.saveObject(output,"My Text");
        } catch (IOException e) {
            e.getStackTrace();
        }

        try {
            System.out.println("The object you saved is: " + data.getObject(input));
        } catch (IOException e) {
            System.out.println("Error while reading the file!");
        }
    }
}
