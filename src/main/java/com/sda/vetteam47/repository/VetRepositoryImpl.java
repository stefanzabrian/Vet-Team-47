package com.sda.vetteam47.repository;

import com.sda.vetteam47.model.Vet;
import com.sda.vetteam47.repository.base.RepositoryImpl;

public class VetRepositoryImpl extends RepositoryImpl<Vet> implements VetRepository{
    public VetRepositoryImpl() {
        super(Vet.class);
    }
}
