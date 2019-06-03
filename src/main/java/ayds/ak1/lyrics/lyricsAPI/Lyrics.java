package ayds.ak1.lyrics.lyricsAPI;

public class Lyrics{

    private String text;
    private String path;

    public Lyrics(String text, String path) {
        this.text = text;
        this.path = path;
    }

    public String getText() {
        return text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setText(String text) {
        this.text = text;
    }
}