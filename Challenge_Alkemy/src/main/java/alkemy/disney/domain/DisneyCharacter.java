package alkemy.disney.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@SQLDelete(sql = "UPDATE DisneyCharacter d SET d.alta = false WHERE t.id = ?")
public class DisneyCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image;
    @NotNull
    private String name;
    private int age;
    private Double weight;
    private String story;
    @ManyToMany(mappedBy = "characters")
    private List<Movie> movies;
    private boolean register;
}
