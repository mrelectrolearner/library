package Class;

import java.util.ArrayList;

/**
 * Have user date
 * @version 1.0.0 2022-02-15.
 * @author Santiago Lezcano santiago.lezcano99@gmail.com
 * @since 1.0.0 2022-02-15.
 */

import java.util.List;

public class User {
    /**
     * Attributes of class
     * @version 1.0.0 2022-02-15.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     * @since 1.0.0 2022-02-15.
     */
    private int idUser=0;
    private final String name;
    private List<Song> playlist;

    /**
     *
     * @param name name of user type String
     */
    public User(String name){
        this.idUser+=1;
        this.name=name;
        List<Song> playlist=new ArrayList<>();
    }
    public void addSongToPlaylist(Song songToAdd){
        this.playlist.add(songToAdd);
    }

    /**
     * Print to user data
     * @version 1.0.0 2022-02-15.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     * @since 1.0.0 2022-02-15.
     */
    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", playlist=" + playlist +
                '}';
    }
}
