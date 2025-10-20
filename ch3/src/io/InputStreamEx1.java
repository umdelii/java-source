package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream(new File("null"));
            InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            OutputStream out = new FileOutputStream("c:\\temp\\output1.txt");

            // int input = in.read();
            // System.out.println(input);

            int input = 0;
            while ((input = in.read()) != -1) {
                // System.out.print((char) input);
                out.write(input);
            }
            in.close();
            out.close();
        } catch (IOException e) { // FileNotFoundException을 IOException으로 ... (IO가 부모클래스임)
            e.printStackTrace();
        }

        try {
            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("c:\\temp\\copy1.jpg");

            int input = 0;
            while ((input = in.read()) != -1) {
                out.write(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
