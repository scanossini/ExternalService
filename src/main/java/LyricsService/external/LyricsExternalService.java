package LyricsService.external;


import LyricsService.external.lyrics.Lyrics;

public interface LyricsExternalService {
    Lyrics getLyric(String song, String artist) throws Exception;
}
