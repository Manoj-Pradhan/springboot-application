package com.sai.app;

import org.springframework.stereotype.Component;

@Component
public class StudentName {
    String name="";
    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
      return name;
    }
}
