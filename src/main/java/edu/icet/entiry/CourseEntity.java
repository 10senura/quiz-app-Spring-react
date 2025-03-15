package edu.icet.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEntity {
    private Integer id;
    private String name;
    private String description;
    private Integer teacherId;
    private String subject;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
