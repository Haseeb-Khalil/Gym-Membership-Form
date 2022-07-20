package com.gym.membership.form;

public class Membership {
    private Person person;
    private Payment payment;


    public Membership(Person person, Payment payment) {
        this.person = person;
        this.payment = payment;
    }


    public Person getPerson() {

        return person;
    }

    public void setPerson(Person newPerson) {

        this.person = newPerson;
    }

    public Payment getPayment() {

        return payment;
    }

    public void setPayment(Payment newPayment) {

        this.payment = newPayment;
    }


}
