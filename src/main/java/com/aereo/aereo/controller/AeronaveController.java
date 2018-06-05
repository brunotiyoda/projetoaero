package com.aereo.aereo.controller;

import com.aereo.aereo.arquitetura.controller.GenericController;
import com.aereo.aereo.arquitetura.service.GenericService;
import com.aereo.aereo.model.Aeronave;
import com.aereo.aereo.service.AeronaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/aeronave")
public class AeronaveController extends GenericController<Aeronave> {

    @Autowired
    private AeronaveService aeronaveService;

    @Override
    public GenericService<Aeronave> getGenericService() {
        return aeronaveService;
    }

    @RequestMapping(value = "/think", method = RequestMethod.GET)
    public Aeronave think() {
        return new Aeronave();
    }
}
