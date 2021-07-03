package panchal.aakash.apspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {

    @GetMapping({"", "/", "index", "index.html"})
    public String listOwners() {
        return "pets/index";
    }
}
