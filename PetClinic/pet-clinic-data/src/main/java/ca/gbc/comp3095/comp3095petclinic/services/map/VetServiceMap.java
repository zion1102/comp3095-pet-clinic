package ca.gbc.comp3095.comp3095petclinic.services.map;

import ca.gbc.comp3095.comp3095petclinic.model.Vet;
import ca.gbc.comp3095.comp3095petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService <Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
      super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
