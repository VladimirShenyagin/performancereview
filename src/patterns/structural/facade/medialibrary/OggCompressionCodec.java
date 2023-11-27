package patterns.structural.facade.medialibrary;

public class OggCompressionCodec implements Codec{
    public String extension = "ogg";

    @Override
    public String toString() {
        return extension;
    }
}
