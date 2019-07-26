package com.sarakemily.lavanderia.resources;

import com.sarakemily.lavanderia.models.OrdemServico;
import com.sarakemily.lavanderia.service.AbstractService;
import com.sarakemily.lavanderia.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/ordens")
public class OrdemServicoResource extends AbstractResource<OrdemServico> {

    @Inject
    private OrdemServicoService service;

    @Override
    protected AbstractService<OrdemServico> getService() {
        return service;
    }

}

