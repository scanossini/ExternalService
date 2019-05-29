package LyricsService.lyrics;

import LyricsService.lyrics.lyrics.Lyrics;

public interface LyricsExternalService {
    Lyrics getLyric(String song, String artist) throws Exception;
}
