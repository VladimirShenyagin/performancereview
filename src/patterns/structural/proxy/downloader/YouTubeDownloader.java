package patterns.structural.proxy.downloader;

import patterns.structural.proxy.media.ThirdPartyYouTubeLib;
import patterns.structural.proxy.media.Video;

import java.util.HashMap;

public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Страница с видео (URL адрес)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Самые популярные видео на Youtube (URL адрес)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Заголовок: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
