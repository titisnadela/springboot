package com.sgiasia.javaspringboot.springmvc.mvcdemo.controller;

import com.sgiasia.javaspringboot.springmvc.mvcdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {
    @RequestMapping("/student")
    public String student(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "student";
    }
    @RequestMapping("addStudent")
    public String  addStudent(@ModelAttribute("student") Student s, Model model){
        model.addAttribute("name", s.getName());
        model.addAttribute("age", s.getAge());
        model.addAttribute("id", s.getId());
        return "result";
    }
}
