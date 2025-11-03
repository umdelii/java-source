package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data = @ToString, @Getter, @Setter, @RequiredArgsConstructor, @EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor

public class DeptDTO {
    private String deptId;
    private String deptName;
}
