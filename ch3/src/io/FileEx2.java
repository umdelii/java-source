package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");

        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (currDir.exists()) {
            currDir.mkdir(); // make diretory 하고싶어요~
        }

        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file1.txt");
        File file3 = new File("c:\\temp\\file2.txt");

        if (!dir.exists()) {
            dir.mkdir();
        }
        try {
            if (!file1.exists())
                file1.createNewFile(); // 새로운 file 생성하고싶어요
            if (!file2.exists())
                file2.createNewFile();
            if (!file3.exists())
                file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        files = currDir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
        // sdf.format(new Date(file.lastModified()))
        // file.lastModified() -> 1970.1.1을 기준으로 얼마나 지났는지 long타입으로 환산
        // ex.1235548527857825994
        // 날짜 형식으로 변환
        // new Date();
        // 내가 원하는 형식으로 변환 SimpleDateFormat
        // a : am/pm

        System.out.println("\t날짜    시간    형태          크기       이름");
        System.out.println("===============================================");
        for (File file : files) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + file.getName());
                System.out.println();
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
                System.out.println();
            }
        }
    }
}
