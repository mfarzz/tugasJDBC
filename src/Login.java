public class Login extends Captcha{
    private static final String usernameKey="admin";
    private static final String passwordKey="123";

    public static boolean AdminLogin (String username, String password, String inputCaptcha, String Captcha){
        return username.equals(usernameKey) && password.equals(passwordKey) && inputCaptcha.equalsIgnoreCase(Captcha);
    }
}
