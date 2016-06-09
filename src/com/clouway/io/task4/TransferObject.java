package com.clouway.io.task4;

import java.io.*;

public class TransferObject {

    public String transferObject(InputStream input, OutputStream output, int offset, int size) throws IOException {
        size = (size * (-1));
        int temp;
        while((temp = input.read()) != -1){
            if((offset <= 0) && (offset > size)) {
                output.write(temp);
            }
            if(offset < size){
                break;
            }
            offset--;
        }
        if(output != null){
            output.close();
        }
        if(input != null){
            input.close();
        }

        return "Transfer is complete";
    }
}
