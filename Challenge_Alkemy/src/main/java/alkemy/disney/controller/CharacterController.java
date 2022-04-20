package alkemy.disney.controller;

import alkemy.disney.domain.Movie;
import alkemy.disney.dto.DisneyCharacterDTO;
import alkemy.disney.service.ICharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    private ICharacterService characterService;

    @GetMapping
    public ResponseEntity<DisneyCharacterDTO> getCharacter(@PathVariable String name, @PathVariable int age, @PathVariable List<Movie> movies) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCharacter(@PathVariable(name = "id") int id) {
        characterService.deleteCharacter(id);
        return ResponseEntity.ok("Successfully erased");
    }

}
