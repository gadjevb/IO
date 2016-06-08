package com.clouway.IO.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    private Scanner reader = null;
    private PrintWriter writer = null;
    private ArrayList<String> list = null;

    public void reverseFile(String fileName){
        list = new ArrayList<>();
        try {
            reader = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        while(reader.hasNextLine()){
            String temp = reader.nextLine();
            temp = new StringBuilder(temp).reverse().toString();
            list.add(temp);
        }

        try {
            writer = new PrintWriter(fileName);
        } catch (IOException e) {
            System.out.println("Output error!");
        }

        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i).toString();
            writer.println(temp);
        }

        System.out.println("The text in " + fileName + " is reversed!");

        if(writer != null){
            writer.close();
        }
        if(reader != null){
            reader.close();
        }
    }
}
