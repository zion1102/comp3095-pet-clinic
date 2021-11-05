package ca.gbc.comp3095.comp3095petclinic.services;

import ca.gbc.comp3095.comp3095petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
