package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
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

            // input 받기(update할 학생 id)
            System.out.print("아이디 입력 : ");
            String studentId = sc.nextLine();
            System.out.print("변경할 키 입력(소수점 한자리까지) : ");
            double updateHeight = Double.parseDouble(sc.nextLine());

            String sql = "update student set height = ? where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, updateHeight);
            pstmt.setString(2, studentId);
            int rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "수정 성공" : "수정 실패");
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
