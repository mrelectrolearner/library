package Controller;

import java.util.List;

import Class.Song;

/**
 * Represent a filter of the library and its basic order and filter operations.
 * @version 1.0.0 2022-02-15.
 * @author Santiago Lezcano santiago.lezcano99@gmail.com
 *         Luis Felipe Rivas- luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public interface Filter {
    /**
     * Filter the library by genre.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     *         Luis Felipe Rivas- luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param genre genre use for filter the songs.
     * @return playlist filter by genre.
     */
    List<Song> filterByGenre(String genre);

    /**
     * Filter the library by the launch year.
     * @author Luis Felipe Rivas- luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param year int the launch year use to filter the library.
     * @return List<Song> playlist filter by year.
     */
    List<Song> filterByYear(int year);

    /**
     * Order the library by duration of the song.
     * @author Luis Felipe Rivas- luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param longToShort determine if tha song is order from long to short.
     * @return playlist order by duration.
     */
    List<Song> orderByDuration(Boolean longToShort);

    /**
     * Order the library by Date.
     * @author Luis Felipe Rivas- luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param oldToNew determine if the library is show from old to new songs.
     * @return playlist order by date.
     */
    List<Song> orderByDate(Boolean oldToNew);

}
