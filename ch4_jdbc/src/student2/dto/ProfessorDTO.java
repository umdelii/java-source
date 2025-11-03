package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class ProfessorDTO {
    // ~~DTO(Data Transfer Object) == ~~VO(Value Object)

    private String profId;
    private String deptId;
    private String profName;

    // 생성사,getset,toString --- lombok 하잖아
    // public ProfessorDTO(String profId, String profName, String deptId) {
    // this.profId = profId;
    // this.profName = profName;
    // this.deptId = deptId;
    // }

    // public ProfessorDTO() {
    // }

    // public String getProfId() {
    // return profId;
    // }

    // public void setProfId(String profId) {
    // this.profId = profId;
    // }

    // public String getProfName() {
    // return profName;
    // }

    // public void setProfName(String profName) {
    // this.profName = profName;
    // }

    // public String getDeptId() {
    // return deptId;
    // }

    // public void setDeptId(String deptId) {
    // this.deptId = deptId;
    // }

    // @Override
    // public String toString() {
    // return "ProfessorDTO [profId=" + profId+ ", deptId=" + deptId + ", profName="
    // + profName +"]";
    // }
}
