package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
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

            // input 받기(delete할 학생 id)
            System.out.print("아이디 입력 : ");
            String studentId = sc.nextLine();

            String sql2 = "delete from enroll where student_id = ?";
            pstmt = con.prepareStatement(sql2);
            pstmt.setString(1, studentId);
            int rows2 = pstmt.executeUpdate();

            String sql = "delete from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            int rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");
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
