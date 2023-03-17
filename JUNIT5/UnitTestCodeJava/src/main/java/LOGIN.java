import java.util.ArrayList;

public class LOGIN{
    ACCOUT accout;
    ArrayList<ACCOUT> accoutArrayList = new ArrayList<>();

    public boolean IsLOGIN(String Email,String Password ) {
        accoutArrayList.add(new ACCOUT("abc@gmail.com", "123456"));
        accoutArrayList.add(new ACCOUT("abc123@gmail.com", "123456"));
        if ((Email.length() > 0) && (Password.length() > 0) )
        {
            for (int i = 0; i < accoutArrayList.size(); i++) {
                if (Email == accoutArrayList.get(i).tendangnhap) {
                    if (Password == accoutArrayList.get(i).password)
                        return true;
                }
            }
        }

        return false;
    }
}
