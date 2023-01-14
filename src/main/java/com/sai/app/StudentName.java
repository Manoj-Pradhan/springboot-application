package com.sai.app;

import org.springframework.stereotype.Component;

@Component
public class StudentName {
     private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
   
    
}
