package Class;

import Controller.Filter;
import Controller.Process;
import SongComparator.DateComparator;
import SongComparator.DurationComparator;

import java.util.*;

public class Library implements Filter {
    private final List<Song> songList;


    public Library(){
        Process process= new Process();
        this.songList = process.createlibraryOfSong();
    }


    @Override
    public List<Song> filterByGenre(String genre) {
        List<Song> filteredSongList =new ArrayList<>();
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
    public List<Song> filterByYear(int year) {
        List<Song> filteredSongList =new ArrayList<>();
        int songYear;
        for(Song song: this.songList){
            songYear=song.getLaunchDate().get(Calendar.YEAR);
            if (songYear==year){
                filteredSongList.add(song);
            }

        }

        return filteredSongList;
    }

    @Override
    public List<Song> orderByDuration(Boolean longToShort) {
        List<Song> filteredSongList=this.songList;
        if(longToShort) {
            Collections.sort(filteredSongList, new DurationComparator());
        }else {
            Collections.sort(filteredSongList,new DurationComparator().reversed());
        }
        return filteredSongList;
    }

    @Override
    public List<Song> orderByDate(Boolean oldToNew) {
        List<Song> filteredSongList=this.songList;
        if(oldToNew) {
            Collections.sort(filteredSongList, new DateComparator());
        }else {
            Collections.sort(filteredSongList,new DateComparator().reversed());
        }


        return filteredSongList;
    }

    public List<Song> getSongList() {
        return songList;
    }
}

