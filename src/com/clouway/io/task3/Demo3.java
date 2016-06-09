package com.clouway.io.task3;

import java.io.IOException;

public class Demo3 {
    public static void main(String [] args){
        Reverse reverse = new Reverse();
        try {
            reverse.reverseFile("Test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
