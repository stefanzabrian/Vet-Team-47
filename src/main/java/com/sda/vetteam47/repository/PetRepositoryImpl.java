package com.sda.vetteam47.repository;

import com.sda.vetteam47.model.Pet;
import com.sda.vetteam47.repository.base.RepositoryImpl;

public class PetRepositoryImpl extends RepositoryImpl<Pet> implements PetRepository {
    public PetRepositoryImpl() {
        super(Pet.class);
    }
}
