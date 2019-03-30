package InnerClass.me;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private String playlistName;
    LinkedList<Song> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new LinkedList<Song>();
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = this.playlist.listIterator();
        if(this.playlist.size() == 0){
            System.out.println("No song in the playlist.");
            System.out.println("--- playlist stopped playing ---");
            return;
        }
        else{
            System.out.println("Now playing \n" + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();


            switch(action){
                case 0:
                    System.out.println("--- Playlist complete. ---");
                    break;
                case 1:
                    currentPlayOptions();
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing \n" + listIterator.next().toString());
                    }
                    else{
                        System.out.println("we have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    currentPlayOptions();
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing \n" + listIterator.previous().toString());
                    }
                    else{
                        System.out.println("we are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    currentPlayOptions();
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying \n" + listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the list.");
                        }
                    }
                    else{
                        if(listIterator.hasNext()){
                            System.out.println("now replaying \n" + listIterator.next().toString());
                            forward = true;
                        }
                        else{
                            System.out.println("We are at the end of the list.");
                        }
                    }
                    break;
                case 4:
                    currentPlayOptions();
                    printList(this.playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(this.playlist.size() > 0){
                        listIterator.remove();
                        System.out.println("--- removed the current song ---");
                        if(listIterator.hasNext()){
                            System.out.println("Now playing \n" + listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now playing \n" + listIterator.previous());
                        }
                    }
                    break;
            }

        }

    }

    private void currentPlayOptions(){
        System.out.println(
                "######################\n" +
                        "Available actions:\n" +
                "1 - Next Song\n" +
                "2 - Previous song\n" +
                "3 - Replay song\n" +
                        "######################");
    }

    private void printMenu(){
        System.out.println("Available actions:\n");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list the song in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from the playlist."
        );
    }

    private void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator(); // only can loop forward, loop through once, and cannot go backwards
        System.out.println("==============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }

}
