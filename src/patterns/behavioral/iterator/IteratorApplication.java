package patterns.behavioral.iterator;

import patterns.behavioral.iterator.profile.Profile;
import patterns.behavioral.iterator.sender.MessageSender;
import patterns.behavioral.iterator.socialnetworks.Facebook;
import patterns.behavioral.iterator.socialnetworks.LinkedIn;
import patterns.behavioral.iterator.socialnetworks.SocialNetwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IteratorApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите соцсеть для рассылки (по умолчанию:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        } else {
            network = new Facebook(createTestProfiles());
        }

        MessageSender sender = new MessageSender(network);
        sender.sendMessageToFriends("Test1@test.com",
                "Привет! Глянь, какой милый котик [link]!");
        sender.sendMessageToCoworkers("Test1@test.com",
                "Добрый день! Приглашаю на рабочую встречу по performance review [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("Test1@test.com", "Test1 name", "friends:Test2@test.com", "friends:Test6@test.com", "coworkers:Test5@test.com"));
        data.add(new Profile("Test2@test.com", "Test2 name", "friends:Test1@test.com", "coworkers:Test5@test.com"));
        data.add(new Profile("Test3@test.com", "Test3 name", "coworkers:Test4@test.com"));
        data.add(new Profile("Test4@test.com", "Test4 name", "coworkers:Test3@test.com"));
        data.add(new Profile("Test5@test.com", "Test5 name", "coworkers:Test1@test.com", "coworkers:Test2@test.com", "friends:Test6@test.com"));
        data.add(new Profile("Test6@test.com", "Test6 name", "friends:Test1@test.com", "friends:Test5@test.com"));
        return data;
    }
}
