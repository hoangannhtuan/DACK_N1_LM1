public class EditAccount {
    //Verify Name Account
    public boolean isName (String name) throws Exception{
        if (name.length()>50)
            throw new Exception("Name is too long");
        return name.length()>5;
    }

    //Verify new Password
    public boolean isPasswordStrong (String password) throws Exception{
        if (password.length() >12)
            throw new Exception("Password is too long!");
        return password.length()>6;
    }
    //Check Confirm password
    public boolean isConfirmPassword (String password, String conpassword) {
        if (password != conpassword)
            return false;
        else
            return true;

    }
}
