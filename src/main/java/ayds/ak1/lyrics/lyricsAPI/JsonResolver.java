package ayds.ak1.lyrics.lyricsAPI;

public interface JsonResolver {

    Lyrics getLyricFromExternalData(String serviceData) throws Exception;
}
