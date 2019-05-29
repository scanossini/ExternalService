package LyricsService.external.lyrics;

public interface JsonResolver {

    Lyrics getLyricFromExternalData(String serviceData) throws Exception;
}
