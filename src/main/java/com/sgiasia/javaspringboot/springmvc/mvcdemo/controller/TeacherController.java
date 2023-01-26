package com.sgiasia.javaspringboot.springmvc.mvcdemo.controller;

import com.sgiasia.javaspringboot.springmvc.mvcdemo.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    @RequestMapping("/teacher")
    public String teacher(Model model){
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "teacher";
    }

    @RequestMapping("addTeacher")
    public String addTeacher(@ModelAttribute("teacher") Teacher t, Model model){
        model.addAttribute("name", t.getName());
        model.addAttribute("noPegawai", t.getNoPegawai());
        return "hasil";
    }
}
