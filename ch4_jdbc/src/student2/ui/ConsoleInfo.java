package student2.ui;

import java.util.List;
import java.util.Scanner;

import student.ProfessorDTO;
import student2.dto.DeptDTO;

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
}
