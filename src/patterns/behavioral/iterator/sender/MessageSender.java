package patterns.behavioral.iterator.sender;

import patterns.behavioral.iterator.iterators.ProfileIterator;
import patterns.behavioral.iterator.profile.Profile;
import patterns.behavioral.iterator.socialnetworks.SocialNetwork;

public class MessageSender {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public MessageSender(SocialNetwork network) {
        this.network = network;
    }

    public void sendMessageToFriends(String profileEmail, String message) {
        System.out.println("\nРассылка друзьям...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessageToCoworkers(String profileEmail, String message) {
        System.out.println("\nРассылка коллегам...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("отправлено контакту: '" + email + "'. Сообщение: '" + message + "'");
    }
}
