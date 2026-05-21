package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.JobPost;

@Repository
public interface  JobRepo extends JpaRepository<JobPost, Integer>{
  
  
    
}

// List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//         new JobPost(1,"Java Developer","Must have experience",2,List.of("Core Java","J2EE","Spring Boot","Hibernate")),
//         new JobPost(2,"FE Developer","Not Experience",0,List.of("HTML","CSS","JS")),
//         new JobPost(3,"Python Developer","some experiemce",5,List.of("Pyspark","Pandas"))
//     ));
//   public List<JobPost> getAllJobs(){
//     return jobs;
//   }  
//   public void addJob(JobPost jobPost){
//     jobs.add(jobPost);
//     System.out.println(jobs);
//   }
