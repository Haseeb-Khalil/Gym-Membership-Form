package com.gym.membership.form;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;


public class Payment {
    private final String paymentId;
     private BigDecimal annualFee;
    private BigDecimal monthlyFee;
    private LocalDate joinDate;
    private LocalDate paymentDate;

    public Payment(BigDecimal annualFee, LocalDate joinDate, LocalDate paymentDate) {
        this.paymentId = (int) (Math.random() * 1000000) + 1 + "";
        this.annualFee = annualFee;
        this.joinDate = joinDate;
        this.paymentDate = paymentDate;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public BigDecimal getAnnualFee() {
        if (Person.getIsStudent()) {
            return annualFee = annualFee.subtract(annualFee.multiply(BigDecimal.valueOf(0.1))); // Subtract 10% of annual fee from annual fee if person is a student
        } else {
            return annualFee;
        }
    }

    public void setAnnualFee(Double annualFee) {
        this.annualFee = BigDecimal.valueOf(annualFee);
    }

    public BigDecimal getMonthlyFee() {
        this.monthlyFee = annualFee.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
        return monthlyFee;

    }

    public void setMonthlyFee(BigDecimal monthlyFee) {
        this.monthlyFee = monthlyFee;
    }


    public String getJoinDate() {
        return joinDate.toString();
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = LocalDate.parse(joinDate.toString());
    }

    public String getPaymentDate() {
        return paymentDate.toString();
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = LocalDate.parse(paymentDate.toString());
    }


}
