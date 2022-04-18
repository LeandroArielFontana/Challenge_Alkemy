package alkemy.disney.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class DisneyCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image;
    private String name;
    private int age;
    private Double weight;
    private String story;
    @ManyToMany(mappedBy = "characters")
    private List<Movie> movies;
}
