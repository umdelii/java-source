package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {
    public DeptDTO setDept(Scanner sc) {
        System.out.println("\n---- 학과 정보 입력 ----");
        // 코드 1
        // System.out.print("학과코드 : ");
        // // String deptId = sc.nextLine();
        // System.out.print("학과명 : ");
        // // String deptName = sc.nextLine();
        // return new DeptDTO(deptId, deptName);

        // 코드2
        DeptDTO dto = new DeptDTO();
        System.out.print("학과코드 : ");
        dto.setDeptId(sc.nextLine());
        System.out.print("학과명 : ");
        dto.setDeptName(sc.nextLine());

        return dto;
    }

    public String getDeptId(Scanner sc) {
        System.out.println("\n---- 학과 정보 입력 ----");
        System.out.print("학과코드 입력 : ");

        return sc.nextLine();
    }

    public void printAll(List<DeptDTO> list) {
        System.out.println("\n---- 전체 학과 정보 ----");
        System.out.println("학과코드\t학과명");
        System.out.println("--------------------------");
        for (DeptDTO deptDTO : list) {
            System.out.print(deptDTO.getDeptId() + "\t");
            System.out.println(deptDTO.getDeptName());
        }
    }

    public String getDeptName(Scanner sc) {
        System.out.print("학과명 입력 : ");
        String deptName = sc.nextLine();
        return deptName;
    }

    public void print(DeptDTO dto) {
        System.out.println("\n---- 학과 정보 ----");
        System.out.println("학과코드\t학과명");
        System.out.println("--------------------------");

        System.out.print(dto.getDeptId() + "\t");
        System.out.println(dto.getDeptName());

    }

    public student2.dto.ProfessorDTO setProf(Scanner sc) {
        System.out.println("\n---- 교수 정보 입력 ----");

        student2.dto.ProfessorDTO dto = new student2.dto.ProfessorDTO();
        System.out.print("교수코드 : ");
        dto.setProfId(sc.nextLine());
        System.out.print("학과코드 : ");
        dto.setDeptId(sc.nextLine());
        System.out.print("교수명 : ");
        dto.setProfName(sc.nextLine());

        return dto;
    }

    public student2.dto.ProfessorDTO updateProf(Scanner sc) {
        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        System.out.print("변경할 학과코드 입력 : ");
        String deptId = sc.nextLine();

        student2.dto.ProfessorDTO professorDTO = new student2.dto.ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);
        return professorDTO;
    }

    public String deleteProf(Scanner sc) {
        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        return profId;
    }

    public String selectProf(Scanner sc) {
        System.out.print("교수코드 입력 : ");
        String profId = sc.nextLine();
        return profId;
    }

    public void printProf(ProfessorDTO dto) {
        System.out.println("============= 조회 결과 ===============");
        System.out.println("교수코드 :" + dto.getProfId());
        System.out.println("학과코드 :" + dto.getDeptId());
        System.out.println("교수명 :" + dto.getProfName());
    }

    public void printAllProf(List<ProfessorDTO> list) {
        System.out.println("\n---- 전체 교수 정보 ----");
        System.out.println("교수코드\t학과코드\t교수명");
        System.out.println("--------------------------");
        for (ProfessorDTO professorDTO : list) {
            System.out.print(professorDTO.getProfId() + " \t");
            System.out.print(professorDTO.getDeptId() + " \t ");
            System.out.println(professorDTO.getProfName());
        }
    }

    public StudentDTO insertStudent(Scanner sc) {
        System.out.println("\n---- 학생 정보 입력 ----");
        StudentDTO dto = new StudentDTO();
        System.out.print("학번 입력 : ");
        dto.setStudentId(sc.nextLine());
        System.out.print("이름 입력 : ");
        dto.setName(sc.nextLine());
        System.out.print("신장 입력 : ");
        dto.setHeight(Double.parseDouble(sc.nextLine()));
        System.out.print("학과코드 입력 : ");
        dto.setDeptId(sc.nextLine());

        return dto;
    }

    public StudentDTO updateStudent(Scanner sc) {
        System.out.print("학번 입력 : ");
        String student_id = sc.nextLine();
        System.out.print("수정할 신장 입력 : ");
        double heigth = Double.parseDouble(sc.nextLine());

        StudentDTO dto = new StudentDTO();
        dto.setStudentId(student_id);
        dto.setHeight(heigth);

        return dto;
    }

    public String deleteStudent(Scanner sc) {
        System.out.print("학번 입력 : ");
        String studentId = sc.nextLine();
        return studentId;
    }

    public String getRowStudent(Scanner sc) {
        System.out.print("조회할 학번 입력 : ");
        String studentId = sc.nextLine();
        return studentId;
    }

    public String getDeptIdStudent(Scanner sc) {
        System.out.print("정보 조회할 학과코드 입력 : ");
        String deptId = sc.nextLine();
        return deptId;
    }

    public void printStudent(StudentDTO dto) {
        System.out.println("============= 조회 결과 ===============");
        System.out.print("학번\t이름\t신장\t학과코드\n");
        System.out.printf("%s\t%s\t%.1f\t%s\n", dto.getStudentId(), dto.getName(), dto.getHeight(), dto.getDeptId());
    }

    public void printAllStudent(List<StudentDTO> list) {
        System.out.println("============= 조회 결과 ===============");
        System.out.print("학번  \t이름\t신장\t학과코드\n");
        for (StudentDTO dto : list) {
            System.out.printf("%s\t%s\t%.1f\t%s", dto.getStudentId(), dto.getName(), dto.getHeight(), dto.getDeptId());
            System.out.println();
        }

    }
}
