import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIoExam {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //키보드로 입력 받음
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);

    }
}
