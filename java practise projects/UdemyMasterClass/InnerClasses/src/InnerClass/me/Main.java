package InnerClass.me;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Modify the playlist challenge so that the Album class uses an inner class.
        // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
        // The inner SongList class will use an ArrayList and will provide a method to add a song.

        // It will also provide findSong() methods which will be used by the containing Album class
        // to add songs to the playlist.
        // Neither the Song class or the Main class should be changed.

        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4,30,10);
        album.addSong("Love don't mean a thing", 4,20,5);
        album.addSong("Holy man", 4,30,10);
        album.addSong("Hold on", 5,35,20);
        album.addSong("Lady double dealer", 3,20,15);
        album.addSong("You can't do it right", 6,20,30);
        album.addSong("High ball shooter", 4,20,30);
        album.addSong("The gypsy", 4,10,20);
        album.addSong("Soldier of fortune", 3,10,30);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5,40,40);
        album.addSong("I put the finger on you", 3,20,30);
        album.addSong("Lets go", 3,40,50);
        album.addSong("Inject the venom", 3,30,30);
        album.addSong("Snowballed", 4,50,10);
        album.addSong("Evil walks", 3,40,10);
        album.addSong("C.O.D.", 5,20,10);
        album.addSong("Breaking the rules", 5,30,20);
        album.addSong("Night of the long knives", 5,10,20);
        albums.add(album);


        Playlist playlist = new Playlist("default playlist");
        albums.get(0).addToPlaylist("You can't do it right",playlist.getPlaylist());
        albums.get(0).addToPlaylist("Holy man",playlist.getPlaylist());
        albums.get(0).addToPlaylist("Speed king",playlist.getPlaylist()); // song does not exist
        albums.get(0).addToPlaylist(9,playlist.getPlaylist());

        albums.get(1).addToPlaylist(8,playlist.getPlaylist());
        albums.get(1).addToPlaylist(3,playlist.getPlaylist());
        albums.get(1).addToPlaylist(2,playlist.getPlaylist());
        albums.get(1).addToPlaylist(24,playlist.getPlaylist()); // there is no track 24

        playlist.play();


    }

}
