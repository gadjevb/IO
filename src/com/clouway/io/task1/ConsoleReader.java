package com.clouway.io.task1;

import java.io.*;

public class ConsoleReader {

    private InputStreamReader input = new InputStreamReader(System.in);
    private BufferedReader in = new BufferedReader(input);

    public String readString() throws IOException {
        return in.readLine();
    }

    public char readChar() throws IOException {
        return in.readLine().charAt(0);
    }

    public int readInt() throws IOException, NumberFormatException {;
        int temp = Integer.parseInt(in.readLine());
        return temp;
    }

    public float readFloat() throws IOException, NumberFormatException {
        float temp = Float.parseFloat(in.readLine());
        return temp;
    }
}
