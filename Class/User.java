package Class;

import java.util.ArrayList;

public class User {
    private int idUser=0;
    private final String name;
    private ArrayList<Song> playlist;

    public User(String name){
        this.idUser+=1;
        this.name=name;
        ArrayList<Song> playlist=new ArrayList<>();
    }
    public void addSongToPlaylist(Song songToAdd){
        playlist.add(songToAdd);
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
