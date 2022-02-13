package Class;

import Controller.Process;
public class Library {


    public void CreateListSong(){
        Process process= new Process();
        process.createlibraryOfSong();
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

