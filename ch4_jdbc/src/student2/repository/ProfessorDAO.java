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

    public int update(ProfessorDTO dto) {
        int result = 0;
        try {
            String sql = "update professor set dept_id = ? where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getProfId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int delete(String profId) { // 얘 이상해
        int result = 0;
        try {
            String sql = "delete from professor where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, profId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public ProfessorDTO getRow(String profId) {
        ProfessorDTO dto = null;
        try {
            String sql = "select * from professor where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, profId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                profId = rs.getString("prof_id");
                String deptId = rs.getString("dept_id");
                String profName = rs.getString("prof_name");
                dto = new ProfessorDTO(profId, deptId, profName);

                return dto;
            }
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
            String sql = "select * from professor order by prof_id";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String profId = rs.getString("prof_id");
                String deptId = rs.getString("dept_id");
                String profName = rs.getString("prof_name");
                list.add(new ProfessorDTO(profId, deptId, profName));
            }
        } catch (Exception e) {
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }
}
