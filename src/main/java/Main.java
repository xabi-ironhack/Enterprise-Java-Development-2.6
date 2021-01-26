import com.ironhack.classes.Student;

import java.util.HashMap;
import java.util.Map;

import static com.ironhack.util.GradeUtil.gradeIncreaser;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Anna Russo", 55);
        Student s2 = new Student("Sandro Mess", 65);
        Student s3 = new Student("Jino Holl", 99);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Anna Russo", s1);
        studentMap.put("Sandro Mess", s2);
        studentMap.put("Jino Holl", s3);

        gradeIncreaser(studentMap);

        System.out.println(studentMap.values());

    }
}