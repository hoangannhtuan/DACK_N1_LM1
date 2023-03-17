import java.util.regex.Pattern;

public class REGISTER {
    public boolean REGISTER(String Hoten, String Email,String Sdt,String Password,String Comfirpassword) {

        if ((Hoten.length() < 1) || (Email.length() < 1) || (Sdt.length() < 1) || (Password.length() < 1) ||(Comfirpassword != Password))
        {
            return false;
        }
        else
        {
            String regexPattern = "^(.+)@(\\S+)$", regexEmail ="@";

            if (Hoten.chars (). allMatch (c -> c >= 48 && c <= 57) // Username không được chứa số
                    || patternMatches(Hoten,regexPattern) == true // Username không được chứa ký tự đặc biệt
                    || patternMatches(Email, regexEmail) == false // Email không hợp lệ
                    || !(Sdt.chars (). allMatch (c -> c >= 48 && c <= 57)) //PhoneNumber không được chứa ký tự chữ

                )
                return false;

            return true;

        }
    }


    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}
