package panchal.aakash.apspringpetclinic.services;

import org.springframework.stereotype.Service;
import panchal.aakash.apspringpetclinic.model.Owner;

//@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);
}
