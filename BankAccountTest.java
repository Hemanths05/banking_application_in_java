import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("43067", "Hemanth", 1000.0);
    }

    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    void testDepositNegativeAmount() {
        account.deposit(-100.0);
        assertEquals(1000.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdraw() {
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawExceedsBalance() {
        account.withdraw(2000.0);
        assertEquals(1000.0, account.getBalance(), 0.01); 
    }

    @Test
    void testWithdrawNegativeAmount() {
        account.withdraw(-100.0);
        assertEquals(1000.0, account.getBalance(), 0.01);
    }

    @Test
    void testToString() {
        String expectedOutput = "Account Number: 43067\nAccount Holder: Hemanth\nBalance: 1000.0";
        assertEquals(expectedOutput, account.toString());
    }
}
