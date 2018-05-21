package com.aereo.aereo.service;

import com.aereo.aereo.arquitetura.dao.GenericDAO;
import com.aereo.aereo.arquitetura.service.GenericService;
import com.aereo.aereo.dao.PassageiroDAO;
import com.aereo.aereo.model.Passageiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassageiroSerivce extends GenericService<Passageiro> {

    @Autowired
    private PassageiroDAO passageiroDAO;

    @Override
    public GenericDAO<Passageiro> getGenericDAO() {
        return passageiroDAO;
    }
}
