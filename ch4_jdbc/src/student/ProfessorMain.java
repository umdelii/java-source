package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProfessorMain {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "java_db";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            boolean run = true;

            while (run) {
                System.out.println("======================================");
                System.out.println("1. 교수정보 입력");
                System.out.println("2. 교수정보 수정");
                System.out.println("3. 교수정보 삭제");
                System.out.println("4. 교수정보 조회");
                System.out.println("5. 프로그램 종료");
                System.out.println("======================================");
                System.out.print("번호 선택 : ");

                int menu = Integer.parseInt(sc.nextLine());
                switch (menu) {
                    case 1:
                        ProfessorDTO professorDTO = insert();
                        String sql = "insert into professor(prof_id, dept_id, prof_name) values (?,?,?) ";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, professorDTO.getProfId());
                        pstmt.setString(2, professorDTO.getDeptId());
                        pstmt.setString(3, professorDTO.getProfName());

                        int rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "입력 성공" : "입력 실패");
                        break;

                    case 2:
                        professorDTO = update();
                        sql = "update professor set dept_id = ? where prof_id = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, professorDTO.getDeptId());
                        pstmt.setString(2, professorDTO.getProfId());

                        rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "수정 완료" : "수정 실패");
                        break;

                    case 3:
                        String profId = delete();
                        sql = "delete from professor where prof_id = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, profId);
                        rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");
                        break;

                    case 4:
                        profId = select();
                        sql = "select * from professor where prof_id = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, profId);
                        rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println("============= 조회 결과 ===============");
                            System.out.println("교수코드 :" + rs.getString("prof_id"));
                            System.out.println("학과코드 :" + rs.getString("dept_id"));
                            System.out.println("교수명 :" + rs.getString("prof_name"));
                        }
                        break;

                    case 5:
                        run = false;
                        break;

                    default:
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static ProfessorDTO insert() {

        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        System.out.print("학과코드 입력 : ");
        String deptId = sc.nextLine();
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();
        return new ProfessorDTO(profId, deptId, name);
    }

    public static ProfessorDTO update() {
        // 수정할 교수 정보 교수코드로 받기
        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        System.out.print("변경할 학과코드 입력 : ");
        String deptId = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);
        return professorDTO;
    }

    public static String delete() {
        // 삭제할 교수 코드 받기
        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        return profId;
    }

    public static String select() {
        // 특정교수 조회
        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        return profId;
    }
}
