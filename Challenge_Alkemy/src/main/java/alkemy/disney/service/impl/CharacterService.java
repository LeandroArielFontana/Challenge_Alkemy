package alkemy.disney.service.impl;

import alkemy.disney.domain.DisneyCharacter;
import alkemy.disney.domain.Movie;
import alkemy.disney.dto.DisneyCharacterDTO;
import alkemy.disney.repository.CharacterRepository;
import alkemy.disney.service.ICharacterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements ICharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public DisneyCharacterDTO createCharacter(DisneyCharacterDTO disneyCharacterDTO) {
        DisneyCharacter disneyCharacter = new DisneyCharacter();
        characterRepository.save(
                modelMapper.map(disneyCharacterDTO, DisneyCharacter.class)
        );
        /*DisneyCharacter disneyCharacter = new DisneyCharacter();
        disneyCharacter.setAge(disneyCharacterDTO.getAge());
        disneyCharacter.setImage(disneyCharacterDTO.getImage());
        disneyCharacter.setName(disneyCharacterDTO.getName());
        disneyCharacter.setRegister(true);
        disneyCharacter.setStory(disneyCharacterDTO.getStory());
        disneyCharacter.setWeight(disneyCharacterDTO.getWeight());*/
        return disneyCharacterDTO;
    }

    @Override
    public DisneyCharacterDTO findCharacter(String name, Integer age, List<Movie> movies) {
        DisneyCharacterDTO disneyCharacterDTO = new DisneyCharacterDTO();

        if(!name.isEmpty() || !(name == null)){
            disneyCharacterDTO = modelMapper.map(characterRepository.findByName(name), DisneyCharacterDTO.class);
        }else if(!(age == null)){
            disneyCharacterDTO = modelMapper.map(characterRepository.findByAge(age), DisneyCharacterDTO.class);
        }else if(!movies.isEmpty()){
            //disneyCharacterDTO = modelMapper.map(characterRepository.findByMovies(movies), DisneyCharacterDTO.class); // este hay que pensarlo mejor
        }
        return disneyCharacterDTO;
    }

    @Override
    public DisneyCharacterDTO updateCharacter(String name, String image, Integer age, double weight, String story) {
        return null;
    }

    @Override
    public void deleteCharacter(int id) {
        characterRepository.deleteById(id);
    }
}
