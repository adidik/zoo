package com.epam.zoo.core.search;

import com.epam.zoo.core.model.Breed;

/**
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class AnimalQuery<T> {

    private Class<T> type;
    private Breed breed;
    private String name;

    public AnimalQuery(Class<T> type) {
        this.type = type;
    }

    private void setBreed(Breed breed) {
        this.breed = breed;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Class<T> getType() {
        return type;
    }

    public Breed getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public static class Builder<T> {

        private AnimalQuery<T> query;

        private Builder(AnimalQuery<T> query) {
            this.query = query;
        }

        public static <T> Builder<T> find(Class<T> type) {
            return new Builder<T>(new AnimalQuery<T>(type));
        }

        public Builder<T> breed(Breed breed) {
            this.query.setBreed(breed);
            return this;
        }

        public Builder<T> name(String name) {
            this.query.name = name;
            return this;
        }

        public AnimalQuery<T> build() {
            return query;
        }
    }

}
