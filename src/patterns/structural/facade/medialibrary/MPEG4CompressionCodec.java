package patterns.structural.facade.medialibrary;

public class MPEG4CompressionCodec implements Codec{
    public String extension = "mp4";

    @Override
    public String toString() {
        return extension;
    }
}
