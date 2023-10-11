public class BankAccount {

    // properties
    String firstName;
    String lastName;
    String dateOfBirth;
    int accountNumber;
    int balance;

    //Constructor
    // Inside the parenthesis of "public BankAccount" are called the properties.
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

//    public BankAccount() {
//
//    }

    //Methods
    // Create a method called deposit() that takes in an amount and updates the balance of the BankAccount object.
    public int currentBankAccount(int amount, int balance){ return  amount +  balance; }

    //Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount object.
    public int subtract(int amount, int balance){ return amount - balance; }






    // Writing getters and setters for all properties
    public String getFirstName(){return this.firstName; }
    public String getLastName(){return this.lastName; }
    public String getDateOfBirth(){return this.dateOfBirth; }
    public int getAccountNumber(){return this.accountNumber; }
    public int getBalance(){return this.balance; }

    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}
    public void setBalance(int balance) {this.balance = balance;}
    //End of getters and setters



} // last curly bracket
