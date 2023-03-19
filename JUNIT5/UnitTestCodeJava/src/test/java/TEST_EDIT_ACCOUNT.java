import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Trần Như Hiếu commit
public class TEST_EDIT_ACCOUNT {
    //Check name
    @Test
    public void test01() throws Exception{
        EditAccount name = new EditAccount();
        EDIT_ACCOUNT namelong = new EDIT_ACCOUNT("abc12345", "", "");
        boolean isname = name.isName(namelong.getName());
        assertTrue(isname);
    }

    //Check name null
    @Test
    public void test02() throws Exception{
        EDIT_ACCOUNT namenull = new EDIT_ACCOUNT("abc173", "", "");
        assertNotNull(namenull.getName());
    }

    //Check password strong
    @Test
    public void test03() throws Exception{
        EditAccount pv = new EditAccount();
        EDIT_ACCOUNT account = new EDIT_ACCOUNT("", "12345678", "");
        boolean isStrong = pv.isPasswordStrong(account.getNewPassword());
        assertTrue(isStrong);
    }

    //Check password not strong
    @Test
    public void test04() throws Exception{
        EditAccount pv = new EditAccount();
        EDIT_ACCOUNT account = new EDIT_ACCOUNT("", "1234", "");
        boolean isStrong = pv.isPasswordStrong(account.getNewPassword());
        assertFalse(isStrong);
    }
    @Test
    public void test05() throws Exception{
        EditAccount pv = new EditAccount();
        assertThrows(Exception.class, ()-> pv.isPasswordStrong("123456vhvjhjhfhj"));
    }

    //Check password vs confirmpassword
    @Test
    public void test06(){
        EDIT_ACCOUNT account = new EDIT_ACCOUNT("abc", "1234567", "1234567");
        EditAccount edit = new EditAccount();
        boolean isConfirm = edit.isConfirmPassword(account.getNewPassword(), account.getConfirmPassword());
        assertTrue(isConfirm);
    }
}
