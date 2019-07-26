package com.sarakemily.lavanderia.resources;

import com.sarakemily.lavanderia.models.Item;
import com.sarakemily.lavanderia.service.AbstractService;
import com.sarakemily.lavanderia.service.ItemService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/itens")
public class ItemResource extends AbstractResource<Item> {

    @Inject
    private ItemService service;

    @Override
    protected AbstractService<Item> getService() {
        return service;
    }

}
