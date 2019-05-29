package LyricsService.external.lyrics;

import LyricsService.external.LyricsExternalService;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class LyricsModule {

    private static LyricsModule instance;

    private LyricsExternalService lyricsExternalService;

    private LyricsModule () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://orion.apiseeds.com/api/music/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        LyricsAPI lyricsAPI = retrofit.create(LyricsAPI.class);
        lyricsExternalService = new LyricsService(new JsonToLyricResolver(), lyricsAPI);
    }

    public static LyricsModule getInstance() {
        if (instance == null)
            instance = new LyricsModule();
        return instance;
    }

    public LyricsExternalService getLyricsExternalService() {
        return lyricsExternalService;
    }
}
