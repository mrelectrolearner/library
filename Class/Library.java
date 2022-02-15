package Class;

import Controller.Filter;
import Controller.Process;
import SongComparator.DateComparator;
import SongComparator.DurationComparator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Collections;


/**
 * Represent the library of songs and its basic operations.
 * @version 1.0.0 2022-02-15.
 * @author Santiago Lezcano santiago.lezcano99@gmail.com
 *         Luis Felipe Rivas- luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public class Library implements Filter {
    private final List<Song> songList;

    /**
     * Instance the library.
     */
    public Library(){
        Process process= new Process();
        this.songList = process.createlibraryOfSong();
    }


    /**
     * Filter the library by genre.
     * @param genre genre use for filter the songs.
     * @return playlist filter by genre.
     */

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


    /**
     * Filter the library by the launch year.
     * @param year int the launch year use to filter the library.
     * @return List<Song> playlist filter by year.
     */

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

    /**
     * Order the library by duration of the song.
     * @param longToShort determine if tha song is order from long to short.
     * @return playlist order by duration.
     */

    @Override
    public List<Song> orderByDuration(Boolean longToShort) {

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

    /**
     * Order the library by Date.
     * @param oldToNew determine if the library is show from old to new songs.
     * @return playlist order by date.
     */

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


    /**
     * get the library's list of songs.
     * @return library's list of songs.
     */

    public List<Song> getSongList() {
        return songList;
    }

}

