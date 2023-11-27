package patterns.structural.facade.medialibrary;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getExtension();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: извлечение звука из mpeg...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: извлечение звука из ogg...");
            return new OggCompressionCodec();
        }
    }
}
