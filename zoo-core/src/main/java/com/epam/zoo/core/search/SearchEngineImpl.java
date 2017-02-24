package com.epam.zoo.core.search;

import com.epam.zoo.core.model.Animal;
import com.epam.zoo.core.model.Zoo;
import com.google.common.base.Objects;

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
        for (Animal animal : zoo.getAnimals()) {
            if (isEqualsType(query, animal)
                    && isEqualBreed(query, animal)
                    && isEqualName(query, animal)) {
                return (T) animal;
            }
        }
        throw new AnimalNotFoundException();
    }

    private <T> boolean isEqualsType(AnimalQuery<T> query, Animal animal) {
        return query.getType().equals(animal.getClass());
    }

    private <T> boolean isEqualName(AnimalQuery<T> query, Animal animal) {
        return Objects.equal(query.getName(), animal.getName());
    }

    private <T> boolean isEqualBreed(AnimalQuery<T> query, Animal animal) {
        return Objects.equal(query.getBreed(), animal.getBreed());
    }
}
