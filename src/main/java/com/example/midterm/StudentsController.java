package com.example.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    StudentsRepository studentsRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewStudent(@RequestBody Students students) {
        studentsRepository.save(students);
        return "ok";
    }


    @GetMapping("/all")
    public @ResponseBody Iterable<Students> getAllStudents() {
        return studentsRepository.findAll();
    }
}
