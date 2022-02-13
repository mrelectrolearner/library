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
    private static String helpDuration;
    private String launchDate;
    private int duration;



    /**
     * Constructor con parametros
     */
    public Song(String name, String genre, String cover, String description, String helpDuration, String launchDate) {
        this.idSong+=1;
        this.name = name;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        this.duration = Integer.parseInt(helpDuration.substring(0,1)) + Integer.parseInt(helpDuration.substring(3,4));
        this.launchDate = launchDate;
    }

    /**
     * Constructor vacio
     */
    public Song() {
    }



    /**
     * Getter and Setter
     */
    public int getIdSong() {
        return idSong;
    }
    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getCover() {
        return cover;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
