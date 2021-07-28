package com.saburto.petfishstore.domain.services;

import java.util.UUID;

public class NoAquariumFoundException extends RuntimeException {

    public NoAquariumFoundException(UUID aquariumID) {
        super(String.format("No aquarium with the id [%s] found", aquariumID.toString()));
    }

}