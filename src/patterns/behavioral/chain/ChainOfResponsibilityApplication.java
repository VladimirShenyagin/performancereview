package patterns.behavioral.chain;

import patterns.behavioral.chain.middleware.Middleware;
import patterns.behavioral.chain.middleware.RoleCheckMiddleware;
import patterns.behavioral.chain.middleware.ThrottlingMiddleware;
import patterns.behavioral.chain.middleware.UserExistsMiddleware;
import patterns.behavioral.chain.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainOfResponsibilityApplication {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Введите email: ");
            String email = reader.readLine();
            System.out.print("Введите пароль: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
