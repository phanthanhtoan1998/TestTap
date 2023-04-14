package com.example.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import java.util.List;
import static com.example.commonservice.contants.MessageContant.MESSAGE_NOT_NULL;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    @NotNull(message = MESSAGE_NOT_NULL)
    private Integer numberStudent;
    @NotNull(message = MESSAGE_NOT_NULL)
    private Integer numberSubject;

    @NotNull(message = MESSAGE_NOT_NULL)
    List<Integer> codeSubject;

    @NotNull(message = MESSAGE_NOT_NULL)
    List<SubjectScoreDTO> subjectScoreDTOList;
}
