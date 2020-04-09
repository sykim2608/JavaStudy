import java.io.*;
import java.rmi.server.ExportException;

public class ByteExam4 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            DataInputStream di = new DataInputStream(new FileInputStream("new3.txt"));
            int i = di.readInt();
            boolean bl = di.readBoolean();
            double db = di.readDouble();
            System.out.println(i);
            System.out.println(bl);
            System.out.println(db);
            int j = -1;
            while((j = di.readInt())!= -1) {

            }

        }catch(Exception e) {
            e.printStackTrace();

        }




    }
}
