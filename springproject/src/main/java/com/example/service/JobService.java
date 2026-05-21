package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.JobPost;
import com.example.repo.JobRepo;


@Service
public class JobService {

    @Autowired
    
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }
    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId){
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost){
        repo.save(jobPost);
    }
    public void deleteJob(int postId){
        repo.deleteById(postId);
    }

    public void load(){
         List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(1,"Java Developer","Must have experience",2,List.of("Core Java","J2EE","Spring Boot","Hibernate")),
        new JobPost(2,"FE Developer","Not Experience",0,List.of("HTML","CSS","JS")),
        new JobPost(3,"Python Developer","some experiemce",5,List.of("Pyspark","Pandas"))
    ));

    repo.saveAll(jobs);
    }
}
