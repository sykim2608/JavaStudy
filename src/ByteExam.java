import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.server.ExportException;

public class ByteExam {
    public static void main(String[] args) {

        /**
         * 1byte 씩 저장
         */
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/arrayExam.java");
            fos = new FileOutputStream("new.txt");
            int readData = -1;
            while((readData = fis.read()) != -1) {
                fos.write(readData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        long stopTime = System.currentTimeMillis();
        System.out.print("first: "+ (stopTime - startTime));


    }
}
