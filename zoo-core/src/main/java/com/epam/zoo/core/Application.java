package com.epam.zoo.core;

import com.epam.zoo.core.model.Breed;
import com.epam.zoo.core.model.Fox;
import com.epam.zoo.core.search.AnimalNotFoundException;
import com.epam.zoo.core.search.AnimalQuery;
import com.epam.zoo.core.search.SearchEngine;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * Main application runner
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class Application {

    public static void main(String[] args) throws AnimalNotFoundException {
        Injector injector = Guice.createInjector(new ZooModule());
        SearchEngine search = injector.getInstance(SearchEngine.class);
        Fox fox = search.findOne(AnimalQuery.Builder.find(Fox.class).breed(Breed.FOX).build());

    }
}
