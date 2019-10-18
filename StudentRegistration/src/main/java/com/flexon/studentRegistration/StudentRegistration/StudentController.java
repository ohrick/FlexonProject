package com.flexon.studentRegistration.StudentRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    private StudentDao studentService;

    @GetMapping
    public List<Students> printAllStudents() {
        return studentService.displayStudents();
    }

    @GetMapping("/{id}")
    public Students printOneStudent(@PathVariable String id) {
        return studentService.printAStudent(id);
    }

    @PostMapping
    //@ResponseStatus(HttpStatus.OK)
    public void addStudents(@RequestBody Students newStudent) {
        studentService.addNewStudents(newStudent);
    }

    @PostMapping("/delete/{id}/{name}")
    public void deleteStudents(@PathVariable String id, @PathVariable String name) {
        studentService.removeStudents(id, name);
    }

    @PostMapping("/update/{id}")
    public void setStudentName(@PathVariable String id, @RequestParam String name) {
        studentService.updateStudent(id, name);
    }

}
