package com.clouway.io.task2;

import java.io.*;

public class UserToFile {

    public void writeInFile(String fileName) throws IOException {
        PrintWriter output = null;
        boolean flag = true;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        output = new PrintWriter(fileName, "UTF-8");

        while(flag){
            String temp = "";
            temp = in.readLine();
            if(temp.equals(".")){
                flag = false;
            }else {
                output.println(temp);
            }
        }

        if(output != null){
            output.close();
        }
        if(in != null){
            in.close();
        }
        if(input != null){
            input.close();
        }
    }
}
