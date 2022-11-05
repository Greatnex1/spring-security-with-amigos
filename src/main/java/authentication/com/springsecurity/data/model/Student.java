package authentication.com.springsecurity.data.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private final Integer studentId;
    private final  String studentName;
    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
