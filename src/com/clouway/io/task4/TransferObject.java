package com.clouway.io.task4;

import java.io.*;

public class TransferObject {

    public void transferObject(InputStream input, OutputStream output, int offset, int size) throws IOException {
        int temp;
        while((temp = input.read()) != -1){
            if((offset <= 0) && (offset > size)) {
                output.write(temp);
            }
            offset--;
        }
        if(output != null){
            output.close();
        }
        if(input != null){
            input.close();
        }

        System.out.println("Transfer is completed!");
    }
}
