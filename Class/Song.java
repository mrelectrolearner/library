package Class;
//Cancion(id(autocrementable),Nombre,genero,fechaLanzamiento,caratula,descripcion,duracion)

import java.util.Calendar;
import java.util.GregorianCalendar;

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
    private Calendar launchDate;
    private Integer duration;

    private String author;



    /**
     * Constructor con parametros
     */

    public Song(String name,String author,  String genre, String cover, String description, String helpDuration, String launchDate) {

        this.idSong+=1;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        this.duration = Integer.parseInt(helpDuration.substring(0,1)) + Integer.parseInt(helpDuration.substring(3,4));
        int songYear=Integer.parseInt(launchDate.substring(6,9));
        int songMonth=Integer.parseInt(launchDate.substring(3,4));
        int songDay=Integer.parseInt(launchDate.substring(0,1));
        this.launchDate = new GregorianCalendar(songYear,0,songDay);
        this.launchDate.add(Calendar.MONTH, songMonth);

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
    public Calendar getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(Calendar launchDate) {
        this.launchDate = launchDate;
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "idSong=" + idSong +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                ", launchDate=" + launchDate.getTime()+
                ", duration=" + duration +
                ", author='" + author + '\'' +
                '}';
    }
}
