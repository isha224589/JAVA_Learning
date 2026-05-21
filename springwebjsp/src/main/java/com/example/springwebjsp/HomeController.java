package com.example.springwebjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @GetMapping("/")
    public String home(){
        System.out.println("Home Page");
        return "index";
    }
    @GetMapping("add")
    public ModelAndView add(int num1,int num2, ModelAndView mv){   //HttpServletRequest req
        // int num1 = Integer.parseInt(req.getParameter("num1"));
        // int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        mv.addObject("result",result);
        mv.setViewName("result");
         

        return mv;
    }
    @GetMapping("addStar")
    public String addStar(Star star) {
        return "result";
    }
    
}
