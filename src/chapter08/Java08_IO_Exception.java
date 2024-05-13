package chapter08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Java08_IO_Exception {
    public static void main(String[] args) throws Exception {
        //todo IO File Copy

        //fileNotFoundException , IOException
        FileInputStream in = null;
        ObjectInputStream objIn = null;
        ObjectOutputStream objOut = null;
        try {
            in = new FileInputStream("xxx");

            in.read();
            objIn.readObject();
            objOut.writeObject(null);
        }catch (Exception e){
            //
        }finally {
            if(in!= null) {
                try {
                    in.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
