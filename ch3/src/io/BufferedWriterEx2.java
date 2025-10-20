package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // 'q' 입력 시 입력 받기 중지
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하시오");
        System.out.println("중지를 원하시면 q를 입력하시오");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\scanner1.txt"));
            do {
                System.out.print(">> ");
                input = sc.nextLine();
                bw.write(input);
                bw.newLine();
            } while (!input.equals("q"));

            System.out.println("입력 중지");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
