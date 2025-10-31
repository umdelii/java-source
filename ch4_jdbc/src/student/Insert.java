package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "java_db";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            // input 받기(insert 할 학생 정보)
            System.out.print("학번 입력 : ");
            String studentId = sc.nextLine();
            System.out.print("이름 입력 : ");
            String studentNm = sc.nextLine();
            System.out.print("신장 입력 : ");
            Double studentHeight = Double.parseDouble(sc.nextLine());
            System.out.print("학과코드 입력 : ");
            String deptId = sc.nextLine();

            String sql = "INSERT\r\n" + //
                    "\tINTO\r\n" + //
                    "\tSTUDENT(STUDENT_ID , NAME , HEIGHT , DEPT_ID )\r\n" + //
                    "VALUES (?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            pstmt.setString(2, studentNm);
            pstmt.setDouble(3, studentHeight);
            pstmt.setString(4, deptId);
            int rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "추가 성공" : "추가 실패");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
