package com.example.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.JobPost;
import com.example.service.JobService;



@Controller
public class JobController{
    
    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home(){
        System.out.println("Home");
        return "home";
    }

    @GetMapping("addjob")
    public String addjob() {
        return "addjob";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model) {
        model.addAttribute("jobPosts", service.getAllJobs());
        return "viewalljobs";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost, Model model) {
        service.addJob(jobPost);
        model.addAttribute("jobPost", jobPost);
        return "success";
    }

    @GetMapping("load")
    public String loadData() {
        return "success";
    }
    


}
