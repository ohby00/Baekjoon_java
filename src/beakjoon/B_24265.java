package beakjoon;

import java.io.*;

public class B_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);
    }
}