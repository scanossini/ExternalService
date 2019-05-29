package LyricsService.lyrics;

import LyricsService.lyrics.lyrics.LyricsModule;

public class LyricsExternalModule {

    private static LyricsExternalModule instance;

    private LyricsExternalModule() {}

    public static LyricsExternalModule getInstance() {
        if (instance == null)
            instance = new LyricsExternalModule();
        return instance;
    }

    public LyricsExternalService getLyricsExternalService() {
        return LyricsModule.getInstance().getLyricsExternalService();
    }
}
