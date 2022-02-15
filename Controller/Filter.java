package Controller;

import java.util.List;

import Class.Song;

public interface Filter {
    int compareTo(Song o);

    List<Song> filterByGenre(String genre);
    List<Song> filterByYear(int year);
    List<Song> orderByDuration(Boolean longToShort);
    List<Song> orderByDate(Boolean oldToNew);

}
