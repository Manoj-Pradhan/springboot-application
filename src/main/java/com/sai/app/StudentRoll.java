package com.sai.app;

import org.springframework.stereotype.Component;

@Component
public class StudentRoll {
    private  int roll;

  public int getRoll() {
    return roll;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }
}
