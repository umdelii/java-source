package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.DeptDTO;

public class DeptDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public DeptDAO(Connection con) {
        this.con = con;
    }

    public int insert(DeptDTO dto) {
        int result = 0;
        try {
            String sql = "insert into department values(?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int delete(String deptId) {
        int result = 0;
        try {
            String sql = "delete from department where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int update(DeptDTO dto) {
        int result = 0;
        try {
            String sql = "update department set dept_id = ? where dept_name = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // select 하나만 조회
    public DeptDTO getRow(String deptName) {
        DeptDTO deptDTO = null;
        try {
            String sql = "select * from department where dept_name = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptName);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                deptName = rs.getString("dept_name");
                deptDTO = new DeptDTO(deptId, deptName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return deptDTO;
    }

    // 조회 결과가 여러개 나오는 경우
    public List<DeptDTO> getRows() {
        List<DeptDTO> list = new ArrayList<>();
        try {
            String sql = "select * from department order by dept_id";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");
                // DeptDTO deptDTO = new DeptDTO(deptId, deptName);
                // list.add(deptDTO);
                list.add(new DeptDTO(deptId, deptName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }
}
