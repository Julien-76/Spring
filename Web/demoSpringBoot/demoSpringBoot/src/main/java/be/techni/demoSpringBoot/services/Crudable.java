package be.techni.demoSpringBoot.services;

import java.util.List;

public interface Crudable <Entity, DTO, ID> {

    List<DTO> getAll();
    DTO getById(ID id);
    boolean insert(Entity entity);
    boolean update(Entity entity, ID id);
    boolean delete(ID id);

}
