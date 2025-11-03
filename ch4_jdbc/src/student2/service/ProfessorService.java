package student2.service;

import static student2.repository.JDBCUtil.close;
import static student2.repository.JDBCUtil.commit;
import static student2.repository.JDBCUtil.getConnection;
import static student2.repository.JDBCUtil.rollback;

import java.sql.Connection;
import java.sql.SQLException;

import student2.dto.ProfessorDTO;
import student2.repository.ProfessorDAO;

public class ProfessorService {
    public boolean addProfessor(ProfessorDTO dto) {
        Connection con = null;
        boolean isAdd = false;

        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int result = dao.insert(dto);
            if (result > 0) {
                commit(con);
                isAdd = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        }
        close(con);
        return isAdd;
    }

    public void updateProfessor() {
    }

    public void deleteProfessor() {
    }

    public void getRow() {
    }

    public void getRows() {
    }
}
