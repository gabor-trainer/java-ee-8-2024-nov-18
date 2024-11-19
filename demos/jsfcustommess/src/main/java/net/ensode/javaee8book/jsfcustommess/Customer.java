package net.ensode.javaee8book.jsfcustommess;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Customer {

  private String firstName;
  private String lastName;
  private String email;
  private int age;
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}

