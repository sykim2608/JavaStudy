import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.server.ExportException;

public class ByteExam2 {
    public static void main(String[] args) {
        /**
         * 512 byte씩 저장
         *
         */
        long startTime2 = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/arrayExam.java");
            fos = new FileOutputStream("new2.txt");
            int readCount = -1;
            byte[] buffer = new byte[512];

            while((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer,0,readCount);
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
            long stopTime2 = System.currentTimeMillis();
            System.out.print("second: " + (stopTime2 - startTime2));

        }
    }
}
