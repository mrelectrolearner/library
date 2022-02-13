package Class;

import Controller.Filter;
import Controller.Process;

import java.util.Collections;
import java.util.List;

public class Library implements Filter,Comparable<Song> {
    private List<Song> songList;
    Song song;

    @Override
    public int compareTo(Song o) {
        return 0;
    }
    public Library(){
        Process process= new Process();
        this.songList = process.createlibraryOfSong();
    }


    @Override
    public List<Song> filterByGenre(String genre) {
        List<Song> filteredSongList =null;
        String songGenre;
        for(Song song:this.songList){
            songGenre =song.getGenre();
            if(songGenre.equalsIgnoreCase(genre)){
                filteredSongList.add(song);
            }

        }
        return filteredSongList;
    }

    @Override
    public List<Song> filterByYear(String year) {
        List<Song> filteredSongList =null;
        String songYear;
        for(Song song: this.songList){
            songYear=song.getLaunchDate();
            if (songYear.equalsIgnoreCase(year)){
                filteredSongList.add(song);
            }

        }

        return filteredSongList;
    }

    @Override
    public List<Song> orderByDuration(Boolean longToShort) {
        Collections.sort(this.songList.);
        return null;
    }

    @Override
    public List<Song> orderByDate(Boolean oldToNew) {
        return null;
    }


}

