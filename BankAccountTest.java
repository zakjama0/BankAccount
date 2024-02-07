import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test

    public void hasitDeposit(){
        BankAccount BankAccount = new BankAccount("Zak","Jama", 123445, 0, 500, "savings",-5000);

        int actual = BankAccount.deposit( 500);
        int result = BankAccount.getBalance();
        assertThat(result).isEqualTo(actual);

    }
    @Test
    public void hasitWithdrawn(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", 123345, 500, 0,"current",-5000);

        int actual = BankAccount.withdraw(500);
        int result = BankAccount.getBalance();

        assertThat(result).isEqualTo(actual);

    }




}
