package com.alehyem.sfgpetclinic.services;

import com.alehyem.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
