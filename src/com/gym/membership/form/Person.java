package com.gym.membership.form;

import java.time.LocalDate;

public class Person {
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String postCode;
    private LocalDate dateOfBirth;   // Date of birth
    private static boolean isStudent;
    private boolean isExistingMember;

    //    Person Constructor

    public Person(String title, String firstName, String lastName, String email, String phone, String address, String city, String postCode, LocalDate dateOfBirth, boolean isStudent, boolean isExistingMember) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.dateOfBirth = dateOfBirth;
        Person.isStudent = isStudent;
        this.isExistingMember = isExistingMember;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = LocalDate.parse(newDateOfBirth.toString());
    }

    public static boolean getIsStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public boolean isExistingMember() {
        return isExistingMember;
    }

    public void setExistingMember(boolean existingMember) {
        isExistingMember = existingMember;
    }


}
