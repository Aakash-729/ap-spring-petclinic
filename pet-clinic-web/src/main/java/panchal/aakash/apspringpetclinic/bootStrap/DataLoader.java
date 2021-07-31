package panchal.aakash.apspringpetclinic.bootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import panchal.aakash.apspringpetclinic.model.Owner;
import panchal.aakash.apspringpetclinic.model.Vet;
import panchal.aakash.apspringpetclinic.services.OwnerService;
import panchal.aakash.apspringpetclinic.services.VetService;
import panchal.aakash.apspringpetclinic.services.map.OwnerServiceMap;
import panchal.aakash.apspringpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerServiceMap ownerService, VetServiceMap vetService) {
        System.out.println("DataLoader - Constructor");
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Aman");
        owner1.setLastName("Varma");

        System.out.println("Saving Owner1");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Aakash");
        owner2.setLastName("Panchal");

        System.out.println("Saving Owner2");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Panchal");

        System.out.println("Saving Vet1");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Abhishek");
        vet2.setLastName("Panchal");

        System.out.println("Saving Vet2");
        vetService.save(vet2);

        System.out.println("--------------------------------------------");

        System.out.println("Printing the saved Owners....");
        for (Owner owner : ownerService.findAll()){
            System.out.println("Owner id: "+ owner.getId() + " firstName: "+
                    owner.getFirstName()+ " lastName: "+ owner.getLastName());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Printing the saved Vets....");
        for (Vet vet : vetService.findAll()){
            System.out.println("Vet id: "+ vet.getId() + " firstName: "+
                    vet.getFirstName()+ " lastName: "+ vet.getLastName());
        }
        System.out.println("--------------------------------------------");

    }
}
