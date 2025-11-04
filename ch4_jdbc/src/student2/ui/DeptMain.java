package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;
import student2.service.DeptService;
import student2.service.ProfessorService;
import student2.service.StudentService;

public class DeptMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        DeptService deptService = new DeptService();
        ProfessorService professorService = new ProfessorService();
        StudentService studentService = new StudentService();
        ConsoleInfo info = new ConsoleInfo();

        while (run) {
            System.out.println("==================================================================================");
            System.out.print("1. 학과등록 | ");
            System.out.print("2. 학과수정 | ");
            System.out.print("3. 학과삭제 | ");
            System.out.print("4. 학과 조회 | ");
            System.out.print("5. 전체학과 조회 | ");
            System.out.println();
            System.out.print("6. 교수정보 등록 | ");
            System.out.print("7. 교수정보 수정 | ");
            System.out.print("8. 교수정보 삭제 | ");
            System.out.print("9. 교수정보 조회 | ");
            System.out.print("10. 전체교수정보 조회 | ");
            System.out.println();
            System.out.print("11. 학생등록 | ");
            System.out.print("12. 학생정보 수정 | ");
            System.out.print("13. 학생정보 삭제 | ");
            System.out.print("14. 학생 조회 | ");
            System.out.print("15. 학과별 학생 조회 | ");
            System.out.print("16. 프로그램 종료\n");
            System.out.print("==================================================================================\n");
            System.out.print("번호 선택 : ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    DeptDTO dto = info.setDept(sc);
                    boolean result = deptService.addDept(dto);
                    System.out.println(result ? "등록 성공" : "등록 실패");
                    break;
                case 2:
                    result = deptService.updateDept(info.setDept(sc));
                    System.out.println(result ? "수정 성공" : "수정 실패");
                    break;
                case 3:
                    result = deptService.removeDept(info.getDeptId(sc));
                    System.out.println(result ? "삭제 성공" : "삭제 실패");
                    break;
                case 4:
                    String deptName = info.getDeptName(sc);
                    dto = deptService.getDept(deptName);
                    info.print(dto);
                    break;
                case 5:
                    List<DeptDTO> list = deptService.getDepts();
                    info.printAll(list);
                    break;
                case 6:
                    result = professorService.addProfessor(info.setProf(sc));
                    System.out.println(result ? "등록 성공" : "등록 실패");
                    break;
                case 7:
                    // 교수정보 입력받기
                    ProfessorDTO professorDTO = info.updateProf(sc);
                    // 수정 정보 서비스로 넘겨준 후 결과 받기
                    result = professorService.updateProfessor(professorDTO);
                    System.out.println(result ? "수정 성공" : "수정 실패");
                    break;
                case 8:
                    String profId = info.deleteProf(sc);
                    result = professorService.deleteProfessor(profId);
                    System.out.println(result ? "삭제 성공" : "삭제 실패");
                    break;
                case 9:
                    profId = info.selectProf(sc);
                    professorDTO = professorService.getRow(profId);
                    info.printProf(professorDTO);
                    break;
                case 10:
                    List<ProfessorDTO> listProf = professorService.getRows();
                    info.printAllProf(listProf);
                    break;
                case 11:
                    result = studentService.insertStudent(info.insertStudent(sc));
                    System.out.println(result ? "등록 성공" : "등록 실패");
                    break;
                case 12:
                    result = studentService.updateStudent(info.updateStudent(sc));
                    System.out.println(result ? "수정 성공" : "수정 실패");
                    break;
                case 13:
                    result = studentService.deleteStudent(info.deleteStudent(sc));
                    System.out.println(result ? "삭제 성공" : "삭제 실패");
                    break;
                case 14:
                    info.printStudent(studentService.getRowStudent(info.getRowStudent(sc)));
                    break;
                case 15:
                    info.printAllStudent(studentService.getAllStudent(info.getDeptIdStudent(sc)));
                    break;
                case 16:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}