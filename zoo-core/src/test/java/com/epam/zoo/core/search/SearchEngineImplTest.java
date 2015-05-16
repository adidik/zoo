package com.epam.zoo.core.search;

import com.epam.zoo.core.model.*;
import com.google.common.collect.ImmutableSet;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class SearchEngineImplTest {

    @Ignore
    @Test
    public void testFindOne() throws Exception {
        // GIVEN
        Collection<Animal> animals = ImmutableSet.of(new Fox("Fire", 3), new Lion("Leo", 9));
        Zoo zoo = new Zoo(animals);
        SearchEngine searchEngine = new SearchEngineImpl(zoo);
        AnimalQuery<Fox> query = AnimalQuery.Builder.find(Fox.class).breed(Breed.FOX).name("Fire").build();

        // WHEN
        Fox actual = searchEngine.findOne(query);

        // THEN
        assertEquals("Fire", actual.getName());
        assertEquals(Breed.FOX, actual.getBreed());
    }

    @Ignore
    @Test(expected = AnimalNotFoundException.class)
    public void testFindOneNotFound() throws Exception {
        // GIVEN
        Collection<Animal> animals = ImmutableSet.of(new Fox("Fire", 3), new Lion("Leo", 9));
        Zoo zoo = new Zoo(animals);
        SearchEngine searchEngine = new SearchEngineImpl(zoo);
        AnimalQuery<Fox> query = AnimalQuery.Builder.find(Fox.class).breed(Breed.FOX).name("IE").build();

        // WHEN
        searchEngine.findOne(query);

        // THEN
        // Expected exception
    }
}
