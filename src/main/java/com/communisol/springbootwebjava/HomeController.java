package com.communisol.springbootwebjava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView modelAndView){
        int result = num1 + num2;

        modelAndView.addObject("result",result);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @ModelAttribute("course")
    public String getCourseName() {
        return "JAVA";
    }

    @RequestMapping("addStudent")
    public String addStudent(Student student){
        return "result";
    }
}

