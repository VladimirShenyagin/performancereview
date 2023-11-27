package patterns.behavioral.chain.middleware;

import patterns.behavioral.chain.server.Server;

public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("Пользователь с такой почтой не зарегистрирован");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Неверный пароль");
            return false;
        }
        return checkNext(email, password);
    }
}
