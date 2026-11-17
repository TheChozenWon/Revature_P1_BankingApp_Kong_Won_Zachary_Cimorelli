/*notes:
The transaction model represents any movement of money involving a bank account.
Some examples are:

1. When depositing money.
2. When withdrawing money.
3. When transferring money between same bank but different accounts.
4. Employee-initiated wire transfers to a different bank.

A transfer between two accounts should create a single transaction record representing the movement, with both account IDs populated.
The service layer will handle making sure the withdrawal and deposit happen together.

Constructors for new transactions and existing ones.
Getters and setters to retrieve and update different info.
*/

package com.team.applicationModels;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transactions {

    public enum TransactionType {
        DEPOSIT,
        WITHDRAWAL,
        TRANSFER,
        WIRE_TRANSFER
    }

    private int transactionId;
    private Integer fromAccountId; //using Integer in case of null fields
    private Integer toAccountId;
    private Integer initiatedByEmployeeId;
    private TransactionType transactionType;
    private BigDecimal amount;
    private String description;
    private LocalDateTime createdAt;

    //no arg constructor
    public Transactions() {
    }

    //parameterized constructor
    public Transactions(int transactionId, Integer fromAccountId, Integer toAccountId, Integer initiatedByEmployeeId, TransactionType transactionType, BigDecimal amount, String description, LocalDateTime createdAt) {
        this.transactionId = transactionId;
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.initiatedByEmployeeId = initiatedByEmployeeId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
        this.createdAt = createdAt;
    }

    //getters
    public int getTransactionId() {
        return transactionId;
    }
    public Integer getFromAccountId() {
        return fromAccountId;
    }
    public Integer getToAccountId() {
        return toAccountId;
    }
    public Integer getInitiatedByEmployeeId() {
        return initiatedByEmployeeId;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public String getDescription() {
        return description;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //setters
    public void setFromAccountId(Integer fromAccountId) {
        this.fromAccountId = fromAccountId;
    }
    public void setToAccountId(Integer toAccountId) {
        this.toAccountId = toAccountId;
    }
    public void setInitiatedByEmployeeId(Integer initiatedByEmployeeId) {
        this.initiatedByEmployeeId = initiatedByEmployeeId;
    }
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //set toString, to see/test/debug
    @Override
    public String toString() {
        return "Transactions{" + "transactionId=" + transactionId + ", fromAccountId=" + fromAccountId + ", toAccountId=" + toAccountId + ", initiatedByEmployeeId=" + initiatedByEmployeeId + ", transactionType=" + transactionType + ", amount=" + amount + ", description='" + description + '\'' + ", createdAt=" + createdAt + '}';
    }

}
