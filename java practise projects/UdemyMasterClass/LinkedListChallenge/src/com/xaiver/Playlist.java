package com.xaiver;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    ArrayList<Song> playlist;

    public Playlist() {
        this.playlist = new ArrayList<Song>();
    }

    public void addSongIntoPlayList(Album albumName,String songName){
        if(!albumName.findSong(songName)){
            // if song exist in the database return false
            // ! to inverse the solution so that will return true when song exist in playlist
            this.playlist.add(albumName.getSong(songName));
        }
    }

    private boolean storeValidSong(Album albumName,String songName){
        return !albumName.findSong(songName);
    }

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        boolean goingForward = true;
        boolean replay = false;
        ListIterator<Song> song = this.playlist.listIterator();

        if(this.playlist.size() == 0){
            System.out.println("No song in the playlist.");
            System.out.println("--- playlist stopped playing ---");
            return;
        }
        else{
            currentSongInfo(song.next());
            printMenu();
        }


        while(quit){
            int state = scanner.nextInt();
            scanner.nextLine();
            switch(state) {
                case 1:
                    System.out.println("--- playlist stopped playing ---");
                    quit = false;
                    break;
                case 2:
                    if(!goingForward){
                        if(song.hasNext()){
                            song.next();
                        }
                        goingForward = true;
                    }

                    if(song.hasNext()) {
                        currentSongInfo(song.next());
                    }
                    else{
                        System.out.println("--- end of the playlist ---");
                        goingForward = false;
                    }
                    break;
                case 3:
                    if(goingForward){
                        if(song.hasPrevious()) {
                            song.previous();
                        }
                        goingForward = false;
                    }

                    if(song.hasPrevious()) {
                        currentSongInfo(song.previous());
                    }
                    else {
                        System.out.println("--- beginning of the playlist ---");
                        goingForward = true;
                    }
                    break;
                case 4:
                    System.out.println("Replaying the current song.");
                    if(goingForward) {
                        currentSongInfo(song.previous());
                    }
                    else{
                        currentSongInfo(song.next());
                    }
                case 5:
                    printMenu();
                    break;
                default:
                    System.out.println("you have clicked an invalid option, please select one of the options below");
                    printMenu();
                    break;
            }
        }
    }

    public void currentSongInfo(Song song) {
        System.out.println("Now listening to : ");
        System.out.println(song.getTitle());
        System.out.println(song.getDuration());
    }

    public void printMenu(){
        System.out.println("1.Quit,\n" +
                "2.Skip forward to the next song,\n" +
                "3.skip backwards to a previous song.\n" +
                "4.Replay the current song.\n" +
                "5.List the songs in the playlist");
    }

}

