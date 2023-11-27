package patterns.structural.facade.medialibrary;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: чтение " + codec.toString() + " файла...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: запись " + codec.toString() + " файла...");
        return new VideoFile("resultFile." + codec);
    }
}
