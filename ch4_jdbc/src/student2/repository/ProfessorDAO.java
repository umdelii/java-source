package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.ProfessorDTO;

public class ProfessorDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public ProfessorDAO(Connection con) {
        this.con = con;
    }

    public int insert(ProfessorDTO dto) {
        int result = 0;
        try {
            String sql = "insert into professor values(?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getProfId());
            pstmt.setString(2, dto.getDeptId());
            pstmt.setString(3, dto.getProfName());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int upate() {
        int result = 0;
        try {

        } catch (Exception e) {
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int delete() {
        int result = 0;
        try {

        } catch (Exception e) {
        } finally {
            close(pstmt);
        }
        return result;
    }

    public ProfessorDTO getRow() {
        ProfessorDTO dto = null;
        try {

        } catch (Exception e) {
        } finally {
            close(rs);
            close(pstmt);
        }
        return dto;
    }

    public List<ProfessorDTO> getRows() {
        List<ProfessorDTO> list = new ArrayList<>();
        try {

        } catch (Exception e) {
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }
}
