package patterns.structural.proxy.media;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }


    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("подключение к серверу " + server + "... ");
        experienceNetworkLatency();
        System.out.print("подключение установлено" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("загрузка трендов... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("sadgahasgdas", new Video("sadgahasgdas", "Lords of the Fallen 2023"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "It’s Back and I’m SO Excited!"));
        hmap.put("asdfas3ffasd", new Video("asdfas3ffasd", "REDD (2012) - \"The Sentence is Death\" Movie Clip"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Build an Easy Arm Routine"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "КАК ВЫГЛЯДИТ ДРИФТ В 17 ИГРАХ"));

        System.out.print("выполнено" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Загрузка видео... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Заголовок видео");

        System.out.print("Готово" + "\n");
        return video;
    }

}
