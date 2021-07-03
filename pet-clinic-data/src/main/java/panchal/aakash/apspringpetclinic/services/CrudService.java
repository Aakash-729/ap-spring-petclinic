package panchal.aakash.apspringpetclinic.services;

import org.springframework.stereotype.Service;

import java.util.Set;

//@Service
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteByID(ID id);
}
