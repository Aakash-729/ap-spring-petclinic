package panchal.aakash.apspringpetclinic.services.map;

import org.springframework.stereotype.Service;
import panchal.aakash.apspringpetclinic.model.Owner;
import panchal.aakash.apspringpetclinic.services.OwnerService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findByLastName(String LastName) {

        return null;
    }
}
