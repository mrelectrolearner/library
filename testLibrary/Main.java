package testLibrary;

import java.util.List;
import java.util.Scanner;
import Class.Library;
import Class.Song;
import Class.User;
/**
 * It represents the interface with the user and its basic operations.
 * @version 1.0.0 2022-02-15.
 * @author Santiago Lezcano santiago.lezcano99@gmail.com
 *          Luis Felipe Rivas- luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */
public class Main {
    /**
     * Runs the program and allows the user to interact with the song library.
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     *         Luis Felipe Rivas- luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     * @param args
     */
    public static void main(String[] args) {
        try {
            Library library = new Library();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome, please enter your name: ");
            String userName = scanner.nextLine();
            User user = new User(userName);
            while (true) {
                try {

                    System.out.println("What do you want to do " + userName + " ?\n"
                            +"1. Show library. \n"
                            +"2. Filter library for genre. \n"
                            +"3. Filter library for year. \n"
                            +"4. Order by duration long to short.\n"
                            +"5. Order by duration short to long.\n"
                            +"6. Order by date old to new.\n"
                            +"7. Order by date new to old.\n"
                            +"8. Add songs to the playlist.\n"
                            +"9. Show user playlist\n"
                            +"Enter a number: ");
                    int selectBehavior = scanner.nextInt();

                    switch (selectBehavior) {
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
                            System.out.println("Order by duration: \n");
                            printPlaylist(library.orderByDuration(true));
                            break;
                        case 5:
                            System.out.println("Order by duration: \n");
                            printPlaylist(library.orderByDuration(false));
                            break;
                        case 6:
                            System.out.println("Order by date: \n");
                            printPlaylist(library.orderByDate(true));
                            break;
                        case 7:
                            System.out.println("Order by date: \n");
                            printPlaylist(library.orderByDate(false));
                            break;
                        case 8:
                            printPlaylist(library.getSongList());
                            System.out.println("\nSelect a song from the library: ");
                            int selectSong = scanner.nextInt();
                            Song newSong = library.getSongList().get(selectSong);
                            System.out.println("The song: " + newSong.getName() + " was added to your playlist \n");
                            user.addSongToPlaylist(newSong);
                            break;
                        case 9:
                            if (user.getPlaylist()==null){
                                System.out.println("The playlist is empty");
                            }else {
                                System.out.println("your playlist:\n");
                                printPlaylist(user.getPlaylist());
                            }
                            break;
                        default:
                            System.out.println("\n Invalid election.\n");
                    }
                }catch (ArrayIndexOutOfBoundsException excArray){
                    System.out.println("Error, array out of index"+excArray);

                }catch (IllegalArgumentException excIllegalArgument){
                    System.out.println("Error an illegal argument was enter"+ excIllegalArgument);
                }
            }
        }catch (Exception exc){
            System.out.println(exc);

        }


    }
    /**
     * prints the user's playlist
     * @param playlist List type Song
     * @author Santiago Lezcano santiago.lezcano99@gmail.com
     *           Luis Felipe Rivas- luisfelorivas@gmail.com
     * @since 1.0.0 2022-02-15.
     */
    private static void printPlaylist(List<Song> playlist){
        int counter=0;
        for (Song song:playlist) {
            System.out.print(counter+". "+song+"\n");
            counter+=1;
        }

    }
}
