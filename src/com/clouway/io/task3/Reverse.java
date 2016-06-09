package com.clouway.io.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

    public String reverseFile(String fileName) throws IOException, FileNotFoundException {
        Scanner reader = null;
        PrintWriter writer = null;

        ArrayList<String> list = new ArrayList<>();
        reader = new Scanner(new File(fileName));

        while(reader.hasNextLine()){
            String temp = reader.nextLine();
            temp = new StringBuilder(temp).reverse().toString();
            list.add(temp);
        }

        writer = new PrintWriter(fileName);

        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i).toString();
            writer.println(temp);
        }

        if(writer != null){
            writer.close();
        }
        if(reader != null){
            reader.close();
        }

        return "The text in " + fileName + " is reversed!";
    }
}
