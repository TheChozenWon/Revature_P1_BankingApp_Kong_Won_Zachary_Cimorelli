/*notes:
The customer model would include general info such as name, phone, email, a customerId and so forth.
A customer can register, log in, update their information, and own multiple bank accounts.
Constructor that list a customer details
Getters and setters to retrieve and update stuff like profile and account info.
*/

package com.team.applicationModels;
import java.time.LocalDateTime;


public class Customers {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private String phoneNumber;
    private String address;
    private LocalDateTime createdAt;

    //no arg constructor, it lets us create a customer object
    public Customers() {
    }

    //parameterized constructor
    public Customers(int customerId, String firstName, String lastName, String email, String passwordHash, String phoneNumber, String address, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.createdAt = createdAt;
    }

    //getters
    public int getCustomerId() {
        return customerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPasswordHash() {
        return passwordHash;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //set toString, to see/test/debug
    //passwordhash hidden
    @Override
    public String toString() {
        return "Customers{" + "customerId=" + customerId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", address='" + address + '\'' + ", createdAt=" + createdAt + '}';
    }
}