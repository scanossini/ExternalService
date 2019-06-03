package ayds.ak1.lyrics.lyricsAPI;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

class JsonToLyricResolver implements JsonResolver{

    JsonToLyricResolver() {}

    private final Gson gson = new Gson();

    public Lyrics getLyricFromExternalData(String serviceData) throws Exception {
        try {
            JsonObject jobj = gson.fromJson(serviceData, JsonObject.class);
            JsonObject result = jobj.get("result").getAsJsonObject();
            JsonObject track = result.get("track").getAsJsonObject();

            String songName = track.get("name").getAsString();
            String text = track.get("text").getAsString();
            String path = "https://source.unsplash.com/random/300x300/?" + songName.replace(" ", "%20") +",music";

            return new Lyrics(text, path);

        } catch (Exception e) {
            throw new Exception("No results");
        }
    }

}
