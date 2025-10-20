package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // 경로 지정 : / or \
        // \n, \t => 경로지정하는 것과 구별하기 위해서 \\ 두번씀
        // File file = new File("c:\\temp\\file1.txt");
        File file = new File("c:\\temp", "file.txt");

        String name = file.getName();
        System.out.println("파일명 " + name); // -> file.txt 확장자명까지 나옴

        // 확장자 제외하고 출력하고 싶음
        System.out.println("확장자명 제외 파일명 " + name.substring(0, name.lastIndexOf('.')));

        // 확장자명만 추출하고 싶어
        System.out.println("파일의 확장자명 " + name.substring(name.lastIndexOf('.') + 1));

        // 경로를 포함한 파일명
        System.out.println("경로를 포함한 파일명 " + file.getPath());

        // 파일이 속해 있는 디렉토리
        System.out.println("파일이 속해 있는 디렉토리 " + file.getParent());

        // 파일 pathSeparator
        System.out.println("파일 pathSeparator " + file.pathSeparator);

        // 파일 pathSeparatorChar
        System.out.println("파일 pathSeparatorChar " + file.pathSeparatorChar);

        // 파일 separator
        System.out.println("파일 separator " + file.separator);

        // 파일 separatorChar
        System.out.println("파일 separatorChar " + file.separatorChar);
    }
}
