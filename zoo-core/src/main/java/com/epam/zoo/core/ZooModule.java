package com.epam.zoo.core;

import com.epam.zoo.core.model.Animal;
import com.epam.zoo.core.model.Fox;
import com.epam.zoo.core.model.Lion;
import com.epam.zoo.core.model.Zoo;
import com.epam.zoo.core.search.SearchEngine;
import com.epam.zoo.core.search.SearchEngineImpl;
import com.google.common.collect.ImmutableSet;
import com.google.inject.AbstractModule;

import java.util.Collection;

/**
 * Guice module with application bindings
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class ZooModule extends AbstractModule {

    @Override
    protected void configure() {
        Collection<Animal> animals = ImmutableSet.of(new Fox("Fire", 3), new Lion("Leo", 9));
        bind(Zoo.class).toInstance(new Zoo(animals));
        bind(SearchEngine.class).to(SearchEngineImpl.class);
    }
}
