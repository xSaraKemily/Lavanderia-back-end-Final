package com.sarakemily.lavanderia.resources;

import com.sarakemily.lavanderia.models.Cliente;
import com.sarakemily.lavanderia.service.AbstractService;
import com.sarakemily.lavanderia.service.ClienteService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }
}

