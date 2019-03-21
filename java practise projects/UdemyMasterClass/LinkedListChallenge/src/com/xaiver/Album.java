package com.xaiver;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> listOfSongs;

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public Album(String albumName) {
        this.albumName = albumName;
        this.listOfSongs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public Song getSong(String songName){
        for(Song song : this.listOfSongs){
            if(songName.equals(song.getTitle())){
                return song;
            }
        }
        return null;
    }

    public boolean findSong(String songName){
        for(Song song : this.listOfSongs){
            if(songName.equals(song.getTitle())){
                return false;
            }
        }
        return true;
    }

    public void addSongToAlbum(String songName,int hour,int minute,int seconds){
        if(findSong(songName)){
            this.listOfSongs.add(new Song(songName,hour,minute,seconds));
            System.out.println("Song " + songName + " have been added into the album successfully.");
        }
        else{
            System.out.println("unable to add song, song exist in the album");
        }
    }

    public void printSongInAlbum(){
        ArrayList<Song> songs = getListOfSongs();
        for(Song song : songs) {
            System.out.println("--------------------------");
            System.out.println("Song " + (songs.indexOf(song) + 1) + " of " + songs.size());
            System.out.println("Song Title: " + song.getTitle());
            System.out.println("Duration : " + song.getDuration());
            System.out.println("--------------------------");
        }
    }

}
