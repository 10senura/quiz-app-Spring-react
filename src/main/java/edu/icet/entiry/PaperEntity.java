package edu.icet.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaperEntity{
    private Integer id;
    private Integer userId;
    private Integer examId;
}
