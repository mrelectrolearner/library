package Class;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int idUser=0;
    private final String name;
    private List<Song> playlist;

    public User(String name){
        this.idUser+=1;
        this.name=name;
        List<Song> playlist=new ArrayList<>();
    }
    public void addSongToPlaylist(Song songToAdd){
        this.playlist.add(songToAdd);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", playlist=" + playlist +
                '}';
    }
}
