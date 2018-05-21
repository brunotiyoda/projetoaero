package com.aereo.aereo.service;

import com.aereo.aereo.arquitetura.dao.GenericDAO;
import com.aereo.aereo.arquitetura.service.GenericService;
import com.aereo.aereo.dao.VooDAO;
import com.aereo.aereo.model.Voo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VooService extends GenericService<Voo> {

    @Autowired
    private VooDAO vooDAO;

    @Override
    public GenericDAO<Voo> getGenericDAO() {
        return vooDAO;
    }
}
