package com.example.common.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import static com.example.commonservice.contants.MessageContant.MESSAGE_NOT_NULL;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntranceTestDTO {
    @NotNull(message = MESSAGE_NOT_NULL)
    private Integer checkTotalScore;

    @NotNull(message = MESSAGE_NOT_NULL)
    private Integer schoolYear;

}
