package patterns.behavioral.iterator.socialnetworks;

import patterns.behavioral.iterator.iterators.LinkedInIterator;
import patterns.behavioral.iterator.iterators.ProfileIterator;
import patterns.behavioral.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork{
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {

        simulateNetworkLatency();
        System.out.println("LinkedIn: загрузка профиля '" + profileEmail + "', ожидайте...");

        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {

        simulateNetworkLatency();
        System.out.println("LinkedIn: загрузка списка '" + contactType + "' профиля '" + profileEmail + "', ожидайте...");

        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
