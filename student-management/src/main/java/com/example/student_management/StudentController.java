package com.example.student_management;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id,
                                @Valid @RequestBody Student student) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Student not found.ID: " + id));
        existingStudent.setName(student.getName());
        existingStudent.setCourse(student.getCourse());
        return studentRepository.save(existingStudent);
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        if (!studentRepository.existsById(id)) {
            return "Student not found";
        }

        studentRepository.deleteById(id);

        return "Student deleted successfully. ID: " + id;
    }
}