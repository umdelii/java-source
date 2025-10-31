import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {
        // db 서버 연결 Oracle

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            // 2. db 연결
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. sql 구문
            String sql = "update emp set sal = 1500 where empno = 7499";

            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "업데이트 성공" : "업데이트 실패");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
