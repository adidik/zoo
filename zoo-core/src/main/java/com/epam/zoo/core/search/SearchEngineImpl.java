package com.epam.zoo.core.search;

import com.epam.zoo.core.model.Animal;
import com.epam.zoo.core.model.Zoo;

import javax.inject.Inject;

/**
 * General implementation of Zoo Search Engine
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class SearchEngineImpl implements SearchEngine {

    private final Zoo zoo;

    @Inject
    public SearchEngineImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public <T> T findOne(AnimalQuery<T> query) throws AnimalNotFoundException {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
