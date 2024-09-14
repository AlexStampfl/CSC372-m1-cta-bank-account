# CSC372-1 Programming II Module 1 Critical Thinking Assignment - Superclass Bank Account

### Requirements:
- Part I:
  - Fields
    - string firstName
    - string lastName
    - int accountID
    - double balance
  - Methods:
    - constructor() initialize balance to zero
    - deposit() - accepts a single value double parameter, parameter value is added to existing balance
    - withdrawal() - accepts a single value double dollar amount; parameter value is subtracted from existing balance
    - Setters and getters
    - getBalance() getter to return balance
    - accountSummary() - prints all account info
 - Part II:
    - has interest rate attribute
    - allows overdraft withdrawals and charges #30 fee
  - Methods:
    - processWithdrawal() displays negative balance that includes a #30 overdraft fee & denotes fee has been accessed
    - displayAccount() displays all superclass attributes and provides additional interest rate

- Ensure program has two required classes and test class
- Each Java class is in separate Java source file
