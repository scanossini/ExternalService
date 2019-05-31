package ayds.ak1.lyrics;

import ayds.ak1.lyrics.lyricsAPI.Lyrics;

public interface LyricsExternalService {
    Lyrics getLyric(String song, String artist) throws Exception;
}
