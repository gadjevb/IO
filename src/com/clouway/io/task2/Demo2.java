package com.clouway.io.task2;

import java.util.Scanner;

public class Demo2 {
    public static void main(String [] args){
        UserToFile writer = new UserToFile();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the text file you wish to write in: ");
        String fileName = sc.nextLine();
        System.out.println("You can begin with the input of your information, if you wish to stop, enter a single dot!");
        writer.writeInFile(fileName);
        System.out.print("The file is closed!");
    }
}
