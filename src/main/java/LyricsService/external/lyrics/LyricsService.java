package LyricsService.external.lyrics;

import LyricsService.external.LyricsExternalService;
import retrofit2.Response;

class LyricsService implements LyricsExternalService {

    private final LyricsAPI lyricsAPI;

    private JsonResolver lyricResolver;

    LyricsService(JsonResolver lyricResolver, LyricsAPI lyricsAPI) {
        this.lyricResolver = lyricResolver;
        this.lyricsAPI = lyricsAPI;
    }

    public Lyrics getLyric(String song, String artist) {
        Lyrics lyrics = null;
        try {
            Response<String> callResponse = getLyricsFromService(song, artist);
            lyrics = lyricResolver.getLyricFromExternalData(callResponse.body());

        }catch( Exception e) {
            e.printStackTrace();
        }
        return lyrics;
    }

    private Response<String> getLyricsFromService(String song, String artist) throws Exception {
        return lyricsAPI.getLyrics(artist, song).execute();
    }
}
