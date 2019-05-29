# LyricsService

Esta libreria nos permite solicitar a la API, la letra y la portada de una cancion solo con su nombre y su artista.

Uso:
- Para solicitar la letra y la imagen de una cancion se debe llamar al metodo getLyric(String song, String artist), de la clase LyricsService.

-A este metodo le debemos pasar como parametro el nombre de la cancion (song) y su artista (artist).

-El metodo retorna un objeto de tipo Lyrics el cual tiene dos atributos: la letra (text), y la url de la imagen (path)

- El objeto Lyrics se arma dentro de la clase JsonToLyricResolver, la cual implementa a la interfaz JsonResolver.
para esto debemos pasar como parametro el callResponse al metodo getLyricFromExternalData(String serviceData).
