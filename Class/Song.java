package Class;
//Cancion(id(autocrementable),Nombre,genero,fechaLanzamiento,caratula,descripcion,duracion)

/**
 * Clase donde se creara cada cancion
 */
public class Song {
    /**
     * Atributos de la clase
     */
    private int idSong=0;
    private String name;
    private String genre;
    private String cover;
    private String description;
    private String duration;
    private String launchDate;

    /**
     * Constructor con parametros
     * @param name
     * @param genre
     * @param cover
     * @param description
     * @param duration
     * @param launchDate
     */
    public Song(String name, String genre, String cover, String description, String duration, String launchDate) {
        this.idSong+=1;
        this.name = name;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        this.duration = duration;
        this.launchDate = launchDate;
    }

    /**
     * Constructor vacio
     */
    public Song() {
    }

}
