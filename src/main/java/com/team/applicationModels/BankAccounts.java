/*notes:
The bank account model would include bank info of each individual customer.
A customer can have multiple accounts, such as checking and savings.
Constructors for new bank account sign-ups and existing ones.
Getters and setters to retrieve and update different info.
*/

package com.team.applicationModels;
import java.math.BigDecimal;
import java.time.LocalDateTime;

//using enum for better readability and preventing invalid values from being assigned
public class BankAccounts {
    public enum AccountType {
        CHECKING,
        SAVINGS
    }

    public enum AccountStatus {
        ACTIVE,
        FROZEN,
        CLOSED
    }

    private int accountId;
    private int customerId;
    private String accountNumber;
    private AccountType accountType;
    private BigDecimal balance; //bigDecimal over double as when dealing with money, need to be precise and limit rounding errors. max is two digits over the decimal (e.g. $110.25)
    private AccountStatus status;
    private LocalDateTime createdAt;

    //no arg constructor
    public BankAccounts() {
    }

    //parameterized constructor
    public BankAccounts(int accountId, int customerId, String accountNumber, AccountType accountType, BigDecimal balance, AccountStatus status, LocalDateTime createdAt) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
        this.createdAt = createdAt;
    }

    //getters
    public int getAccountId() {
        return accountId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public AccountType getAccountType() {
        return accountType;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public AccountStatus getStatus() {
        return status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //setters
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    //set toString, to see/test/debug
    @Override
    public String toString() {
        return "BankAccounts{" + "accountId=" + accountId + ", customerId=" + customerId + ", accountNumber='" + accountNumber + '\'' + ", accountType=" + accountType + ", balance=" + balance + ", status=" + status + ", createdAt=" + createdAt + '}';
    }
}
