package Class;

import java.util.ArrayList;
import java.util.Date;

public class Library implements Filter{
    private ArrayList<Song> songsList;

    public Library(){
        this.songsList=new ArrayList<>();
    }

    @Override
    public ArrayList<Song> filterByGenre(String genre) {
        return null;
    }

    @Override
    public ArrayList<Song> filterByYear(Date year) {
        return null;
    }

    @Override
    public ArrayList<Song> orderByDuration(Boolean longToShort) {
        return null;
    }

    @Override
    public ArrayList<Song> orderByDate(Boolean oldToNew) {
        return null;
    }
}
