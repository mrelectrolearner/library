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
     */
    private int idUser=0;
    private final String name;
    private List<Song> playlist;

    /**
     * @param name name of user type String
     */
    public User(String name){
        this.idUser+=1;
        this.name=name;
        this.playlist=new ArrayList<Song>();

    }

    /**
     * Add a new song to the user's playlist.
     * @param songToAdd new song to be added.
     */
    public void addSongToPlaylist(Song songToAdd){
        this.getPlaylist().add(songToAdd);
    }

    /**
     * Get the user's playlist.
     * @return the user's playlist.
     */
    public List<Song> getPlaylist() {
        return playlist;
    }

    /**
     * Print the user data.
     */
    @Override
    public String toString() {
        return "User{"
                +"idUser=" + idUser
                +", name='" + name + '\''
                +", playlist=" + playlist
                +'}';
    }
}
