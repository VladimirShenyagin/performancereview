package patterns.structural.facade.medialibrary;

public class VideoFile {

    private String name;
    private String extension;

    public VideoFile(String name) {
        this.name = name;
        this.extension = name.substring(name.indexOf(".") + 1);
    }

    public String getExtension() {
        return extension;
    }

    public String getName() {
        return name;
    }
}
