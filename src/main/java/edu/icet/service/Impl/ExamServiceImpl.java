package edu.icet.service.Impl;

import edu.icet.dto.Exam;
import edu.icet.repository.ExamRepository;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    final ExamRepository examRepository;
    final ModelMapper modelMapper;

    @Override
    public void createExam(Exam exam) {

    }

    @Override
    public Exam getExamByCourseId(Integer integer) {
        return null;
    }

    @Override
    public List<Exam> GetAll() {
        return List.of();
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public Void deleteExamId(Integer id) {
        return null;
    }

    @Override
    public Void deleteExamByCourseId(Integer integer) {
        return null;
    }
}
