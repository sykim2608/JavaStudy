import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteExam3 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            //data type 으로 저장
            DataOutputStream out = new DataOutputStream(new FileOutputStream("new3.txt"));
            out.writeInt(100); //4byte
            out.writeBoolean(true); //1byte
            out.writeDouble(40.2); //13byte
            //out.
        }

        catch(Exception e) {
            e.printStackTrace();

        }



    }
}
