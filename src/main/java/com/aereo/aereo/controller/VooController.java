package com.aereo.aereo.controller;

import com.aereo.aereo.arquitetura.controller.GenericController;
import com.aereo.aereo.arquitetura.service.GenericService;
import com.aereo.aereo.model.Voo;
import com.aereo.aereo.service.VooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voo")
public class VooController extends GenericController<Voo> {

    @Autowired
    private VooService vooService;

    @Override
    public GenericService<Voo> getGenericService() {
        return vooService;
    }
}
