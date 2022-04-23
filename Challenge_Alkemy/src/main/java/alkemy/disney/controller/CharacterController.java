package alkemy.disney.controller;

import alkemy.disney.domain.Movie;
import alkemy.disney.dto.DisneyCharacterDTO;
import alkemy.disney.service.ICharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    private ICharacterService characterService;

    @GetMapping("/character")
    public ResponseEntity<DisneyCharacterDTO> getCharacter(@PathVariable String name, @PathVariable int age, @PathVariable List<Movie> movies) {
        return new ResponseEntity(characterService.findCharacter(name, age, movies), HttpStatus.OK);
    }

    @PostMapping("/create_character")
    public ResponseEntity<DisneyCharacterDTO> createCharacter(String name, String image, Integer age, double weight, String story){
        return new ResponseEntity(characterService.createCharacter(name, image, age, weight, story), HttpStatus.CREATED);
    }

    @PutMapping("/update_character")
    public ResponseEntity<DisneyCharacterDTO> updateCharacter(String name, String image, Integer age, double weight, String story){
        return new ResponseEntity(characterService.updateCharacter(name, image, age, weight, story), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCharacter(@PathVariable(name = "id") int id) {
        characterService.deleteCharacter(id);
        return ResponseEntity.ok("Successfully erased");
    }

}
