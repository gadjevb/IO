package com.clouway.IO.task1;

public class Demo {
    public static void main(String [] args){
        Reader read = new Reader();
        int tempInt = read.readInt();
        char tempChar = read.readChar();
        read.close();
        System.out.print("The integer is: " + tempInt + "\n");
        System.out.print("The char is: " + tempChar);
    }
}
