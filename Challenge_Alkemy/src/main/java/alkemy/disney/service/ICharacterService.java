package alkemy.disney.service;

import alkemy.disney.domain.Movie;
import alkemy.disney.dto.DisneyCharacterDTO;

import java.util.List;

public interface ICharacterService {

    DisneyCharacterDTO createCharacter(String name, int age, double weight, String story);

    DisneyCharacterDTO findCharacter(String name, int age, List<Movie> movies);

    DisneyCharacterDTO updateCharacter(String name, int age, double weight, String story);

    void deleteCharacter (int id);

}
