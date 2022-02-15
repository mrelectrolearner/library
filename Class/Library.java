package Class;

import Controller.Filter;
import Controller.Process;
import SongComparator.DateComparator;
import SongComparator.DurationComparator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Collections;

public class Library implements Filter {
    private final List<Song> songList;


    public Library(){
        Process process= new Process();
        this.songList = process.createlibraryOfSong();
    }

    @Override
    public List<Song> filterByGenre(String genre) {
        try {
            List<Song> filteredSongList = new ArrayList<>();
            String songGenre;
            for (Song song : this.songList) {
                songGenre = song.getGenre();
                if (songGenre.equalsIgnoreCase(genre)) {
                    filteredSongList.add(song);
                }

            }
            return filteredSongList;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Override
    public List<Song> filterByYear(int year) {
        try{
            List<Song> filteredSongList =new ArrayList<>();
            int songYear;
            for(Song song: this.songList){
                songYear=song.getLaunchDate().get(Calendar.YEAR);
                if (songYear==year){
                    filteredSongList.add(song);
                }
            }
            return filteredSongList;
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }
    @Override
    public List<Song> orderByDuration(Boolean longToShort) {
        /*
         //Santiago
        if(longToShort){
            //songList.sort((songList.get(0),songList.get(1)) -> (songList.get(0).getDuration().compareTo(songList.get(1).getDuration())));
            //Collections.sort(songList,(s1,s2)-> s1.getDuration().compareTo(s2.setDuration()));
            return songList.stream().sorted(Comparator.comparingInt(Song::getDuration)).collect(Collectors.toList());//Ascendente
        }else{
            return songList.stream().sorted(Comparator.comparingInt(Song::getDuration).reversed()).collect(Collectors.toList());//Descendente
        }*/
        //Luis
        try {
            List<Song> filteredSongList = this.songList;
            if (longToShort) {
                Collections.sort(filteredSongList, new DurationComparator());
            } else {
                Collections.sort(filteredSongList, new DurationComparator().reversed());
            }
            return filteredSongList;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Override
    public List<Song> orderByDate(Boolean oldToNew) {
        try {
            List<Song> filteredSongList = this.songList;
            if (oldToNew) {
                Collections.sort(filteredSongList, new DateComparator());
            } else {
                Collections.sort(filteredSongList, new DateComparator().reversed());
            }

            return filteredSongList;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Song> getSongList() {
        return songList;
    }

}

