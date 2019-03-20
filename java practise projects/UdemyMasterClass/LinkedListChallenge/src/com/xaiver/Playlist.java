package com.xaiver;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    ArrayList<Album> playlist;

    public Playlist() {
        this.playlist = new ArrayList<Album>();
    }

    public void addSongIntoPlayList(Album albumName,String songName){
        if(!albumName.findSong(songName)){
            // if song exist in the database return false
            // ! to inverse the solution so that will return true when song exist in playlist
            this.playlist.add(albumName);
        }
    }

    public void playCurrentSong(Album song){
        return song.getAlbumName();
    }

    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Album> songs = this.playlist.listIterator();
        if(this.playlist.size() == 0){
            System.out.println("No song in the playlist.");
            System.out.println("--- playlist stopped playing ---");
            return;
        }
        else{
            System.out.println("Now listening to : " + songs.next());
            printMenu();
        }

        boolean quit = true;
        while(quit){
            int state = scanner.nextInt();
            scanner.nextLine();
            switch(state) {
                case 1:
                    System.out.println("--- playlist stopped playing ---");
                    quit = false;
                    break;
                case 2:
                    thePlaylist.next();
                case 3:
                    thePlaylist.previous();
                case 4:
                    System.out.println("Replaying the current song.");
                default:
                    System.out.println("you have clicked an invalid option, please select one of the options below");
                    printMenu();
                    break;
            }
        }
    }

    public void printMenu(){
        System.out.println("1.Quit,\n" +
                "2.Skip forward to the next song,\n" +
                "3.skip backwards to a previous song.\n" +
                "4.Replay the current song.\n" +
                "5.List the songs in the playlist");
    }

}
