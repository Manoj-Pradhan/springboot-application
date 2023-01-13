package com.sai.app;

import org.springframework.stereotype.Component;

@Component
public class StudentFee {
    double fee=0.0;

    public void setName(double fee) {
        this.fee=fee;
    }

    public double getFee() {
      return fee;
    }
}
