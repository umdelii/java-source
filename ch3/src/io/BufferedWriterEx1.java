package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // 'q' 입력 시 입력 받기 중지
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하시오");
        System.out.println("중지를 원하시면 q를 입력하시오");

        do {
            System.out.print(">> ");
            input = sc.nextLine();
        } while (!input.equals("q"));

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\scanner1.txt"));
            bw.write(input);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
