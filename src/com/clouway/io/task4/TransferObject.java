package com.clouway.io.task4;

import java.io.*;

public class TransferObject {

    public void transferObject(InputStream input, OutputStream output, int offset, int size){
        int temp;

        try {
            while((temp = input.read()) != -1){
                if((offset <= 0) && (offset > size)) {
                    output.write(temp);
                }
                offset--;
            }
        } catch (IOException e) {
            System.out.println("Input error!");
        }

        if(output != null){
            try {
                output.close();
            } catch (IOException e) {
                System.out.println("Error while closing the output stream!");
            }
        }
        if(input != null){
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error while closing the input stream!");
            }
        }

        System.out.println("Transfer is completed!");
    }
}
