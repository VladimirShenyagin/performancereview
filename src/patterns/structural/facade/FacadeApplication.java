package patterns.structural.facade;

import patterns.structural.facade.facade.VideoConversionFacade;

import java.io.File;

public class FacadeApplication {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println(mp4Video);
    }
}
