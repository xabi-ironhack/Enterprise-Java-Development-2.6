package com.ironhack.util;

import com.ironhack.classes.Student;

import java.util.Map;

public class GradeUtil {
    public static Map<String, Student> gradeIncreaser(Map<String, Student> studentMap){

        for(Student student : studentMap.values()) student.setGrade(student.getGrade()*1.1);

        return studentMap;
    }
}
