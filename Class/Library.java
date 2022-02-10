package Class;

import java.util.ArrayList;
import java.util.Date;

public class Library implements Filter{
    private ArrayList<Song> songsList;

    public Library(){
        this.songsList=new ArrayList<>();
    }

    @Override
    public ArrayList<Class.Song> filterByGenre(String genre) {
        return null;
    }

    @Override
    public ArrayList<Class.Song> filterByYear(Date year) {
        return null;
    }

    @Override
    public ArrayList<Class.Song> orderByDuration(Boolean longToShort) {
        return null;
    }

    @Override
    public ArrayList<Class.Song> orderByDate(Boolean oldToNew) {
        return null;
    }
}
