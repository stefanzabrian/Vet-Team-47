package com.sda.vetteam47.repository;

import com.sda.vetteam47.model.Consult;
import com.sda.vetteam47.repository.base.RepositoryImpl;

public class ConsultRepositoryImpl extends RepositoryImpl<Consult> implements ConsultRepository{
    public ConsultRepositoryImpl() {
        super(Consult.class);
    }
}
