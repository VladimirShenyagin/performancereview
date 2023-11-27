package patterns.structural.proxy;

import patterns.structural.proxy.downloader.YouTubeDownloader;
import patterns.structural.proxy.media.ThirdPartyYouTubeClass;
import patterns.structural.proxy.proxy.YouTubeCacheProxy;

public class ProxyApplication {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Сэкономленное кэшированием время: " + (naive - smart) + "мс");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();


        downloader.renderPopularVideos();
        downloader.renderVideoPage("mkafksangasj");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("3sdfgsd1j333");

        downloader.renderVideoPage("mkafksangasj");
        downloader.renderVideoPage("sadgahasgdas");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Затраченное время: " + estimatedTime + "мс\n");
        return estimatedTime;
    }
}
