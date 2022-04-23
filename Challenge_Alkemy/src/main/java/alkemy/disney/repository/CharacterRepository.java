package alkemy.disney.repository;

import alkemy.disney.domain.DisneyCharacter;
import alkemy.disney.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<DisneyCharacter, Integer> {

    DisneyCharacter findByName(String name);

    DisneyCharacter findByAge(int age);

    DisneyCharacter findByMovies(List<Movie> movies);
}
