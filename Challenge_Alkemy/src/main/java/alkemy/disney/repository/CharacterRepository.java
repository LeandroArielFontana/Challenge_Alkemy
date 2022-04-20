package alkemy.disney.repository;

import alkemy.disney.domain.DisneyCharacter;
import alkemy.disney.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<DisneyCharacter, Integer> {

    DisneyCharacter findByName();

    DisneyCharacter findByAge();

    DisneyCharacter findByMovies(List<Movie> movies);
}
