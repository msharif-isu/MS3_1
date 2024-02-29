package onetoone.Cosmetics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CosmeticController {
    @Autowired
    CosmeticRepository cosmeticRepository;

    private String success = "{\"message\":\"success\"}";
    private String failure = "{\"message\":\"failure\"}";

    //return all cosmetics in the game (in the DB)
    @GetMapping(path = "/cosmetics")
    List<Cosmetic> getAllCosmetics() { return cosmeticRepository.findAll(); }

}