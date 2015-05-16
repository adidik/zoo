package com.epam.zoo.core.search;

/**
 * Main search engine for Zoo.
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public interface SearchEngine {

    /**
     * Look for specific animal by query.
     *
     * @param query query with look up details.
     * @param <T> Type of animal
     * @return first found animal
     */
    <T> T findOne(AnimalQuery<T> query) throws AnimalNotFoundException;

}
