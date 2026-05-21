package com.example.springownpractice.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class task {
    private int taskNo;
    private String taskName;
    private String taskDescription;
}

// @Override
// public String toString(){
//     return "task[taskNo="+ taskNo + ",taskName="+ taskName +",taskDescription="+taskDescription+"]";
// }