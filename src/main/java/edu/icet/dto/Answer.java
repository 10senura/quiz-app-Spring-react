package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Answer {
    private Integer id;
    private Integer paperId;
    private Integer questionId;
    private String answer;
    private Boolean isCorrect;
}
