package com.clouway.io.task5;

import java.io.*;

public class DataClass {
    public void saveObject(OutputStream output, Object object) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(output);
        oos.writeObject(object);
    }

    public Object getObject(InputStream input) throws  IOException{
        ObjectInputStream ois = new ObjectInputStream(input);
        Object object = null;
        try {
            object = ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
