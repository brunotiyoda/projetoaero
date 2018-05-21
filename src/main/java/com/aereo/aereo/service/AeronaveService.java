package com.aereo.aereo.service;

import com.aereo.aereo.arquitetura.dao.GenericDAO;
import com.aereo.aereo.arquitetura.service.GenericService;
import com.aereo.aereo.dao.AeronaveDAO;
import com.aereo.aereo.model.Aeronave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeronaveService extends GenericService<Aeronave> {

    @Autowired
    private AeronaveDAO aeronaveDAO;

    @Override
    public GenericDAO<Aeronave> getGenericDAO() {
        return aeronaveDAO;
    }
}
