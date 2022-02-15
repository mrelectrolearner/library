package Controller;

import java.util.List;

import Class.Song;

/**
 * Represent a filter of the library and its basic operations (filter and order).
 * @version 1.0.0 2022-02-15.
 * @author Santiago Lezcano santiago.lezcano99@gmail.com
 *         Luis Felipe Rivas- luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public interface Filter {
    /**
     * Filtra la libreria de canciones por genero.
     * @param genre genero usado para filtrar la libreria.
     * @return lista de canciones filtrada por un género.
     */
    List<Song> filterByGenre(String genre);

    /**
     * Filtra la libreria de canciones por año de lanzamiento.
     * @param year int año de lanzamiento usado para filtrar la libreria.
     * @return List<Song> Lista de canciones filtrada por un año de lanzamiento.
     */
    List<Song> filterByYear(int year);

    /**
     * Ordena la libreria de canciones por duracion.
     * @param longToShort boolean determina si la lista de canciones es ordenada de la mas larga a la mas corta.
     * @return List<Song> lista de canciones ordenadas por duración.
     */
    List<Song> orderByDuration(Boolean longToShort);

    /**
     * Ordena la libreria de canciones por fecha.
     * @param oldToNew boolean determina si la lista de canciones es ordenada de la mas vieja a la mas resiente.
     * @return List<Song> lista de canciones ordenadas por fecha.
     */
    List<Song> orderByDate(Boolean oldToNew);

}
