package com.sai.app;

import org.springframework.stereotype.Component;

@Component
public class StudentRoll {
    int roll=0;
    public void setRoll(int roll) {
        this.roll=roll;
    }

    public int getRoll() {
      return roll;
    }
}
    

