package patterns.structural.facade.medialibrary;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: миксуем звук...");
        return new File("resultFile." + result.getExtension());
    }

}
