package alkemy.disney.service;

import alkemy.disney.domain.Movie;
import alkemy.disney.dto.DisneyCharacterDTO;

import java.util.List;

public interface ICharacterService {

    DisneyCharacterDTO createCharacter(String name, String image, Integer age, double weight, String story);

    DisneyCharacterDTO findCharacter(String name, Integer age, List<Movie> movies);

    DisneyCharacterDTO updateCharacter(String name, String image, Integer age, double weight, String story);

    void deleteCharacter (int id);
}
