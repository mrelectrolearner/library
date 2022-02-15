package Class;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * structure of the song, this class creates the parameters and encapsulates them.
 * @version 1.0.0 2022-02-15.
 * @author Santiago Lezcano santiago.lezcano99@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public class Song {
    /**
     * Attributes of class
     * @version 1.0.0 2022-02-15.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     * @since 1.0.0 2022-02-15.
     */
    private static int counter;
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
     * Constructor with parameters
     * @version 1.0.0 2022-02-15.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param name name of song type String
     * @param author person singing the song type String
     * @param genre genre of each song type String
     * @param cover Image of song type String
     * @param description Description of song type String
     * @param helpDuration attribute with which the duration is done
     * @param launchDate date of creation of the song
     */
    public Song(String name,String author,  String genre, String cover, String description, String helpDuration, String launchDate) {
        this.idSong=counter;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        this.duration = Integer.parseInt(helpDuration.substring(0,2))*60 + Integer.parseInt(helpDuration.substring(3,5));
        int songYear=Integer.parseInt(launchDate.substring(6,10));
        int songMonth=Integer.parseInt(launchDate.substring(3,5));
        int songDay=Integer.parseInt(launchDate.substring(0,2));
        this.launchDate = new GregorianCalendar(songYear,0,songDay);
        this.launchDate.add(Calendar.MONTH, songMonth);
        counter+=1;


    }
    /**
     * encapsulation
     * @version 1.0.0 2022-02-15.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     * @since 1.0.0 2022-02-15.
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
                ", launchDate=" + launchDate.get(Calendar.DAY_OF_MONTH)+"/"+launchDate.get(Calendar.MONTH)+"/"+launchDate.get(Calendar.YEAR)+
                ", duration=" + duration +
                ", author='" + author + '\'' +
                '}';
    }
}
