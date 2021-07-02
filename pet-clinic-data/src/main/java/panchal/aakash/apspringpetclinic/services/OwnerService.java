package panchal.aakash.apspringpetclinic.services;

import panchal.aakash.apspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);
}
