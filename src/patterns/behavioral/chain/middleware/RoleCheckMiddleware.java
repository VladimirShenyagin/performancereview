package patterns.behavioral.chain.middleware;

public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Привет, администратор");
            return true;
        }
        System.out.println("Привет, пользователь");
        return checkNext(email, password);
    }

}
