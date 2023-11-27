package patterns.behavioral.templatemethod;

import patterns.behavioral.templatemethod.networks.Facebook;
import patterns.behavioral.templatemethod.networks.Network;
import patterns.behavioral.templatemethod.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemplateMethodApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Введите имя пользователя: ");
        String userName = reader.readLine();
        System.out.print("введите пароль: ");
        String password = reader.readLine();

        // Вводим сообщение.
        System.out.print("введите сообщение: ");
        String message = reader.readLine();

        System.out.println("\nВыберите соцсеть для отправки сообщения.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Создаем сетевые объекты и публикуем пост.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
