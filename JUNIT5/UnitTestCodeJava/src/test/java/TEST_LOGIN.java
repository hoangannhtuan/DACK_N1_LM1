import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Phạm Hoàng Tuấn Anh Commit
public class TEST_LOGIN {
    LOGIN login = new LOGIN();

    ////Check Login is successfully
    @Test
    void test01() {
        boolean result = login.IsLOGIN("abc@gmail.com","123456");
        assertTrue(result,"Login Successflly");
    }

    //Check Email cannot be empty
    @Test
    void test02() {
        boolean result = login.IsLOGIN("","123456");
        assertFalse(result,"Login Failed");
    }

    //Check Password cannot be empty
    @Test
    void test03() {
        boolean result = login.IsLOGIN("abc@gmail.com","");
        assertFalse(result,"Login Failed");
    }

    //Check Email does not exist
    @Test
    void test04() {
        boolean result = login.IsLOGIN("abc2@gmail.com","123456");
        assertFalse(result,"Login Failed");
    }

    //Check Password fail
    @Test
    void test05() {
        boolean result = login.IsLOGIN("abc123@gmail.com","1456");
        assertFalse(result,"Login Failed");
    }
}
