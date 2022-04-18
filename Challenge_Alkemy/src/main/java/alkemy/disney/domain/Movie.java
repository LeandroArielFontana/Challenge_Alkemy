package alkemy.disney.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image;
    private String title;
    private Date cretedDate;
    private int rating;
    @ManyToMany
    @JoinTable(name = "character_movie",
            joinColumns = @JoinColumn(name = "id_movie"),
            inverseJoinColumns = @JoinColumn(name = "id_character"))
    private List<DisneyCharacter> characters;
    @ManyToOne
    private Genre genre;
}
