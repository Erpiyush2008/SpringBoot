package com.codingshuttle.youtube.learingRESTAPIs.Controller;

import com.codingshuttle.youtube.learingRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(31,"piyush","piyushsharma@gmail.com");
    }

}
