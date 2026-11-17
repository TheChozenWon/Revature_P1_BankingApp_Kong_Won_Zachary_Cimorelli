/*notes:
The account notes model represents a note written by an employee about a specific customer account.
MongoDB would hold a lot of this data.

Example:
If an employee writes "customer contacted the bank regarding an unusual withdrawal."
In MongoDB shows:
["suspicious-activity", "customer-contact", "follow-up-required"]
If a different employee comes along, they can see this information and continue the other employee's case

Constructors for new notes and existing ones.
Getters and setters to retrieve and update different info.
*/

package com.team.applicationModels;
import java.time.LocalDateTime;
import java.util.List;

public class AccountNotes {
    private String id;
    private int accountId;
    private int employeeId;
    private Integer transactionId;
    private String noteText;
    private List<String> tags; //in database would be shown as suspicious activity or customer contact, etc. It categorize notes
    private LocalDateTime createdAt;

    //no arg constructor
    public AccountNotes() {
    }

    //parameterized constructor
    public AccountNotes(String id, int accountId, int employeeId, Integer transactionId, String noteText, List<String> tags, LocalDateTime createdAt) {
        this.id = id;
        this.accountId = accountId;
        this.employeeId = employeeId;
        this.transactionId = transactionId;
        this.noteText = noteText;
        this.tags = tags;
        this.createdAt = createdAt;
    }

    //getters
    public String getId() {
        return id;
    }
    public int getAccountId() {
        return accountId;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public Integer getTransactionId() {
        return transactionId;
    }
    public String getNoteText() {
        return noteText;
    }
    public List<String> getTags() {
        return tags;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    //set toString, to see/test/debug
    @Override
    public String toString() {
        return "AccountNote{" + "id='" + id + '\'' + ", accountId=" + accountId + ", employeeId=" + employeeId + ", transactionId=" + transactionId + ", noteText='" + noteText + '\'' + ", tags=" + tags + ", createdAt=" + createdAt + '}';
    }
}
