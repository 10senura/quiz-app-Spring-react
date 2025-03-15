package edu.icet.service;

import edu.icet.dto.Exam;

import java.util.List;

public interface ExamService {

    void createExam(Exam exam);
    Exam getExamByCourseId(Integer id);
    List<Exam> GetAll();
    void updateExam(Exam exam);
    Void deleteExamId(Integer id);
    Void deleteExamByCourseId(Integer id);

}
