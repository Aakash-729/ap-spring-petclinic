package panchal.aakash.apspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import panchal.aakash.apspringpetclinic.services.PetService;

@Controller
@RequestMapping("/pets")
public class PetController {

    private PetService petService;

    @GetMapping({"", "/", "index", "index.html"})
    public String listOwners() {
        return "pets/index";
    }
}
