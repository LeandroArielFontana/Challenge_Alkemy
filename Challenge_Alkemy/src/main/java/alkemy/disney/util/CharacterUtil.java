package alkemy.disney.util;

import alkemy.disney.dto.DisneyCharacterDTO;

public class CharacterUtil {

    public static DisneyCharacterDTO createDisneyCharacterDTO(String name, String image, Integer age, double weight, String story){
        DisneyCharacterDTO disneyCharacterDTO = new DisneyCharacterDTO();

        disneyCharacterDTO.setName(name);
        disneyCharacterDTO.setImage(image);
        disneyCharacterDTO.setAge(age);
        disneyCharacterDTO.setWeight(weight);
        disneyCharacterDTO.setStory(story);
        disneyCharacterDTO.setRegister(true);

        return disneyCharacterDTO;
    }
}
