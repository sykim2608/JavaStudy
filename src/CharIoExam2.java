import java.io.*;

public class CharIoExam2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        //try 안에서 선언하면, try 밖에서는 못씀
        try {
            br = new BufferedReader(new FileReader("new2.txt")); // 파일로부터 한줄 읽어들임
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while((line = br.readLine()) != null) {
                pw.println(line); // 파일은 반드시 닫아주어야 함 !!
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            pw.close();
            br.close();
        }

    }
}
