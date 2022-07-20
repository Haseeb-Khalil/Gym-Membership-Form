package com.gym.membership.form;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Mr", "John", "Doe", "fake@gmail.com", "0123456789", "123 Main St", "London", "SW1 1AA", LocalDate.parse("1980-01-01"), false, true);
//        Person person = new Person("Mr", "John", "Doe", "fake@gmail.com", "0123456789", "123 Main St", "London", "SW1 1AA", LocalDate.parse("1980-01-01"), false, false);
        Payment payment = new Payment(BigDecimal.valueOf(100.00), LocalDate.parse("2022-01-01"), LocalDate.parse("2022-01-01"));
        // Create a new membership of person and with the payment method
        Membership membership = new Membership(person, payment);

        // Print the membership details
        if (membership.getPerson().isExistingMember()) {
            System.out.println("Please Provide Your Membership Number: ");
        } else {
            System.out.println("Your Membership Details Are: ");
            System.out.println("Membership Number: " + membership.getPerson().getLastName() + membership.getPayment().getPaymentId()); // Concatenate lastName of person + paymentId
//            System.out.println("Payment id: " + membership.getPerson().getLastName() + membership.getPayment().getPaymentId()); // Concatenate lastName of person + paymentId
            if(Person.getIsStudent()){
                System.out.println("Student Discount Applied: " + 10 + "%");
            }
            System.out.println("Title: " + membership.getPerson().getTitle());
            System.out.println("Person's name: " + membership.getPerson().getFirstName() + " " + membership.getPerson().getLastName());
            System.out.println("Person's phone number: " + membership.getPerson().getPhone());
            System.out.println("Person's email: " + membership.getPerson().getEmail());
            System.out.println("Person's date of birth: " + membership.getPerson().getDateOfBirth());
            System.out.println("Person's address: " + membership.getPerson().getAddress());
            System.out.println("Person's city: " + membership.getPerson().getCity());
            System.out.println("Person's post code: " + membership.getPerson().getPostCode());
            System.out.println("Annual Payment: £" + membership.getPayment().getAnnualFee());
            System.out.println("Monthly Payment: £" + membership.getPayment().getMonthlyFee());
            System.out.println("Join date: " + membership.getPayment().getJoinDate());
            System.out.println("Payment date: " + membership.getPayment().getPaymentDate());
        }
    }
}
