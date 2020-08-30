package com.alehyem.sfgpetclinic.services;

import com.alehyem.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
