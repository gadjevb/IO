package com.clouway.io.task5;

import java.io.*;

public class DataClass {

    public void saveObject(OutputStream output, Object object) throws IOException, NotSerializableException{
        ObjectOutputStream oos = new ObjectOutputStream(output);
        oos.writeObject(object);
        oos.close();
        output.close();
    }

    public Object getObject(InputStream input) throws  IOException, NotSerializableException{
        ObjectInputStream ois = new ObjectInputStream(input);
        Object object = null;
        try {
            object = ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ois.close();
        input.close();
        return object;
    }
}
