package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class ArtistRepository {
    List<Artist> artists;
    public ArtistRepository() {
        artists = new ArrayList<>();
        artists.add(new Artist(0L,"Zdravko","Colic","bio0"));
        artists.add(new Artist(1L,"Aco","Pejovic","bio1"));
        artists.add(new Artist(2L,"Ceca","Raznjatovic","bio2"));
        artists.add(new Artist(3L,"Jelena","Karleusa","bio3"));
        artists.add(new Artist(4L,"Marija","Serifovic","bio4"));

    }

    public List<Artist> findALL() {
        return artists;
    }

    public Optional<Artist> findById(Long id){
        return artists.stream().filter(z -> z.getId().equals(id)).findFirst();
    }
}
