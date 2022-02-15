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
 * Representa una biblioteca de canciones y  algunas de sus operaciones basicas de orden y filtrado.
 * @version 1.0.0 2022-02-15.
 * @author  Luis Felipe Rivas- luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public class Library implements Filter {
    private final List<Song> songList;

    /**
     * Instancia la libreria de canciones
     */
    public Library(){
        Process process= new Process();
        this.songList = process.createlibraryOfSong();
    }

    /**
     * Filtra la libreria de canciones por genero.
     * @param genre genero usado para filtrar la libreria.
     * @return lista de canciones filtrada por un género.
     */
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

    /**
     * Filtra la libreria de canciones por año de lanzamiento.
     * @param year int año de lanzamiento usado para filtrar la libreria.
     * @return List<Song> Lista de canciones filtrada por un año de lanzamiento.
     */
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

    /**
     * Ordena la libreria de canciones por duracion.
     * @param longToShort boolean determina si la lista de canciones es ordenada de la mas larga a la mas corta.
     * @return List<Song> lista de canciones ordenadas por duración.
     */
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

    /**
     * Ordena la libreria de canciones por fecha.
     * @param oldToNew boolean determina si la lista de canciones es ordenada de la mas vieja a la mas resiente.
     * @return List<Song> lista de canciones ordenadas por fecha.
     */
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

    /**
     * Obtiene la lista de canciones de la librería.
     * @return la lista de canciones de la librería.
     */
    public List<Song> getSongList() {
        return songList;
    }

}

