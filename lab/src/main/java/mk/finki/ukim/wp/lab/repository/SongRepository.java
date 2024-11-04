package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    List<Song> songs;

    public SongRepository() {
        songs = new ArrayList<Song>();
        songs.add(new Song("0","Title0","Pop",2000));
        songs.add(new Song("1","Title1","Rock",2001));
        songs.add(new Song("2","Title2","Pop",2003));
        songs.add(new Song("3","Title3","Jazz",2005));
        songs.add(new Song("4","Title4","Hip-Hop",1990));
    }

    public List<Song> findAll() {
        return songs;
    }

    public Song findByTrackId(String trackId){
        return songs.stream().filter(z -> z.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Artist artist, Song song){
        song.getPerformers().add(artist);
        return artist;
    }
}
