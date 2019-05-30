package LyricsService.lyrics.lyrics;

public interface JsonResolver {

    Lyrics getLyricFromExternalData(String serviceData) throws Exception;
}
