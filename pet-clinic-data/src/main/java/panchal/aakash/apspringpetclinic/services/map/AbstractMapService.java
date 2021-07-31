package panchal.aakash.apspringpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import panchal.aakash.apspringpetclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//@Service
public abstract class AbstractMapService <T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else{
            throw new RuntimeException("Object cannot be null!");
        }
        return object;
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    private Long getNextId() {
        if (map.isEmpty()) return 1L;
        else return map.size() + 1L;
    }

}
