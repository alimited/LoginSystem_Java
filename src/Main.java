public class Main {
    public static void main(String[] args) {

        IDandPasswords idp = new IDandPasswords();
        new LoginPage(idp.getLoginInfo());
    }
}