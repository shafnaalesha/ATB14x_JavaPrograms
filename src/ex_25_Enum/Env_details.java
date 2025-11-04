package ex_25_Enum;

public class Env_details{
    public static void main(String[] args) {
//        System.out.println(Env.PROD.getBaseURL());
//        System.out.println(Env.DEV.getBaseURL());
    }
}
enum Env{

        DEV("https://dev.myapp.com"),
                STAGING("https://staging.myapp.com"),
                PROD("https://myapp.com");

        private final String baseURL;
        Env(String baseURL) {
            this.baseURL = baseURL;
        }
        public String getBaseURL(){
            return baseURL;
        }
}

