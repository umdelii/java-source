package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.service.DeptService;
import student2.service.ProfessorService;

public class DeptMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        DeptService deptService = new DeptService();
        ProfessorService professorService = new ProfessorService();
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
            System.out.print("10. 프로그램 종료\n");
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
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}