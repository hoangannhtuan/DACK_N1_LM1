import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class TEST_NEW_ACCOUNT {
    REGISTER register = new REGISTER();

    //Check New Account is created
    @Test
    void test01() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","adsd@gmail.com","","123456","123456");
        assertFalse(result,"Register Successfully");
    }

    //Check Username cannot be empty
    @Test
    void test02() {
        boolean result = register.REGISTER("","adsd@gmail.com","0545452","123456","123456");
        assertFalse(result,"Register Failed");
    }

    //Check Username can't have special characters
    @Test
    void test03() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","adsd@gmail.com","0545452","123456","123456");
        assertFalse(result,"Register Failed");
    }

    //Check Email cannot be empty
    @Test
    void test04() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","","0545452","123456","123456");
        assertFalse(result,"Register Failed");
    }

    //Check PhoneNumber cannot be empty
    @Test
    void test05() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","adsd@gmail.com","","123456","123456");
        assertFalse(result,"Register Failed");
    }

    //Check Password cannot be empty
    @Test
    void test06() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","adsd@gmail.com","0545452","","123456");
        assertFalse(result,"Register Failed");
    }

    //Check ComfirmPassword cannot be empty
    @Test
    void test07() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","adsd@gmail.com","0545452","123456","");
        assertFalse(result,"Register Failed");
    }

    //Check ComfirmPassword does not match
    @Test
    void test08() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","adsd@gmail.com","0545452","123456","1");
        assertFalse(result,"Register Failed");
    }

    /*
        Check Email does not match
        Test Data:
            adsaddd
            addssa@
            adcgmail.com
            dans2@gmail.
     */
    @Test
    void test09() {
        boolean result = register.REGISTER("PhamHoangTuanAnh","ads.com","0545452","123456","123456");
        assertFalse(result,"Register Failed");
    }
}
