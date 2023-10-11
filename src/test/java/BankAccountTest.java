import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest{

    @Test
    void canGetFirstName() {
        // Given
        BankAccount bank1 = new BankAccount("John", "Doe", "2022-10", 8888);
        // When
        String firstName = bank1.getFirstName();
        // Then
        assertThat(firstName).isEqualTo("John");
}
    @Test
    void canSetFirstName (){
        // Given
        BankAccount bank1 = new BankAccount("John", "Doe", "2022-10", 8888);
        //When = operation is being made
        bank1.setFirstName("James");
        String firstName = bank1.getFirstName();
        //Then
        assertThat(firstName).isEqualTo("James");
    }

    @Test
    void canGetLastName(){
        //Given
        BankAccount bankone = new BankAccount("John", "Doe", "2022-10", 8888);
        //When
        String lastname = bankone.getLastName();
        //Then
        assertThat(lastname).isEqualTo("Doe");
    }

    @Test
    void canSetLastName(){
        //Given
        BankAccount bankone = new BankAccount("John", "Doe", "2022-10", 8888);
        //When
        bankone.setLastName("Smith");
        String lastName = bankone.getLastName();
        //Then
        assertThat(lastName).isEqualTo("Smith");

    }

    @Test
    void canGetDateOfBirth() {
        //Given
        BankAccount bank2 = new BankAccount("John", "Doe", "2022-10", 8888);
        //When
        String dateOfBirth = bank2.getDateOfBirth();
        //Then
        assertThat(dateOfBirth).isEqualTo("2022-10");
    }

    @Test
    void canSetDateOfBirth() {
        //Given
        BankAccount bank2 = new BankAccount("John", "Doe", "2022-10", 8888);
        //When
        bank2.setDateOfBirth("2022-Oct");
        String dateOfBirth = bank2.getDateOfBirth();
        //Then
        assertThat(dateOfBirth).isEqualTo("2022-Oct");
    }

    @Test
    void canGetAccountNumber(){
        //Given
        BankAccount bankTwo = new BankAccount("John", "Doe", "2022-10", 8888);
        //When
        int accountNumber = bankTwo.getAccountNumber();
        //Then
        assertThat(accountNumber).isEqualTo(8888);
    }

    @Test
    void canSetAccountNumber(){
        //Given
        BankAccount bankTwo = new BankAccount("John", "Doe", "2022-10", 8888);
        //When
        bankTwo.setAccountNumber(0000);
        int accountNumber = bankTwo.getAccountNumber();
        //Then
        assertThat(accountNumber).isEqualTo(0000);
    }













}// last curly bracket
