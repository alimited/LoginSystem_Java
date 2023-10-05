import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> login_info = new HashMap<>();

    IDandPasswords() {
        login_info.put("Bro", "Pizza");
        login_info.put("BroCode", "Price");
        login_info.put("Trevor", "Castlevania123");
    }

    protected HashMap getLoginInfo() {
        return login_info;
    }
}
