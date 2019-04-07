package InnerClass.me;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumName;
    private String artistName;
    private SongList listOfSongs;

    public Album(String albumName,String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.listOfSongs = new SongList();
    }

    public boolean addSong(String title, int hour, int minute, int seconds){
        return this.listOfSongs.add(title,hour,minute,seconds);
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.listOfSongs.getSongList().size())) {
            playlist.add(this.listOfSongs.getSongList().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = listOfSongs.findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + "is not in this album.");
        return false;
    }

    /////////////////////////// inner class ////////////////////////////
    class SongList{

        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        public boolean add(String title, int hour, int minute, int seconds){
            if(findSong(title) == null){
                this.songList.add(new Song(title,hour,minute,seconds));
                return true;
            }
            return false;
        }

        private Song findSong(String songName){
            for(Song checkedSong : this.songList){
                if(songName.equals(checkedSong.getTitle())){
                    return checkedSong;
                }
            }
            return null;
        }

    }
    /////////////////////////// inner class ////////////////////////////


}
