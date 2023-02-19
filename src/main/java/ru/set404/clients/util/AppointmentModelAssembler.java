package ru.set404.clients.util;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import ru.set404.clients.controllers.ClientController;
import ru.set404.clients.models.Appointment;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class AppointmentModelAssembler implements RepresentationModelAssembler<Appointment, EntityModel<Appointment>> {
    @Override
    public EntityModel<Appointment> toModel(Appointment entity) {
        return EntityModel.of(entity,
                linkTo(methodOn(ClientController.class).newAppointment(entity)).withSelfRel(),
                linkTo(methodOn(ClientController.class).newAppointment(entity)).withRel("clients"));
    }

    @Override
    public CollectionModel<EntityModel<Appointment>> toCollectionModel(Iterable<? extends Appointment> entities) {
        return RepresentationModelAssembler.super.toCollectionModel(entities);
    }
}
