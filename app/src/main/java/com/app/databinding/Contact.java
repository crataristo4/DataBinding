package com.app.databinding;

public class Contact {
  public String firstName, otherName,surName;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.otherName = lastName;
    }

    public Contact(String surName) {
        this.surName = surName;
    }
}
