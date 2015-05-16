package com.epam.zoo.core.model;

import java.util.Collection;

/**
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class Zoo {

    private Collection<Animal> animals;

    public Zoo(Collection<Animal> animals) {
        this.animals = animals;
    }

    public Collection<Animal> getAnimals() {
        return animals;
    }
}
