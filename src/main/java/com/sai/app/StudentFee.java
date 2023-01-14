package com.sai.app;

import org.springframework.stereotype.Component;

@Component
public class StudentFee {
   private double fee;

  public double getFee() {
    return fee;
  }

  public void setFee(double fee) {
    this.fee = fee;
  }
   
}
