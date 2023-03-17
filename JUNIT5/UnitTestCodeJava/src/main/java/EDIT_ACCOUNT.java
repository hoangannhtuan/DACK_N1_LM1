public class EDIT_ACCOUNT {
    String Name, NewPassword, ConfirmPassword;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public EDIT_ACCOUNT(String name, String newPassword, String confirmPassword) {
        Name = name;
        NewPassword = newPassword;
        ConfirmPassword = confirmPassword;
    }
}
