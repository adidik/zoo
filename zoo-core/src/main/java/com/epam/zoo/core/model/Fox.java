package com.epam.zoo.core.model;

/**
 * This is a simple fox.
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class Fox extends Animal {

    private static final int AGE_HUMANIZATION_MULTIPLIER = 10;

    public Fox(String name, int age) {
        super(name, Breed.FOX, age);
    }

    @Override
    public int getHumanizeAge() {
        return getAge() * AGE_HUMANIZATION_MULTIPLIER;
    }
}
