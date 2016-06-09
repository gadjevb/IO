package com.clouway.io.task6;

import java.io.IOException;
import java.util.Scanner;

public class Demo6 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        DirectoryBrowser browser = new DirectoryBrowser();
        String tempPath = null;
        System.out.print("Enter the file path: ");
        tempPath = sc.nextLine();
        try {
            browser.listContent(tempPath);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
