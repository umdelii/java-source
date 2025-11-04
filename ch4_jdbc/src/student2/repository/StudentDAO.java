package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private static Integer result;
    // update : 키 수정
    // 학생 조회 : 전체(dept_id 조건) and 한명(student_id로 조회)
    // delete : student_id

    public StudentDAO(Connection con) {
        this.con = con;
    }

    public int insertStudent(StudentDTO dto) {
        try {
            String sql = "insert into student values (?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getStudentId());
            pstmt.setString(2, dto.getName());
            pstmt.setDouble(3, dto.getHeight());
            pstmt.setString(4, dto.getDeptId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int updateStudent(StudentDTO dto) {
        try {
            String sql = "update student set height = ? where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, dto.getHeight());
            pstmt.setString(2, dto.getStudentId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int deleteStudent(String studentId) {
        try {
            String sql = "delete from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public StudentDTO getRowStudent(String studentId) {
        StudentDTO dto = null;
        try {
            String sql = "select * from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                studentId = rs.getString("student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptId = rs.getString("dept_id");
                dto = new StudentDTO(studentId, name, height, deptId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return dto;
    }

    public List<StudentDTO> getAllStudent(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "select * from student where dept_id = ? order by student_id";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String studentId = rs.getString("student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                deptId = rs.getString("dept_id");
                list.add(new StudentDTO(studentId, name, height, deptId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }
}
