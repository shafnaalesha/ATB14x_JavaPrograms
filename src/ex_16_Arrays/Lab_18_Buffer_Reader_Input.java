package ex_16_Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab_18_Buffer_Reader_Input {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of N");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(N);

    }
}
