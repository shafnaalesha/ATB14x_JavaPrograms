package ex_21_OOPs_Encapsulation;

public class Lab_01_ecap_Demo {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pass123");
  //      System.out.println(vwoLogin.password);
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);
        vwoLogin1.setPassword("Pramodchild@123", true);
    }
}
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.password = password;
        this.username =username;
    }
}
class GoodVWOLogin{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isGoodAuntyadmin) {
        if(isGoodAuntyadmin){
            this.password = password;
        }
        else {
            System.out.println("Not allowed");
        }
    }

    public String password;

    public GoodVWOLogin(String username, String password) {
        this.password = password;
        this.username =username;
    }
}