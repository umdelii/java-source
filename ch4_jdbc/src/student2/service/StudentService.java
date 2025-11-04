package student2.service;

import static student2.repository.JDBCUtil.close;
import static student2.repository.JDBCUtil.commit;
import static student2.repository.JDBCUtil.getConnection;
import static student2.repository.JDBCUtil.rollback;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import student2.repository.StudentDAO;
import student2.repository.JDBCUtil.*;

import student2.dto.StudentDTO;

public class StudentService {
    private Connection con;

    public boolean insertStudent(StudentDTO dto) {
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            int result = dao.insertStudent(dto);
            if (result > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }
        return false;
    }

    public boolean updateStudent(StudentDTO dto) {
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            int result = dao.updateStudent(dto);
            if (result > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }
        return false;
    }

    public boolean deleteStudent(String studentId) {
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            int result = dao.deleteStudent(studentId);
            if (result > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }
        return false;
    }

    public StudentDTO getRowStudent(String studentId) {
        StudentDTO dto = null;
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            dto = dao.getRowStudent(studentId);
            return dto;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con);
        }
        return null;
    }

    public List<StudentDTO> getAllStudent(String deptId) {
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            return dao.getAllStudent(deptId);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con);
        }
        return null;
    }
}
