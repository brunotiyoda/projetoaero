package com.aereo.aereo.controller;

import com.aereo.aereo.arquitetura.controller.GenericController;
import com.aereo.aereo.arquitetura.service.GenericService;
import com.aereo.aereo.model.Passageiro;
import com.aereo.aereo.service.PassageiroSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/passageiro")
public class PassageiroController extends GenericController<Passageiro> {

    @Autowired
    private PassageiroSerivce passageiroSerivce;

    @Override
    public GenericService<Passageiro> getGenericService() {
        return passageiroSerivce;
    }
}