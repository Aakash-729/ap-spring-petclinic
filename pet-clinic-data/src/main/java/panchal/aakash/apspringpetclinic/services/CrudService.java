package panchal.aakash.apspringpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteByID(ID id);
}
