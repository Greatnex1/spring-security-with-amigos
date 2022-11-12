package authentication.com.springsecurity.controller;

import authentication.com.springsecurity.data.model.Student;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController implements ErrorController {
  /*  private final static String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }*/
    //Role based authentication


    private static final List<Student> STUDENTS = new ArrayList<>(
            List.of(new Student(1, "Jide Idris"),
                    new Student(2, "Hannah Wills"))

    );

    @GetMapping(path = "/{studentId}")
    public Student getStudents(@PathVariable("studentId") Integer studentId) {
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student with id " + studentId + "does not exist"));

    }

}
