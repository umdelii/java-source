import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) {
        // db 서버 연결 Oracle

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO EXAM_EMP(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
            sql += "VALUES (8001,'A','CLERK',NULL,'1981-01-01',2300,NULL,50)";

            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "입력 성공" : "입력 실패");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
