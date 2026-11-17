/*notes:
The employee model would include general info of bank employees such as name, phone, email, a employeeId and so forth.
Employees would have more access to permissions compared to regular customers.

Employees can:
1. Look up customers
2. View customer accounts.
3. Perform wire transfers.
4. Freeze and unfreeze accounts.
5. Create account notes.
6. View activity logs.

Constructor that list a employee details
Getters and setters to retrieve and update stuff like profile and account info.
*/

package com.team.applicationModels;
import java.time.LocalDateTime;

public class Employees {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private String jobTitle;
    private LocalDateTime createdAt;

    //no arg constructor
    public Employees() {
    }

    //parameterized constructor
    public Employees(int employeeId, String firstName, String lastName, String email, String passwordHash, String jobTitle, LocalDateTime createdAt) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.jobTitle = jobTitle;
        this.createdAt = createdAt;
    }

    //getters
    public int getEmployeeId() {
        return employeeId;
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
    public String getJobTitle() {
        return jobTitle;
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
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //set toString, to see/test/debug
    //passwordhash hidden
    @Override
    public String toString() {
        return "Employees{" + "employeeId=" + employeeId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", jobTitle='" + jobTitle + '\'' + ", createdAt=" + createdAt + '}';
    }
}
