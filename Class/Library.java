package Class;

import Controller.Filter;
import Controller.Process;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements Filter {
    private List<Song> songList;


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
        if(longToShort){
            //songList.sort((songList.get(0),songList.get(1)) -> (songList.get(0).getDuration().compareTo(songList.get(1).getDuration())));
            //Collections.sort(songList,(s1,s2)-> s1.getDuration().compareTo(s2.setDuration()));
            return songList.stream().sorted(Comparator.comparingInt(Song::getDuration)).collect(Collectors.toList());//Ascendente
        }else{
            return songList.stream().sorted(Comparator.comparingInt(Song::getDuration).reversed()).collect(Collectors.toList());//Descendente
        }
    }

    @Override
    public List<Song> orderByDate(Boolean oldToNew) {
        return null;
    }
}

