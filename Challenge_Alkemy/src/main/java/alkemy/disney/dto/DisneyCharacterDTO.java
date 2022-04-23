package alkemy.disney.dto;

import alkemy.disney.domain.Movie;
import lombok.Data;

import java.util.List;

@Data
public class DisneyCharacterDTO {
    private int id;
    private String image;
    private String name;
    private int age;
    private Double weight;
    private String story;
    private List<Movie> movies;
    private boolean register;
}
