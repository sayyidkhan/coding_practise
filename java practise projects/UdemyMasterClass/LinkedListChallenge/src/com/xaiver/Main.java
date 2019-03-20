package com.xaiver;

public class Main {

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.

        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList

        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.

        // Once the songs have been added to the playlist, create a menu of options to:-
        // 1.Quit,
        // 2.Skip forward to the next song,
        // 3.skip backwards to a previous song.
        // 4.Replay the current song.
        // 5.List the songs in the playlist

        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).

        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.

        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        /*
        Duration duration = new Duration(101,60,60);
        duration.getDuration();
        */

        /*
        Song song = new Song("music1",0,5,20);
        System.out.println(song.getTitle());
        System.out.println(song.getDuration());
        */

        Album album = new Album("Eminem");
        album.addSongToAlbum("I'm not afraid",0,5,30);
        album.addSongToAlbum("Remember the name",0,3,20);
        album.addSongToAlbum("mocking bird",0,2,50);
        album.addSongToAlbum("venom",0,4,35);

        Album album2 = new Album("roy jones jr");
        album2.addSongToAlbum("can't be touched",0,5,30);
        album2.addSongToAlbum("rap god",0,3,20);
        album2.addSongToAlbum("tears of the clown",0,2,50);
        album2.addSongToAlbum("hayley",0,4,35);

        System.out.println("----------------------------");

        Playlist playlist = new Playlist();
        playlist.addSongIntoPlayList(album,"I'm not afraid");
        playlist.addSongIntoPlayList(album,"Remember the name");
        playlist.addSongIntoPlayList(album2,"can't be touched");
        playlist.addSongIntoPlayList(album2,"hayley");
        playlist.addSongIntoPlayList(album,"venom");
        playlist.Menu();


    }
}
