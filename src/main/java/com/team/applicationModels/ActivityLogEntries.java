/*notes:
The activity log entries tracks, records, and displays every action taken on an account to ensure security, transparency, and regulatory compliance.

Example: A incoming direct deposit, customer gets a email about this.
Another example: Customer orders online for food, gets a notification/message about money withdrew from bank.
Another example: New login from xxx, lets customer know to secure account if needed.

Constructors for new activity and existing ones.
Getters and setters to retrieve and update different info.
*/

package com.team.applicationModels;
import java.time.LocalDateTime;

public class ActivityLogEntries {
    private String id;
    private int employeeId;
    private String actionType;
    private Integer accountId;
    private Integer customerId;
    private String details;
    private LocalDateTime createdAt;

    //no arg constructor
    public ActivityLogEntries() {
    }

    //parameterized constructor
    public ActivityLogEntries(String id, int employeeId, String actionType, Integer accountId, Integer customerId, String details, LocalDateTime createdAt) {
        this.id = id;
        this.employeeId = employeeId;
        this.actionType = actionType;
        this.accountId = accountId;
        this.customerId = customerId;
        this.details = details;
        this.createdAt = createdAt;
    }

    //getters
    public String getId() {
        return id;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getActionType() {
        return actionType;
    }
    public Integer getAccountId() {
        return accountId;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public String getDetails() {
        return details;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    //set toString, to see/test/debug
    @Override
    public String toString() {
        return "ActivityLog{" + "id='" + id + '\'' + ", employeeId=" + employeeId + ", actionType='" + actionType + '\'' + ", accountId=" + accountId + ", customerId=" + customerId + ", details='" + details + '\'' + ", createdAt=" + createdAt + '}';
    }
}
