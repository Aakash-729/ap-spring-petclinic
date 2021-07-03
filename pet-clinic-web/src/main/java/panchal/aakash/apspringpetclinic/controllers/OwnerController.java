package panchal.aakash.apspringpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import panchal.aakash.apspringpetclinic.bootStrap.DataLoader;
import panchal.aakash.apspringpetclinic.model.Owner;
import panchal.aakash.apspringpetclinic.services.OwnerService;
import panchal.aakash.apspringpetclinic.services.map.OwnerServiceMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerServiceMap ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/", "index", "index.html"})
    public String listOwners(Model model) {
        System.out.println("OwnerService: "+ ownerService);
        List<Owner> ownerList = new ArrayList<>(ownerService.findAll());

        System.out.println("Printing the saved Owners....");
        for (Owner owner : ownerList){
            System.out.println("Owner id: "+ owner.getId() + " firstName: "+
                    owner.getFirstName()+ " lastName: "+ owner.getLastName());
        }
        System.out.println("--------------------------------------------");
        model.addAttribute("owners", ownerList);
        return "owners/index";
    }
}
