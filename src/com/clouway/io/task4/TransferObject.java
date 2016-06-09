package com.clouway.io.task4;

import java.io.*;

public class TransferObject {

    public int transferObject(InputStream input, OutputStream output, int offset, int size) throws IOException {
        size = (size * (-1));
        int temp, count = 0;
        while((temp = input.read()) != -1){
            if((offset <= 0) && (offset > size)) {
                output.write(temp);
            }
            if(offset < size){
                break;
            }
            count++;
            offset--;
        }
        if(output != null){
            output.close();
        }
        if(input != null){
            input.close();
        }
        count--;
        return count;
    }
}
