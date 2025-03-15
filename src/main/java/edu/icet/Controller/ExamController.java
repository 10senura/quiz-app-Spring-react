package edu.icet.Controller;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {
   //    http://localhost:8080/exam/create-exam

    @Autowired
    ExamService service;


    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam) {

    }

    @GetMapping()
    public void updateExam(@RequestBody Integer id){

    }
}