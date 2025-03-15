package edu.icet.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionEntity {
    private Integer id;
    private Integer examId;
    private String text;
    private String options;
    private String correctAnswer;
    private Integer points;

}
