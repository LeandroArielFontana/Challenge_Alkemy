package alkemy.disney.service.impl;

import alkemy.disney.domain.Movie;
import alkemy.disney.dto.DisneyCharacterDTO;
import alkemy.disney.repository.CharacterRepository;
import alkemy.disney.service.ICharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements ICharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public DisneyCharacterDTO createCharacter(String name, int age, double weight, String story) {
        return null;
    }

    @Override
    public DisneyCharacterDTO findCharacter(String name, int age, List<Movie> movies) {
        return null;
    }

    @Override
    public DisneyCharacterDTO updateCharacter(String name, int age, double weight, String story) {
        return null;
    }

    @Override
    public void deleteCharacter(int id) {

    }
}
