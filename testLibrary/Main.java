package testLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Class.Library;
import Class.Song;
public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome, please enter your name: ");
        String UserName= scanner.nextLine();
        while(true) {

            System.out.println("What do you want to do= \n" +
                    "1. Show library. \n" +
                    "2. Filter library for genre. \n" +
                    "3. Filter library for year. \n" +
                    "4. Order by duration.\n" +
                    "5. Order by date.\n" +
                    "Enter a number: ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("playlist: \n");
                    printPlaylist(library.getSongList());
                    break;
                case 2:
                    System.out.println("Enter the genre you want to filter: \n");
                    String genreToFilter = scanner.nextLine();
                    printPlaylist(library.filterByGenre(genreToFilter));
                    break;
                case 3:
                    System.out.println("Enter the year you want to filter: \n");
                    int yearToFilter = scanner.nextInt();
                    printPlaylist(library.filterByYear(yearToFilter));
                    break;
                case 4:
                    System.out.println("Order by genre: \n");
                    printPlaylist(library.orderByDate(true));
                    break;
                case 5:
                    System.out.println("Order by date: \n");
                    printPlaylist(library.orderByDate(true));
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }


    }
    private static void printPlaylist(List<Song> playlist){
        for (Song song:playlist) {
            System.out.print(song+"\n");
        }

    }
}
