package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
    public static void main(String[] args) {
        // close로 안닫아도되는 방법 : try 옆에 ()치고 안에 코드 삽입
        try (InputStream in = new FileInputStream("c:\\temp\\file1.txt");
                OutputStream out = new FileOutputStream("c:\\temp\\output1.txt");) {

            int input = 0;
            while ((input = in.read()) != -1) {
                out.write(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
