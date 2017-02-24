package com.epam.zoo.core.search;

public interface SearchEngine {

    <T> T findOne(AnimalQuery<T> query) throws AnimalNotFoundException;

}
