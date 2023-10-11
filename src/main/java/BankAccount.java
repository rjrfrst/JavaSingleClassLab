public class BankAccount {

    // properties
    String firstName;
    String lastName;
    String dateOfBirth;
    int accountNumber;
    int balance;

    //Constructor
    // Inside the parenthesis of "public BankAccount" are called the properties.
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }

    //Methods
    //Create a method called deposit() that takes in an amount and updates the balance of the BankAccount object.
    public int depositMoney(int amount) {
        return this.balance += amount;
    }
    // Create a method called withdraw() that takes in an amount and updates the balance of the BankAccount object.
    public int withdrawMoney(int amount){
        return this.balance -= amount;
        }


//    Create a payInterest method which adds 5% to the BankAccount object's balance property


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
